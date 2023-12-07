package ec.edu.puce.facturacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JDesktopPane;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class MenuPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JDesktopPane desktopPane;
	private FrmCliente frmCliente;

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
		setTitle("Menu Principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 701, 593);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setForeground(new Color(255, 128, 0));
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmNew = new JMenuItem("New ");
		mnFile.add(mntmNew);
		
		JMenuItem mntmOpen = new JMenuItem("Open");
		mnFile.add(mntmOpen);
		
		JMenuItem mntmSalir = new JMenuItem("Salir");
		mntmSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(getDefaultCloseOperation());
			}
		});
		mnFile.add(mntmSalir);
		
		JMenu mnCliente = new JMenu("Cliente");
		menuBar.add(mnCliente);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Lista de clientes");
		mnCliente.add(mntmNewMenuItem_4);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Agregar nuevo cliente");
		mntmNewMenuItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (frmCliente == null ) {
					frmCliente = new FrmCliente();
					desktopPane.add(frmCliente);
					frmCliente.setVisible(true);
				} else if (!frmCliente.isVisible()){
					frmCliente.setVisible(true);
				} else {
					frmCliente.toFront();
				}
				
			}
		});
		mnCliente.add(mntmNewMenuItem_5);
		
		JMenu mnProductos = new JMenu("Productos");
		menuBar.add(mnProductos);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Lista de productos");
		mnProductos.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Agregar nuevo producto");
		mnProductos.add(mntmNewMenuItem_3);
		
		JMenu mnRedesSociales = new JMenu("Redes sociales");
		menuBar.add(mnRedesSociales);
		
		JMenuItem mntmFacebook = new JMenuItem("Facebook");
		mntmFacebook.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/ec/edu/puce/facturacion/imagenes/facebook.png")));
		mntmFacebook.setHorizontalAlignment(SwingConstants.LEFT);
		mnRedesSociales.add(mntmFacebook);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		desktopPane = new JDesktopPane();
		desktopPane.setBackground(new Color(0, 0, 64));
		contentPane.add(desktopPane, "name_1328930845884300");
	}
	
	
	public void abrirNuevo() {
		
		
	}
}
