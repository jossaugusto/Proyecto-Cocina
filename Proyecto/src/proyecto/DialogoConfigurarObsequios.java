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

public class DialogoConfigurarObsequios extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JLabel lblObsequio1;
	private JLabel lblObsequio2;
	private JLabel lblObsequio3;
	private JTextField txtObsequio1;
	private JButton btnAceptar_1;
	private JButton btnCancelar_1;
	private JTextField txtObsequio2;
	private JTextField txtObsequio3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DialogoConfigurarObsequios dialog = new DialogoConfigurarObsequios();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DialogoConfigurarObsequios() {
		setTitle("Configurar Obsequios");
		setBounds(100, 100, 450, 130);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(192, 192, 192));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		lblObsequio1 = new JLabel("1 unidad");
		lblObsequio1.setBounds(29, 15, 111, 14);
		contentPanel.add(lblObsequio1);
		
		lblObsequio2 = new JLabel("2 a 5 unidades");
		lblObsequio2.setBounds(29, 40, 123, 14);
		contentPanel.add(lblObsequio2);
		
		lblObsequio3 = new JLabel("6 a mas unidades");
		lblObsequio3.setBounds(29, 65, 139, 14);
		contentPanel.add(lblObsequio3);
		
		txtObsequio1 = new JTextField(MenuPrincipal.obsequio1);
		txtObsequio1.setColumns(10);
		txtObsequio1.setBounds(157, 12, 86, 20);
		contentPanel.add(txtObsequio1);
		
		btnAceptar_1 = new JButton("Aceptar");
		btnAceptar_1.addActionListener(this);
		btnAceptar_1.setBounds(324, 11, 89, 23);
		contentPanel.add(btnAceptar_1);
		
		btnCancelar_1 = new JButton("Cancelar");
		btnCancelar_1.addActionListener(this);
		btnCancelar_1.setBounds(324, 40, 89, 23);
		contentPanel.add(btnCancelar_1);
		
		txtObsequio2 = new JTextField(MenuPrincipal.obsequio2);
		txtObsequio2.setColumns(10);
		txtObsequio2.setBounds(157, 37, 86, 20);
		contentPanel.add(txtObsequio2);
		
		txtObsequio3 = new JTextField(MenuPrincipal.obsequio3);
		txtObsequio3.setColumns(10);
		txtObsequio3.setBounds(157, 62, 86, 20);
		contentPanel.add(txtObsequio3);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCancelar_1) {
			actionPerformedBtnCancelar_1(e);
		}
		if (e.getSource() == btnAceptar_1) {
			actionPerformedBtnAceptar_1(e);
		}
	}
	
	
	
	String cambiarobsequio1  () {
		return txtObsequio1.getText();
		
		
	}
	
	String cambiarobsequio2  () {
		return txtObsequio2.getText();
		
	}
	
	String cambiarobsequio3  () {
		return txtObsequio3.getText();
	}
	
	
	protected void actionPerformedBtnAceptar_1(ActionEvent e) {
		
		MenuPrincipal.obsequio1 = cambiarobsequio1  ();
		MenuPrincipal.obsequio2  = cambiarobsequio2  ();
		MenuPrincipal.obsequio3  = cambiarobsequio3  ();
		
		dispose();
		
	}
	protected void actionPerformedBtnCancelar_1(ActionEvent e) {
		dispose();
	}
}
