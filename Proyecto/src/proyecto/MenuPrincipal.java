package proyecto;

import java.awt.EventQueue;
import java.awt.Image;
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
import java.awt.Toolkit;
import javax.swing.JLabel;


public class MenuPrincipal extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
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

	// Cantidad Ventas
	public static int cantidadVentas0 = 0;
	public static int cantidadVentas1 = 0;
	public static int cantidadVentas2 = 0;
	public static int cantidadVentas3 = 0;
	public static int cantidadVentas4 = 0;
	public static int contadorVentas = 0;
	//Importes
	public static double sumaImporte0 = 0;
	public static double sumaImporte1 = 0;
	public static double sumaImporte2 = 0;
	public static double sumaImporte3 = 0;
	public static double sumaImporte4 = 0;
	public static double sumaImporteTotal = 0;
	//Unidades Vendidas
	public static int unidadesVendidas0 = 0;
	public static int unidadesVendidas1 = 0;
	public static int unidadesVendidas2 = 0;
	public static int unidadesVendidas3 = 0;
	public static int unidadesVendidas4 = 0;
	//Aporte a la cuota diaria
	public static double aporteCuotaD0;
	public static double aporteCuotaD1 = 0;
	public static double aporteCuotaD2 = 0;
	public static double aporteCuotaD3 = 0;
	public static double aporteCuotaD4 = 0;
	public static double aporteTotalCuota = 0;
	//Comparación con la cantidad optima
	public static String optima0 = "";
	public static String optima1 = "";
	public static String optima2 = "";
	public static String optima3 = "";
	public static String optima4 = "";
	//Precios Promedio, Mayor, Menor
	public static double precioMayor = precio1;
	public static double precioMenor = precio3;
	public static double precioPromedio = (precioMenor/2 + precioMayor/2);
	public static double anchoMayor = ancho1;
	public static double anchoMenor = ancho0;
	public static double anchoPromedio = (anchoMenor + anchoMayor) / 2;
	//Comparacion de precio con promedio
	public static String comparacionPromedio0 = "";
	public static String comparacionPromedio1 = "";
	public static String comparacionPromedio2 = "";
	public static String comparacionPromedio3 = "";
	public static String comparacionPromedio4 = "";
	


	private JSeparator separator_3;
	private JSeparator separator_4;
	private JSeparator separator_5;
	private JLabel lblImagen;


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
		setIconImage(Toolkit.getDefaultToolkit().getImage(MenuPrincipal.class.getResource("/Imagenes/iconoEscudo.png")));
		setTitle("Tienda1.0");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 583);

		menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		mnArchivo = new JMenu("Archivo");
		mnArchivo.setIcon(new ImageIcon("C:\\Users\\USER\\Downloads\\abrir-documento.png"));
		menuBar.add(mnArchivo);

		mntmNewMenuItem = new JMenuItem("Salir del Sistema");
		mntmNewMenuItem.addActionListener(this);
		mntmNewMenuItem.setIcon(new ImageIcon("C:\\Users\\USER\\Downloads\\cerrar-sesion.png"));
		mntmNewMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F4, InputEvent.ALT_DOWN_MASK));
		mnArchivo.add(mntmNewMenuItem);

		mnMantenimiento = new JMenu("Mantenimiento");
		mnMantenimiento.setIcon(new ImageIcon("C:\\Users\\USER\\Downloads\\mantenimiento.png"));
		menuBar.add(mnMantenimiento);

		mntmConsultarCocina = new JMenuItem("Consultar Cocina");
		mntmConsultarCocina.setIcon(new ImageIcon("C:\\Users\\USER\\Downloads\\consulta.png"));
		mntmConsultarCocina.addActionListener(this);
		mnMantenimiento.add(mntmConsultarCocina);

		mntmModificarCocina = new JMenuItem("Modificar Cocina");
		mntmModificarCocina.setIcon(new ImageIcon("C:\\Users\\USER\\Downloads\\editar.png"));
		mntmModificarCocina.addActionListener(this);
		
		separator_5 = new JSeparator();
		mnMantenimiento.add(separator_5);
		mnMantenimiento.add(mntmModificarCocina);

		separator = new JSeparator();
		mnMantenimiento.add(separator);

		mntmListarCocina = new JMenuItem("Listar Cocina");
		mntmListarCocina.setIcon(new ImageIcon("C:\\Users\\USER\\Downloads\\lista-de-verificacion.png"));
		mntmListarCocina.addActionListener(this);
		mnMantenimiento.add(mntmListarCocina);

		mnVentas = new JMenu("Ventas");
		mnVentas.setIcon(new ImageIcon("C:\\Users\\USER\\Downloads\\mano.png"));
		menuBar.add(mnVentas);

		mntmVender = new JMenuItem("Vender");
		mntmVender.setIcon(new ImageIcon("C:\\Users\\USER\\Downloads\\vender.png"));
		mntmVender.addActionListener(this);
		mnVentas.add(mntmVender);

		separator_1 = new JSeparator();
		mnVentas.add(separator_1);

		mntmGenerarReportes = new JMenuItem("Generar Reportes");
		mntmGenerarReportes.setIcon(new ImageIcon("C:\\Users\\USER\\Downloads\\dinero.png"));
		mntmGenerarReportes.addActionListener(this);
		mnVentas.add(mntmGenerarReportes);

		mnConfiguracion = new JMenu("Configuraci\u00F3n");
		mnConfiguracion.setIcon(new ImageIcon("C:\\Users\\USER\\Downloads\\configuraciones.png"));
		menuBar.add(mnConfiguracion);

		mntmConfigurarDescuentos = new JMenuItem("Configurar Descuentos");
		mntmConfigurarDescuentos.setIcon(new ImageIcon("C:\\Users\\USER\\Downloads\\descuento.png"));
		mntmConfigurarDescuentos.addActionListener(this);
		mnConfiguracion.add(mntmConfigurarDescuentos);

		mntmConfigurarObsequios = new JMenuItem("Configurar Obsequios");
		mntmConfigurarObsequios.setIcon(new ImageIcon("C:\\Users\\USER\\Downloads\\regalo.png"));
		mntmConfigurarObsequios.addActionListener(this);
		
		separator_3 = new JSeparator();
		mnConfiguracion.add(separator_3);
		mnConfiguracion.add(mntmConfigurarObsequios);

		separator_2 = new JSeparator();
		mnConfiguracion.add(separator_2);

		mntmConfigurarCantidadOptima = new JMenuItem("Configurar Cantidad \u00D3ptima");
		mntmConfigurarCantidadOptima.setIcon(new ImageIcon("C:\\Users\\USER\\Downloads\\ipq.png"));
		mntmConfigurarCantidadOptima.addActionListener(this);
		mnConfiguracion.add(mntmConfigurarCantidadOptima);

		mntmConfigurarCuotaDiaria = new JMenuItem("Configurar Cuota Diaria");
		mntmConfigurarCuotaDiaria.setIcon(new ImageIcon("C:\\Users\\USER\\Downloads\\pago.png"));
		mntmConfigurarCuotaDiaria.addActionListener(this);
		
		separator_4 = new JSeparator();
		mnConfiguracion.add(separator_4);
		mnConfiguracion.add(mntmConfigurarCuotaDiaria);

		mnAyuda = new JMenu("Ayuda");
		mnAyuda.setIcon(new ImageIcon("C:\\Users\\USER\\Downloads\\ayuda.png"));
		menuBar.add(mnAyuda);

		mntmAcercadeTienda = new JMenuItem("Acerca de Tienda");
		mntmAcercadeTienda.setIcon(new ImageIcon("C:\\Users\\USER\\Downloads\\informacion (1).png"));
		mntmAcercadeTienda.addActionListener(this);
		mnAyuda.add(mntmAcercadeTienda);
		getContentPane().setLayout(null);
		
		lblImagen = new JLabel("");
		lblImagen.setBounds(0, 0, 884, 514);
		getContentPane().add(lblImagen);
		
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mntmConfigurarObsequios) {
			actionPerformedMntmConfigurarObsequios(e);
		}
		if (e.getSource() == mntmConfigurarDescuentos) {
			actionPerformedMntmConfigurarDescuentos(e);
		}
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

	protected void actionPerformedMntmConfigurarDescuentos(ActionEvent e) {

		DialogoConfigurarDescuento confiDes = new DialogoConfigurarDescuento();

		confiDes.setLocationRelativeTo(this);
		confiDes.setVisible(true);

	}
	protected void actionPerformedMntmConfigurarObsequios(ActionEvent e) {
		
		DialogoConfigurarObsequio confiObs = new DialogoConfigurarObsequio();

		confiObs.setLocationRelativeTo(this);
		confiObs.setVisible(true);	
	}
	
	protected void actionPerformedMntmNewMenuItem(ActionEvent e) {

		System.exit(0);

	}
}// FIN
