package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.JSeparator;
import java.awt.Label;
import javax.swing.ImageIcon;
import java.awt.Canvas;
import java.awt.Panel;
import javax.swing.border.LineBorder;
import java.awt.Dimension;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class CrearUsuario {

	private JFrame frame;
	private JPanel panelNaranja;
	private JTextField userField;
	private JPanel panel_2;
	private JLabel lblNewLabel;
	private JLabel lblX;
	private JLabel lblNewLabel_2;
	private JTextField txtApellidos;
	private JLabel lblTipoDocumento;
	private JLabel lblNDocumento;
	private JTextField txtNDocumento;
	private JSeparator separator_2;
	private JSeparator separator_3;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CrearUsuario window = new CrearUsuario();
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
	public CrearUsuario() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 650, 350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setUndecorated(true);
		
		panelNaranja = new JPanel();
		panelNaranja.setBackground(new Color(186,79,84));
		panelNaranja.setBounds(205, 0, 445, 350);
		frame.getContentPane().add(panelNaranja);
		panelNaranja.setLayout(null);
		
		userField = new JTextField();
		userField.setBorder(null);
		userField.setToolTipText("Nombre de usuario");
		userField.setForeground(new Color(255, 255, 255));
		userField.setFont(new Font("Dialog", Font.PLAIN, 12));
		userField.setBounds(155, 22, 200, 29);
		userField.setBackground(new Color(186,79,84));
		panelNaranja.add(userField);
		userField.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(255, 255, 255));
		separator.setBackground(new Color(192, 192, 192));
		separator.setBounds(10, 64, 397, 21);
		panelNaranja.add(separator);
		
		lblX = new JLabel("x");
		lblX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.exit(0);
			}
		});
		lblX.setHorizontalTextPosition(SwingConstants.CENTER);
		lblX.setHorizontalAlignment(SwingConstants.CENTER);
		lblX.setBounds(419, -8, 23, 32);
		panelNaranja.add(lblX);
		lblX.setFont(new Font("Segoe UI", Font.BOLD, 24));
		lblX.setBackground(new Color(74,31,61));
		
		JLabel lblNombre = new JLabel("NOMBRE");
		lblNombre.setForeground(Color.WHITE);
		lblNombre.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNombre.setBounds(10, 28, 128, 21);
		panelNaranja.add(lblNombre);
		
		JLabel lblApellidos = new JLabel("APELLIDOS");
		lblApellidos.setForeground(Color.WHITE);
		lblApellidos.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblApellidos.setBounds(10, 84, 128, 21);
		panelNaranja.add(lblApellidos);
		
		txtApellidos = new JTextField();
		txtApellidos.setToolTipText("Nombre de usuario");
		txtApellidos.setForeground(Color.WHITE);
		txtApellidos.setFont(new Font("Dialog", Font.PLAIN, 12));
		txtApellidos.setColumns(10);
		txtApellidos.setBorder(null);
		txtApellidos.setBackground(new Color(186, 79, 84));
		txtApellidos.setBounds(155, 80, 200, 29);
		panelNaranja.add(txtApellidos);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.WHITE);
		separator_1.setBackground(Color.LIGHT_GRAY);
		separator_1.setBounds(10, 120, 397, 21);
		panelNaranja.add(separator_1);
		
		lblTipoDocumento = new JLabel("TIPO DOCUMENTO");
		lblTipoDocumento.setForeground(Color.WHITE);
		lblTipoDocumento.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblTipoDocumento.setBounds(10, 142, 128, 21);
		panelNaranja.add(lblTipoDocumento);
		
		lblNDocumento = new JLabel("Nº DOCUMENTO");
		lblNDocumento.setForeground(Color.WHITE);
		lblNDocumento.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNDocumento.setBounds(10, 198, 102, 21);
		panelNaranja.add(lblNDocumento);
		
		txtNDocumento = new JTextField();
		txtNDocumento.setToolTipText("Nombre de usuario");
		txtNDocumento.setForeground(Color.WHITE);
		txtNDocumento.setFont(new Font("Dialog", Font.PLAIN, 12));
		txtNDocumento.setColumns(10);
		txtNDocumento.setBorder(null);
		txtNDocumento.setBackground(new Color(186, 79, 84));
		txtNDocumento.setBounds(155, 194, 200, 29);
		panelNaranja.add(txtNDocumento);
		
		separator_2 = new JSeparator();
		separator_2.setForeground(Color.WHITE);
		separator_2.setBackground(Color.LIGHT_GRAY);
		separator_2.setBounds(10, 178, 397, 21);
		panelNaranja.add(separator_2);
		
		separator_3 = new JSeparator();
		separator_3.setForeground(Color.WHITE);
		separator_3.setBackground(Color.LIGHT_GRAY);
		separator_3.setBounds(10, 234, 397, 21);
		panelNaranja.add(separator_3);
		
		final JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Dialog", Font.PLAIN, 12));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {" ", "DNI", "NIE"}));
		comboBox.setMaximumRowCount(3);
		comboBox.setBounds(155, 142, 70, 20);
		panelNaranja.add(comboBox);
		
		JLabel lblSexo = new JLabel("SEXO");
		lblSexo.setForeground(Color.WHITE);
		lblSexo.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblSexo.setBounds(10, 257, 102, 21);
		panelNaranja.add(lblSexo);
		
		JSeparator separator_3_1 = new JSeparator();
		separator_3_1.setForeground(Color.WHITE);
		separator_3_1.setBackground(Color.LIGHT_GRAY);
		separator_3_1.setBounds(10, 293, 397, 21);
		panelNaranja.add(separator_3_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Hombre");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBorder(null);
		rdbtnNewRadioButton.setHorizontalTextPosition(SwingConstants.RIGHT);
		rdbtnNewRadioButton.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnNewRadioButton.setFont(new Font("Dialog", Font.PLAIN, 12));
		rdbtnNewRadioButton.setBounds(148, 255, 109, 23);
		panelNaranja.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnMujer = new JRadioButton("Mujer");
		buttonGroup.add(rdbtnMujer);
		rdbtnMujer.setHorizontalTextPosition(SwingConstants.RIGHT);
		rdbtnMujer.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnMujer.setFont(new Font("Dialog", Font.PLAIN, 12));
		rdbtnMujer.setBorder(null);
		rdbtnMujer.setBounds(271, 255, 109, 23);
		panelNaranja.add(rdbtnMujer);
		
		
		final JLabel lblErrorApellido = new JLabel("*OBLIGATORIO*");
		lblErrorApellido.setForeground(Color.GREEN);
		lblErrorApellido.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblErrorApellido.setVisible(false);
		lblErrorApellido.setBounds(358, 69, 80, 14);
		panelNaranja.add(lblErrorApellido);
		
		panel_2 = new JPanel();
		panel_2.setBounds(73, 310, 114, 29);
		panelNaranja.add(panel_2);
		panel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtApellidos.setText(null);
				userField.setText(null);
				txtNDocumento.setText(null);
				comboBox.setSelectedItem(null);
			}
		});
		panel_2.setBackground(new Color(186,79,84));
		panel_2.setBorder(new LineBorder(Color.LIGHT_GRAY));
		
		lblNewLabel = new JLabel("BORRAR");
		panel_2.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel.setMinimumSize(new Dimension(32767, 32767));
		lblNewLabel.setMaximumSize(new Dimension(32767, 32767));
		
		
		final JLabel lblErrorNombre = new JLabel("*OBLIGATORIO*");
		lblErrorNombre.setVisible(false);
		lblErrorNombre.setForeground(Color.GREEN);
		lblErrorNombre.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblErrorNombre.setBounds(357, 23, 85, 14);
		panelNaranja.add(lblErrorNombre);
		
		final JLabel lblErrorNDoc = new JLabel("*OBLIGATORIO*");
		lblErrorNDoc.setVisible(false);
		lblErrorNDoc.setForeground(Color.GREEN);
		lblErrorNDoc.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblErrorNDoc.setBounds(357, 192, 85, 14);
		panelNaranja.add(lblErrorNDoc);
		
		
		final JLabel lblErrorSeleccionDoc = new JLabel("*OBLIGATORIO*");
		lblErrorSeleccionDoc.setVisible(false);
		lblErrorSeleccionDoc.setForeground(Color.GREEN);
		lblErrorSeleccionDoc.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblErrorSeleccionDoc.setBounds(358, 127, 85, 14);
		panelNaranja.add(lblErrorSeleccionDoc);
		
		
		final JLabel lblErrorOpcionS = new JLabel("*OBLIGATORIO*");
		lblErrorOpcionS.setVisible(false);
		lblErrorOpcionS.setForeground(Color.GREEN);
		lblErrorOpcionS.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblErrorOpcionS.setBounds(358, 237, 85, 14);
		panelNaranja.add(lblErrorOpcionS);
		
		
				
		JPanel panel_2_1 = new JPanel();
		panel_2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if (txtApellidos.getText().equalsIgnoreCase("")) {
					lblErrorApellido.setVisible(true);
				} else {
					lblErrorApellido.setVisible(false);
				}
				
				if (userField.getText().equalsIgnoreCase("")) {
					lblErrorNombre.setVisible(true);
				} else {
					lblErrorNombre.setVisible(false);
				}
				
				if (txtNDocumento.getText().equalsIgnoreCase("")) {
					lblErrorNDoc.setVisible(true);
				} else {
					lblErrorNDoc.setVisible(false);
				}
				if (comboBox.getSelectedIndex()==0){
					lblErrorSeleccionDoc.setVisible(true);
				} else {
					lblErrorSeleccionDoc.setVisible(false);
				}
				if(buttonGroup.getSelection() == null) {
					lblErrorOpcionS.setVisible(true);
				} else {
					lblErrorOpcionS.setVisible(false);
				}
				
				if (txtApellidos.getText().equalsIgnoreCase("") || 
					userField.getText().equalsIgnoreCase("") || 
					txtNDocumento.getText().equalsIgnoreCase("") || 
					comboBox.getSelectedIndex() == 0 ||
					buttonGroup.getSelection() == null
					)
				{
				
				
				} else 
				{
					UsuarioCreadoCorrectamente ucc = new UsuarioCreadoCorrectamente();
					ucc.UsuarioCreadoCorrectamente();
				}
				
				
			}
		});
		
		
		panel_2_1.setBorder(new LineBorder(Color.LIGHT_GRAY));
		panel_2_1.setBackground(new Color(186, 79, 84));
		panel_2_1.setBounds(213, 310, 114, 29);
		panelNaranja.add(panel_2_1);
		
		JLabel lblAceptar = new JLabel("ACEPTAR");
		lblAceptar.setMinimumSize(new Dimension(32767, 32767));
		lblAceptar.setMaximumSize(new Dimension(32767, 32767));
		lblAceptar.setHorizontalAlignment(SwingConstants.CENTER);
		lblAceptar.setForeground(Color.WHITE);
		lblAceptar.setFont(new Font("Dialog", Font.PLAIN, 12));
		panel_2_1.add(lblAceptar);
		
		
		
		
		JPanel panelMorado = new JPanel();
		panelMorado.setBackground(new Color(74,31,61)); //cambiar color background
		panelMorado.setBounds(0, 0, 207, 350);
		frame.getContentPane().add(panelMorado);
		panelMorado.setLayout(null);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(37, 59, 134, 147);
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Uusuario.CRISTINA\\git\\SoftwarePatternMVC_DAO_Test\\Images\\server.png"));
		panelMorado.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("W E B    P R O J E C T");
		lblNewLabel_3.setFont(new Font("SansSerif", Font.BOLD, 18));
		lblNewLabel_3.setForeground(new Color(186, 79, 84));
		lblNewLabel_3.setBounds(10, 217, 187, 58);
		panelMorado.add(lblNewLabel_3);
	}
	public JFrame getFrame() {
		return frame;
	}
}
