package proyecto;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.border.BevelBorder;
import java.awt.Cursor;
import java.awt.Toolkit;

public class DialogoListar extends JDialog implements ActionListener {

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
		getContentPane().setBackground(new Color(192, 192, 192));
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
		txtS.setEditable(false);
		txtS.setDisabledTextColor(new Color(255, 255, 255));
		txtS.setSelectionColor(new Color(255, 255, 255));
		txtS.setBackground(Color.WHITE);
		txtS.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(192, 192, 192), new Color(192, 192, 192),
				new Color(192, 192, 192), new Color(192, 192, 192)));
		txtS.setFont(new Font("Monospaced", Font.PLAIN, 12));
		scrollPane.setViewportView(txtS);

		btnCerrar = new JButton("Cerrar");
		btnCerrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(222, 248, 89, 23);
		getContentPane().add(btnCerrar);

		btnListar = new JButton("Listar");
		btnListar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnListar.addActionListener(this);
		btnListar.setBounds(118, 248, 89, 23);
		getContentPane().add(btnListar);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
		if (e.getSource() == btnListar) {
			actionPerformedBtnListar(e);
		}
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

	protected void actionPerformedBtnCerrar(ActionEvent e) {
		dispose();
	}
}// FIN
