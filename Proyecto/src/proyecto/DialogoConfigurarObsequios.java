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

public class DialogoConfigurarObsequios extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JLabel lblPorcentaje1;
	private JLabel lblPorcentaje2;
	private JLabel lblPorcentaje3;
	private JLabel lblPorcentaje4;
	private JTextField txtPorcentaje1;
	private JTextField txtPorcentaje2;
	private JTextField txtPorcentaje3;
	private JTextField txtPorcentaje4;
	private JButton btnAceptar;
	private JButton btnCancelar;

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
		setTitle("Configurar Porcetaje de Descuento");
		setBounds(100, 100, 450, 177);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(192, 192, 192));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		lblPorcentaje1 = new JLabel("1 a 5 unidades");
		lblPorcentaje1.setBounds(21, 23, 72, 14);
		contentPanel.add(lblPorcentaje1);
		
		lblPorcentaje2 = new JLabel("6 a 10 unidades");
		lblPorcentaje2.setBounds(21, 48, 86, 14);
		contentPanel.add(lblPorcentaje2);
		
		lblPorcentaje3 = new JLabel("11 a 15 unidades");
		lblPorcentaje3.setBounds(21, 73, 99, 14);
		contentPanel.add(lblPorcentaje3);
		
		lblPorcentaje4 = new JLabel("Más de 15 unidades");
		lblPorcentaje4.setBounds(21, 98, 99, 14);
		contentPanel.add(lblPorcentaje4);
		
		txtPorcentaje1 = new JTextField();
		txtPorcentaje1.setBounds(127, 20, 86, 20);
		contentPanel.add(txtPorcentaje1);
		txtPorcentaje1.setColumns(10);
		
		txtPorcentaje2 = new JTextField();
		txtPorcentaje2.setColumns(10);
		txtPorcentaje2.setBounds(127, 45, 86, 20);
		contentPanel.add(txtPorcentaje2);
		
		txtPorcentaje3 = new JTextField();
		txtPorcentaje3.setColumns(10);
		txtPorcentaje3.setBounds(127, 70, 86, 20);
		contentPanel.add(txtPorcentaje3);
		
		txtPorcentaje4 = new JTextField();
		txtPorcentaje4.setColumns(10);
		txtPorcentaje4.setBounds(127, 95, 86, 20);
		contentPanel.add(txtPorcentaje4);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(316, 19, 89, 23);
		contentPanel.add(btnAceptar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(316, 48, 89, 23);
		contentPanel.add(btnCancelar);
	}
}
