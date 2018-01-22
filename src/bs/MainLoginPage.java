package bs;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;

public class MainLoginPage {

	private JFrame frame;
	private JTextField login_username;
	private JPasswordField login_password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainLoginPage window = new MainLoginPage();
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
	public MainLoginPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	Connection connection = null;
	
	private void initialize() {
		
		try {
			Class.forName("org.h2.Driver");
			connection = DriverManager.getConnection("jdbc:h2:~/test","sa","");
			JOptionPane.showMessageDialog(null, "Connection Successful");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
		frame = new JFrame();
		frame.setBounds(150, 30, 900, 680);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblBillingSoftware = new JLabel("Billing Software");
		lblBillingSoftware.setHorizontalAlignment(SwingConstants.CENTER);
		lblBillingSoftware.setFont(new Font("Lato Medium", Font.PLAIN, 50));
		lblBillingSoftware.setBounds(0, 52, 884, 72);
		frame.getContentPane().add(lblBillingSoftware);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setBounds(0, 243, 884, 65);
		frame.getContentPane().add(lblLogin);
		
		login_username = new JTextField();
		login_username.setBounds(446, 338, 136, 27);
		frame.getContentPane().add(login_username);
		login_username.setColumns(10);
		
		login_password = new JPasswordField();
		login_password.setBounds(446, 395, 136, 27);
		frame.getContentPane().add(login_password);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblUsername.setBounds(313, 338, 123, 27);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPassword.setBounds(313, 395, 123, 27);
		frame.getContentPane().add(lblPassword);
		
		JButton btnLogin = new JButton("Enter");
		btnLogin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
//				new Tasks().setVisible(true);
				if(login_username.getText().equals("admin") && login_password.getText().equals("admin")) {
					JOptionPane.showMessageDialog(null, "Login Successful");
					new Tasks().setVisible(true);
					
				}
				else {
					
					JOptionPane.showMessageDialog(null, "Invalid Credentials");
				}
			}
		});
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnLogin.setBounds(403, 458, 83, 27);
		frame.getContentPane().add(btnLogin);
		
		
	}
}
