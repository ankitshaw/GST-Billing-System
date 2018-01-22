package bs;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class AddTransport extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddTransport frame = new AddTransport();
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
	
	Connection connection = null;
	
	public AddTransport() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(150, 30, 900, 680);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAddTransport = new JLabel("Add Transport");
		lblAddTransport.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblAddTransport.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddTransport.setBounds(0, 59, 884, 83);
		contentPane.add(lblAddTransport);
		
		JButton btnNewButton = new JButton("Close");
		btnNewButton.addActionListener(e -> this.dispose());
		btnNewButton.setBounds(778, 14, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblTransportName = new JLabel("Contact");
		lblTransportName.setHorizontalAlignment(SwingConstants.CENTER);
		lblTransportName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTransportName.setBounds(471, 145, 116, 47);
		contentPane.add(lblTransportName);
		
		JLabel label = new JLabel("Transport Name");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label.setBounds(288, 145, 145, 47);
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setBounds(288, 191, 145, 28);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(471, 191, 116, 28);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(288, 230, 145, 28);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(471, 230, 116, 28);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(288, 269, 145, 28);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(471, 269, 116, 28);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(288, 308, 145, 28);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(471, 308, 116, 28);
		contentPane.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(288, 347, 145, 28);
		contentPane.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(471, 347, 116, 28);
		contentPane.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(288, 386, 145, 28);
		contentPane.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(471, 386, 116, 28);
		contentPane.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(288, 425, 145, 28);
		contentPane.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(471, 425, 116, 28);
		contentPane.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(288, 464, 145, 28);
		contentPane.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(471, 464, 116, 28);
		contentPane.add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(288, 503, 145, 28);
		contentPane.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(471, 503, 116, 28);
		contentPane.add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(288, 542, 145, 28);
		contentPane.add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(471, 542, 116, 28);
		contentPane.add(textField_19);
		
		JLabel label_1 = new JLabel("1. ");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_1.setBounds(256, 191, 33, 28);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("2. ");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_2.setBounds(256, 230, 33, 28);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("4. ");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_3.setBounds(256, 308, 33, 28);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("3. ");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_4.setBounds(256, 269, 33, 28);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("8. ");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_5.setBounds(256, 464, 33, 28);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("7. ");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_6.setBounds(256, 425, 33, 28);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("6. ");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_7.setBounds(256, 386, 33, 28);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("5. ");
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_8.setBounds(256, 347, 33, 28);
		contentPane.add(label_8);
		
		JLabel label_9 = new JLabel("10. ");
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_9.setBounds(256, 542, 33, 28);
		contentPane.add(label_9);
		
		JLabel label_10 = new JLabel("9. ");
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_10.setBounds(256, 503, 33, 28);
		contentPane.add(label_10);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int c = 0;
				try {
					Class.forName("org.h2.Driver");
					connection = DriverManager.getConnection("jdbc:h2:~/test","sa","");
					System.out.print("Connection Successful for add transport");
					String addData = "insert into transport values(?,?)";
					PreparedStatement ps = connection.prepareStatement(addData);
					
					int inserted;
//					if(inserted>0) {
//						System.out.println("Done");
//					}
					if(textField.getText().equals("")) {
					}
					else {
						ps.setString(1,textField.getText());
						ps.setString(2,textField_1.getText());
						c++;
						inserted = ps.executeUpdate();
					}
					
					if(textField_2.getText().equals("")) {
					}
					else {
						ps.setString(1,textField_2.getText());
						ps.setString(2,textField_3.getText());
						c++;
						inserted = ps.executeUpdate();
					}
										
					if(textField_4.getText().equals("")) {
					}
					else {
						ps.setString(1,textField_4.getText());
						ps.setString(2,textField_5.getText());
						c++;
						inserted = ps.executeUpdate();
					}
					
					if(textField_6.getText().equals("")) {
					}
					else {
						ps.setString(1,textField_6.getText());
						ps.setString(2,textField_7.getText());
						c++;
						inserted = ps.executeUpdate();
					}
										
					if(textField_8.getText().equals("")) {
					}
					else {
						ps.setString(1,textField_8.getText());
						ps.setString(2,textField_9.getText());
						c++;
						inserted = ps.executeUpdate();
					}
										
					if(textField_10.getText().equals("")) {
					}
					else {
						ps.setString(1,textField_10.getText());
						ps.setString(2,textField_11.getText());
						c++;
						inserted = ps.executeUpdate();
					}

					
					if(textField_12.getText().equals("")) {
					}
					else {
						ps.setString(1,textField_12.getText());
						ps.setString(2,textField_13.getText());
						c++;
						inserted = ps.executeUpdate();
					}

					
					if(textField_14.getText().equals("")) {
					}
					else {
						ps.setString(1,textField_14.getText());
						ps.setString(2,textField_15.getText());
						c++;
						inserted = ps.executeUpdate();
					}

					if(textField_16.getText().equals("")) {
					}
					else {
						ps.setString(1,textField_16.getText());
						ps.setString(2,textField_17.getText());
						c++;
						inserted = ps.executeUpdate();
					}
					
					if(textField_18.getText().equals("")) {
					}
					else {
						ps.setString(1,textField_18.getText());
						ps.setString(2,textField_19.getText());
						c++;
						inserted = ps.executeUpdate();
					}
					
				}catch (Exception e2) {
					e2.printStackTrace();
				}finally {
					try {
						JOptionPane.showMessageDialog(null, c+" Rows Added");
						connection.close();
					} catch (Exception e3) {
						// TODO: handle exception
					}
				}
				
				
//				JOptionPane.showMessageDialog(null, "Connection Successful");
				
				
				
				
				
			}
		});
		btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnAdd.setBounds(371, 588, 160, 33);
		contentPane.add(btnAdd);
		
		
	}
}
