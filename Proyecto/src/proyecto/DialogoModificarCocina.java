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
	private JComboBox cboModelo;
	private JButton btnCerrar;
	private JButton btnGrabar;

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
		getContentPane().setBackground(new Color(192, 192, 192));
		setTitle("Modificar Cocina");
		setBounds(100, 100, 450, 208);
		getContentPane().setLayout(null);
		{
			JLabel lblModelo = new JLabel("Modelo");
			lblModelo.setBackground(new Color(255, 255, 255));
			lblModelo.setForeground(new Color(0, 0, 0));
			lblModelo.setFont(new Font("Roboto", Font.PLAIN, 13));
			lblModelo.setBounds(10, 15, 46, 14);
			getContentPane().add(lblModelo);
		}
		{
			JLabel lblPrecio = new JLabel("Precio (S/)");
			lblPrecio.setForeground(new Color(0, 0, 0));
			lblPrecio.setFont(new Font("Roboto", Font.PLAIN, 13));
			lblPrecio.setBounds(10, 40, 72, 14);
			getContentPane().add(lblPrecio);
		}
		{
			JLabel lblAncho = new JLabel("Ancho (cm)");
			lblAncho.setFont(new Font("Roboto", Font.PLAIN, 13));
			lblAncho.setForeground(new Color(0, 0, 0));
			lblAncho.setBounds(10, 65, 72, 14);
			getContentPane().add(lblAncho);
		}
		{
			JLabel lblAlto = new JLabel("Alto (cm)");
			lblAlto.setForeground(new Color(0, 0, 0));
			lblAlto.setFont(new Font("Roboto", Font.PLAIN, 13));
			lblAlto.setBounds(10, 90, 72, 14);
			getContentPane().add(lblAlto);
		}
		{
			JLabel lblFondo = new JLabel("Fondo (cm)");
			lblFondo.setFont(new Font("Roboto", Font.PLAIN, 13));
			lblFondo.setForeground(new Color(0, 0, 0));
			lblFondo.setBounds(10, 115, 72, 14);
			getContentPane().add(lblFondo);
		}
		{
			JLabel lblQuemadores = new JLabel("Quemadores");
			lblQuemadores.setForeground(new Color(0, 0, 0));
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
			txtPrecio.setHorizontalAlignment(SwingConstants.LEFT);
			txtPrecio.setBorder(null);
			txtPrecio.setBounds(92, 37, 118, 20);
			getContentPane().add(txtPrecio);
			txtPrecio.setColumns(10);
		}
		{
			txtAncho = new JTextField();
			txtAncho.setHorizontalAlignment(SwingConstants.LEFT);
			txtAncho.setFont(new Font("Roboto", Font.PLAIN, 12));
			txtAncho.setBorder(null);
			txtAncho.setBounds(92, 62, 118, 20);
			getContentPane().add(txtAncho);
			txtAncho.setColumns(10);
		}
		{
			txtAlto = new JTextField();
			txtAlto.setHorizontalAlignment(SwingConstants.LEFT);
			txtAlto.setFont(new Font("Roboto", Font.PLAIN, 12));
			txtAlto.setBorder(null);
			txtAlto.setBounds(92, 87, 118, 20);
			getContentPane().add(txtAlto);
			txtAlto.setColumns(10);
		}
		{
			txtFondo = new JTextField();
			txtFondo.setHorizontalAlignment(SwingConstants.LEFT);
			txtFondo.setFont(new Font("Roboto", Font.PLAIN, 12));
			txtFondo.setBorder(null);
			txtFondo.setBounds(92, 112, 118, 20);
			getContentPane().add(txtFondo);
			txtFondo.setColumns(10);
		}
		{
			txtQuemadores = new JTextField();
			txtQuemadores.setHorizontalAlignment(SwingConstants.LEFT);
			txtQuemadores.setFont(new Font("Roboto", Font.PLAIN, 12));
			txtQuemadores.setBorder(null);
			txtQuemadores.setBounds(92, 137, 118, 20);
			getContentPane().add(txtQuemadores);
			txtQuemadores.setColumns(10);
		}
		{
			btnCerrar = new JButton("Cerrar");
			btnCerrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnCerrar.addActionListener(this);
			btnCerrar.setBounds(335, 15, 89, 23);
			getContentPane().add(btnCerrar);
		}
		{
			btnGrabar = new JButton("Grabar");
			btnGrabar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnGrabar.addActionListener(this);
			btnGrabar.setBounds(335, 40, 89, 23);
			getContentPane().add(btnGrabar);
		}
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnGrabar) {
			actionPerformedBtnGrabar(e);
		}
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
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
	protected void actionPerformedBtnCerrar(ActionEvent e) {
	
		dispose();
	}
	protected void actionPerformedBtnGrabar(ActionEvent e) {
	}
}// Fin
