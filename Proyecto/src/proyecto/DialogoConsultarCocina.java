package proyecto;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DialogoConsultarCocina extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JLabel lblModelo;
	private JLabel lblPrecio;
	private JLabel lblAncho;
	private JLabel lblAlto;
	private JLabel lblFondo;
	private JLabel lblQuemadores;
	private JComboBox cboModelo;
	private JTextField txtPrecio;
	private JTextField txtAncho;
	private JTextField txtAlto;
	private JTextField txtFondo;
	private JTextField txtQuemadores;
	private JButton btnBorrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DialogoConsultarCocina dialog = new DialogoConsultarCocina();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DialogoConsultarCocina() {
		setTitle("ConsultarCocina");
		setBounds(100, 100, 450, 224);
		getContentPane().setLayout(null);

		lblModelo = new JLabel("Modelo");
		lblModelo.setBounds(21, 21, 46, 14);
		getContentPane().add(lblModelo);

		lblPrecio = new JLabel("Precio (S/)");
		lblPrecio.setBounds(21, 46, 71, 14);
		getContentPane().add(lblPrecio);

		lblAncho = new JLabel("Ancho(cm)");
		lblAncho.setBounds(21, 71, 71, 14);
		getContentPane().add(lblAncho);

		lblAlto = new JLabel("Alto (cm)");
		lblAlto.setBounds(21, 96, 71, 14);
		getContentPane().add(lblAlto);

		lblFondo = new JLabel("Fondo(cm)");
		lblFondo.setBounds(21, 121, 71, 14);
		getContentPane().add(lblFondo);

		lblQuemadores = new JLabel("Quemadores");
		lblQuemadores.setBounds(21, 146, 76, 14);
		getContentPane().add(lblQuemadores);

		cboModelo = new JComboBox();
		cboModelo.addActionListener(this);
		cboModelo.setModel(new DefaultComboBoxModel(
				new String[] { "Mabe EMP6120PG0", "Indurama Parma", "Coldex CX602", "Sole COSOL027", "Reco Dakota" }));
		cboModelo.setBounds(103, 17, 131, 22);
		getContentPane().add(cboModelo);

		txtPrecio = new JTextField();
		txtPrecio.addActionListener(this);
		txtPrecio.setBounds(103, 43, 131, 20);
		getContentPane().add(txtPrecio);
		txtPrecio.setColumns(10);

		txtAncho = new JTextField();
		txtAncho.setBounds(103, 68, 131, 20);
		getContentPane().add(txtAncho);
		txtAncho.setColumns(10);

		txtAlto = new JTextField();
		txtAlto.setBounds(103, 93, 131, 20);
		getContentPane().add(txtAlto);
		txtAlto.setColumns(10);

		txtFondo = new JTextField();
		txtFondo.setBounds(103, 118, 131, 20);
		getContentPane().add(txtFondo);
		txtFondo.setColumns(10);

		txtQuemadores = new JTextField();
		txtQuemadores.setBounds(103, 143, 131, 20);
		getContentPane().add(txtQuemadores);
		txtQuemadores.setColumns(10);

		btnBorrar = new JButton("Borrar");
		btnBorrar.setBounds(316, 17, 89, 23);
		getContentPane().add(btnBorrar);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == txtPrecio) {
			actionPerformedTxtPrecio(e);
		}
		if (e.getSource() == cboModelo) {
			actionPerformedCboModelo(e);
		}
	}

	protected void actionPerformedCboModelo(ActionEvent e) {

	}

	protected void actionPerformedTxtPrecio(ActionEvent e) {

	}
}
