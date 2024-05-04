package proyecto;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.Cursor;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class DialogoVender1 extends JDialog implements ActionListener, KeyListener {

	private static final long serialVersionUID = 1L;
	private JTextField txtPrecio;
	private JTextField txtCantidad;
	private JButton btnCerrar;
	private JButton btnVender;
	private JComboBox<String> cboModelo;
	private JScrollPane scrollPane;
	private JTextArea txtS;

	int cantidad = 0;
	String regalo = "", modelo = "";
	double impC = 0, impD = 0, impP, precio = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DialogoVender1 dialog = new DialogoVender1();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DialogoVender1() {
		setModal(true);
		getContentPane().setForeground(new Color(255, 255, 255));
		setTitle("Vender");
		setIconImage(
				Toolkit.getDefaultToolkit().getImage(DialogoVender1.class.getResource("/Imagenes/iconoEscudo.png")));
		getContentPane().setBackground(new Color(192, 192, 192));
		setBounds(100, 100, 463, 351);
		getContentPane().setLayout(null);
		{
			JLabel lblModelo = new JLabel("Modelo");
			lblModelo.setFont(new Font("Roboto", Font.PLAIN, 13));
			lblModelo.setBounds(10, 15, 59, 14);
			getContentPane().add(lblModelo);
		}
		{
			JLabel lblPrecio = new JLabel("Precio(S/)");
			lblPrecio.setFont(new Font("Roboto", Font.PLAIN, 13));
			lblPrecio.setBounds(10, 40, 59, 14);
			getContentPane().add(lblPrecio);
		}
		{
			JLabel lblCantidad = new JLabel("Cantidad");
			lblCantidad.setFont(new Font("Roboto", Font.PLAIN, 13));
			lblCantidad.setBounds(10, 72, 59, 14);
			getContentPane().add(lblCantidad);
		}
		{
			cboModelo = new JComboBox<String>();
			cboModelo.addActionListener(this);
			cboModelo.setBounds(79, 11, 138, 22);
			cboModelo.setFont(new Font("Roboto", Font.PLAIN, 12));
			cboModelo.setModel(new DefaultComboBoxModel<String>(new String[] { "Mabe EMP6120PG0", "Indurama Parma",
					"Sole COSOL027", "Coldex CX602", "Reco Dakota" }));
			getContentPane().add(cboModelo);
		}
		{
			txtPrecio = new JTextField();
			txtPrecio.setFont(new Font("Roboto", Font.PLAIN, 12));
			txtPrecio.setEditable(false);
			txtPrecio.setBorder(null);
			txtPrecio.setBounds(79, 37, 138, 20);
			txtPrecio.setColumns(10);
			getContentPane().add(txtPrecio);
		}
		{
			txtCantidad = new JTextField();
			txtCantidad.setFont(new Font("Roboto", Font.PLAIN, 12));
			txtCantidad.addKeyListener(this);
			txtCantidad.setBorder(null);
			txtCantidad.setBounds(79, 69, 138, 20);
			txtCantidad.setColumns(10);
			getContentPane().add(txtCantidad);
		}
		{
			btnCerrar = new JButton("Cerrar");
			btnCerrar.addActionListener(this);
			btnCerrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnCerrar.setBounds(351, 40, 89, 23);
			getContentPane().add(btnCerrar);
		}
		{
			btnVender = new JButton("Vender");
			btnVender.addActionListener(this);
			btnVender.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnVender.setBounds(351, 11, 89, 23);
			getContentPane().add(btnVender);
		}

		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 116, 430, 188);
		getContentPane().add(scrollPane);

		txtS = new JTextArea();
		txtS.setEditable(false);
		txtS.setFont(new Font("Monospaced", Font.PLAIN, 13));
		scrollPane.setViewportView(txtS);

		mostrarDatos();
	}

	void mostrarDatos() {
		txtPrecio.setText(MenuPrincipal.precio0 + "");
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
		if (e.getSource() == btnVender) {
			actionPerformedBtnVender(e);
		}
		if (e.getSource() == cboModelo) {
			actionPerformedCboModelo(e);
		}
	}

	protected void actionPerformedCboModelo(ActionEvent e) {

		String modelo;
		modelo = (String) cboModelo.getSelectedItem();

		switch (modelo) {
		case "Mabe EMP6120PG0":
			txtPrecio.setText(MenuPrincipal.precio0 + "");
			break;

		case "Indurama Parma":
			txtPrecio.setText(MenuPrincipal.precio1 + "");
			break;

		case "Sole COSOL027":
			txtPrecio.setText(MenuPrincipal.precio2 + "");
			break;

		case "Coldex CX602":
			txtPrecio.setText(MenuPrincipal.precio3 + "");
			break;

		default:
			txtPrecio.setText(MenuPrincipal.precio4 + "");
			break;
		}
	}

	protected void actionPerformedBtnVender(ActionEvent e) {

//=============campo de texto vacio=================================================
		if (txtCantidad.getText().isEmpty()) {
			JOptionPane.showMessageDialog(this, "Coloque la cantidad deseada");
			return;
		}
//===================================================================================
		cantidad = leerCantidad();

		modelo = leerModelo();

		precio = calcularPrecio();

		impC = calcularImporteCompra();

		impD = calcularImporteDescuento();

		impP = calcularImportePagar();

		calcularVariablesParaReportes();

		regalo = verRegalo();

		mostrarBoleta();

		acumulador();

		mostraMensajeEnPantalla();

	}

	int leerCantidad() {
		return Integer.parseInt(txtCantidad.getText());
	}

	String leerModelo() {
		return (String) cboModelo.getSelectedItem();
	}

	Double calcularPrecio() {

		switch (modelo) {
		case "Mabe EMP6120PG0":
			precio = MenuPrincipal.precio0;
			break;
		case "Indurama Parma":
			precio = MenuPrincipal.precio1;
			break;
		case "Sole COSOL027":
			precio = MenuPrincipal.precio2;
			break;
		case "Coldex CX602":
			precio = MenuPrincipal.precio3;
			break;
		default:
			precio = MenuPrincipal.precio4;
			break;
		}
		return precio;
	}

	Double calcularImporteCompra() {
		return precio * cantidad;

	}

	Double calcularImporteDescuento() {

		if (cantidad >= 1 && cantidad <= 5)
			impD = (MenuPrincipal.porcentaje1 / 100) * impC;
		else if (cantidad >= 6 && cantidad <= 10)
			impD = (MenuPrincipal.porcentaje2 / 100) * impC;
		else if (cantidad >= 11 && cantidad <= 15)
			impD = (MenuPrincipal.porcentaje3 / 100) * impC;
		else
			impD = (MenuPrincipal.porcentaje4 / 100) * impC;
		return impD;
	}

	Double calcularImportePagar() {
		return impC - impD;
	}

	void calcularVariablesParaReportes() {

		switch (modelo) {
		case "Mabe EMP6120PG0":
			MenuPrincipal.cantidadVentas0++;
			MenuPrincipal.unidadesVendidas0 += cantidad;
			MenuPrincipal.sumaImporte0 += impP;
			MenuPrincipal.aporteCuotaD0 = (MenuPrincipal.sumaImporte0 / MenuPrincipal.cuotaDiaria * 100);
			break;
		case "Indurama Parma":
			MenuPrincipal.cantidadVentas1++;
			MenuPrincipal.unidadesVendidas1 += cantidad;
			MenuPrincipal.sumaImporte1 += impP;
			MenuPrincipal.aporteCuotaD1 = (MenuPrincipal.sumaImporte1 / MenuPrincipal.cuotaDiaria * 100);
			break;
		case "Sole COSOL027":
			MenuPrincipal.cantidadVentas2++;
			MenuPrincipal.unidadesVendidas2 += cantidad;
			MenuPrincipal.sumaImporte2 += impP;
			MenuPrincipal.aporteCuotaD2 = (MenuPrincipal.sumaImporte2 / MenuPrincipal.cuotaDiaria * 100);
			break;
		case "Coldex CX602":
			MenuPrincipal.cantidadVentas3++;
			MenuPrincipal.unidadesVendidas3 += cantidad;
			MenuPrincipal.sumaImporte3 += impP;
			MenuPrincipal.aporteCuotaD3 = (MenuPrincipal.sumaImporte3 / MenuPrincipal.cuotaDiaria * 100);
			break;
		default:
			MenuPrincipal.cantidadVentas4++;
			MenuPrincipal.unidadesVendidas4 += cantidad;
			MenuPrincipal.sumaImporte4 += impP;
			MenuPrincipal.aporteCuotaD4 = (MenuPrincipal.sumaImporte4 / MenuPrincipal.cuotaDiaria * 100);
			break;
		}
	}

	String verRegalo() {

		if (cantidad == 1)
			regalo = MenuPrincipal.obsequio1;
		else if (cantidad >= 2 && cantidad <= 5)
			regalo = MenuPrincipal.obsequio2;
		else if (cantidad >= 5)
			regalo = MenuPrincipal.obsequio3;
		else
			regalo = "0";
		return regalo;
	}

	void mostrarBoleta() {
		txtS.setText("Boleta de venta \n\n");
		imprimir("Modelo\t\t\t: " + modelo);
		imprimir("Precio\t\t\t: " + String.format("S/.%,6.2f", precio));
		imprimir("Cantidad\t\t: " + cantidad);
		imprimir("importe de compra\t: " + String.format("S/.%,6.2f", impC));
		imprimir("importe de descuento\t: " + String.format("S/.%,6.2f", impD));
		imprimir("importe a pagar\t\t: " + String.format("S/.%,6.2f", impP));
		imprimir("Obsequio\t\t: " + regalo);
	}

	void imprimir(String s) {
		txtS.append(s + "\n");
	}

	void acumulador() {
		MenuPrincipal.contadorVentas++;
		MenuPrincipal.sumaImporteTotal += impP;
		MenuPrincipal.aporteTotalCuota += (impP / MenuPrincipal.cuotaDiaria) * 100;
	}

	void mostraMensajeEnPantalla() {
		if (MenuPrincipal.contadorVentas % 5 == 0) {
			JOptionPane.showMessageDialog(null,
					"Ventas Nro. " + MenuPrincipal.contadorVentas + "\n" + "Importe total general acumulado: S/. "
							+ Math.round(MenuPrincipal.sumaImporteTotal * 100) / 100 + "\n"
							+ " Porcentaje de la cuota diaria : "
							+ Math.round(MenuPrincipal.aporteTotalCuota * 100) / 100 + "%",
					"Avance de ventas", 1);
		}

	}

	protected void actionPerformedBtnCerrar(ActionEvent e) {
		dispose();
	}

	public void keyPressed(KeyEvent e) {
	}

	public void keyReleased(KeyEvent e) {
	}

	public void keyTyped(KeyEvent e) {
		if (e.getSource() == txtCantidad) {
			keyTypedTxtCantidad(e);
		}
	}

	protected void keyTypedTxtCantidad(KeyEvent e) {

		int key = e.getKeyChar();
		if (key < '0' || key > '9')
			e.consume();

	}

}// fin
