package proyecto;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DialogoAcercadeTienda extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JButton btncerrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DialogoAcercadeTienda dialog = new DialogoAcercadeTienda();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DialogoAcercadeTienda() {

		setModal(true);
		setIconImage(Toolkit.getDefaultToolkit().getImage(DialogoAcercadeTienda.class.getResource("/Imagenes/iconoEscudo.png")));
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}

		getContentPane().setBackground(new Color(192, 192, 192));
		setBackground(Color.WHITE);
		setForeground(new Color(0, 0, 0));
		getContentPane().setForeground(new Color(192, 192, 192));
		setTitle("Acerca de tienda");
		setBounds(100, 100, 493, 277);
		getContentPane().setLayout(null);

		lblNewLabel = new JLabel("Ventas de Cocinas");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Showcard Gothic", Font.PLAIN, 20));
		lblNewLabel.setBounds(143, 0, 225, 53);
		getContentPane().add(lblNewLabel);

		lblNewLabel_1 = new JLabel("Autores");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.ITALIC, 17));
		lblNewLabel_1.setBounds(200, 52, 63, 14);
		getContentPane().add(lblNewLabel_1);

		lblNewLabel_2 = new JLabel("Angely Eusebio Gutiérrez");
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setBackground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Stencil", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(125, 77, 225, 14);
		getContentPane().add(lblNewLabel_2);

		lblNewLabel_3 = new JLabel("Sebastián José Casilla Reyes");
		lblNewLabel_3.setForeground(Color.BLACK);
		lblNewLabel_3.setFont(new Font("Stencil", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(110, 102, 272, 14);
		getContentPane().add(lblNewLabel_3);

		lblNewLabel_4 = new JLabel("Oscar David García Quispe");
		lblNewLabel_4.setForeground(Color.BLACK);
		lblNewLabel_4.setFont(new Font("Stencil", Font.PLAIN, 16));
		lblNewLabel_4.setBounds(120, 177, 240, 14);
		getContentPane().add(lblNewLabel_4);

		lblNewLabel_5 = new JLabel("José Augusto Palomino Azalde");
		lblNewLabel_5.setForeground(Color.BLACK);
		lblNewLabel_5.setFont(new Font("Stencil", Font.PLAIN, 16));
		lblNewLabel_5.setBounds(110, 127, 272, 14);
		getContentPane().add(lblNewLabel_5);

		lblNewLabel_6 = new JLabel("Jair Chuquihuaccha Solano");
		lblNewLabel_6.setForeground(Color.BLACK);
		lblNewLabel_6.setFont(new Font("Stencil", Font.PLAIN, 16));
		lblNewLabel_6.setBounds(110, 152, 262, 14);
		getContentPane().add(lblNewLabel_6);

		btncerrar = new JButton("Cerrar");
		btncerrar.setForeground(Color.BLACK);
		btncerrar.setBackground(new Color(135, 206, 235));
		btncerrar.addActionListener(this);
		btncerrar.setBounds(184, 202, 89, 23);
		getContentPane().add(btncerrar);
		}
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btncerrar) {
			actionPerformedBtncerrar(e);
		}
	}

	protected void actionPerformedBtncerrar(ActionEvent e) {
		dispose();
	}
}// find
