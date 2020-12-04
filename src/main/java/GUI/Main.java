package GUI;

import java.awt.EventQueue;




import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Cursor;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.JSeparator;
import java.awt.Label;
import javax.swing.ImageIcon;
import java.awt.Canvas;
import java.awt.Panel;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import uml.Client.DocumentType;

import java.awt.Dimension;
import javax.swing.SwingConstants;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalDate;

import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JMenuBar;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import java.awt.Component;

public class Main {

	private JFrame frame;
	private JPanel panelNaranja;
	private JLabel lblX;
	private JLabel lblNewLabel_2;
	private JTable tablaCliente;
	private JTable tablaPedidos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1141, 609);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setUndecorated(true);
		
		panelNaranja = new JPanel();
		panelNaranja.setBackground(new Color(186,79,84));
		panelNaranja.setBounds(193, 0, 948, 609);
		frame.getContentPane().add(panelNaranja);
		
		lblX = new JLabel("x");
		lblX.setBounds(919, -5, 23, 32);
		lblX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Object[] option = {"Si", "No"};
				int sure = JOptionPane.showOptionDialog(frame, "¿Seguro que quieres salir?", "EXIT", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, option, option[1]);
				if (sure == 0) 
				{
				System.exit(0);
				}
			}
		});
		
		
		panelNaranja.setLayout(null);
		lblX.setHorizontalTextPosition(SwingConstants.CENTER);
		lblX.setHorizontalAlignment(SwingConstants.CENTER);
		panelNaranja.add(lblX);
		lblX.setFont(new Font("Segoe UI", Font.BOLD, 24));
		lblX.setBackground(new Color(74,31,61));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(69, 68, 843, 510);
		panelNaranja.add(tabbedPane);
		
		String [][] datos = {};
		
		String [] nombreColumnas = {"ID", "Nombre cliente", "Apellido contacto", "Tipo de documento", "Numero DNI/NIE", "Email", "Contransenia"};
		
		tablaCliente = new JTable(datos, nombreColumnas);
		tablaCliente.getTableHeader().setFont(new Font("Verdana", Font.BOLD, 14));
		
		tablaCliente.setEnabled(false);
		tablaCliente.getTableHeader().setReorderingAllowed(false);
		tablaCliente.setModel(new DefaultTableModel(
			new Object[][] {
				{new Integer(1), "Marta", "Portoles", DocumentType.DNI, "72999034W", "asdad@ads.com", "asdasdd"},
				{new Integer(2), "Maria", "Garcia", DocumentType.DNI, "72859034W", "asdad@ads.com", "asdasdd"},
				{new Integer(3), "Carlos", "Perez", DocumentType.NIE, "P2999034W", "asdad@ads.com", "asdasdd"},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"ID", "Nombre cliente", "Apellido contacto", "Tipo documento", " Numero Dni/Nie", " Email", "Password"
			}
		)
				);
		
				
		String [] [] dataP = {};
		
		String[] columnNamesP = { "Codigo pedido",  "Fecha pedido", "Fecha entrega" ,"Codigo cliente" }; 
		tablaPedidos.getTableHeader().setFont(new Font("Verdana", Font.BOLD, 14));
		
		tablaCliente.setEnabled(false);
		tablaPedidos.getTableHeader().setReorderingAllowed(false);
		tablaPedidos.setModel(new DefaultTableModel(
			new Object[][] {
				{new Integer(1), LocalDate.of(2020, 12, 02), LocalDate.of(2020, 12, 10), new Integer(1)},
				{new Integer(2), LocalDate.of(2020, 12, 01), LocalDate.of(2020, 12, 9), new Integer(1)},
				{new Integer(3), LocalDate.of(2020, 12, 01), LocalDate.of(2020, 12, 12), new Integer(3)},
				{new Integer(4), LocalDate.of(2020, 12, 03), LocalDate.of(2020, 12, 13), new Integer(2)},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"Codigo pedido", "Fecha pedido", "Fecha entrega", "Codigo cliente"
			}
		)
		);
		
		tablaPedidos = new JTable(dataP, columnNamesP);
		tablaPedidos.getTableHeader().setFont(new Font("Verdana", Font.BOLD, 14));
		
		JScrollPane scrollPane_1 = new JScrollPane((Component) null);
		scrollPane_1.setFont(new Font("Verdana", Font.PLAIN, 12));
		tabbedPane.addTab("New tab", null, scrollPane_1, null);
		
		tablaPedidos = new JTable();
		scrollPane_1.setColumnHeaderView(tablaPedidos);
		
		
		
		
		
		JPanel panelMorado = new JPanel();
		panelMorado.setBackground(new Color(74,31,61)); //cambiar color background
		panelMorado.setBounds(0, 0, 195, 609);
		frame.getContentPane().add(panelMorado);
		panelMorado.setLayout(null);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(66, 46, 40, 52);
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Uusuario.CRISTINA\\git\\SoftwarePatternMVC_DAO_Test\\Images\\serverPeque.png"));
		panelMorado.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("W E B    P R O J E C T");
		lblNewLabel_3.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_3.setForeground(new Color(186, 79, 84));
		lblNewLabel_3.setBounds(33, 11, 132, 26);
		panelMorado.add(lblNewLabel_3);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setFont(new Font("Dialog", Font.PLAIN, 12));
		menuBar.setToolTipText("MENÚ");
		menuBar.setBounds(10, 128, 97, 21);
		panelMorado.add(menuBar);
		
		JMenu mnMenu = new JMenu("MENU");
		mnMenu.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		mnMenu.setBackground(Color.BLACK);
		mnMenu.setForeground(Color.BLACK);
		mnMenu.setFont(new Font("Dialog", Font.PLAIN, 12));
		menuBar.add(mnMenu);
		
		
		
		JMenuItem mntmCrear = new JMenuItem("Crear");
		/*mntmCrear.addActionListener(new ActionListener()){
			public void actionPerformed(ActionEvent e) {
				CreateUser.main(null);
			}
		});*/
		
		
		mntmCrear.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		mntmCrear.setBorder(new LineBorder(new Color(0, 0, 0), 0));
		mntmCrear.setFont(new Font("Verdana", Font.PLAIN, 12));
		mnClientes.add(mntmCrear);
		
		JMenuItem mntmModificar = new JMenuItem("Modificar");
		mntmModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tablaCliente.setEnabled(true);
				tablaPedidos.setEnabled(true);
			}
		});
		mntmModificar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		mntmModificar.setBorder(new LineBorder(new Color(0, 0, 0), 0));
		mntmModificar.setFont(new Font("Verdana", Font.PLAIN, 12));
		mnClientes.add(mntmModificar);
		
		JMenuItem mntmBorrar = new JMenuItem("Borrar");
		mntmBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tablaCliente.setEnabled(true);
				tablaPedidos.setEnabled(true);
			}
		});
		mntmBorrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		mntmBorrar.setBorder(new LineBorder(new Color(0, 0, 0), 0));
		mntmBorrar.setFont(new Font("Verdana", Font.PLAIN, 12));
		mnClientes.add(mntmBorrar);
		
	
	
	
	
	
	public JFrame getFrame() {
		return frame;
	}
}
