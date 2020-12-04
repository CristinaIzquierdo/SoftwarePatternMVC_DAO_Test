package GUI;

import java.awt.EventQueue;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import uml.Client.DocumentType;

import javax.swing.JMenuBar;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Cursor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalDate;
import java.awt.Component;
import javax.swing.JMenu;
import java.awt.Color;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;

public class Main {

	private JFrame JPanel;
	private JTable tablaClientes;
	private JTable tablaPedidos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.JPanel.setVisible(true);
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
	@SuppressWarnings("serial")
	private void initialize() {
		JPanel = new JFrame();
		JPanel.setBounds(400, 300, 1049, 774);
		JPanel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel.getContentPane().setLayout(null);
		JPanel.setUndecorated(true);
				
				
				
				String [] [] data = {};
				
				String[] columnNames = { "ID", "Nombre cliente","Apellido contacto","Tipo documento"," Numero Dni/Nie"," Email", "Password" }; 
				
				String [] [] dataP = {};
				
				String[] columnNamesP = { "Codigo pedido",  "Fecha pedido", "Fecha entrega" ,"Codigo cliente" }; 
				
				JPanel panelNaranja = new JPanel();
				panelNaranja.setLayout(null);
				panelNaranja.setBackground(new Color(186, 79, 84));
				panelNaranja.setBounds(192, 0, 857, 774);
				JPanel.getContentPane().add(panelNaranja);
				
				JLabel lblX_1 = new JLabel("x");
				lblX_1.setHorizontalTextPosition(SwingConstants.CENTER);
				lblX_1.setHorizontalAlignment(SwingConstants.CENTER);
				lblX_1.setFont(new Font("Segoe UI", Font.BOLD, 24));
				lblX_1.setBackground(new Color(74, 31, 61));
				lblX_1.setBounds(834, -5, 23, 32);
				panelNaranja.add(lblX_1);
				
				JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
				tabbedPane.setBorder(null);
				tabbedPane.setBounds(10, 74, 805, 637);
				panelNaranja.add(tabbedPane);
				tabbedPane.setFont(new Font("Dialog", Font.PLAIN, 12));
				tabbedPane.setBackground(SystemColor.info);
				
				tablaPedidos = new JTable(dataP, columnNamesP);
				tablaPedidos.getTableHeader().setFont(new Font("Verdana", Font.BOLD, 14));
				tablaPedidos.getTableHeader().setReorderingAllowed(false);
				tablaPedidos.setModel(new DefaultTableModel(
					new Object[][] {
						{new Integer(1), LocalDate.of(2020, 12, 02), LocalDate.of(2020, 12, 10), new Integer(1)},
						{new Integer(2), LocalDate.of(2020, 12, 01), LocalDate.of(2020, 12, 9), new Integer(1)},
						{new Integer(3), LocalDate.of(2020, 12, 01), LocalDate.of(2020, 12, 12), new Integer(3)},
						{new Integer(4), LocalDate.of(2020, 12, 03), LocalDate.of(2020, 12, 13), new Integer(2)},
						{new Integer(1), LocalDate.of(2020, 12, 05), LocalDate.of(2020, 12, 13), new Integer(3)},
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
//				{public boolean isCellEditable(int row, int column){return false;}}
				);
				
				
				tablaPedidos.setFont(new Font("Verdana", Font.PLAIN, 12));
				JScrollPane scrollPane_1 = new JScrollPane(tablaPedidos);
				scrollPane_1.setFont(new Font("Verdana", Font.PLAIN, 12));
				tabbedPane.addTab("Pedidos", null, scrollPane_1, null);
				
				tablaClientes = new JTable(data, columnNames);
				tablaClientes.getTableHeader().setFont(new Font("Verdana", Font.BOLD, 14));
				tablaClientes.setEnabled(false);
				tablaClientes.getTableHeader().setReorderingAllowed(false);
				tablaClientes.setModel(new DefaultTableModel(
					new Object[][] {
						{new Integer(1), "Cristina", "Izquierdo", DocumentType.DNI, "73167895A", "prueba@ads.com", "prueba"},
						{new Integer(2), "Maria", "Garcia",  DocumentType.DNI, "72859034W", "asdad@ads.com", "asdasdd"},
						{new Integer(3), "Nuria", "Gallego",  DocumentType.NIE, "P2999034W", "asdad@ads.com", "asdasdd"},
						{new Integer(4), "Carlos", "Garcia",  DocumentType.NIE, "P2999034W", "asdad@ads.com", "asdasdd"},
						{new Integer(5), "Carlos", "Perez",  DocumentType.NIE, "P2999034W", "asdad@ads.com", "asdasdd"},
						{new Integer(6), "Alex", "Perez",  DocumentType.NIE, "P2999034W", "asdad@ads.com", "asdasdd"},
						{null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null},
					},
					new String[] {
						"ID", "Nombre cliente", "Apellido contacto", "Tipo documento", " Numero Dni/Nie", " Email", "Password"
					}
				) 
//				{public boolean isCellEditable(int row, int column){return false;}}
				);
				
				tablaClientes.setFont(new Font("Verdana", Font.PLAIN, 12));
				JScrollPane scrollPane = new JScrollPane(tablaClientes);
				tabbedPane.addTab("New tab", null, scrollPane, null);
				scrollPane.setFont(new Font("Verdana", Font.PLAIN, 12));
				tablaClientes.setEnabled(false);
				
				JPanel panelMorado = new JPanel();
				panelMorado.setLayout(null);
				panelMorado.setBackground(new Color(74, 31, 61));
				panelMorado.setBounds(0, 0, 195, 774);
				JPanel.getContentPane().add(panelMorado);
				
				JMenuBar menuBar = new JMenuBar();
				menuBar.setBounds(26, 217, 97, 21);
				panelMorado.add(menuBar);
				menuBar.setBackground(new Color(186, 79, 84));
				
				JMenu menuClientes = new JMenu("Clientes");
				menuClientes.setAlignmentX(Component.RIGHT_ALIGNMENT);
				menuClientes.setBackground(new Color(186, 79, 84));
				menuBar.add(menuClientes);
				
				menuClientes.setBorder(null);
				menuClientes.setForeground(Color.WHITE);
				menuClientes.setFont(new Font("Dialog", Font.BOLD, 20));
				menuClientes.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				
				JMenuItem mntmCrear = new JMenuItem("Crear");
				mntmCrear.setForeground(Color.WHITE);
				mntmCrear.setHorizontalAlignment(SwingConstants.CENTER);
				mntmCrear.setBackground(new Color(186, 79, 84));
				mntmCrear.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						CrearUsuario.main();
						}
				});
				mntmCrear.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				
				mntmCrear.setBorder(null);
				mntmCrear.setFont(new Font("Dialog", Font.PLAIN, 16));
				menuClientes.add(mntmCrear);
				
				JMenuItem mntmModificar = new JMenuItem("Modificar");
				mntmModificar.setForeground(Color.WHITE);
				mntmModificar.setBackground(new Color(186, 79, 84));
				mntmModificar.setHorizontalAlignment(SwingConstants.CENTER);
				mntmModificar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						tablaClientes.setEnabled(true);
						tablaPedidos.setEnabled(true);
					}
				});
				mntmModificar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				mntmModificar.setBorder(null);
				mntmModificar.setFont(new Font("Dialog", Font.PLAIN, 16));
				menuClientes.add(mntmModificar);
				
				JMenuItem mntmBorrar = new JMenuItem("Borrar");
				mntmBorrar.setForeground(Color.WHITE);
				mntmBorrar.setBackground(new Color(186, 79, 84));
				mntmBorrar.setHorizontalAlignment(SwingConstants.CENTER);
				mntmBorrar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						tablaClientes.setEnabled(true);
						tablaPedidos.setEnabled(true);
					}
				});
				mntmBorrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				mntmBorrar.setBorder(null);
				mntmBorrar.setFont(new Font("Dialog", Font.PLAIN, 16));
				menuClientes.add(mntmBorrar);
				
				JLabel lblNewLabel_2 = new JLabel("");
				lblNewLabel_2.setBounds(69, 47, 40, 52);
				panelMorado.add(lblNewLabel_2);
				
				JLabel lblNewLabel_3 = new JLabel("W E B    P R O J E C T");
				lblNewLabel_3.setForeground(new Color(186, 79, 84));
				lblNewLabel_3.setFont(new Font("SansSerif", Font.BOLD, 12));
				lblNewLabel_3.setBounds(33, 11, 132, 26);
				panelMorado.add(lblNewLabel_3);
				
				lblX_1.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent arg0) {
						Object[] option = {"Si", "No"};
						int sure = JOptionPane.showOptionDialog(JPanel, "¿Seguro que quieres salir?", "EXIT", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, option, option[1]);
						if (sure == 0) 
						{
						System.exit(0);
						}
					}
				});
	}
}
