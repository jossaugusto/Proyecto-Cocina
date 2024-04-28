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

public class DialogoConfgurarObsequio extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtObsequio1;
	private JTextField txtObsequio2;
	private JTextField txtObsequio3;
	private JButton btnAceptar;
	private JButton btnCancelar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DialogoConfgurarObsequio dialog = new DialogoConfgurarObsequio();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DialogoConfgurarObsequio() {
		setTitle("Configurar obsequios");
		setBounds(100, 100, 450, 134);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(192, 192, 192));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblObsequio1 = new JLabel("1 unidad");
			lblObsequio1.setBounds(22, 15, 89, 14);
			contentPanel.add(lblObsequio1);
		}
		{
			JLabel lblObsequio2 = new JLabel("2 a 5 unidades");
			lblObsequio2.setBounds(22, 40, 89, 14);
			contentPanel.add(lblObsequio2);
		}
		{
			JLabel lblObsequio3 = new JLabel("6 a más unidades");
			lblObsequio3.setBounds(22, 65, 89, 14);
			contentPanel.add(lblObsequio3);
		}
		{
			txtObsequio1 = new JTextField();
			txtObsequio1.setColumns(10);
			txtObsequio1.setBorder(null);
			txtObsequio1.setBounds(140, 12, 86, 20);
			contentPanel.add(txtObsequio1);
		}
		{
			btnAceptar = new JButton("Aceptar");
			btnAceptar.addActionListener(this);
			btnAceptar.setBounds(317, 11, 89, 23);
			contentPanel.add(btnAceptar);
		}
		{
			btnCancelar = new JButton("Cancelar");
			btnCancelar.addActionListener(this);
			btnCancelar.setBounds(317, 40, 89, 23);
			contentPanel.add(btnCancelar);
		}
		{
			txtObsequio2 = new JTextField();
			txtObsequio2.setColumns(10);
			txtObsequio2.setBorder(null);
			txtObsequio2.setBounds(140, 37, 86, 20);
			contentPanel.add(txtObsequio2);
		}
		{
			txtObsequio3 = new JTextField();
			txtObsequio3.setColumns(10);
			txtObsequio3.setBorder(null);
			txtObsequio3.setBounds(140, 62, 86, 20);
			contentPanel.add(txtObsequio3);
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
	
	String marcarObsequio1 () {
		return (txtObsequio1.getText());
	}
	String marcarObsequio2 () {
		return (txtObsequio1.getText());
	}
	String marcarObsequio3 () {
		return (txtObsequio1.getText());
	}
	
	
	protected void actionPerformedBtnAceptar(ActionEvent e) {
		
		MenuPrincipal.obsequio1 = marcarObsequio1();
		MenuPrincipal.obsequio2 = marcarObsequio2();
		MenuPrincipal.obsequio3 = marcarObsequio3();
		
		dispose();
	}
	protected void actionPerformedBtnCancelar(ActionEvent e) {
		dispose();
	}
	
	
}
