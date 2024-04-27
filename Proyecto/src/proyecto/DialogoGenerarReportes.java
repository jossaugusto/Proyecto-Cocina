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
			cboTipodeReporte.setModel(new DefaultComboBoxModel<String>(new String[] { "Ventas por Modelo", "Ventas en relación a la venta óptima","Precios en relación al precio promedio", "Promedios, menores y mayores" }));
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

//============================Combo box==========================================	

	protected void actionPerformedCboTipodeReporte(ActionEvent e) {

		double precioPromedio = (DialogoModificarCocina.precioMayor + DialogoModificarCocina.precioMenor) / 2;
		String reporte = "";
		String comparacionPromedio0 = "", comparacionPromedio1 = "", comparacionPromedio2 = "",
				comparacionPromedio3 = "", comparacionPromedio4 = "";
		;

		if (MenuPrincipal.precio0 < precioPromedio)
			comparacionPromedio0 = " (Menor al promedio)";
		else if (MenuPrincipal.precio0 > precioPromedio)
			comparacionPromedio0 = " (Mayor al promedio)";

		if (MenuPrincipal.precio1 < precioPromedio)
			comparacionPromedio1 = " (Menor al promedio)";
		else if (MenuPrincipal.precio1 > precioPromedio)
			comparacionPromedio1 = " (Mayor al promedio)";

		if (MenuPrincipal.precio2 < precioPromedio)
			comparacionPromedio2 = " (Menor al promedio)";
		else if (MenuPrincipal.precio2 > precioPromedio)
			comparacionPromedio2 = " (Mayor al promedio)";

		if (MenuPrincipal.precio3 < precioPromedio)
			comparacionPromedio3 = " (Menor al promedio)";
		else if (MenuPrincipal.precio3 > precioPromedio)
			comparacionPromedio3 = " (Mayor al promedio)";

		if (MenuPrincipal.precio4 < precioPromedio)
			comparacionPromedio4 = " (Menor al promedio)";
		else if (MenuPrincipal.precio4 > precioPromedio)
			comparacionPromedio4 = " (Mayor al promedio)";

		reporte = (String) cboTipodeReporte.getSelectedItem();

		switch (reporte) {

		case "Ventas por Modelo":
			txtS.setText(reporte + "\n\n");
			txtS.append("Modelo\t\t\t\t: " + MenuPrincipal.modelo0 + "\n");
			txtS.append("Cantidades de ventas\t\t: " + DialogoVender1.cantidadVentas0 + "\n");
			txtS.append("Cantidad de unidades vendidas\t: " + DialogoVender1.unidadesVendidas0 + "\n");
			txtS.append("Importe total vendido\t\t: S/." + DialogoVender1.sumaImporte0 + "\n");
			txtS.append("Aporte a la cuota diaria\t: " + String.format("%,2.2f", DialogoVender1.aporteCuotaD0) + "%"
					+ "\n\n");

			txtS.append("Modelo\t\t\t\t: " + MenuPrincipal.modelo1 + "\n");
			txtS.append("Cantidades de ventas\t\t: " + DialogoVender1.cantidadVentas1 + "\n");
			txtS.append("Cantidad de unidades vendidas\t: " + DialogoVender1.unidadesVendidas1 + "\n");
			txtS.append("Importe total vendido\t\t: S/." + DialogoVender1.sumaImporte1 + "\n");
			txtS.append("Aporte a la cuota diaria\t: " + String.format("%,2.2f", DialogoVender1.aporteCuotaD1) + "%"
					+ "\n\n");

			txtS.append("Modelo\t\t\t\t: " + MenuPrincipal.modelo2 + "\n");
			txtS.append("Cantidades de ventas\t\t: " + DialogoVender1.cantidadVentas2 + "\n");
			txtS.append("Cantidad de unidades vendidas\t: " + DialogoVender1.unidadesVendidas2 + "\n");
			txtS.append("Importe total vendido\t\t: S/." + DialogoVender1.sumaImporte2 + "\n");
			txtS.append("Aporte a la cuota diaria\t: " + String.format("%,2.2f", DialogoVender1.aporteCuotaD2) + "%"
					+ "\n\n");

			txtS.append("Modelo\t\t\t\t: " + MenuPrincipal.modelo3 + "\n");
			txtS.append("Cantidades de ventas\t\t: " + DialogoVender1.cantidadVentas3 + "\n");
			txtS.append("Cantidad de unidades vendidas\t: " + DialogoVender1.unidadesVendidas3 + "\n");
			txtS.append("Importe total vendido\t\t: S/." + DialogoVender1.sumaImporte3 + "\n");
			txtS.append("Aporte a la cuota diaria\t: " + String.format("%,2.2f", DialogoVender1.aporteCuotaD3) + "%"
					+ "\n\n");

			txtS.append("Modelo\t\t\t\t: " + MenuPrincipal.modelo4 + "\n");
			txtS.append("Cantidades de ventas\t\t: " + DialogoVender1.cantidadVentas4 + "\n");
			txtS.append("Cantidad de unidades vendidas\t: " + DialogoVender1.unidadesVendidas4 + "\n");
			txtS.append("Importe total vendido\t\t: S/." + DialogoVender1.sumaImporte4 + "\n");
			txtS.append("Aporte a la cuota diaria\t: " + String.format("%,2.2f", DialogoVender1.aporteCuotaD4) + "%"
					+ "\n\n");
			break;

		case "Ventas en relación a la venta óptima":
			txtS.setText(reporte + "\n\n");
			txtS.append("Modelo\t\t\t\t: " + MenuPrincipal.modelo0 + "\n");
			txtS.append("Cantidad de unidades vendidas\t: " + DialogoVender1.unidadesVendidas0 + DialogoVender1.optima0
					+ "\n\n");

			txtS.append("Modelo\t\t\t\t: " + MenuPrincipal.modelo1 + "\n");
			txtS.append("Cantidad de unidades vendidas\t: " + DialogoVender1.unidadesVendidas1 + DialogoVender1.optima1
					+ "\n\n");

			txtS.append("Modelo\t\t\t\t: " + MenuPrincipal.modelo2 + "\n");
			txtS.append("Cantidad de unidades vendidas\t: " + DialogoVender1.unidadesVendidas2 + DialogoVender1.optima2
					+ "\n\n");

			txtS.append("Modelo\t\t\t\t: " + MenuPrincipal.modelo3 + "\n");
			txtS.append("Cantidad de unidades vendidas\t: " + DialogoVender1.unidadesVendidas3 + DialogoVender1.optima3
					+ "\n\n");

			txtS.append("Modelo\t\t\t\t: " + MenuPrincipal.modelo4 + "\n");
			txtS.append("Cantidad de unidades vendidas\t: " + DialogoVender1.unidadesVendidas4 + DialogoVender1.optima4
					+ "\n\n");
			break;
		case "Precios en relación al precio promedio":
			txtS.setText(reporte + "\n\n");
			txtS.append("Modelo : " + MenuPrincipal.modelo0 + "\n");
			txtS.append("Precio : " + MenuPrincipal.precio0 + comparacionPromedio0 + "\n\n");

			txtS.append("Modelo : " + MenuPrincipal.modelo1 + "\n");
			txtS.append("Precio : " + MenuPrincipal.precio1 + comparacionPromedio1 + "\n\n");

			txtS.append("Modelo : " + MenuPrincipal.modelo2 + "\n");
			txtS.append("Precio : " + MenuPrincipal.precio2 + comparacionPromedio2 + "\n\n");

			txtS.append("Modelo : " + MenuPrincipal.modelo3 + "\n");
			txtS.append("Precio : " + MenuPrincipal.precio3 + comparacionPromedio3 + "\n\n");

			txtS.append("Modelo : " + MenuPrincipal.modelo4 + "\n");
			txtS.append("Precio : " + MenuPrincipal.precio4 + comparacionPromedio4 + "\n\n");
			break;

		default:
			txtS.setText(reporte + "\n\n");
			txtS.append("Precio promedio :" + precioPromedio + "\n");
			txtS.append("Precio menor    :" + DialogoModificarCocina.precioMenor + "\n");
			txtS.append("Precio mayor    :" + DialogoModificarCocina.precioMayor + "\n");
			break;
		}

	}

//============================================================================================	

}// Fin
