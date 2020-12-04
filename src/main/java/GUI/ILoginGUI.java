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
import javax.swing.UIManager;

public class ILoginGUI {

	private JFrame frame;
	private JPanel panelNaranja;
	private JTextField userField;
	private JPasswordField pwdPassword;
	private JSeparator separator_1;
	private JLabel lblNewLabel_1;
	private JPanel panel_2;
	private JLabel lblNewLabel;
	private JLabel lblForgetPassword;
	private JLabel lblX;
	private JLabel lblNewLabel_2;
	
	private int contarClick = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ILoginGUI window = new ILoginGUI();
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
	public ILoginGUI() {
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
		panelNaranja.setBounds(324, 0, 326, 350);
		frame.getContentPane().add(panelNaranja);
		panelNaranja.setLayout(null);
		
		userField = new JTextField();
		userField.setBorder(null);
		userField.setToolTipText("Nombre de usuario");
		userField.setForeground(new Color(255, 255, 255));
		userField.setFont(new Font("Dialog", Font.PLAIN, 12));
		userField.setText(" Username");
		userField.setBounds(70, 67, 200, 29);
		userField.setBackground(new Color(186,79,84));
		panelNaranja.add(userField);
		userField.setColumns(10);
		
		pwdPassword = new JPasswordField();
		pwdPassword.setText("password");
		pwdPassword.setBorder(null);
		pwdPassword.setForeground(new Color(255, 255, 255));
		pwdPassword.setFont(new Font("Dialog", Font.PLAIN, 12));
		pwdPassword.setToolTipText("Contraseña");
		pwdPassword.setBounds(70, 125, 200, 29);
		pwdPassword.setBackground(new Color(186,79,84));
		panelNaranja.add(pwdPassword);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(255, 255, 255));
		separator.setBackground(new Color(192, 192, 192));
		separator.setBounds(74, 97, 194, 21);
		panelNaranja.add(separator);
		
		separator_1 = new JSeparator();
		separator_1.setForeground(new Color(255, 255, 255));
		separator_1.setBackground(new Color(192, 192, 192));
		separator_1.setBounds(71, 156, 200, 21);
		panelNaranja.add(separator_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon("C:\\Users\\Uusuario.CRISTINA\\git\\SoftwarePatternMVC_DAO_Test\\Images\\usuarioLogin.png"));
		lblNewLabel_1_1.setBounds(44, 71, 16, 29);
		panelNaranja.add(lblNewLabel_1_1);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Uusuario.CRISTINA\\git\\SoftwarePatternMVC_DAO_Test\\Images\\locked.png"));
		lblNewLabel_1.setBounds(44, 129, 16, 29);
		panelNaranja.add(lblNewLabel_1);
		
		panel_2 = new JPanel();
		panel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				LoggedUser loggedUser = new LoggedUser();
				loggedUser.LoggedUser();
			}
		});
		panel_2.setBackground(new Color(186,79,84));
		panel_2.setBorder(new LineBorder(Color.LIGHT_GRAY));
		panel_2.setBounds(109, 203, 114, 29);
		panelNaranja.add(panel_2);
		
		lblNewLabel = new JLabel("Log In");
		panel_2.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel.setMinimumSize(new Dimension(32767, 32767));
		lblNewLabel.setMaximumSize(new Dimension(32767, 32767));
		
		lblForgetPassword = new JLabel("Forget Password?");
		lblForgetPassword.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				ForgotPassword fp = new ForgotPassword();
				fp.ForgotPassword();
			}
		});
		lblForgetPassword.setMinimumSize(new Dimension(32767, 32767));
		lblForgetPassword.setMaximumSize(new Dimension(32767, 32767));
		lblForgetPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblForgetPassword.setForeground(Color.WHITE);
		lblForgetPassword.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblForgetPassword.setBounds(100, 272, 126, 21);
		panelNaranja.add(lblForgetPassword);
		
		lblX = new JLabel("x");
		lblX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.exit(0);
			}
		});
		lblX.setHorizontalTextPosition(SwingConstants.CENTER);
		lblX.setHorizontalAlignment(SwingConstants.CENTER);
		lblX.setBounds(303, -9, 23, 32);
		panelNaranja.add(lblX);
		lblX.setFont(new Font("Segoe UI", Font.BOLD, 24));
		lblX.setBackground(new Color(74,31,61));
		
		JButton btnMostrarContrasena = new JButton("");
		btnMostrarContrasena.setForeground(new Color(186,79,84));
		btnMostrarContrasena.setBorderPainted(false);
		btnMostrarContrasena.setBorder(null);
		btnMostrarContrasena.setBackground(new Color(186,79,84));
		
		btnMostrarContrasena.setIcon(new ImageIcon("C:\\Users\\Uusuario.CRISTINA\\git\\SoftwarePatternMVC_DAO_Test\\Images\\visibilidad.png"));
		
		btnMostrarContrasena.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				contarClick++;
				if (contarClick % 2 == 0) {
					pwdPassword.setEchoChar('\u26AB');
				} else {
					pwdPassword.setEchoChar((char)0);
				}
			}
		});
		btnMostrarContrasena.setBounds(280, 122, 46, 44);
		panelNaranja.add(btnMostrarContrasena);
		
		
		
		
		
		
		
		
		JPanel panelMorado = new JPanel();
		panelMorado.setBackground(new Color(74,31,61)); //cambiar color background
		panelMorado.setBounds(0, 0, 326, 350);
		frame.getContentPane().add(panelMorado);
		panelMorado.setLayout(null);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(95, 53, 134, 147);
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Uusuario.CRISTINA\\git\\SoftwarePatternMVC_DAO_Test\\Images\\server.png"));
		panelMorado.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("W E B    P R O J E C T");
		lblNewLabel_3.setFont(new Font("SansSerif", Font.BOLD, 18));
		lblNewLabel_3.setForeground(new Color(186, 79, 84));
		lblNewLabel_3.setBounds(68, 211, 187, 58);
		panelMorado.add(lblNewLabel_3);
	}
	public JFrame getFrame() {
		return frame;
	}
}
