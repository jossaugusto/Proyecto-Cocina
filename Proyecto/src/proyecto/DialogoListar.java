package proyecto;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.event.CaretListener;
import javax.swing.event.CaretEvent;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.border.BevelBorder;
import java.awt.Cursor;
import javax.swing.ScrollPaneConstants;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.awt.Dimension;
import javax.swing.SwingConstants;

public class DialogoListar extends JDialog implements ActionListener, CaretListener {

	private static final long serialVersionUID = 1L;
	private JScrollPane scrollPane;
	private JTextArea txtS;
	private JButton btnCerrar;
	private JButton btnListar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DialogoListar dialog = new DialogoListar();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public DialogoListar() {
		setIconImage(
				Toolkit.getDefaultToolkit().getImage(DialogoListar.class.getResource("/Imagenes/iconoEscudo.png")));
		setBackground(new Color(255, 255, 255));
		getContentPane().setBackground(new Color(119, 203, 210));
		setTitle("Listado de Cocinas");
		setBounds(100, 100, 466, 321);
		getContentPane().setLayout(null);

		scrollPane = new JScrollPane();
		scrollPane.setFont(new Font("Roboto", Font.PLAIN, 11));
		scrollPane.setBackground(Color.WHITE);
		scrollPane.setBorder(new LineBorder(new Color(130, 135, 144), 2));
		scrollPane.setBounds(10, 11, 430, 226);
		getContentPane().add(scrollPane);

		txtS = new JTextArea();
		txtS.setDisabledTextColor(new Color(255, 255, 176));
		txtS.setSelectionColor(new Color(255, 255, 176));
		txtS.setBackground(Color.WHITE);
		txtS.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(192, 192, 192), new Color(192, 192, 192),
				new Color(192, 192, 192), new Color(192, 192, 192)));
		txtS.addCaretListener(this);
		txtS.setFont(new Font("Roboto", Font.PLAIN, 12));
		scrollPane.setViewportView(txtS);
		
				btnListar = new JButton("");
				btnListar.setVerticalAlignment(SwingConstants.TOP);
				btnListar.setHorizontalTextPosition(SwingConstants.LEFT);
				btnListar.setVerticalTextPosition(SwingConstants.BOTTOM);
				btnListar.setRolloverIcon(new ImageIcon(DialogoListar.class.getResource("/Imagenes/Listar48png.png")));
				btnListar.setPressedIcon(new ImageIcon(DialogoListar.class.getResource("/Imagenes/Listar32.png")));
				btnListar.setIcon(new ImageIcon(DialogoListar.class.getResource("/Imagenes/Listar32.png")));
				btnListar.setRequestFocusEnabled(false);
				btnListar.setBorderPainted(false);
				btnListar.setBounds(118, 237, 89, 45);
				getContentPane().add(btnListar);
				btnListar.setFont(new Font("Roboto", Font.PLAIN, 14));
				btnListar.setForeground(new Color(255, 255, 255));
				btnListar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				btnListar.setContentAreaFilled(false);
				btnListar.setBorder(null);
				btnListar.setBackground(new Color(255, 255, 255));
				
						btnCerrar = new JButton("");
						btnCerrar.setHorizontalAlignment(SwingConstants.LEFT);
						btnCerrar.setBorderPainted(false);
						btnCerrar.setIcon(new ImageIcon(DialogoListar.class.getResource("/Imagenes/salir32.png")));
						btnCerrar.setRolloverIcon(new ImageIcon(DialogoListar.class.getResource("/Imagenes/salir48.png")));
						btnCerrar.setPressedIcon(new ImageIcon(DialogoListar.class.getResource("/Imagenes/salir32.png")));
						btnCerrar.setRequestFocusEnabled(false);
						btnCerrar.setVerticalAlignment(SwingConstants.TOP);
						btnCerrar.setVerticalTextPosition(SwingConstants.BOTTOM);
						btnCerrar.setBounds(233, 237, 68, 45);
						getContentPane().add(btnCerrar);
						btnCerrar.setContentAreaFilled(false);
						btnCerrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
						btnCerrar.setForeground(new Color(255, 255, 255));
						btnCerrar.setBorder(null);
						btnCerrar.setFont(new Font("Roboto", Font.PLAIN, 14));
						btnCerrar.setBackground(new Color(255, 255, 255));
						btnCerrar.addActionListener(this);
		btnListar.addActionListener(this);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnListar) {
			actionPerformedBtnListar(e);
		}
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
	}

	protected void actionPerformedBtnCerrar(ActionEvent e) {
		dispose();
	}

	protected void actionPerformedBtnListar(ActionEvent e) {

		txtS.setText("LISTADO DE COCINAS\n\n");

		txtS.append("Modelo     : " + MenuPrincipal.modelo0 + "\n");
		txtS.append("Precio     : " + MenuPrincipal.precio0 + "\n");
		txtS.append("Fondo      : " + MenuPrincipal.fondo0 + "\n");
		txtS.append("Ancho      : " + MenuPrincipal.ancho0 + "\n");
		txtS.append("Alto       : " + MenuPrincipal.alto0 + "\n");
		txtS.append("Quemadores : " + MenuPrincipal.quemadores0 + "\n\n");

		txtS.append("Modelo     : " + MenuPrincipal.modelo1 + "\n");
		txtS.append("Precio     : " + MenuPrincipal.precio1 + "\n");
		txtS.append("Fondo      : " + MenuPrincipal.fondo1 + "\n");
		txtS.append("Ancho      : " + MenuPrincipal.ancho1 + "\n");
		txtS.append("Alto       : " + MenuPrincipal.alto1 + "\n");
		txtS.append("Quemadores : " + MenuPrincipal.quemadores1 + "\n\n");

		txtS.append("Modelo     : " + MenuPrincipal.modelo2 + "\n");
		txtS.append("Precio     : " + MenuPrincipal.precio2 + "\n");
		txtS.append("Fondo      : " + MenuPrincipal.fondo2 + "\n");
		txtS.append("Ancho      : " + MenuPrincipal.ancho2 + "\n");
		txtS.append("Alto       : " + MenuPrincipal.alto2 + "\n");
		txtS.append("Quemadores : " + MenuPrincipal.quemadores2 + "\n\n");

		txtS.append("Modelo     : " + MenuPrincipal.modelo3 + "\n");
		txtS.append("Precio     : " + MenuPrincipal.precio3 + "\n");
		txtS.append("Fondo      : " + MenuPrincipal.fondo3 + "\n");
		txtS.append("Ancho      : " + MenuPrincipal.ancho3 + "\n");
		txtS.append("Alto       : " + MenuPrincipal.alto3 + "\n");
		txtS.append("Quemadores : " + MenuPrincipal.quemadores3 + "\n\n");

		txtS.append("Modelo     : " + MenuPrincipal.modelo4 + "\n");
		txtS.append("Precio     : " + MenuPrincipal.precio4 + "\n");
		txtS.append("Fondo      : " + MenuPrincipal.fondo4 + "\n");
		txtS.append("Ancho      : " + MenuPrincipal.ancho4 + "\n");
		txtS.append("Alto       : " + MenuPrincipal.alto4 + "\n");
		txtS.append("Quemadores : " + MenuPrincipal.quemadores4);

	}

	public void caretUpdate(CaretEvent e) {
		if (e.getSource() == txtS) {
			caretUpdateTxtS(e);
		}
	}

	protected void caretUpdateTxtS(CaretEvent e) {

	}
}// FIN
