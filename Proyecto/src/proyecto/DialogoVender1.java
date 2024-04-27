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
	private JComboBox <String>cboModelo;
	private JScrollPane scrollPane;
	private JTextArea txtS;

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
			cboModelo.setModel(new DefaultComboBoxModel<String>(new String[] { "Mabe EMP6120PG0", "Indurama Parma","Sole COSOL027", "Coldex CX602", "Reco Dakota" }));
			getContentPane().add(cboModelo);
		}
		{
			txtPrecio = new JTextField(MenuPrincipal.precio0 + "");
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
		double modelo;

		modelo = cboModelo.getSelectedIndex();

		if (modelo == 0)
			txtPrecio.setText(MenuPrincipal.precio0 + "");

		else if (modelo == 1)
			txtPrecio.setText(MenuPrincipal.precio1 + "");

		else if (modelo == 2)
			txtPrecio.setText(MenuPrincipal.precio2 + "");

		else if (modelo == 3)
			txtPrecio.setText(MenuPrincipal.precio3 + "");

		else
			txtPrecio.setText(MenuPrincipal.precio4 + "");

	}

	int leerCantidad() {
		return Integer.parseInt(txtCantidad.getText());
	}

	String leerModelo() {
		return (String) cboModelo.getSelectedItem();
	}

	Double calcularPrecio(String modelo) {
		double precio;

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

	Double calcularImporteCompra(double precio, int cantidad, String modelo) {
		switch (modelo) {
		case "Mabe EMP6120PG0":
			cantidadVentas0++;
			unidadesVendidas0 += cantidad;
			if (unidadesVendidas0 == MenuPrincipal.cantidadOptima)
				optima0 = " (igual a la cantidad óptima)";
			else if (unidadesVendidas0 < MenuPrincipal.cantidadOptima)
				optima0 = " (" + (MenuPrincipal.cantidadOptima - unidadesVendidas0) + " menos que la cantida óptima)";
			else
				optima0 = " (" + (unidadesVendidas0 - MenuPrincipal.cantidadOptima) + " más que la cantida óptima)";
			break;

		case "Indurama Parma":
			cantidadVentas1++;
			unidadesVendidas1 += cantidad;
			if (unidadesVendidas0 == MenuPrincipal.cantidadOptima)
				optima1 = " (igual a la cantidad óptima)";
			else if (unidadesVendidas0 < MenuPrincipal.cantidadOptima)
				optima1 = " (" + (MenuPrincipal.cantidadOptima - unidadesVendidas0) + " menos que la cantida óptima)";
			else
				optima1 = " (" + (unidadesVendidas0 - MenuPrincipal.cantidadOptima) + " más que la cantida óptima)";
			break;
		case "Sole COSOL027":
			cantidadVentas2++;
			unidadesVendidas2 += cantidad;
			if (unidadesVendidas0 == MenuPrincipal.cantidadOptima)
				optima2 = " (igual a la cantidad óptima)";
			else if (unidadesVendidas0 < MenuPrincipal.cantidadOptima)
				optima2 = " (" + (MenuPrincipal.cantidadOptima - unidadesVendidas0) + " menos que la cantida óptima)";
			else
				optima2 = " (" + (unidadesVendidas0 - MenuPrincipal.cantidadOptima) + " más que la cantida óptima)";
			break;
		case "Coldex CX602":
			cantidadVentas3++;
			unidadesVendidas3 += cantidad;
			if (unidadesVendidas0 == MenuPrincipal.cantidadOptima)
				optima3 = " (igual a la cantidad óptima)";
			else if (unidadesVendidas0 < MenuPrincipal.cantidadOptima)
				optima3 = " (" + (MenuPrincipal.cantidadOptima - unidadesVendidas0) + " menos que la cantida óptima)";
			else
				optima3 = " (" + (unidadesVendidas0 - MenuPrincipal.cantidadOptima) + " más que la cantida óptima)";
			break;
		default:
			cantidadVentas4++;
			unidadesVendidas4 += cantidad;
			if (unidadesVendidas0 == MenuPrincipal.cantidadOptima)
				optima4 = " (igual a la cantidad óptima)";
			else if (unidadesVendidas0 < MenuPrincipal.cantidadOptima)
				optima4 = " (" + (MenuPrincipal.cantidadOptima - unidadesVendidas0) + " menos que la cantida óptima)";
			else
				optima4 = " (" + (unidadesVendidas0 - MenuPrincipal.cantidadOptima) + " más que la cantida óptima)";
			break;
		}
		return precio * cantidad;

	}

	Double calcularImporteDescuento(int cantidad, double impC) {
		double impD;

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

	Double calcularImportePagar(String modelo, double impC, double impD) {
		double impP = impC - impD;

		switch (modelo) {
		case "Mabe EMP6120PG0":
			sumaImporte0 += impP;
			aporteCuotaD0 = (sumaImporte0 / MenuPrincipal.cuotaDiaria * 100);
			break;
		case "Indurama Parma":
			sumaImporte1 += impP;
			aporteCuotaD1 = (sumaImporte0 / MenuPrincipal.cuotaDiaria * 100);
			break;
		case "Sole COSOL027":
			sumaImporte2 += impP;
			aporteCuotaD2 = (sumaImporte0 / MenuPrincipal.cuotaDiaria * 100);
			break;
		case "Coldex CX602":
			sumaImporte3 += impP;
			aporteCuotaD3 = (sumaImporte0 / MenuPrincipal.cuotaDiaria * 100);
			break;
		default:
			sumaImporte4 += impP;
			aporteCuotaD4 = (sumaImporte0 / MenuPrincipal.cuotaDiaria * 100);
			break;
		}
		return impP;

	}

	String verRegalo(int cantidad) {
		String regalo;

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

	void mostrarBoleta(String modelo, double precio, int cantidad, double impC, double impD, double impP,
			String regalo) {
		txtS.setText("Boleta de venta \n\n");
		txtS.append("Modelo\t\t\t: " + modelo + "\n");
		txtS.append("Precio\t\t\t: " + String.format("S/.%,6.2f", precio) + "\n");
		txtS.append("Cantidad\t\t: " + cantidad + "\n");
		txtS.append("importe de compra\t: " + String.format("S/.%,6.2f", impC) + "\n");
		txtS.append("importe de descuento\t: " + String.format("S/.%,6.2f", impD) + "\n");
		txtS.append("importe a pagar\t\t: " + String.format("S/.%,6.2f", impP) + "\n");
		txtS.append("Obsequio\t\t: " + regalo + "\n");
	}

//==========================================================================================================================================
	public static int cantidadVentas0 = 0, cantidadVentas1 = 0, cantidadVentas2 = 0, cantidadVentas3 = 0,
			cantidadVentas4 = 0;
	public static double sumaImporte0 = 0, sumaImporte1 = 0, sumaImporte2 = 0, sumaImporte3 = 0, sumaImporte4 = 0;
	public static int unidadesVendidas0 = 0, unidadesVendidas1 = 0, unidadesVendidas2 = 0, unidadesVendidas3 = 0,
			unidadesVendidas4 = 0;
	public static double aporteCuotaDiaria0 = 0, aporteCuotaDiaria1 = 0, aporteCuotaDiaria2 = 0, aporteCuotaDiaria3 = 0,
			aporteCuotaDiaria4 = 0;
	public static String optima0 = "", optima1 = "", optima2 = "", optima3 = "", optima4 = "";
	public static double aporteCuotaD0 = 0, aporteCuotaD1 = 0, aporteCuotaD2 = 0, aporteCuotaD3 = 0, aporteCuotaD4 = 0;


//===========================================================================================================================================

	protected void actionPerformedBtnVender(ActionEvent e) {

		if (txtCantidad.getText().isEmpty()) {
			JOptionPane.showMessageDialog(this, "Coloque la cantidad deseada");
			return;
		}

		double impC = 0, impD = 0, impP, precio = 0;
		int cantidad = 0;
		String regalo = "", modelo = "";

		cantidad = leerCantidad();

		modelo = leerModelo();

		precio = calcularPrecio(modelo);

		impC = calcularImporteCompra(precio, cantidad, modelo);

		impD = calcularImporteDescuento(cantidad, impC);

		impP = calcularImportePagar(modelo, impC, impD);

		regalo = verRegalo(cantidad);

		mostrarBoleta(modelo, precio, cantidad, impC, impD, impP, regalo);

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
