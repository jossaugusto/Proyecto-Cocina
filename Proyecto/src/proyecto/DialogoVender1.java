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
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.DefaultComboBoxModel;

public class DialogoVender1 extends JDialog {

	private static final long serialVersionUID = 1L;
	private JTextField txtPrecio;
	private JTextField txtCantidad;

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
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		{
			JLabel lblModelo = new JLabel("Modelo");
			lblModelo.setBounds(10, 15, 59, 14);
			getContentPane().add(lblModelo);
		}
		{
			JLabel lblPrecio = new JLabel("Precio(S/)");
			lblPrecio.setBounds(10, 40, 59, 14);
			getContentPane().add(lblPrecio);
		}
		{
			JLabel lblCantidad = new JLabel("Cantidad");
			lblCantidad.setBounds(10, 72, 59, 14);
			getContentPane().add(lblCantidad);
		}
		{
			JComboBox cboModelo = new JComboBox();
			cboModelo.setModel(new DefaultComboBoxModel(new String[] {"Mabe EMP6120PG0", "Indurama Parma", "Sole COSOL027", "Coldex CX602", "Reco Dakota"}));
			cboModelo.setBounds(79, 11, 124, 22);
			getContentPane().add(cboModelo);
		}
		{
			txtPrecio = new JTextField();
			txtPrecio.setColumns(10);
			txtPrecio.setBounds(79, 37, 124, 20);
			getContentPane().add(txtPrecio);
		}
		{
			txtCantidad = new JTextField();
			txtCantidad.setColumns(10);
			txtCantidad.setBounds(79, 69, 124, 20);
			getContentPane().add(txtCantidad);
		}
		{
			JButton btnVender = new JButton("Vender");
			btnVender.setBounds(315, 11, 89, 23);
			getContentPane().add(btnVender);
		}
		{
			JButton btnCerrar = new JButton("Cerrar");
			btnCerrar.setBounds(315, 36, 89, 23);
			getContentPane().add(btnCerrar);
		}
		{
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 97, 414, 157);
			getContentPane().add(scrollPane);
			{
				JTextArea txtS = new JTextArea();
				scrollPane.setViewportView(txtS);
			}
		}
	}

}
