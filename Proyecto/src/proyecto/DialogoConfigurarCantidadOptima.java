package proyecto;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.Toolkit;

public class DialogoConfigurarCantidadOptima extends JDialog implements ActionListener, KeyListener {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JLabel lblCantidad;
	private JTextField txtCantidad;
	private JButton btnAceptar;
	private JButton btnCancelar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DialogoConfigurarCantidadOptima dialog = new DialogoConfigurarCantidadOptima();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DialogoConfigurarCantidadOptima() {
		setModal(true);
		setIconImage(Toolkit.getDefaultToolkit().getImage(DialogoConfigurarCantidadOptima.class.getResource("/Imagenes/iconoEscudo.png")));
		setBounds(100, 100, 450, 151);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(192, 192, 192));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		lblCantidad = new JLabel("Cantidad óptima de unidades vendidas");
		lblCantidad.setFont(new Font("Roboto", Font.BOLD, 13));
		lblCantidad.setBounds(10, 22, 245, 19);
		contentPanel.add(lblCantidad);

		txtCantidad = new JTextField();
		txtCantidad.addKeyListener(this);
		txtCantidad.addActionListener(this);
		txtCantidad.setBorder(null);
		txtCantidad.setBounds(265, 19, 42, 20);
		contentPanel.add(txtCantidad);
		txtCantidad.setColumns(10);

		btnAceptar = new JButton("Aceptar");
		btnAceptar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAceptar.addActionListener(this);
		btnAceptar.setBorder(null);
		btnAceptar.setBounds(335, 18, 89, 23);
		contentPanel.add(btnAceptar);

		btnCancelar = new JButton("Cancelar");
		btnCancelar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCancelar.setBorder(null);
		btnCancelar.addActionListener(this);
		btnCancelar.setBounds(335, 52, 89, 23);
		contentPanel.add(btnCancelar);
		
		mostrarDatos();
	}

	void mostrarDatos() {
		txtCantidad.setText(MenuPrincipal.cantidadOptima + "");
	}
	
	
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnAceptar) {
			actionPerformedBtnAceptar(e);
		}
		if (e.getSource() == txtCantidad) {
			actionPerformedTxtCantidad(e);
		}
		if (e.getSource() == btnCancelar) {
			actionPerformedBtnCancelar(e);
		}
	}

	protected void actionPerformedBtnCancelar(ActionEvent e) {
		dispose();
	}

	protected void actionPerformedTxtCantidad(ActionEvent e) {

	}

	int cambiarcantidad() {
		return Integer.parseInt(txtCantidad.getText());
	}

	protected void actionPerformedBtnAceptar(ActionEvent e) {
		
		if (txtCantidad.getText().isEmpty()) {
			JOptionPane.showMessageDialog(this, "Coloque la cantidad deseada");
			return;
		}

		MenuPrincipal.cantidadOptima = cambiarcantidad();
		dispose();
	}

	public void keyPressed(KeyEvent e) {
	}

	public void keyReleased(KeyEvent e) {
	}

	public void keyTyped(KeyEvent e) {
		if (e.getSource() == txtCantidad) {
			keyTypedTxtCantidad(e);
		}
	}

	protected void keyTypedTxtCantidad(KeyEvent e) {

		double key = e.getKeyChar();
		boolean numero = key >= 48 && key < 57;
		if (!numero)
			e.consume();

	}
}
