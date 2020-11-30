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

public class ILoginGUI {

	private JFrame frame;
	private JPanel panelNaranja;
	private JTextField userField;
	private JPasswordField pwdPassword;

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
		
		JPanel panelMorado = new JPanel();
		panelMorado.setBackground(new Color(74,31,61)); //cambiar color background
		panelMorado.setBounds(0, 0, 325, 311);
		frame.getContentPane().add(panelMorado);
		
		panelNaranja = new JPanel();
		panelNaranja.setBackground(new Color(186,79,84));
		panelNaranja.setBounds(324, 0, 310, 311);
		frame.getContentPane().add(panelNaranja);
		panelNaranja.setLayout(null);
		
		userField = new JTextField();
		userField.setBorder(null);
		userField.setToolTipText("Nombre de usuario");
		userField.setForeground(new Color(255, 255, 255));
		userField.setFont(new Font("Dialog", Font.PLAIN, 12));
		userField.setText("  Username");
		userField.setBounds(86, 50, 200, 29);
		userField.setBackground(new Color(186,79,84));
		panelNaranja.add(userField);
		userField.setColumns(10);
		
		pwdPassword = new JPasswordField();
		pwdPassword.setText("password");
		pwdPassword.setBorder(null);
		pwdPassword.setForeground(new Color(255, 255, 255));
		pwdPassword.setFont(new Font("Dialog", Font.PLAIN, 12));
		pwdPassword.setToolTipText("Contraseña");
		pwdPassword.setBounds(86, 102, 200, 29);
		pwdPassword.setBackground(new Color(186,79,84));
		panelNaranja.add(pwdPassword);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(280, 90, -224, 21);
		panelNaranja.add(separator);
	}
}
