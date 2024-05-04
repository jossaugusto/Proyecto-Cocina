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
		setModal(true);
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
			txtPrecio = new JTextField();
			txtPrecio.addKeyListener(this);
			txtPrecio.setFont(new Font("Roboto", Font.PLAIN, 12));
			txtPrecio.setHorizontalAlignment(SwingConstants.LEFT);
			txtPrecio.setBorder(null);
			txtPrecio.setBounds(92, 37, 118, 20);
			getContentPane().add(txtPrecio);
			txtPrecio.setColumns(10);
		}
		{
			txtAncho = new JTextField();
			txtAncho.addKeyListener(this);
			txtAncho.setHorizontalAlignment(SwingConstants.LEFT);
			txtAncho.setFont(new Font("Roboto", Font.PLAIN, 12));
			txtAncho.setBorder(null);
			txtAncho.setBounds(92, 62, 118, 20);
			getContentPane().add(txtAncho);
			txtAncho.setColumns(10);
		}
		{
			txtAlto = new JTextField();
			txtAlto.addKeyListener(this);
			txtAlto.setHorizontalAlignment(SwingConstants.LEFT);
			txtAlto.setFont(new Font("Roboto", Font.PLAIN, 12));
			txtAlto.setBorder(null);
			txtAlto.setBounds(92, 87, 118, 20);
			getContentPane().add(txtAlto);
			txtAlto.setColumns(10);
		}
		{
			txtFondo = new JTextField();
			txtFondo.addKeyListener(this);
			txtFondo.setHorizontalAlignment(SwingConstants.LEFT);
			txtFondo.setFont(new Font("Roboto", Font.PLAIN, 12));
			txtFondo.setBorder(null);
			txtFondo.setBounds(92, 112, 118, 20);
			getContentPane().add(txtFondo);
			txtFondo.setColumns(10);
		}
		{
			txtQuemadores = new JTextField();
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
		btnCerrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(335, 12, 89, 23);
		getContentPane().add(btnCerrar);

		mostrarDatos();

	}

	void mostrarDatos() {
		txtPrecio.setText(MenuPrincipal.precio0 + "");
		txtAlto.setText(MenuPrincipal.alto0 + "");
		txtAncho.setText(MenuPrincipal.ancho0 + "");
		txtFondo.setText(MenuPrincipal.fondo0 + "");
		txtQuemadores.setText(MenuPrincipal.quemadores0 + "");
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
			imprimir(MenuPrincipal.precio0, MenuPrincipal.ancho0, MenuPrincipal.alto0, MenuPrincipal.fondo0,
					MenuPrincipal.quemadores0);
			break;
		case 1:
			imprimir(MenuPrincipal.precio1, MenuPrincipal.ancho1, MenuPrincipal.alto1, MenuPrincipal.fondo1,
					MenuPrincipal.quemadores1);
			break;
		case 2:
			imprimir(MenuPrincipal.precio2, MenuPrincipal.ancho2, MenuPrincipal.alto2, MenuPrincipal.fondo2,
					MenuPrincipal.quemadores2);
			break;
		case 3:
			imprimir(MenuPrincipal.precio3, MenuPrincipal.ancho3, MenuPrincipal.alto3, MenuPrincipal.fondo3,
					MenuPrincipal.quemadores3);
			break;
		default:
			imprimir(MenuPrincipal.precio4, MenuPrincipal.ancho4, MenuPrincipal.alto4, MenuPrincipal.fondo4,
					MenuPrincipal.quemadores4);
		}
	}

	double cambiarPrecio() {
		return Double.parseDouble(txtPrecio.getText());
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

	protected void actionPerformedBtnGrabar(ActionEvent e) {

		int modelo = cboModelo.getSelectedIndex();

		campoDeTextoVacio();

		switch (modelo) {

		case 0:
			MenuPrincipal.precio0 = cambiarPrecio();
			MenuPrincipal.ancho0 = cambiarAncho();
			MenuPrincipal.alto0 = cambiarAlto();
			MenuPrincipal.fondo0 = cambiarFondo();
			MenuPrincipal.quemadores0 = cambiarQuemadores();
			break;
		case 1:
			MenuPrincipal.precio1 = cambiarPrecio();
			MenuPrincipal.ancho1 = cambiarAncho();
			MenuPrincipal.alto1 = cambiarAlto();
			MenuPrincipal.fondo1 = cambiarFondo();
			MenuPrincipal.quemadores1 = cambiarQuemadores();
			break;
		case 2:
			MenuPrincipal.precio2 = cambiarPrecio();
			MenuPrincipal.ancho2 = cambiarAncho();
			MenuPrincipal.alto2 = cambiarAlto();
			MenuPrincipal.fondo2 = cambiarFondo();
			MenuPrincipal.quemadores2 = cambiarQuemadores();
			break;
		case 3:
			MenuPrincipal.precio3 = cambiarPrecio();
			MenuPrincipal.ancho3 = cambiarAncho();
			MenuPrincipal.alto3 = cambiarAlto();
			MenuPrincipal.fondo3 = cambiarFondo();
			MenuPrincipal.quemadores3 = cambiarQuemadores();
			break;
		default:
			MenuPrincipal.precio4 = cambiarPrecio();
			MenuPrincipal.ancho4 = cambiarAncho();
			MenuPrincipal.alto4 = cambiarAlto();
			MenuPrincipal.fondo4 = cambiarFondo();
			MenuPrincipal.quemadores4 = cambiarQuemadores();
			break;
		}

		leerPrecioMenor();
		leerPrecioMayor();
		leerAnchoMenor();
		leerAnchoMayor();
		dispose();
	}

	void leerPrecioMenor() {
		if (cambiarPrecio() < MenuPrincipal.precioMenor) {
			MenuPrincipal.precioMenor = cambiarPrecio();
			MenuPrincipal.precioPromedio = (cambiarPrecio() + MenuPrincipal.precioMayor) / 2;
		} else if (MenuPrincipal.precio0 < MenuPrincipal.precio1 && MenuPrincipal.precio0 < MenuPrincipal.precio2
				&& MenuPrincipal.precio0 < MenuPrincipal.precio3 && MenuPrincipal.precio0 < MenuPrincipal.precio4) {
			MenuPrincipal.precioMenor = MenuPrincipal.precio0;
			MenuPrincipal.precioPromedio = (MenuPrincipal.precio0 + MenuPrincipal.precioMayor) / 2;
		} else if (MenuPrincipal.precio1 < MenuPrincipal.precio0 && MenuPrincipal.precio1 < MenuPrincipal.precio2
				&& MenuPrincipal.precio1 < MenuPrincipal.precio3 && MenuPrincipal.precio1 < MenuPrincipal.precio4) {
			MenuPrincipal.precioMenor = MenuPrincipal.precio1;
			MenuPrincipal.precioPromedio = (MenuPrincipal.precio1 + MenuPrincipal.precioMayor) / 2;
		} else if (MenuPrincipal.precio2 < MenuPrincipal.precio1 && MenuPrincipal.precio2 < MenuPrincipal.precio0
				&& MenuPrincipal.precio2 < MenuPrincipal.precio3 && MenuPrincipal.precio2 < MenuPrincipal.precio4) {
			MenuPrincipal.precioMenor = MenuPrincipal.precio2;
			MenuPrincipal.precioPromedio = (MenuPrincipal.precio2 + MenuPrincipal.precioMayor) / 2;
		} else if (MenuPrincipal.precio3 < MenuPrincipal.precio1 && MenuPrincipal.precio3 < MenuPrincipal.precio2
				&& MenuPrincipal.precio3 < MenuPrincipal.precio0 && MenuPrincipal.precio3 < MenuPrincipal.precio4) {
			MenuPrincipal.precioMenor = MenuPrincipal.precio3;
			MenuPrincipal.precioPromedio = (MenuPrincipal.precio3 + MenuPrincipal.precioMayor) / 2;
		} else
			MenuPrincipal.precioMenor = MenuPrincipal.precio4;
		MenuPrincipal.precioPromedio = (MenuPrincipal.precio4 + MenuPrincipal.precioMayor) / 2;
	}

	void leerPrecioMayor() {
		if (cambiarPrecio() > MenuPrincipal.precioMayor) {
			MenuPrincipal.precioMayor = cambiarPrecio();
			MenuPrincipal.precioPromedio = (cambiarPrecio() + MenuPrincipal.precioMenor) / 2;
		} else if (MenuPrincipal.precio0 > MenuPrincipal.precio1 && MenuPrincipal.precio0 > MenuPrincipal.precio2
				&& MenuPrincipal.precio0 > MenuPrincipal.precio3 && MenuPrincipal.precio0 > MenuPrincipal.precio4) {
			MenuPrincipal.precioMayor = MenuPrincipal.precio0;
			MenuPrincipal.precioPromedio = (MenuPrincipal.precio0 + MenuPrincipal.precioMenor) / 2;
		} else if (MenuPrincipal.precio1 > MenuPrincipal.precio0 && MenuPrincipal.precio1 > MenuPrincipal.precio2
				&& MenuPrincipal.precio1 > MenuPrincipal.precio3 && MenuPrincipal.precio1 > MenuPrincipal.precio4) {
			MenuPrincipal.precioMayor = MenuPrincipal.precio1;
			MenuPrincipal.precioPromedio = (MenuPrincipal.precio1 + MenuPrincipal.precioMenor) / 2;
		} else if (MenuPrincipal.precio2 > MenuPrincipal.precio1 && MenuPrincipal.precio2 > MenuPrincipal.precio0
				&& MenuPrincipal.precio2 > MenuPrincipal.precio3 && MenuPrincipal.precio2 > MenuPrincipal.precio4) {
			MenuPrincipal.precioMayor = MenuPrincipal.precio2;
			MenuPrincipal.precioPromedio = (MenuPrincipal.precio2 + MenuPrincipal.precioMenor) / 2;
		} else if (MenuPrincipal.precio3 > MenuPrincipal.precio1 && MenuPrincipal.precio3 > MenuPrincipal.precio2
				&& MenuPrincipal.precio3 > MenuPrincipal.precio0 && MenuPrincipal.precio3 > MenuPrincipal.precio4) {
			MenuPrincipal.precioMayor = MenuPrincipal.precio3;
			MenuPrincipal.precioPromedio = (MenuPrincipal.precio3 + MenuPrincipal.precioMenor) / 2;
		} else
			MenuPrincipal.precioMayor = MenuPrincipal.precio4;
		MenuPrincipal.precioPromedio = (MenuPrincipal.precio4 + MenuPrincipal.precioMayor) / 2;
	}

	void leerAnchoMenor() {
		if (cambiarPrecio() < MenuPrincipal.anchoMenor) {
			MenuPrincipal.anchoMenor = cambiarPrecio();
			MenuPrincipal.anchoPromedio = (cambiarPrecio() + MenuPrincipal.anchoMayor) / 2;
		} else if (MenuPrincipal.ancho0 < MenuPrincipal.ancho1 && MenuPrincipal.ancho0 < MenuPrincipal.ancho2
				&& MenuPrincipal.ancho0 < MenuPrincipal.ancho3 && MenuPrincipal.ancho0 < MenuPrincipal.ancho4) {
			MenuPrincipal.anchoMenor = MenuPrincipal.ancho0;
			MenuPrincipal.anchoPromedio = (MenuPrincipal.ancho0 + MenuPrincipal.anchoMayor) / 2;
		} else if (MenuPrincipal.ancho1 < MenuPrincipal.ancho0 && MenuPrincipal.ancho1 < MenuPrincipal.ancho2
				&& MenuPrincipal.ancho1 < MenuPrincipal.ancho3 && MenuPrincipal.ancho1 < MenuPrincipal.ancho4) {
			MenuPrincipal.anchoMenor = MenuPrincipal.ancho1;
			MenuPrincipal.anchoPromedio = (MenuPrincipal.ancho1 + MenuPrincipal.anchoMayor) / 2;
		} else if (MenuPrincipal.ancho2 < MenuPrincipal.ancho1 && MenuPrincipal.ancho2 < MenuPrincipal.ancho0
				&& MenuPrincipal.ancho2 < MenuPrincipal.ancho3 && MenuPrincipal.ancho2 < MenuPrincipal.ancho4) {
			MenuPrincipal.anchoMenor = MenuPrincipal.ancho2;
			MenuPrincipal.anchoPromedio = (MenuPrincipal.ancho2 + MenuPrincipal.anchoMayor) / 2;
		} else if (MenuPrincipal.ancho3 < MenuPrincipal.ancho1 && MenuPrincipal.ancho3 < MenuPrincipal.ancho2
				&& MenuPrincipal.ancho3 < MenuPrincipal.ancho0 && MenuPrincipal.ancho3 < MenuPrincipal.ancho4) {
			MenuPrincipal.anchoMenor = MenuPrincipal.ancho3;
			MenuPrincipal.anchoPromedio = (MenuPrincipal.ancho3 + MenuPrincipal.anchoMayor) / 2;
		} else
			MenuPrincipal.anchoMenor = MenuPrincipal.ancho4;
			MenuPrincipal.anchoPromedio = (MenuPrincipal.ancho4 + MenuPrincipal.anchoMayor) / 2;
	}

	void leerAnchoMayor() {
		if (cambiarPrecio() > MenuPrincipal.anchoMayor) {
			MenuPrincipal.anchoMayor = cambiarPrecio();
			MenuPrincipal.anchoPromedio = (cambiarPrecio() + MenuPrincipal.anchoMenor) / 2;
		} else if (MenuPrincipal.ancho0 > MenuPrincipal.ancho1 && MenuPrincipal.ancho0 > MenuPrincipal.ancho2
				&& MenuPrincipal.ancho0 > MenuPrincipal.ancho3 && MenuPrincipal.ancho0 > MenuPrincipal.ancho4) {
			MenuPrincipal.anchoMayor = MenuPrincipal.ancho0;
			MenuPrincipal.anchoPromedio = (MenuPrincipal.ancho0 + MenuPrincipal.anchoMenor) / 2;
		} else if (MenuPrincipal.ancho1 > MenuPrincipal.ancho0 && MenuPrincipal.ancho1 > MenuPrincipal.ancho2
				&& MenuPrincipal.ancho1 > MenuPrincipal.ancho3 && MenuPrincipal.ancho1 > MenuPrincipal.ancho4) {
			MenuPrincipal.anchoMayor = MenuPrincipal.ancho1;
			MenuPrincipal.anchoPromedio = (MenuPrincipal.ancho1 + MenuPrincipal.anchoMenor) / 2;
		} else if (MenuPrincipal.ancho2 > MenuPrincipal.ancho1 && MenuPrincipal.ancho2 > MenuPrincipal.ancho0
				&& MenuPrincipal.ancho2 > MenuPrincipal.ancho3 && MenuPrincipal.ancho2 > MenuPrincipal.ancho4) {
			MenuPrincipal.anchoMayor = MenuPrincipal.ancho2;
			MenuPrincipal.anchoPromedio = (MenuPrincipal.ancho2 + MenuPrincipal.anchoMenor) / 2;
		} else if (MenuPrincipal.ancho3 > MenuPrincipal.ancho1 && MenuPrincipal.ancho3 > MenuPrincipal.ancho2
				&& MenuPrincipal.ancho3 > MenuPrincipal.ancho0 && MenuPrincipal.ancho3 > MenuPrincipal.ancho4) {
			MenuPrincipal.anchoMayor = MenuPrincipal.ancho3;
			MenuPrincipal.anchoPromedio = (MenuPrincipal.ancho3 + MenuPrincipal.anchoMenor) / 2;
		} else
			MenuPrincipal.anchoMayor = MenuPrincipal.ancho4;
		MenuPrincipal.anchoPromedio = (MenuPrincipal.ancho4 + MenuPrincipal.anchoMenor) / 2;
	}

	void imprimir(double pre, double anc, double alt, double fond, int quem) {
		txtPrecio.setText(pre + "");
		txtAncho.setText(anc + "");
		txtAlto.setText(alt + "");
		txtFondo.setText(fond + "");
		txtQuemadores.setText(quem + "");
	}

	void campoDeTextoVacio() {

		String campoTextoPrecio = txtPrecio.getText();
		String campoTextoAncho = txtAncho.getText();
		String campoTextoAlto = txtAlto.getText();
		String campoTextoFondo = txtFondo.getText();
		String campoTextoQuemadores = txtQuemadores.getText();

		if (campoTextoPrecio.isEmpty() || campoTextoAncho.isEmpty() || campoTextoAlto.isEmpty()
				|| campoTextoFondo.isEmpty() || campoTextoQuemadores.isEmpty()) {
			JOptionPane.showMessageDialog(this, "Coloque la cantidad deseada");
		}
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
		boolean numero = key >= 48 && key < 58;
		if (!punto && !numero)
			e.consume();

	}

	protected void keyTypedTxtAncho(KeyEvent e) {

		double key = e.getKeyChar();
		boolean punto = key == 46;
		boolean numero = key >= 48 && key < 58;
		if (!punto && !numero)
			e.consume();
	}

	protected void keyTypedTxtAlto(KeyEvent e) {

		double key = e.getKeyChar();
		boolean punto = key == 46;
		boolean numero = key >= 48 && key < 58;
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
