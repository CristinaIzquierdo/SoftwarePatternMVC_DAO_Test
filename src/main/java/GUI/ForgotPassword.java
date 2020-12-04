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
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ForgotPassword {

	private JFrame frame;
	private JPanel panelNaranja;
	private JTextField userField;
	private JLabel lblX;
	private JLabel lblNewLabel_2;

	/**
	 * Launch the application.
	 */
	public static void ForgotPassword() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ForgotPassword window = new ForgotPassword();
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
	public ForgotPassword() {
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
		panelNaranja.setBounds(213, 0, 437, 350);
		frame.getContentPane().add(panelNaranja);
		panelNaranja.setLayout(null);
		
		userField = new JTextField();
		userField.setBorder(null);
		userField.setToolTipText("Nombre de usuario");
		userField.setForeground(new Color(255, 255, 255));
		userField.setFont(new Font("Dialog", Font.PLAIN, 12));
		userField.setText("Correo");
		userField.setBounds(47, 134, 200, 29);
		userField.setBackground(new Color(186,79,84));
		panelNaranja.add(userField);
		userField.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(255, 255, 255));
		separator.setBackground(new Color(192, 192, 192));
		separator.setBounds(48, 164, 287, 21);
		panelNaranja.add(separator);
		
		JLabel lblNewLabel_1_1 = new JLabel("Introduce tu correo para restablecer la contraseña:");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_1.setIcon(null);
		lblNewLabel_1_1.setBounds(44, 79, 291, 44);
		panelNaranja.add(lblNewLabel_1_1);
		
		lblX = new JLabel("x");
		lblX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.exit(0);
			}
		});
		
		JButton btnNewButton = new JButton("CONFIRMAR");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBorder(null);
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 14));
		
		btnNewButton.addActionListener(new ActionListener() {
			@SuppressWarnings("static-access")
			public void actionPerformed(ActionEvent e) {
				ConfirmarContrasena confirmarContrasena = new ConfirmarContrasena();
				confirmarContrasena.NewScreen();
			}
		});
		btnNewButton.setBounds(129, 242, 135, 32);
		panelNaranja.add(btnNewButton);
		lblX.setHorizontalTextPosition(SwingConstants.CENTER);
		lblX.setHorizontalAlignment(SwingConstants.CENTER);
		lblX.setBounds(411, -9, 23, 32);
		panelNaranja.add(lblX);
		lblX.setFont(new Font("Segoe UI", Font.BOLD, 24));
		lblX.setBackground(new Color(74,31,61));
		
		JPanel panelMorado = new JPanel();
		panelMorado.setBackground(new Color(74,31,61)); //cambiar color background
		panelMorado.setBounds(0, 0, 215, 350);
		frame.getContentPane().add(panelMorado);
		panelMorado.setLayout(null);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(41, 62, 134, 147);
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Uusuario.CRISTINA\\git\\SoftwarePatternMVC_DAO_Test\\Images\\server.png"));
		panelMorado.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("W E B    P R O J E C T");
		lblNewLabel_3.setFont(new Font("SansSerif", Font.BOLD, 18));
		lblNewLabel_3.setForeground(new Color(186, 79, 84));
		lblNewLabel_3.setBounds(14, 220, 187, 58);
		panelMorado.add(lblNewLabel_3);
	}
	public JFrame getFrame() {
		return frame;
	}

	
}
