package proyecto;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Toolkit;

public class DialogoGenerarReportes extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JButton btnCerrar;
	private JTextArea txtS;
	private JComboBox<String> cboTipodeReporte;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DialogoGenerarReportes dialog = new DialogoGenerarReportes();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DialogoGenerarReportes() {
		setModal(true);
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage(DialogoGenerarReportes.class.getResource("/Imagenes/iconoEscudo.png")));
		getContentPane().setBackground(new Color(192, 192, 192));
		setBounds(100, 100, 548, 339);
		getContentPane().setLayout(null);
		{
			JLabel lblTipodeReporte = new JLabel("Tipo de Reporte");
			lblTipodeReporte.setFont(new Font("Roboto", Font.PLAIN, 13));
			lblTipodeReporte.setForeground(new Color(0, 0, 0));
			lblTipodeReporte.setBounds(10, 11, 98, 14);
			getContentPane().add(lblTipodeReporte);
		}
		{
			cboTipodeReporte = new JComboBox<String>();
			cboTipodeReporte.addActionListener(this);
			cboTipodeReporte.setFont(new Font("Roboto", Font.PLAIN, 12));
			cboTipodeReporte.setModel(new DefaultComboBoxModel<String>(
					new String[] { "Ventas por Modelo", "Ventas en relación a la venta óptima",
							"Precios en relación al precio promedio", "Promedios, menores y mayores" }));
			cboTipodeReporte.setBounds(118, 7, 264, 22);
			getContentPane().add(cboTipodeReporte);
		}
		{
			btnCerrar = new JButton("Cerrar");
			btnCerrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnCerrar.addActionListener(this);
			btnCerrar.setBounds(434, 8, 89, 23);
			getContentPane().add(btnCerrar);
		}
		{
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 43, 513, 246);
			getContentPane().add(scrollPane);

			txtS = new JTextArea();
			txtS.setEditable(false);
			txtS.setFont(new Font("Monospaced", Font.PLAIN, 13));
			scrollPane.setViewportView(txtS);
		}
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == cboTipodeReporte) {
			actionPerformedCboTipodeReporte(e);
		}
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnNewButton(e);
		}
	}

	protected void actionPerformedBtnNewButton(ActionEvent e) {
		dispose();
	}

	protected void actionPerformedCboTipodeReporte(ActionEvent e) {

		String reporte = "";
		reporte = (String) cboTipodeReporte.getSelectedItem();

		unidadesOptimas0();
		unidadesOptimas1();
		unidadesOptimas2();
		unidadesOptimas3();
		unidadesOptimas4();

		comparar0();
		comparar1();
		comparar2();
		comparar3();
		comparar4();

		switch (reporte) {

		case "Ventas por Modelo":
			mostrarVentasPorModelo(reporte);
			break;

		case "Ventas en relación a la venta óptima":
			mostrarRelacionaVentaOptima(reporte);
			break;
		case "Precios en relación al precio promedio":
			mostrarRelacionPrecioPromedio(reporte);
			break;

		default:
			mostrarPromedioMenorMayor(reporte);
			break;
		}

	}

	void unidadesOptimas0() {
		if (MenuPrincipal.unidadesVendidas0 == MenuPrincipal.cantidadOptima)
			MenuPrincipal.optima0 = " (igual a la cantidad óptima)";

		else if (MenuPrincipal.unidadesVendidas0 < MenuPrincipal.cantidadOptima)
			MenuPrincipal.optima0 = " (" + (MenuPrincipal.cantidadOptima - MenuPrincipal.unidadesVendidas0)
					+ " menos que la cantida óptima)";

		else
			MenuPrincipal.optima0 = " (" + (MenuPrincipal.unidadesVendidas0 - MenuPrincipal.cantidadOptima)
					+ " más que la cantida óptima)";
	}

	void unidadesOptimas1() {
		if (MenuPrincipal.unidadesVendidas1 == MenuPrincipal.cantidadOptima)
			MenuPrincipal.optima1 = " (igual a la cantidad óptima)";

		else if (MenuPrincipal.unidadesVendidas1 < MenuPrincipal.cantidadOptima)
			MenuPrincipal.optima1 = " (" + (MenuPrincipal.cantidadOptima - MenuPrincipal.unidadesVendidas1)
					+ " menos que la cantida óptima)";

		else
			MenuPrincipal.optima1 = " (" + (MenuPrincipal.unidadesVendidas1 - MenuPrincipal.cantidadOptima)
					+ " más que la cantida óptima)";
	}

	void unidadesOptimas2() {
		if (MenuPrincipal.unidadesVendidas2 == MenuPrincipal.cantidadOptima)
			MenuPrincipal.optima2 = " (igual a la cantidad óptima)";

		else if (MenuPrincipal.unidadesVendidas2 < MenuPrincipal.cantidadOptima)
			MenuPrincipal.optima2 = " (" + (MenuPrincipal.cantidadOptima - MenuPrincipal.unidadesVendidas2)
					+ " menos que la cantida óptima)";

		else
			MenuPrincipal.optima2 = " (" + (MenuPrincipal.unidadesVendidas2 - MenuPrincipal.cantidadOptima)
					+ " más que la cantida óptima)";
	}

	void unidadesOptimas3() {
		if (MenuPrincipal.unidadesVendidas3 == MenuPrincipal.cantidadOptima)
			MenuPrincipal.optima3 = " (igual a la cantidad óptima)";

		else if (MenuPrincipal.unidadesVendidas3 < MenuPrincipal.cantidadOptima)
			MenuPrincipal.optima3 = " (" + (MenuPrincipal.cantidadOptima - MenuPrincipal.unidadesVendidas3)
					+ " menos que la cantida óptima)";

		else
			MenuPrincipal.optima3 = " (" + (MenuPrincipal.unidadesVendidas0 - MenuPrincipal.cantidadOptima)
					+ " más que la cantida óptima)";
	}

	void unidadesOptimas4() {
		if (MenuPrincipal.unidadesVendidas4 == MenuPrincipal.cantidadOptima)
			MenuPrincipal.optima4 = " (igual a la cantidad óptima)";

		else if (MenuPrincipal.unidadesVendidas4 < MenuPrincipal.cantidadOptima)
			MenuPrincipal.optima4 = " (" + (MenuPrincipal.cantidadOptima - MenuPrincipal.unidadesVendidas4)
					+ " menos que la cantida óptima)";

		else
			MenuPrincipal.optima4 = " (" + (MenuPrincipal.unidadesVendidas4 - MenuPrincipal.cantidadOptima)
					+ " más que la cantida óptima)";
	}

	void comparar0() {
		if (MenuPrincipal.precio0 < MenuPrincipal.precioPromedio)
			MenuPrincipal.comparacionPromedio0 = " (Menor al promedio)";
		else if (MenuPrincipal.precio0 > MenuPrincipal.precioPromedio)
			MenuPrincipal.comparacionPromedio0 = " (Mayor al promedio)";
	}

	void comparar1() {
		if (MenuPrincipal.precio1 < MenuPrincipal.precioPromedio)
			MenuPrincipal.comparacionPromedio1 = " (Menor al promedio)";
		else if (MenuPrincipal.precio1 > MenuPrincipal.precioPromedio)
			MenuPrincipal.comparacionPromedio1 = " (Mayor al promedio)";
	}

	void comparar2() {
		if (MenuPrincipal.precio2 < MenuPrincipal.precioPromedio)
			MenuPrincipal.comparacionPromedio2 = " (Menor al promedio)";
		else if (MenuPrincipal.precio2 > MenuPrincipal.precioPromedio)
			MenuPrincipal.comparacionPromedio2 = " (Mayor al promedio)";
	}

	void comparar3() {
		if (MenuPrincipal.precio3 < MenuPrincipal.precioPromedio)
			MenuPrincipal.comparacionPromedio3 = " (Menor al promedio)";
		else if (MenuPrincipal.precio3 > MenuPrincipal.precioPromedio)
			MenuPrincipal.comparacionPromedio3 = " (Mayor al promedio)";
	}

	void comparar4() {
		if (MenuPrincipal.precio4 < MenuPrincipal.precioPromedio)
			MenuPrincipal.comparacionPromedio4 = " (Menor al promedio)";
		else if (MenuPrincipal.precio4 > MenuPrincipal.precioPromedio)
			MenuPrincipal.comparacionPromedio4 = " (Mayor al promedio)";
	}

	void mostrarVentasPorModelo(String reporte) {
		txtS.setText(reporte + "\n\n");
		imprimir("Modelo\t\t\t\t: " + MenuPrincipal.modelo0);
		imprimir("Cantidades de ventas\t\t: " + MenuPrincipal.cantidadVentas0);
		imprimir("Cantidad de unidades vendidas\t: " + MenuPrincipal.unidadesVendidas0);
		imprimir("Importe total vendido\t\t: S/." + MenuPrincipal.sumaImporte0);
		imprimir("Aporte a la cuota diaria\t: " + String.format("%,2.2f", MenuPrincipal.aporteCuotaD0) + "%");
		imprimir("");
		imprimir("Modelo\t\t\t\t: " + MenuPrincipal.modelo1);
		imprimir("Cantidades de ventas\t\t: " + MenuPrincipal.cantidadVentas1);
		imprimir("Cantidad de unidades vendidas\t: " + MenuPrincipal.unidadesVendidas1);
		imprimir("Importe total vendido\t\t: S/." + MenuPrincipal.sumaImporte1);
		imprimir("Aporte a la cuota diaria\t: " + String.format("%,2.2f", MenuPrincipal.aporteCuotaD1) + "%");
		imprimir("");
		imprimir("Modelo\t\t\t\t: " + MenuPrincipal.modelo2);
		imprimir("Cantidades de ventas\t\t: " + MenuPrincipal.cantidadVentas2);
		imprimir("Cantidad de unidades vendidas\t: " + MenuPrincipal.unidadesVendidas2);
		imprimir("Importe total vendido\t\t: S/." + MenuPrincipal.sumaImporte2);
		imprimir("Aporte a la cuota diaria\t: " + String.format("%,2.2f", MenuPrincipal.aporteCuotaD2) + "%");
		imprimir("");
		imprimir("Modelo\t\t\t\t: " + MenuPrincipal.modelo3);
		imprimir("Cantidades de ventas\t\t: " + MenuPrincipal.cantidadVentas3);
		imprimir("Cantidad de unidades vendidas\t: " + MenuPrincipal.unidadesVendidas3);
		imprimir("Importe total vendido\t\t: S/." + MenuPrincipal.sumaImporte3);
		imprimir("Aporte a la cuota diaria\t: " + String.format("%,2.2f", MenuPrincipal.aporteCuotaD3) + "%");
		imprimir("");
		imprimir("Modelo\t\t\t\t: " + MenuPrincipal.modelo4);
		imprimir("Cantidades de ventas\t\t: " + MenuPrincipal.cantidadVentas4);
		imprimir("Cantidad de unidades vendidas\t: " + MenuPrincipal.unidadesVendidas4);
		imprimir("Importe total vendido\t\t: S/." + MenuPrincipal.sumaImporte4);
		imprimir("Aporte a la cuota diaria\t: " + String.format("%,2.2f", MenuPrincipal.aporteCuotaD4) + "%");
	}

	void mostrarRelacionaVentaOptima(String reporte) {
		txtS.setText(reporte + "\n\n");
		imprimir("Modelo\t\t\t\t: " + MenuPrincipal.modelo0);
		imprimir("Cantidad de unidades vendidas\t: " + MenuPrincipal.unidadesVendidas0 + MenuPrincipal.optima0);
		imprimir("");
		imprimir("Modelo\t\t\t\t: " + MenuPrincipal.modelo1);
		imprimir("Cantidad de unidades vendidas\t: " + MenuPrincipal.unidadesVendidas1 + MenuPrincipal.optima1);
		imprimir("");
		imprimir("Modelo\t\t\t\t: " + MenuPrincipal.modelo2);
		imprimir("Cantidad de unidades vendidas\t: " + MenuPrincipal.unidadesVendidas2 + MenuPrincipal.optima2);
		imprimir("");
		imprimir("Modelo\t\t\t\t: " + MenuPrincipal.modelo3);
		imprimir("Cantidad de unidades vendidas\t: " + MenuPrincipal.unidadesVendidas3 + MenuPrincipal.optima3);
		imprimir("");
		imprimir("Modelo\t\t\t\t: " + MenuPrincipal.modelo4);
		imprimir("Cantidad de unidades vendidas\t: " + MenuPrincipal.unidadesVendidas4 + MenuPrincipal.optima4);
	}

	void mostrarRelacionPrecioPromedio(String reporte) {
		txtS.setText(reporte + "\n\n");
		imprimir("Modelo : " + MenuPrincipal.modelo0);
		imprimir("Precio : " + MenuPrincipal.precio0 + MenuPrincipal.comparacionPromedio0);
		imprimir("");
		imprimir("Modelo : " + MenuPrincipal.modelo1);
		imprimir("Precio : " + MenuPrincipal.precio1 + MenuPrincipal.comparacionPromedio1);
		imprimir("");
		imprimir("Modelo : " + MenuPrincipal.modelo2);
		imprimir("Precio : " + MenuPrincipal.precio2 + MenuPrincipal.comparacionPromedio2);
		imprimir("");
		imprimir("Modelo : " + MenuPrincipal.modelo3);
		imprimir("Precio : " + MenuPrincipal.precio3 + MenuPrincipal.comparacionPromedio3);
		imprimir("");
		imprimir("Modelo : " + MenuPrincipal.modelo4);
		imprimir("Precio : " + MenuPrincipal.precio4 + MenuPrincipal.comparacionPromedio4);
	}

	void mostrarPromedioMenorMayor(String reporte) {
		txtS.setText(reporte + "\n\n");
		imprimir("Precio promedio :" + MenuPrincipal.precioPromedio);
		imprimir("Precio menor    :" + MenuPrincipal.precioMenor);
		imprimir("Precio mayor    :" + MenuPrincipal.precioMayor);
		imprimir("");
		imprimir("Ancho promedio :" + MenuPrincipal.anchoPromedio);
		imprimir("Ancho menor    :" + MenuPrincipal.anchoMenor);
		imprimir("Ancho mayor    :" + MenuPrincipal.anchoMayor);
	}

	void imprimir(String s) {
		txtS.append(s + "\n");
	}

//============================================================================================	

}// Fin
