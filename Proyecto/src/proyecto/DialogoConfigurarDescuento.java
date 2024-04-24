package proyecto;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;

public class DialogoConfigurarDescuento extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtObsequio1;
	private JTextField txtObsequio2;
	private JTextField txtObsequio3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DialogoConfigurarDescuento dialog = new DialogoConfigurarDescuento();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DialogoConfigurarDescuento() {
		setTitle("Configurar Obsquios");
		setBounds(100, 100, 450, 137);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(192, 192, 192));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblObsequio1 = new JLabel("1 unidad");
			lblObsequio1.setBounds(21, 15, 72, 14);
			contentPanel.add(lblObsequio1);
		}
		{
			JLabel lblObsequio2 = new JLabel("2 a 5 unidades");
			lblObsequio2.setBounds(21, 40, 86, 14);
			contentPanel.add(lblObsequio2);
		}
		{
			JLabel lblObsequio3 = new JLabel("6 a mas unidades");
			lblObsequio3.setBounds(21, 65, 99, 14);
			contentPanel.add(lblObsequio3);
		}
		{
			txtObsequio1 = new JTextField();
			txtObsequio1.setBounds(127, 12, 86, 20);
			txtObsequio1.setColumns(10);
			contentPanel.add(txtObsequio1);
		}
		{
			txtObsequio2 = new JTextField();
			txtObsequio2.setBounds(127, 37, 86, 20);
			txtObsequio2.setColumns(10);
			contentPanel.add(txtObsequio2);
		}
		{
			txtObsequio3 = new JTextField();
			txtObsequio3.setBounds(127, 62, 86, 20);
			txtObsequio3.setColumns(10);
			contentPanel.add(txtObsequio3);
		}
		{
			JButton btnAceptar = new JButton("Aceptar");
			btnAceptar.setBounds(316, 11, 89, 23);
			contentPanel.add(btnAceptar);
		}
		{
			JButton btnCancelar = new JButton("Cancelar");
			btnCancelar.setBounds(316, 40, 89, 23);
			contentPanel.add(btnCancelar);
		}
	}

}
