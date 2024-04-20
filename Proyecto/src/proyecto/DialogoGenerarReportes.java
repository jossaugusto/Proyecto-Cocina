package proyecto;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class DialogoGenerarReportes extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JButton btnCerrar;

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
		setBounds(100, 100, 549, 252);
		getContentPane().setLayout(null);
		{
			JLabel lblTipodeReporte = new JLabel("Tipo de Reporte");
			lblTipodeReporte.setBounds(10, 11, 98, 14);
			getContentPane().add(lblTipodeReporte);
		}
		{
			JComboBox cboTipodeReporte = new JComboBox();
			cboTipodeReporte.setModel(new DefaultComboBoxModel(new String[] {"Ventas por Modelo", "Ventas en relación a la venta óptima", "Precios en relación al precio promedio", "Promedios, menores y mayores"}));
			cboTipodeReporte.setBounds(118, 7, 264, 22);
			getContentPane().add(cboTipodeReporte);
		}
		{
			btnCerrar = new JButton("Cerrar");
			btnCerrar.addActionListener(this);
			btnCerrar.setBounds(409, 7, 89, 23);
			getContentPane().add(btnCerrar);
		}
		{
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 43, 513, 159);
			getContentPane().add(scrollPane);
			{
				JTextArea txtS = new JTextArea();
				scrollPane.setViewportView(txtS);
			}
		}
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnNewButton(e);
		}
	}
	protected void actionPerformedBtnNewButton(ActionEvent e) {
	}
}
