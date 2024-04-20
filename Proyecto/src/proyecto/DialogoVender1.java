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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Menu;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Cursor;
import javax.swing.border.BevelBorder;

public class DialogoVender1 extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JTextField txtPrecio;
	private JTextField txtCantidad;
	private JScrollPane scrollPane;
	private JTextArea txtS;
	private JButton btnCerrar;
	private JButton btnVender;
	private JComboBox cboModelo;

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
		setTitle("Vender");
		setIconImage(
				Toolkit.getDefaultToolkit().getImage(DialogoVender1.class.getResource("/Imagenes/iconoEscudo.png")));
		getContentPane().setBackground(new Color(192, 192, 192));
		setBounds(100, 100, 478, 334);
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
			cboModelo = new JComboBox();
			cboModelo.addActionListener(this);
			cboModelo.setBounds(79, 11, 138, 22);
			cboModelo.setFont(new Font("Dialog", Font.PLAIN, 12));
			cboModelo.setModel(new DefaultComboBoxModel(new String[] { "Mabe EMP6120PG0", "Indurama Parma",
					"Sole COSOL027", "Coldex CX602", "Reco Dakota" }));
			getContentPane().add(cboModelo);
		}
		{
			txtPrecio = new JTextField();
			txtPrecio.setEditable(false);
			txtPrecio.setBorder(null);
			txtPrecio.setBounds(79, 37, 138, 20);
			txtPrecio.setColumns(10);
			getContentPane().add(txtPrecio);
		}
		{
			txtCantidad = new JTextField();
			txtCantidad.setBorder(null);
			txtCantidad.setBounds(79, 69, 138, 20);
			txtCantidad.setColumns(10);
			getContentPane().add(txtCantidad);
		}

		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 109, 442, 175);
		getContentPane().add(scrollPane);

		txtS = new JTextArea();
		txtS.setFont(new Font("Monospaced", Font.PLAIN, 13));
		txtS.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(192, 192, 192), new Color(192, 192, 192),
				new Color(192, 192, 192), new Color(192, 192, 192)));
		scrollPane.setViewportView(txtS);
		{
			btnCerrar = new JButton("Cerrar");
			btnCerrar.addActionListener(this);
			btnCerrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnCerrar.setBounds(351, 40, 89, 23);
			getContentPane().add(btnCerrar);
		}
		{
			btnVender = new JButton("Vender");
			btnVender.addActionListener(this);
			btnVender.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnVender.setBounds(351, 11, 89, 23);
			getContentPane().add(btnVender);
		}
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
		if (e.getSource() == btnVender) {
			actionPerformedBtnVender(e);
		}
		if (e.getSource() == cboModelo) {
			actionPerformedCboModelo(e);
		}
	}

	protected void actionPerformedCboModelo(ActionEvent e) {
		double modelo;

        modelo = cboModelo.getSelectedIndex();

        if (modelo == 0) 
            txtPrecio.setText(MenuPrincipal.precio0 + "");
        
            else if (modelo == 1) 
            txtPrecio.setText(MenuPrincipal.precio1 + "");
        
            else if (modelo == 2) 
            txtPrecio.setText(MenuPrincipal.precio2 + "");
        
            else if (modelo == 3) 
            txtPrecio.setText(MenuPrincipal.precio3 + "");
        
            else
            txtPrecio.setText(MenuPrincipal.precio4 + "");
	
	}

	protected void actionPerformedBtnVender(ActionEvent e) {

		double impC = 0, impD = 0, impP, precio = 0;
		int cantidad;
		String regalo, modelo;

		cantidad = Integer.parseInt(txtCantidad.getText());
		modelo = (String) cboModelo.getSelectedItem();

		switch (modelo) {
		case "Mabe EMP6120PG0":
			precio = 949;
			break;
		case "Indurama Parma":
			precio = 1089;
			break;
		case "Sole COSOL027\r\n":
			precio = 850;
			break;
		case "Coldex CX6022":
			precio = 629;
			break;

		default:
			precio = 849;
			break;
		}

		impC = precio * cantidad;

		if (cantidad >= 1 && cantidad <= 5)
			impD = 0.01 * impC;
		else if (cantidad > 5 && cantidad <= 10)
			impD = 0.02 * impC;
		else if (cantidad > 10 && cantidad <= 15)
			impD = 0.03 * impC;
		else
			impD = 0.04 * impC;

		impP = impC - impD;

		if (cantidad == 1)
			regalo = MenuPrincipal.obsequio1;
		else if (cantidad >= 2 && cantidad <= 5)
			regalo = MenuPrincipal.obsequio2;
		else
			regalo = MenuPrincipal.obsequio3;

		txtS.setText("Boleta de venta \n\n");
		txtS.append("importe de compra\t:S/" + String.format("%,12.2f", impC) + "\n");
		txtS.append("importe de descuento\t:S/" + String.format("%,12.2f", impD) + "\n");
		txtS.append("importe a pagar\t\t:S/" + String.format("%,12.2f", impP) + "\n");
		txtS.append("Obsequio\t\t: " + regalo + "\n");
		txtS.append("Modelo\t\t\t: " + modelo + "\n");
		txtS.append("Cantidad\t\t: " + cantidad + "\n");
		txtS.append("Precio\t\t\t: " + precio + "\n");

	}

	protected void actionPerformedBtnCerrar(ActionEvent e) {

		dispose();
	}
}// fin
