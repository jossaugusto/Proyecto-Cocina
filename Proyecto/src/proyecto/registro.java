package proyecto;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Cursor;

public class registro extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblINICIARSESION;
	private JLabel lblUsuario;
	private JLabel lblContraseña;
	private JTextField txtUsuario;
	private JPasswordField jpassContraseña;
	private JButton btnIniciarsesion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					registro frame = new registro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public registro() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(registro.class.getResource("/Imagenes/iconoEscudo.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		jpassContraseña = new JPasswordField();
		jpassContraseña.setBounds(22, 130, 188, 20);
		contentPane.add(jpassContraseña);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(22, 76, 188, 20);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		btnIniciarsesion = new JButton("Iniciar Sesión ");
		btnIniciarsesion.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnIniciarsesion.addActionListener(this);
		btnIniciarsesion.setBounds(22, 180, 188, 40);
		contentPane.add(btnIniciarsesion);
		
		lblINICIARSESION = new JLabel("INICIAR SESIÓN ");
		lblINICIARSESION.setFont(new Font("Trebuchet MS", Font.ITALIC, 17));
		lblINICIARSESION.setForeground(new Color(0, 0, 0));
		lblINICIARSESION.setHorizontalAlignment(SwingConstants.CENTER);
		lblINICIARSESION.setBounds(53, 21, 131, 14);
		contentPane.add(lblINICIARSESION);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(registro.class.getResource("/Imagenes/rata2.0jpeg.jpeg")));
		lblNewLabel.setBounds(-60, -21, 508, 297);
		contentPane.add(lblNewLabel);
		
		lblUsuario = new JLabel("Usuario:");
		lblUsuario.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblUsuario.setBounds(22, 51, 59, 14);
		contentPane.add(lblUsuario);
		
		lblContraseña = new JLabel("Contraseña:");
		lblContraseña.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblContraseña.setBounds(22, 105, 96, 14);
		contentPane.add(lblContraseña);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnIniciarsesion) {
			actionPerformedBtnIniciarsesion(e);
		}
	}
	protected void actionPerformedBtnIniciarsesion(ActionEvent e) {
		
		char [] contraseña = jpassContraseña.getPassword();
		String contraseñaFinal = new String( contraseña);
		
		if (txtUsuario.getText().equals("PROYECTO") && contraseñaFinal.equals("1318")) {
			dispose ();
			
			JOptionPane.showMessageDialog(this, "Bienvenido al programa", "INGRESASTE", JOptionPane.INFORMATION_MESSAGE);
			MenuPrincipal m = new MenuPrincipal ();
			m.setVisible(true);
			
	}
		else {
		JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrecto", "ERROR", JOptionPane.ERROR_MESSAGE);
		
		txtUsuario.setText("");
		jpassContraseña.setText("");
		txtUsuario.requestFocus();
		
			
	}
}
}
