package proyecto;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.Cursor;

public class DialogoCuotaDiaria extends JDialog implements ActionListener, KeyListener {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtCuotaDiaria;
	private JButton btnAceptar;
	private JButton btnCancelar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DialogoCuotaDiaria dialog = new DialogoCuotaDiaria();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DialogoCuotaDiaria() {
		setBounds(100, 100, 450, 142);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(192, 192, 192));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblCuotaDiaria = new JLabel("Cuota diaria esperada (S/.)");
			lblCuotaDiaria.setFont(new Font("Roboto", Font.BOLD, 13));
			lblCuotaDiaria.setBounds(10, 24, 163, 14);
			contentPanel.add(lblCuotaDiaria);
		}
		{
			txtCuotaDiaria = new JTextField(MenuPrincipal.cuotaDiaria + "");
			txtCuotaDiaria.addKeyListener(this);
			txtCuotaDiaria.addActionListener(this);
			txtCuotaDiaria.setBorder(null);
			txtCuotaDiaria.setBounds(183, 22, 86, 20);
			contentPanel.add(txtCuotaDiaria);
			txtCuotaDiaria.setColumns(10);
		}
		{
			btnAceptar = new JButton("Aceptar");
			btnAceptar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnAceptar.addActionListener(this);
			btnAceptar.setBorder(null);
			btnAceptar.setBounds(335, 21, 89, 23);
			contentPanel.add(btnAceptar);
		}
		{
			btnCancelar = new JButton("Cancelar");
			btnCancelar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnCancelar.addActionListener(this);
			btnCancelar.setBorder(null);
			btnCancelar.setBounds(335, 50, 89, 23);
			contentPanel.add(btnCancelar);
		}
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCancelar) {
			actionPerformedBtnCancelar(e);
		}
		if (e.getSource() == btnAceptar) {
			actionPerformedBtnAceptar(e);
		}
	}

	double cambiarcuota() {
		return Double.parseDouble(txtCuotaDiaria.getText());
	}

	protected void actionPerformedBtnAceptar(ActionEvent e) {

		MenuPrincipal.cuotaDiaria = cambiarcuota();
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
		if (e.getSource() == txtCuotaDiaria) {
			keyTypedTxtCuotaDiaria(e);
		}
	}

	protected void keyTypedTxtCuotaDiaria(KeyEvent e) {

		double key = e.getKeyChar();
		boolean punto = key == 46;
		boolean numero = key >= 48 && key < 57;
		if (!punto && !numero)
			e.consume();

	}
}
