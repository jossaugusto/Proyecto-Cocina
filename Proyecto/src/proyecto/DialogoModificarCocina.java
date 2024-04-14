package proyecto;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;
import java.awt.Cursor;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class DialogoModificarCocina extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JTextField txtPrecio;
	private JTextField txtAncho;
	private JTextField txtAlto;
	private JTextField txtFondo;
	private JTextField txtQuemadores;
	private JButton btnGrabrar;
	private JComboBox cboModelo;
	private JButton btnCerrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DialogoModificarCocina dialog = new DialogoModificarCocina();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DialogoModificarCocina() {
		setBackground(new Color(240, 240, 240));
		setIconImage(Toolkit.getDefaultToolkit().getImage(DialogoModificarCocina.class.getResource("/Imagenes/iconoEscudo.png")));
		getContentPane().setBackground(new Color(119, 203, 210));
		setTitle("Modificar Cocina");
		setBounds(100, 100, 450, 208);
		getContentPane().setLayout(null);
		{
			JLabel lblModelo = new JLabel("Modelo");
			lblModelo.setBackground(new Color(255, 255, 255));
			lblModelo.setForeground(new Color(255, 255, 176));
			lblModelo.setFont(new Font("Roboto", Font.PLAIN, 13));
			lblModelo.setBounds(10, 15, 46, 14);
			getContentPane().add(lblModelo);
		}
		{
			JLabel lblPrecio = new JLabel("Precio (S/)");
			lblPrecio.setForeground(new Color(255, 255, 176));
			lblPrecio.setFont(new Font("Roboto", Font.PLAIN, 13));
			lblPrecio.setBounds(10, 40, 72, 14);
			getContentPane().add(lblPrecio);
		}
		{
			JLabel lblAncho = new JLabel("Ancho (cm)");
			lblAncho.setFont(new Font("Roboto", Font.PLAIN, 13));
			lblAncho.setForeground(new Color(255, 255, 176));
			lblAncho.setBounds(10, 65, 72, 14);
			getContentPane().add(lblAncho);
		}
		{
			JLabel lblAlto = new JLabel("Alto (cm)");
			lblAlto.setForeground(new Color(255, 255, 176));
			lblAlto.setFont(new Font("Roboto", Font.PLAIN, 13));
			lblAlto.setBounds(10, 90, 72, 14);
			getContentPane().add(lblAlto);
		}
		{
			JLabel lblFondo = new JLabel("Fondo (cm)");
			lblFondo.setFont(new Font("Roboto", Font.PLAIN, 13));
			lblFondo.setForeground(new Color(255, 255, 176));
			lblFondo.setBounds(10, 115, 72, 14);
			getContentPane().add(lblFondo);
		}
		{
			JLabel lblQuemadores = new JLabel("Quemadores");
			lblQuemadores.setForeground(new Color(255, 255, 176));
			lblQuemadores.setFont(new Font("Roboto", Font.PLAIN, 13));
			lblQuemadores.setBounds(10, 140, 81, 14);
			getContentPane().add(lblQuemadores);
		}
		{
			cboModelo = new JComboBox();
			cboModelo.setBorder(null);
			cboModelo.setFont(new Font("Roboto", Font.PLAIN, 12));
			cboModelo.addActionListener(this);
			cboModelo.setModel(new DefaultComboBoxModel(new String[] { "Mabe EMP6120PG0", "Indurama Parma", "Sole COSOL027", "Coldex CX602", "Reco Dakota" }));
			cboModelo.setBounds(92, 11, 118, 22);
			getContentPane().add(cboModelo);
		}
		{
			txtPrecio = new JTextField();
			txtPrecio.setFont(new Font("Roboto", Font.PLAIN, 12));
			txtPrecio.setHorizontalAlignment(SwingConstants.CENTER);
			txtPrecio.setBorder(null);
			txtPrecio.setBounds(92, 37, 118, 20);
			getContentPane().add(txtPrecio);
			txtPrecio.setColumns(10);
		}
		{
			txtAncho = new JTextField();
			txtAncho.setHorizontalAlignment(SwingConstants.CENTER);
			txtAncho.setFont(new Font("Roboto", Font.PLAIN, 12));
			txtAncho.setBorder(null);
			txtAncho.setBounds(92, 62, 118, 20);
			getContentPane().add(txtAncho);
			txtAncho.setColumns(10);
		}
		{
			txtAlto = new JTextField();
			txtAlto.setHorizontalAlignment(SwingConstants.CENTER);
			txtAlto.setFont(new Font("Roboto", Font.PLAIN, 12));
			txtAlto.setBorder(null);
			txtAlto.setBounds(92, 87, 118, 20);
			getContentPane().add(txtAlto);
			txtAlto.setColumns(10);
		}
		{
			txtFondo = new JTextField();
			txtFondo.setHorizontalAlignment(SwingConstants.CENTER);
			txtFondo.setFont(new Font("Roboto", Font.PLAIN, 12));
			txtFondo.setBorder(null);
			txtFondo.setBounds(92, 112, 118, 20);
			getContentPane().add(txtFondo);
			txtFondo.setColumns(10);
		}
		{
			txtQuemadores = new JTextField();
			txtQuemadores.setHorizontalAlignment(SwingConstants.CENTER);
			txtQuemadores.setFont(new Font("Roboto", Font.PLAIN, 12));
			txtQuemadores.setBorder(null);
			txtQuemadores.setBounds(92, 137, 118, 20);
			getContentPane().add(txtQuemadores);
			txtQuemadores.setColumns(10);
		}
		{
			btnCerrar = new JButton("");
			btnCerrar.addActionListener(this);
			btnCerrar.setContentAreaFilled(false);
			btnCerrar.setHorizontalAlignment(SwingConstants.LEFT);
			btnCerrar.setVerticalTextPosition(SwingConstants.BOTTOM);
			btnCerrar.setHorizontalTextPosition(SwingConstants.CENTER);
			btnCerrar.setRequestFocusEnabled(false);
			btnCerrar.setRolloverIcon(new ImageIcon(DialogoModificarCocina.class.getResource("/Imagenes/salir48.png")));
			btnCerrar.setPressedIcon(new ImageIcon(DialogoModificarCocina.class.getResource("/Imagenes/salir32.png")));
			btnCerrar.setBorderPainted(false);
			btnCerrar.setIcon(new ImageIcon(DialogoModificarCocina.class.getResource("/Imagenes/salir32.png")));
			btnCerrar.setForeground(new Color(255, 255, 255));
			btnCerrar.setBackground(new Color(255, 255, 255));
			btnCerrar.setBorder(null);
			btnCerrar.setOpaque(false);
			btnCerrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnCerrar.setFont(new Font("Roboto", Font.PLAIN, 14));
			btnCerrar.setBounds(362, 11, 62, 99);
			getContentPane().add(btnCerrar);
		}

		btnGrabrar = new JButton("");
		btnGrabrar.setHorizontalAlignment(SwingConstants.LEFT);
		btnGrabrar.setContentAreaFilled(false);
		btnGrabrar.setRolloverIcon(new ImageIcon(DialogoModificarCocina.class.getResource("/Imagenes/guardar48.png")));
		btnGrabrar.setPressedIcon(new ImageIcon(DialogoModificarCocina.class.getResource("/Imagenes/guardar32.png")));
		btnGrabrar.setIcon(new ImageIcon(DialogoModificarCocina.class.getResource("/Imagenes/guardar32.png")));
		btnGrabrar.setBorderPainted(false);
		btnGrabrar.setRequestFocusEnabled(false);
		btnGrabrar.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnGrabrar.setFont(new Font("Roboto", Font.PLAIN, 14));
		btnGrabrar.setForeground(new Color(255, 255, 255));
		btnGrabrar.setBorder(null);
		btnGrabrar.setBackground(new Color(255, 255, 255));
		btnGrabrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnGrabrar.setOpaque(false);
		btnGrabrar.addActionListener(this);
		btnGrabrar.setBounds(290, 11, 62, 99);
		getContentPane().add(btnGrabrar);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
		if (e.getSource() == btnGrabrar) {
			actionPerformedBtnGrabrar(e);
		}
		if (e.getSource() == cboModelo) {
			actionPerformedCboModelo(e);
		}
	}

	protected void actionPerformedCboModelo(ActionEvent e) {

		int modeloMD = cboModelo.getSelectedIndex();
		
		if (modeloMD == 0) {
			txtPrecio.setText(MenuPrincipal.precio0 + "");
			txtAncho.setText(MenuPrincipal.ancho0 + "");
			txtAlto.setText(MenuPrincipal.alto0 + "");
			txtFondo.setText(MenuPrincipal.fondo0 + "");
			txtQuemadores.setText(MenuPrincipal.quemadores0 + "");
		} else if (modeloMD == 1) {
			txtPrecio.setText(MenuPrincipal.precio1 + "");
			txtAncho.setText(MenuPrincipal.ancho1 + "");
			txtAlto.setText(MenuPrincipal.alto1 + "");
			txtFondo.setText(MenuPrincipal.fondo1 + "");
			txtQuemadores.setText(MenuPrincipal.quemadores1 + "");
		} else if (modeloMD == 2) {
			txtPrecio.setText(MenuPrincipal.precio2 + "");
			txtAncho.setText(MenuPrincipal.ancho2 + "");
			txtAlto.setText(MenuPrincipal.alto2 + "");
			txtFondo.setText(MenuPrincipal.fondo2 + "");
			txtQuemadores.setText(MenuPrincipal.quemadores2 + "");
		} else if (modeloMD == 3) {
			txtPrecio.setText(MenuPrincipal.precio3 + "");
			txtAncho.setText(MenuPrincipal.ancho3 + "");
			txtAlto.setText(MenuPrincipal.alto3 + "");
			txtFondo.setText(MenuPrincipal.fondo3 + "");
			txtQuemadores.setText(MenuPrincipal.quemadores3 + "");
		} else {
			txtPrecio.setText(MenuPrincipal.precio4 + "");
			txtAncho.setText(MenuPrincipal.ancho4 + "");
			txtAlto.setText(MenuPrincipal.alto4 + "");
			txtFondo.setText(MenuPrincipal.fondo4 + "");
			txtQuemadores.setText(MenuPrincipal.quemadores4 + "");
		}

	}

	protected void actionPerformedBtnGrabrar(ActionEvent e) {

	}
	protected void actionPerformedBtnCerrar(ActionEvent e) {
	
		dispose();
	}
}// Fin
