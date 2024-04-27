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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DialogoConfigurarDescuento extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtPorcentaje4;
	private JTextField txtPorcentaje3;
	private JTextField txtPorcentaje2;
	private JTextField txtPorcentaje1;
	private JButton btnAceptar;
	private JButton btnCancelar;

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
		setTitle("Configurar Porcentaje de Descuentos ");
		setBounds(100, 100, 450, 158);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(192, 192, 192));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblPorcentaje1 = new JLabel("1 a 5 unidades");
			lblPorcentaje1.setBounds(26, 15, 99, 14);
			contentPanel.add(lblPorcentaje1);
		}
		{
			JLabel lblPorcentaje4 = new JLabel("Más de 15 unidades");
			lblPorcentaje4.setBounds(26, 90, 136, 14);
			contentPanel.add(lblPorcentaje4);
		}
		{
			txtPorcentaje4 = new JTextField(MenuPrincipal.porcentaje4 + "");
			txtPorcentaje4.setColumns(10);
			txtPorcentaje4.setBounds(153, 87, 86, 20);
			contentPanel.add(txtPorcentaje4);
		}
		{
			txtPorcentaje3 = new JTextField(MenuPrincipal.porcentaje3 + "");
			txtPorcentaje3.setColumns(10);
			txtPorcentaje3.setBounds(153, 62, 86, 20);
			contentPanel.add(txtPorcentaje3);
		}
		{
			txtPorcentaje2 = new JTextField(MenuPrincipal.porcentaje2 + "");
			txtPorcentaje2.setColumns(10);
			txtPorcentaje2.setBounds(153, 37, 86, 20);
			contentPanel.add(txtPorcentaje2);
		}
		{
			txtPorcentaje1 = new JTextField(MenuPrincipal.porcentaje1 + "");
			txtPorcentaje1.setColumns(10);
			txtPorcentaje1.setBounds(153, 12, 86, 20);
			contentPanel.add(txtPorcentaje1);
		}
		{
			btnAceptar = new JButton("Aceptar");
			btnAceptar.addActionListener(this);
			btnAceptar.setBounds(321, 11, 89, 23);
			contentPanel.add(btnAceptar);
		}
		{
			btnCancelar = new JButton("Cancelar");
			btnCancelar.addActionListener(this);
			btnCancelar.setBounds(321, 40, 89, 23);
			contentPanel.add(btnCancelar);
		}
		{
			JLabel lblPorcentaje2 = new JLabel("6 a 10 unidades");
			lblPorcentaje2.setBounds(26, 40, 121, 14);
			contentPanel.add(lblPorcentaje2);
		}
		{
			JLabel lblPorcentaje3 = new JLabel("11 a 15 unidades");
			lblPorcentaje3.setBounds(26, 65, 136, 14);
			contentPanel.add(lblPorcentaje3);
		}
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCancelar) {
			actionPerformedBtnCancelar(e);
		}
		if (e.getSource() == btnAceptar) {
			actionPerformedBtnAceptar(e);
		}
	}
	
	double cambiarporcentaje1 () {
		return Double.parseDouble(txtPorcentaje1.getText());
		
		
	}
	
	double cambiarporcentaje2 () {
		return Double.parseDouble(txtPorcentaje2.getText());
		
	}
	
	double cambiarporcentaje3 () {
		return Double.parseDouble(txtPorcentaje3.getText());
	}
	
	double cambiarporcentaje4 () {
		return Double.parseDouble(txtPorcentaje4.getText());
		
	}
	
	protected void actionPerformedBtnAceptar(ActionEvent e) {
		
		MenuPrincipal.porcentaje1 = cambiarporcentaje1 ();
		MenuPrincipal.porcentaje2 = cambiarporcentaje2 ();
		MenuPrincipal.porcentaje3 = cambiarporcentaje3 ();
		MenuPrincipal.porcentaje4 = cambiarporcentaje4 ();
dispose();

		
		
		
		
	}
	protected void actionPerformedBtnCancelar(ActionEvent e) {
		dispose();
	}
}
