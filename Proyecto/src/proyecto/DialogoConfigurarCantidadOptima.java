package proyecto;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class DialogoConfigurarCantidadOptima extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JLabel lblCantidad;
	private JTextField txtCantidad;
	private JButton btnAceptar;
	private JButton btnCancelar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DialogoConfigurarCantidadOptima dialog = new DialogoConfigurarCantidadOptima();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DialogoConfigurarCantidadOptima() {
		setBounds(100, 100, 450, 151);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(192, 192, 192));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		lblCantidad = new JLabel("Cantidad óptima de unidades vendidas");
		lblCantidad.setFont(new Font("Dialog", Font.BOLD, 10));
		lblCantidad.setBounds(10, 22, 192, 14);
		contentPanel.add(lblCantidad);
		
		txtCantidad = new JTextField(MenuPrincipal.cantidadOptima + "");
		txtCantidad.addActionListener(this);
		txtCantidad.setBorder(null);
		txtCantidad.setBounds(212, 19, 86, 20);
		contentPanel.add(txtCantidad);
		txtCantidad.setColumns(10);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(this);
		btnAceptar.setBorder(null);
		btnAceptar.setBounds(335, 18, 89, 23);
		contentPanel.add(btnAceptar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBorder(null);
		btnCancelar.addActionListener(this);
		btnCancelar.setBounds(335, 52, 89, 23);
		contentPanel.add(btnCancelar);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnAceptar) {
			actionPerformedBtnAceptar(e);
		}
		if (e.getSource() == txtCantidad) {
			actionPerformedTxtCantidad(e);
		}
		if (e.getSource() == btnCancelar) {
			actionPerformedBtnCancelar(e);
		}
	}
	protected void actionPerformedBtnCancelar(ActionEvent e) {
		dispose();
	}
	protected void actionPerformedTxtCantidad(ActionEvent e) {
		
	
	}
	int cambiarcantidad() {
		return Integer.parseInt(txtCantidad.getText());
	}
	protected void actionPerformedBtnAceptar(ActionEvent e) {
		
	MenuPrincipal.cantidadOptima = cambiarcantidad();
	dispose();
}
}
