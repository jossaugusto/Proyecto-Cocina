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

public class DialogoVender1 extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JTextField txtPrecio;
	private JTextField txtCantidad;
	private JButton btnVender;
    private JComboBox cbomodelo;
    private JTextField txtS;
   
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
			JComboBox cboModelo =new JComboBox();
			cboModelo.setFont(new Font("Dialog", Font.PLAIN, 12));
			cboModelo.setModel(new DefaultComboBoxModel(new String[] {"Mabe EMP6120PG0", "Indurama Parma", "Sole COSOL027", "Coldex CX602", "Reco Dakota"}));
			cboModelo.setBounds(79, 11, 138, 22);
			getContentPane().add(cboModelo);
		}
		{
			txtPrecio = new JTextField();
			txtPrecio.setColumns(10);
			txtPrecio.setBounds(79, 37, 138, 20);
			getContentPane().add(txtPrecio);
		}
		{
			txtCantidad = new JTextField();
			txtCantidad.setColumns(10);
			txtCantidad.setBounds(79, 69, 138, 20);
			getContentPane().add(txtCantidad);
		}
		{
			btnVender = new JButton("Vender");
			btnVender.addActionListener(this);
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

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnVender) {
			actionPerformedBtnVender(e);
		}
	}
	protected void actionPerformedBtnVender(ActionEvent e) {
	
	double impC=0,impD=0,impP,precio;
	int cantidad,modelo;
	String regalo;
	
	
	cantidad=Integer.parseInt(txtCantidad.getText());
    modelo=cbomodelo.getSelectedIndex();
    
    if(modelo==0)
    	precio=949.00;
    else if(modelo==1)
    	precio=1089.00;
    else if(modelo==2)
    	precio=850.00;  
    else
    	precio=629.00;
    impC=precio * cantidad;
    		
   
    
    
    if(cantidad>1 && cantidad<=5)
    	impD=0.01 *impC;
    else if(cantidad>6 && cantidad>=10)
    	impD=0.02 *impC;
    else if (cantidad>11 && cantidad>=15)
    	impD=0.03 * cantidad;
    else
    	impD=0.04 *cantidad;
    
    impP=impC - impD;
    
    if(cantidad==1)
     regalo=MenuPrincipal.obsequio1;
    else if(cantidad>=2 && cantidad<=5)
    	regalo=MenuPrincipal.obsequio2;
    else
    	regalo=MenuPrincipal.obsequio3;
    
    txtS.setText("Boleta de venta \n\n");
    txtS.append("importe de compra\t: " + String.format("%,12.2f",impC)+ "\n");
   
   
   
    
    
    
    	
    
    
			
	
	
	
	
		
		
		
	
	
	}
}//fin
