package proyecto;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Cursor;
import java.awt.Toolkit;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class DialogoModificarCocina extends JDialog implements ActionListener, KeyListener {

	private static final long serialVersionUID = 1L;
	private JTextField txtPrecio;
	private JTextField txtAncho;
	private JTextField txtAlto;
	private JTextField txtFondo;
	private JTextField txtQuemadores;
	private JComboBox<String> cboModelo;
	private JButton btnGrabar;
	private JButton btnCerrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DialogoModificarCocina dialog = new DialogoModificarCocina();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * Create the dialog.
	 * 
	 */

	public DialogoModificarCocina() {
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setBackground(new Color(240, 240, 240));
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage(DialogoModificarCocina.class.getResource("/Imagenes/iconoEscudo.png")));
		getContentPane().setBackground(new Color(192, 192, 192));
		setTitle("Modificar Cocina");
		setBounds(100, 100, 450, 208);
		getContentPane().setLayout(null);
		{
			JLabel lblModelo = new JLabel("Modelo");
			lblModelo.setBackground(new Color(255, 255, 255));
			lblModelo.setForeground(new Color(0, 0, 0));
			lblModelo.setFont(new Font("Roboto", Font.PLAIN, 13));
			lblModelo.setBounds(10, 15, 46, 14);
			getContentPane().add(lblModelo);
		}
		{
			JLabel lblPrecio = new JLabel("Precio (S/)");
			lblPrecio.setForeground(new Color(0, 0, 0));
			lblPrecio.setFont(new Font("Roboto", Font.PLAIN, 13));
			lblPrecio.setBounds(10, 40, 72, 14);
			getContentPane().add(lblPrecio);
		}
		{
			JLabel lblAncho = new JLabel("Ancho (cm)");
			lblAncho.setFont(new Font("Roboto", Font.PLAIN, 13));
			lblAncho.setForeground(new Color(0, 0, 0));
			lblAncho.setBounds(10, 65, 72, 14);
			getContentPane().add(lblAncho);
		}
		{
			JLabel lblAlto = new JLabel("Alto (cm)");
			lblAlto.setForeground(new Color(0, 0, 0));
			lblAlto.setFont(new Font("Roboto", Font.PLAIN, 13));
			lblAlto.setBounds(10, 90, 72, 14);
			getContentPane().add(lblAlto);
		}
		{
			JLabel lblFondo = new JLabel("Fondo (cm)");
			lblFondo.setFont(new Font("Roboto", Font.PLAIN, 13));
			lblFondo.setForeground(new Color(0, 0, 0));
			lblFondo.setBounds(10, 115, 72, 14);
			getContentPane().add(lblFondo);
		}
		{
			JLabel lblQuemadores = new JLabel("Quemadores");
			lblQuemadores.setForeground(new Color(0, 0, 0));
			lblQuemadores.setFont(new Font("Roboto", Font.PLAIN, 13));
			lblQuemadores.setBounds(10, 140, 81, 14);
			getContentPane().add(lblQuemadores);
		}
		{
			cboModelo = new JComboBox<String>();
			cboModelo.setBorder(null);
			cboModelo.setFont(new Font("Roboto", Font.PLAIN, 12));
			cboModelo.addActionListener(this);
			cboModelo.setModel(new DefaultComboBoxModel<String>(new String[] { "Mabe EMP6120PG0", "Indurama Parma",
					"Sole COSOL027", "Coldex CX602", "Reco Dakota" }));
			cboModelo.setBounds(92, 11, 118, 22);
			getContentPane().add(cboModelo);
		}
		{
			txtPrecio = new JTextField(MenuPrincipal.precio0 + "");
			txtPrecio.addKeyListener(this);
			txtPrecio.setFont(new Font("Roboto", Font.PLAIN, 12));
			txtPrecio.setHorizontalAlignment(SwingConstants.LEFT);
			txtPrecio.setBorder(null);
			txtPrecio.setBounds(92, 37, 118, 20);
			getContentPane().add(txtPrecio);
			txtPrecio.setColumns(10);
		}
		{
			txtAncho = new JTextField(MenuPrincipal.ancho0 + "");
			txtAncho.addKeyListener(this);
			txtAncho.setHorizontalAlignment(SwingConstants.LEFT);
			txtAncho.setFont(new Font("Roboto", Font.PLAIN, 12));
			txtAncho.setBorder(null);
			txtAncho.setBounds(92, 62, 118, 20);
			getContentPane().add(txtAncho);
			txtAncho.setColumns(10);
		}
		{
			txtAlto = new JTextField(MenuPrincipal.alto0 + "");
			txtAlto.addKeyListener(this);
			txtAlto.setHorizontalAlignment(SwingConstants.LEFT);
			txtAlto.setFont(new Font("Roboto", Font.PLAIN, 12));
			txtAlto.setBorder(null);
			txtAlto.setBounds(92, 87, 118, 20);
			getContentPane().add(txtAlto);
			txtAlto.setColumns(10);
		}
		{
			txtFondo = new JTextField(MenuPrincipal.fondo0 + "");
			txtFondo.addKeyListener(this);
			txtFondo.setHorizontalAlignment(SwingConstants.LEFT);
			txtFondo.setFont(new Font("Roboto", Font.PLAIN, 12));
			txtFondo.setBorder(null);
			txtFondo.setBounds(92, 112, 118, 20);
			getContentPane().add(txtFondo);
			txtFondo.setColumns(10);
		}
		{
			txtQuemadores = new JTextField(MenuPrincipal.quemadores0 + "");
			txtQuemadores.addKeyListener(this);
			txtQuemadores.setHorizontalAlignment(SwingConstants.LEFT);
			txtQuemadores.setFont(new Font("Roboto", Font.PLAIN, 12));
			txtQuemadores.setBorder(null);
			txtQuemadores.setBounds(92, 137, 118, 20);
			getContentPane().add(txtQuemadores);
			txtQuemadores.setColumns(10);
		}
		{
			btnGrabar = new JButton("Grabar");
			btnGrabar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnGrabar.addActionListener(this);
			btnGrabar.setBounds(335, 40, 89, 23);
			getContentPane().add(btnGrabar);
		}

		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(335, 12, 89, 23);
		getContentPane().add(btnCerrar);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
		if (e.getSource() == btnGrabar) {
			actionPerformedBtnGrabar(e);
		}
		if (e.getSource() == cboModelo) {
			actionPerformedCboModelo(e);
		}
	}

	protected void actionPerformedCboModelo(ActionEvent e) {

		int modeloMD = cboModelo.getSelectedIndex();

		switch (modeloMD) {

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

	double cambiarPrecio(double precio) {
		precio = Double.parseDouble(txtPrecio.getText());

		if (precio < MenuPrincipal.precio0 || precio < MenuPrincipal.precio1 || precio < MenuPrincipal.precio2
				|| precio < MenuPrincipal.precio3 || precio < MenuPrincipal.precio4)
			precioMenor = precio;
		else if (precio > MenuPrincipal.precio0 || precio > MenuPrincipal.precio1 || precio > MenuPrincipal.precio2
				|| precio > MenuPrincipal.precio3 || precio > MenuPrincipal.precio4)
			precioMayor = precio;
		return precio;
	}

	double cambiarAncho() {
		return Double.parseDouble(txtAncho.getText());
	}

	double cambiarAlto() {
		return Double.parseDouble(txtAlto.getText());
	}

	double cambiarFondo() {
		return Double.parseDouble(txtFondo.getText());
	}

	int cambiarQuemadores() {
		return Integer.parseInt(txtQuemadores.getText());
	}

	public static double precioMayor = MenuPrincipal.precio1, precioMenor = MenuPrincipal.precio3;

	protected void actionPerformedBtnGrabar(ActionEvent e) {

		if (txtPrecio.getText().isEmpty() || txtAlto.getText().isEmpty() || txtAncho.getText().isEmpty()
				|| txtFondo.getText().isEmpty() || txtQuemadores.getText().isEmpty()) {
			JOptionPane.showMessageDialog(this, "Coloque la cantidad deseada");
			return;
		}

		double precio = 0;
		int modeloMD = cboModelo.getSelectedIndex();

		switch (modeloMD) {

		case 0:
			MenuPrincipal.precio0 = cambiarPrecio(precio);
			MenuPrincipal.ancho0 = cambiarAncho();
			MenuPrincipal.alto0 = cambiarAlto();
			MenuPrincipal.fondo0 = cambiarFondo();
			MenuPrincipal.quemadores0 = cambiarQuemadores();
			break;
		case 1:
			MenuPrincipal.precio1 = cambiarPrecio(precio);
			MenuPrincipal.ancho1 = cambiarAncho();
			MenuPrincipal.alto1 = cambiarAlto();
			MenuPrincipal.fondo1 = cambiarFondo();
			MenuPrincipal.quemadores1 = cambiarQuemadores();
			break;
		case 2:
			MenuPrincipal.precio2 = cambiarPrecio(precio);
			MenuPrincipal.ancho2 = cambiarAncho();
			MenuPrincipal.alto2 = cambiarAlto();
			MenuPrincipal.fondo2 = cambiarFondo();
			MenuPrincipal.quemadores2 = cambiarQuemadores();
			break;
		case 3:
			MenuPrincipal.precio3 = cambiarPrecio(precio);
			MenuPrincipal.ancho3 = cambiarAncho();
			MenuPrincipal.alto3 = cambiarAlto();
			MenuPrincipal.fondo3 = cambiarFondo();
			MenuPrincipal.quemadores3 = cambiarQuemadores();
			break;
		default:
			MenuPrincipal.precio4 = cambiarPrecio(precio);
			MenuPrincipal.ancho4 = cambiarAncho();
			MenuPrincipal.alto4 = cambiarAlto();
			MenuPrincipal.fondo4 = cambiarFondo();
			MenuPrincipal.quemadores4 = cambiarQuemadores();
			break;
		}

		dispose();
	}

	public void keyPressed(KeyEvent e) {
	}

	public void keyReleased(KeyEvent e) {
	}

	public void keyTyped(KeyEvent e) {
		if (e.getSource() == txtQuemadores) {
			keyTypedTxtQuemadores(e);
		}
		if (e.getSource() == txtFondo) {
			keyTypedTxtFondo(e);
		}
		if (e.getSource() == txtAlto) {
			keyTypedTxtAlto(e);
		}
		if (e.getSource() == txtAncho) {
			keyTypedTxtAncho(e);
		}
		if (e.getSource() == txtPrecio) {
			keyTypedTxtPrecio(e);
		}
	}

	protected void keyTypedTxtPrecio(KeyEvent e) {

		double key = e.getKeyChar();
		boolean punto = key == 46;
		boolean numero = key >= 48 && key < 57;
		if (!punto && !numero)
			e.consume();

	}

	protected void keyTypedTxtAncho(KeyEvent e) {

		double key = e.getKeyChar();
		boolean punto = key == 46;
		boolean numero = key >= 48 && key < 57;
		if (!punto && !numero)
			e.consume();
	}

	protected void keyTypedTxtAlto(KeyEvent e) {

		double key = e.getKeyChar();
		boolean punto = key == 46;
		boolean numero = key >= 48 && key < 57;
		if (!punto && !numero)
			e.consume();

	}

	protected void keyTypedTxtFondo(KeyEvent e) {

		double key = e.getKeyChar();
		boolean punto = key == 46;
		boolean numero = key >= 48 && key < 57;
		if (!punto && !numero)
			e.consume();

	}

	protected void keyTypedTxtQuemadores(KeyEvent e) {

		double key = e.getKeyChar();
		boolean punto = key == 46;
		boolean numero = key >= 48 && key < 57;
		if (!punto && !numero)
			e.consume();

	}

	protected void actionPerformedBtnCerrar(ActionEvent e) {
		dispose();
	}
}// Fin
