package proyecto;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuPrincipal extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnArchivo;
	private JMenu mnMantenimiento;
	private JMenu mnVentas;
	private JMenu mnConfiguracion;
	private JMenu mnAyuda;
	private JMenuItem mntmNewMenuItem;
	private JMenuItem mntmConsultarCocina;
	private JMenuItem mntmModificarCocina;
	private JSeparator separator;
	private JMenuItem mntmListarCocina;
	private JMenuItem mntmVender;
	private JSeparator separator_1;
	private JMenuItem mntmGenerarReportes;
	private JMenuItem mntmConfigurarDescuentos;
	private JMenuItem mntmConfigurarObsequios;
	private JSeparator separator_2;
	private JMenuItem mntmConfigurarCantidadOptima;
	private JMenuItem mntmConfigurarCuotaDiaria;
	private JMenuItem mntmAcercadeTienda;

	// Datos m�nimos de la primera cocina
	public static String modelo0 = "Mabe EMP6120PG0";
	public static double precio0 = 949.0;
	public static double fondo0 = 58.6;
	public static double ancho0 = 60.0;
	public static double alto0 = 91.0;
	public static int quemadores0 = 4;
	// Datos m�nimos de la segunda cocina
	public static String modelo1 = "Indurama Parma";
	public static double precio1 = 1089.0;
	public static double ancho1 = 80.0;
	public static double alto1 = 94.0;
	public static double fondo1 = 67.5;
	public static int quemadores1 = 6;
	// Datos m�nimos de la tercera cocina
	public static String modelo2 = "Sole COSOL027";
	public static double precio2 = 850.0;
	public static double ancho2 = 60.0;
	public static double alto2 = 90.0;
	public static double fondo2 = 50.0;
	public static int quemadores2 = 4;
	// Datos m�nimos de la cuarta cocina
	public static String modelo3 = "Coldex CX602";
	public static double precio3 = 629.0;
	public static double ancho3 = 61.6;
	public static double alto3 = 95.0;
	public static double fondo3 = 51.5;
	public static int quemadores3 = 5;
	// Datos m�nimos de la quinta cocina
	public static String modelo4 = "Reco Dakota";
	public static double precio4 = 849.0;
	public static double ancho4 = 75.4;
	public static double alto4 = 94.5;
	public static double fondo4 = 66.0;
	public static int quemadores4 = 5;
	// Porcentajes de descuento
	public static double porcentaje1 = 7.5;
	public static double porcentaje2 = 10.0;
	public static double porcentaje3 = 12.5;
	public static double porcentaje4 = 15.0;
	// Obsequios
	public static String obsequio1 = "Cafetera";
	public static String obsequio2 = "Licuadora";
	public static String obsequio3 = "Extractor";
	// Cantidad �ptima de unidades vendidas
	public static int cantidadOptima = 30;
	// Cuota diaria
	public static double cuotaDiaria = 75000;

	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPrincipal frame = new MenuPrincipal();
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
	public MenuPrincipal() {
		setTitle("Tienda1.0");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 583);

		menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);

		mntmNewMenuItem = new JMenuItem("Salir del Sistema");
		mntmNewMenuItem.addActionListener(this);
		mntmNewMenuItem.setIcon(new ImageIcon("D:\\Descargas\\icons8-fire-exit-16.png"));
		mntmNewMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F4, InputEvent.ALT_DOWN_MASK));
		mnArchivo.add(mntmNewMenuItem);

		mnMantenimiento = new JMenu("Mantenimiento");
		menuBar.add(mnMantenimiento);

		mntmConsultarCocina = new JMenuItem("Consultar Cocina");
		mntmConsultarCocina.addActionListener(this);
		mnMantenimiento.add(mntmConsultarCocina);

		mntmModificarCocina = new JMenuItem("Modificar Cocina");
		mntmModificarCocina.addActionListener(this);
		mnMantenimiento.add(mntmModificarCocina);

		separator = new JSeparator();
		mnMantenimiento.add(separator);

		mntmListarCocina = new JMenuItem("Listar Cocina");
		mntmListarCocina.addActionListener(this);
		mnMantenimiento.add(mntmListarCocina);

		mnVentas = new JMenu("Ventas");
		menuBar.add(mnVentas);

		mntmVender = new JMenuItem("Vender");
		mntmVender.addActionListener(this);
		mnVentas.add(mntmVender);

		separator_1 = new JSeparator();
		mnVentas.add(separator_1);

		mntmGenerarReportes = new JMenuItem("Generar Reportes");
		mntmGenerarReportes.addActionListener(this);
		mnVentas.add(mntmGenerarReportes);

		mnConfiguracion = new JMenu("Configuraci\u00F3n");
		menuBar.add(mnConfiguracion);

		mntmConfigurarDescuentos = new JMenuItem("Configurar Descuentos");
		mnConfiguracion.add(mntmConfigurarDescuentos);

		mntmConfigurarObsequios = new JMenuItem("Configurar Obsequios");
		mnConfiguracion.add(mntmConfigurarObsequios);

		separator_2 = new JSeparator();
		mnConfiguracion.add(separator_2);

		mntmConfigurarCantidadOptima = new JMenuItem("Configurar Cantidad \u00D3ptima");
		mntmConfigurarCantidadOptima.addActionListener(this);
		mnConfiguracion.add(mntmConfigurarCantidadOptima);

		mntmConfigurarCuotaDiaria = new JMenuItem("Configurar Cuota Diaria");
		mntmConfigurarCuotaDiaria.addActionListener(this);
		mnConfiguracion.add(mntmConfigurarCuotaDiaria);

		mnAyuda = new JMenu("Ayuda");
		menuBar.add(mnAyuda);

		mntmAcercadeTienda = new JMenuItem("Acerca de Tienda");
		mntmAcercadeTienda.addActionListener(this);
		mnAyuda.add(mntmAcercadeTienda);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mntmConfigurarCantidadOptima) {
			actionPerformedMntmConfigurarCantidadOptima(e);
		}
		if (e.getSource() == mntmConfigurarCuotaDiaria) {
			actionPerformedMntmConfigurarCuotaDiaria(e);
		}
		if (e.getSource() == mntmGenerarReportes) {
			actionPerformedMntmGenerarReportes(e);
		}
		if (e.getSource() == mntmVender) {
			actionPerformedMntmVender(e);
		}
		if (e.getSource() == mntmModificarCocina) {
			actionPerformedMntmNewMenuItem_2(e);
		}
		if (e.getSource() == mntmConsultarCocina) {
			actionPerformedMntmNewMenuItem_1(e);
		}
		if (e.getSource() == mntmNewMenuItem) {
			actionPerformedMntmNewMenuItem(e);
		}
		if (e.getSource() == mntmAcercadeTienda) {
			actionPerformedMntmNewMenuItem_10(e);
		}
		if (e.getSource() == mntmListarCocina) {
			actionPerformedMntmNewMenuItem_3(e);
		}
	}

	protected void actionPerformedMntmNewMenuItem_3(ActionEvent e) {

		DialogoListar dialist = new DialogoListar();
		dialist.setLocationRelativeTo(this);
		dialist.setVisible(true);

	}

	protected void actionPerformedMntmNewMenuItem_10(ActionEvent e) {

		DialogoAcercadeTienda acerca = new DialogoAcercadeTienda();
		acerca.setLocationRelativeTo(this);
		acerca.setVisible(true);

	}

	protected void actionPerformedMntmNewMenuItem(ActionEvent e) {

		System.exit(0);

	}

	protected void actionPerformedMntmNewMenuItem_1(ActionEvent e) {

		DialogoConsultarCocina dialist = new DialogoConsultarCocina();
		dialist.setLocationRelativeTo(this);
		dialist.setVisible(true);

	}

	protected void actionPerformedMntmNewMenuItem_2(ActionEvent e) {

		DialogoModificarCocina diamod = new DialogoModificarCocina();
		diamod.setLocationRelativeTo(this);
		diamod.setVisible(true);

	}

	protected void actionPerformedMntmVender(ActionEvent e) {

		DialogoVender1 diaved = new DialogoVender1();

		diaved.setLocationRelativeTo(this);
		diaved.setVisible(true);

	}

	protected void actionPerformedMntmGenerarReportes(ActionEvent e) {

		DialogoGenerarReportes diagere = new DialogoGenerarReportes();

		diagere.setLocationRelativeTo(this);
		diagere.setVisible(true);

	}

	protected void actionPerformedMntmConfigurarCuotaDiaria(ActionEvent e) {

		DialogoCuotaDiaria confiCuota = new DialogoCuotaDiaria();

		confiCuota.setLocationRelativeTo(this);
		confiCuota.setVisible(true);

	}

	protected void actionPerformedMntmConfigurarCantidadOptima(ActionEvent e) {

		DialogoConfigurarCantidadOptima confiOptima = new DialogoConfigurarCantidadOptima();

		confiOptima.setLocationRelativeTo(this);
		confiOptima.setVisible(true);

	}
}// FIN
