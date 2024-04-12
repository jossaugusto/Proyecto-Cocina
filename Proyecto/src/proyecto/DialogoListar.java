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

public class DialogoListar extends JDialog implements ActionListener, CaretListener {

	private static final long serialVersionUID = 1L;
	private JScrollPane scrollPane;
	private JTextArea txtS;
	private JButton btnCerrar;
	private JButton btnListar;
	private JPanel panel;

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
		setTitle("Listar");
		setBounds(100, 100, 466, 321);
		getContentPane().setLayout(null);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 430, 226);
		getContentPane().add(scrollPane);

		txtS = new JTextArea();
		txtS.addCaretListener(this);
		txtS.setFont(new Font("Monospaced", Font.PLAIN, 12));
		scrollPane.setViewportView(txtS);

		panel = new JPanel();
		panel.setBounds(131, 248, 188, 23);
		getContentPane().add(panel);
		panel.setLayout(null);

		btnCerrar = new JButton("Cerrar");
		btnCerrar.setBounds(99, 0, 89, 23);
		panel.add(btnCerrar);

		btnListar = new JButton("Listar");
		btnListar.addActionListener(this);
		btnListar.setBounds(0, 0, 89, 23);
		panel.add(btnListar);
		btnCerrar.addActionListener(this);

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
		txtS.append("Quemadores : " + MenuPrincipal.quemadores4 + "\n\n");

	}

	public void caretUpdate(CaretEvent e) {
		if (e.getSource() == txtS) {
			caretUpdateTxtS(e);
		}
	}

	protected void caretUpdateTxtS(CaretEvent e) {

	}
}// FIN
