package ec.edu.puce.facturacion;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmCliente extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private JTextField txtCedula;
	private JTextField txtNombres;
	private JTextField txtApellidos;
	private JTextField txtTelefono;
	private JTextField txtDireccion;
	private JTextField txtEmail;
	private JTable table;
	private Cliente cliente = new Cliente();
	private DefaultTableModel model;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmCliente frame = new FrmCliente();
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
	public FrmCliente() {
		setBounds(100, 100, 450, 601);
		getContentPane().setLayout(null);
		
		
		//LABELS
		JLabel lblCedula = new JLabel("Cedula");
		lblCedula.setBounds(49, 30, 49, 14);
		getContentPane().add(lblCedula);
		
		JLabel lblNombre = new JLabel("Nombres");
		lblNombre.setBounds(49, 62, 49, 14);
		getContentPane().add(lblNombre);
		
		JLabel lblApellidos = new JLabel("Apellidos");
		lblApellidos.setBounds(49, 94, 49, 14);
		getContentPane().add(lblApellidos);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setBounds(49, 126, 49, 14);
		getContentPane().add(lblTelefono);
		
		JLabel lblDireccion = new JLabel("Direccion");
		lblDireccion.setBounds(49, 158, 49, 14);
		getContentPane().add(lblDireccion);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(49, 190, 49, 14);
		getContentPane().add(lblEmail);
		
		
		
		//BOTONES
		JButton btnNuevo = new JButton("Nuevo");
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpiarCampos();
			}
		});
		btnNuevo.setBounds(45, 266, 89, 23);
		getContentPane().add(btnNuevo);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				crearCliente();
			}
		});
		btnGuardar.setBounds(165, 266, 89, 23);
		getContentPane().add(btnGuardar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cerrarVentana();
			}
		});
		btnCancelar.setBounds(285, 266, 89, 23);
		getContentPane().add(btnCancelar);
		
		
		
		
		//TEXT FIELDS
		txtCedula = new JTextField();
		txtCedula.setBounds(124, 27, 214, 20);
		getContentPane().add(txtCedula);
		txtCedula.setColumns(10);
		
		txtNombres = new JTextField();
		txtNombres.setBounds(124, 59, 214, 20);
		getContentPane().add(txtNombres);
		txtNombres.setColumns(10);
		
		txtApellidos = new JTextField();
		txtApellidos.setBounds(124, 91, 214, 20);
		getContentPane().add(txtApellidos);
		txtApellidos.setColumns(10);
		
		txtTelefono = new JTextField();
		txtTelefono.setBounds(124, 123, 214, 20);
		getContentPane().add(txtTelefono);
		txtTelefono.setColumns(10);
		
		txtDireccion = new JTextField();
		txtDireccion.setBounds(124, 155, 214, 20);
		getContentPane().add(txtDireccion);
		txtDireccion.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(124, 187, 214, 20);
		getContentPane().add(txtEmail);
		txtEmail.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(50, 302, 350, 244);
		getContentPane().add(scrollPane);
		
		
		
		//TABLA
		table = new JTable();
		table.setBackground(new Color(192, 192, 192));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Cedula", "Nombres", "Apellidos", "Tel\u00E9fono", "Direcci\u00F3n", "Email"
			}
		));
		scrollPane.setViewportView(table);
		model=(DefaultTableModel)table.getModel();

	}
	
	
	public void cerrarVentana() {
		this.setVisible(false);
	}
	
	public void limpiarCampos() {
		txtCedula.setText("");
		txtNombres.setText("");
		txtApellidos.setText("");
		txtDireccion.setText("");
		txtTelefono.setText("");
		txtEmail.setText("");
	}
	
	private void crearCliente() {
		cliente.setCedula(txtCedula.getText());
		cliente.setNombres(txtNombres.getText());
		cliente.setApellidos(txtApellidos.getText());
		cliente.setDireccion(txtDireccion.getText());
		cliente.setTelefono(txtTelefono.getText());
		cliente.setEmail(txtEmail.getText());
		agregarFila();
			
	}

	private void agregarFila() {
		Object[] fila=new Object[6];
		fila[0]=cliente.getCedula();
		fila[1]=cliente.getNombres();
		fila[2]=cliente.getApellidos();
		fila[3]=cliente.getTelefono();
		fila[4]=cliente.getDireccion();
		fila[5]=cliente.getEmail();
		model.addRow(fila);
	}
	
	
}
