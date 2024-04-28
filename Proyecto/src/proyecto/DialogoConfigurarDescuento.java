package proyecto;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Cursor;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class DialogoConfigurarDescuento extends JDialog implements ActionListener, KeyListener {

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
	private JButton btnCancelar;
	private JButton btnAceptar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DialogoConfigurarDescuento dialog = new DialogoConfigurarDescuento();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DialogoConfigurarDescuento() {
		setTitle("Configurar porcentajes de descuento");
		setBounds(100, 100, 450, 178);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(192, 192, 192));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		lblPorcentaje1 = new JLabel("1 a 5 unidades");
		lblPorcentaje1.setBounds(26, 27, 89, 14);
		contentPanel.add(lblPorcentaje1);

		lblPorcentaje2 = new JLabel("6 a 10 unidades");
		lblPorcentaje2.setBounds(26, 52, 89, 14);
		contentPanel.add(lblPorcentaje2);

		lblPorcentaje3 = new JLabel("11 a 15 unidades");
		lblPorcentaje3.setBounds(26, 77, 89, 14);
		contentPanel.add(lblPorcentaje3);

		lblPorcentaje4 = new JLabel("Más de 15 unidades");
		lblPorcentaje4.setBounds(26, 102, 130, 14);
		contentPanel.add(lblPorcentaje4);

		txtPorcentaje1 = new JTextField(MenuPrincipal.porcentaje1 + "");
		txtPorcentaje1.addKeyListener(this);
		txtPorcentaje1.setBorder(null);
		txtPorcentaje1.setBounds(144, 24, 86, 20);
		contentPanel.add(txtPorcentaje1);
		txtPorcentaje1.setColumns(10);

		txtPorcentaje2 = new JTextField(MenuPrincipal.porcentaje2 + "");
		txtPorcentaje2.addKeyListener(this);
		txtPorcentaje2.setBorder(null);
		txtPorcentaje2.setBounds(144, 49, 86, 20);
		contentPanel.add(txtPorcentaje2);
		txtPorcentaje2.setColumns(10);

		txtPorcentaje3 = new JTextField(MenuPrincipal.porcentaje3 + "");
		txtPorcentaje3.addKeyListener(this);
		txtPorcentaje3.setBorder(null);
		txtPorcentaje3.setBounds(144, 74, 86, 20);
		contentPanel.add(txtPorcentaje3);
		txtPorcentaje3.setColumns(10);

		txtPorcentaje4 = new JTextField(MenuPrincipal.porcentaje4 + "");
		txtPorcentaje4.addKeyListener(this);
		txtPorcentaje4.setBorder(null);
		txtPorcentaje4.setBounds(144, 99, 86, 20);
		contentPanel.add(txtPorcentaje4);
		txtPorcentaje4.setColumns(10);

		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(this);
		btnCancelar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCancelar.setBounds(321, 52, 89, 23);
		contentPanel.add(btnCancelar);

		btnAceptar = new JButton("Aceptar");
		btnAceptar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAceptar.addActionListener(this);
		btnAceptar.setBounds(321, 23, 89, 23);
		contentPanel.add(btnAceptar);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCancelar) {
			actionPerformedBtnCancelar(e);
		}
		if (e.getSource() == btnAceptar) {
			actionPerformedBtnAceptar(e);
		}
	}

	double cambiarPorcentaje1() {

		return Double.parseDouble(txtPorcentaje1.getText());

	}

	double cambiarPorcentaje2() {

		return Double.parseDouble(txtPorcentaje2.getText());

	}

	double cambiarPorcentaje3() {

		return Double.parseDouble(txtPorcentaje3.getText());

	}

	double cambiarPorcentaje4() {

		return Double.parseDouble(txtPorcentaje4.getText());

	}

	protected void actionPerformedBtnAceptar(ActionEvent e) {

		if (txtPorcentaje1.getText().isEmpty() || txtPorcentaje2.getText().isEmpty()
				|| txtPorcentaje3.getText().isEmpty() || txtPorcentaje4.getText().isEmpty()) {
			JOptionPane.showMessageDialog(this, "Coloque el porcentaje deseado");
			return;
		}

		MenuPrincipal.porcentaje1 = cambiarPorcentaje1();
		MenuPrincipal.porcentaje2 = cambiarPorcentaje2();
		MenuPrincipal.porcentaje3 = cambiarPorcentaje3();
		MenuPrincipal.porcentaje4 = cambiarPorcentaje4();

		dispose();

	}

	protected void actionPerformedBtnCancelar(ActionEvent e) {
		dispose();

	}

	public void keyPressed(KeyEvent e) {
	}

	public void keyReleased(KeyEvent e) {
	}

	public void keyTyped(KeyEvent e) {
		if (e.getSource() == txtPorcentaje4) {
			keyTypedTxtPorcentaje4(e);
		}
		if (e.getSource() == txtPorcentaje3) {
			keyTypedTxtPorcentaje3(e);
		}
		if (e.getSource() == txtPorcentaje2) {
			keyTypedTxtPorcentaje2(e);
		}
		if (e.getSource() == txtPorcentaje1) {
			keyTypedTxtPorcentaje1(e);
		}
	}

	protected void keyTypedTxtPorcentaje1(KeyEvent e) {

		double key = e.getKeyChar();
		boolean punto = key == 46;
		boolean numero = key >= 48 && key < 57;
		if (!punto && !numero)
			e.consume();

	}

	protected void keyTypedTxtPorcentaje2(KeyEvent e) {

		double key = e.getKeyChar();
		boolean punto = key == 46;
		boolean numero = key >= 48 && key < 57;
		if (!punto && !numero)
			e.consume();
	}

	protected void keyTypedTxtPorcentaje3(KeyEvent e) {

		double key = e.getKeyChar();
		boolean punto = key == 46;
		boolean numero = key >= 48 && key < 57;
		if (!punto && !numero)
			e.consume();
	}

	protected void keyTypedTxtPorcentaje4(KeyEvent e) {

		double key = e.getKeyChar();
		boolean punto = key == 46;
		boolean numero = key >= 48 && key < 57;
		if (!punto && !numero)
			e.consume();
	}
}
