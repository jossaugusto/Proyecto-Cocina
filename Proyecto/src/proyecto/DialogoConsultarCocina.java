package proyecto;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.Cursor;
import javax.swing.SwingConstants;
import java.awt.Toolkit;

public class DialogoConsultarCocina extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JLabel lblModelo;
	private JLabel lblPrecio;
	private JLabel lblAncho;
	private JLabel lblAlto;
	private JLabel lblFondo;
	private JLabel lblQuemadores;
	private JComboBox <String> cboModelo;
	private JTextField txtPrecio;
	private JTextField txtAncho;
	private JTextField txtAlto;
	private JTextField txtFondo;
	private JTextField txtQuemadores;
	private JButton btnCerrar;

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
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage(DialogoConsultarCocina.class.getResource("/Imagenes/iconoEscudo.png")));
		getContentPane().setForeground(new Color(255, 255, 255));
		setBackground(new Color(255, 255, 255));
		getContentPane().setBackground(new Color(192, 192, 192));
		setTitle("Consultar Cocina");
		setBounds(100, 100, 450, 224);
		getContentPane().setLayout(null);

		lblModelo = new JLabel("Modelo");
		lblModelo.setBackground(new Color(255, 255, 255));
		lblModelo.setForeground(new Color(0, 0, 0));
		lblModelo.setBounds(21, 21, 46, 14);
		lblModelo.setFont(new Font("Roboto", Font.PLAIN, 13));
		getContentPane().add(lblModelo);

		lblPrecio = new JLabel("Precio (S/)");
		lblPrecio.setBackground(new Color(255, 255, 255));
		lblPrecio.setForeground(new Color(0, 0, 0));
		lblPrecio.setBounds(21, 46, 71, 14);
		lblPrecio.setFont(new Font("Roboto", Font.PLAIN, 13));
		getContentPane().add(lblPrecio);

		lblAncho = new JLabel("Ancho(cm)");
		lblAncho.setForeground(new Color(0, 0, 0));
		lblAncho.setBounds(21, 71, 71, 14);
		lblAncho.setFont(new Font("Roboto", Font.PLAIN, 13));
		getContentPane().add(lblAncho);

		lblAlto = new JLabel("Alto (cm)");
		lblAlto.setForeground(new Color(0, 0, 0));
		lblAlto.setBounds(21, 96, 71, 14);
		lblAlto.setFont(new Font("Roboto", Font.PLAIN, 13));
		getContentPane().add(lblAlto);

		lblFondo = new JLabel("Fondo(cm)");
		lblFondo.setForeground(new Color(0, 0, 0));
		lblFondo.setBounds(21, 121, 71, 14);
		lblFondo.setFont(new Font("Roboto", Font.PLAIN, 13));
		getContentPane().add(lblFondo);

		lblQuemadores = new JLabel("Quemadores");
		lblQuemadores.setForeground(new Color(0, 0, 0));
		lblQuemadores.setBounds(21, 146, 76, 14);
		lblQuemadores.setFont(new Font("Roboto", Font.PLAIN, 13));
		getContentPane().add(lblQuemadores);

		cboModelo = new JComboBox<String>();
		cboModelo.setForeground(new Color(0, 0, 0));
		cboModelo.setBorder(null);
		cboModelo.setBackground(new Color(207, 207, 207));
		cboModelo.setFont(new Font("Roboto", Font.PLAIN, 12));
		cboModelo.setBounds(103, 17, 131, 22);
		cboModelo.addActionListener(this);
		cboModelo.setModel(new DefaultComboBoxModel<String>(new String[] { "Mabe EMP6120PG0", "Indurama Parma", "Coldex CX602", "Sole COSOL027", "Reco Dakota" }));
		getContentPane().add(cboModelo);

		txtPrecio = new JTextField(MenuPrincipal.precio0 + "");
		txtPrecio.setForeground(new Color(0, 0, 0));
		txtPrecio.setSelectionColor(new Color(0, 128, 255));
		txtPrecio.setHorizontalAlignment(SwingConstants.LEFT);
		txtPrecio.setEditable(false);
		txtPrecio.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		txtPrecio.setBorder(null);
		txtPrecio.setFont(new Font("Roboto", Font.PLAIN, 12));
		txtPrecio.setBounds(103, 43, 131, 20);
		txtPrecio.addActionListener(this);
		getContentPane().add(txtPrecio);
		txtPrecio.setColumns(10);

		txtAncho = new JTextField(MenuPrincipal.ancho0 + "");
		txtAncho.setHorizontalAlignment(SwingConstants.LEFT);
		txtAncho.setEditable(false);
		txtAncho.setBorder(null);
		txtAncho.setFont(new Font("Roboto", Font.PLAIN, 12));
		txtAncho.setBounds(103, 68, 131, 20);
		getContentPane().add(txtAncho);
		txtAncho.setColumns(10);

		txtAlto = new JTextField(MenuPrincipal.alto0 + "");
		txtAlto.setEditable(false);
		txtAlto.setHorizontalAlignment(SwingConstants.LEFT);
		txtAlto.setBorder(null);
		txtAlto.setFont(new Font("Roboto", Font.PLAIN, 12));
		txtAlto.setBounds(103, 93, 131, 20);
		getContentPane().add(txtAlto);
		txtAlto.setColumns(10);

		txtFondo = new JTextField(MenuPrincipal.fondo0 + "");
		txtFondo.setHorizontalAlignment(SwingConstants.LEFT);
		txtFondo.setEditable(false);
		txtFondo.setBorder(null);
		txtFondo.setFont(new Font("Roboto", Font.PLAIN, 12));
		txtFondo.setBounds(103, 118, 131, 20);
		getContentPane().add(txtFondo);
		txtFondo.setColumns(10);

		txtQuemadores = new JTextField(MenuPrincipal.quemadores0 + "");
		txtQuemadores.setEditable(false);
		txtQuemadores.setHorizontalAlignment(SwingConstants.LEFT);
		txtQuemadores.setBorder(null);
		txtQuemadores.setFont(new Font("Roboto", Font.PLAIN, 12));
		txtQuemadores.setBounds(103, 143, 131, 20);
		getContentPane().add(txtQuemadores);
		txtQuemadores.setColumns(10);

		btnCerrar = new JButton("Cerrar");
		btnCerrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(323, 43, 89, 23);
		getContentPane().add(btnCerrar);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}

		if (e.getSource() == cboModelo) {
			actionPerformedCboModelo(e);
		}
	}

	protected void actionPerformedCboModelo(ActionEvent e) {

		int modeloCC = cboModelo.getSelectedIndex();

		switch (modeloCC) {

		case 0:
			txtPrecio.setText(MenuPrincipal.precio0 + "");
			txtAncho.setText(MenuPrincipal.ancho0 + "");
			txtAlto.setText(MenuPrincipal.alto0 + "");
			txtFondo.setText(MenuPrincipal.fondo0 + "");
			txtQuemadores.setText(MenuPrincipal.quemadores0 + "");
			break;
		case 1:
			txtPrecio.setText(MenuPrincipal.precio1 + "");
			txtAncho.setText(MenuPrincipal.ancho1 + "");
			txtAlto.setText(MenuPrincipal.alto1 + "");
			txtFondo.setText(MenuPrincipal.fondo1 + "");
			txtQuemadores.setText(MenuPrincipal.quemadores1 + "");
			break;
		case 2:
			txtPrecio.setText(MenuPrincipal.precio2 + "");
			txtAncho.setText(MenuPrincipal.ancho2 + "");
			txtAlto.setText(MenuPrincipal.alto2 + "");
			txtFondo.setText(MenuPrincipal.fondo2 + "");
			txtQuemadores.setText(MenuPrincipal.quemadores2 + "");
			break;
		case 3:
			txtPrecio.setText(MenuPrincipal.precio3 + "");
			txtAncho.setText(MenuPrincipal.ancho3 + "");
			txtAlto.setText(MenuPrincipal.alto3 + "");
			txtFondo.setText(MenuPrincipal.fondo3 + "");
			txtQuemadores.setText(MenuPrincipal.quemadores3 + "");
			break;
		default:
			txtPrecio.setText(MenuPrincipal.precio4 + "");
			txtAncho.setText(MenuPrincipal.ancho4 + "");
			txtAlto.setText(MenuPrincipal.alto4 + "");
			txtFondo.setText(MenuPrincipal.fondo4 + "");
			txtQuemadores.setText(MenuPrincipal.quemadores4 + "");
		}

	}

	protected void actionPerformedBtnCerrar(ActionEvent e) {

		dispose();
	}
}// Fin
