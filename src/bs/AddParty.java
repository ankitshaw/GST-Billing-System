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

public class AddParty extends JFrame {

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
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField textField_36;
	private JTextField textField_37;
	private JTextField textField_38;
	private JTextField textField_39;
	private JTextField textField_40;
	private JTextField textField_41;
	private JTextField textField_42;
	private JTextField textField_43;
	private JTextField textField_44;
	private JTextField textField_45;
	private JTextField textField_46;
	private JTextField textField_47;
	private JTextField textField_48;
	private JTextField textField_49;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddParty frame = new AddParty();
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
	public AddParty() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(150, 30, 900, 680);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAddParty = new JLabel("Add Party");
		lblAddParty.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddParty.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblAddParty.setBounds(0, 36, 884, 70);
		contentPane.add(lblAddParty);
		
		JButton btnNewButton = new JButton("Close");
		btnNewButton.addActionListener(e -> this.dispose());
		btnNewButton.setBounds(776, 13, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblGstNo = new JLabel("GST No");
		lblGstNo.setHorizontalAlignment(SwingConstants.CENTER);
		lblGstNo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblGstNo.setBounds(108, 138, 125, 24);
		contentPane.add(lblGstNo);
		
		JLabel lblPartyName = new JLabel("Party Name");
		lblPartyName.setHorizontalAlignment(SwingConstants.CENTER);
		lblPartyName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPartyName.setBounds(243, 138, 137, 24);
		contentPane.add(lblPartyName);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddress.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAddress.setBounds(390, 138, 255, 24);
		contentPane.add(lblAddress);
		
		JLabel lblState = new JLabel("State");
		lblState.setHorizontalAlignment(SwingConstants.CENTER);
		lblState.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblState.setBounds(655, 138, 90, 24);
		contentPane.add(lblState);
		
		JLabel lblContact = new JLabel("Contact");
		lblContact.setHorizontalAlignment(SwingConstants.CENTER);
		lblContact.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblContact.setBounds(755, 138, 77, 24);
		contentPane.add(lblContact);
		
		JLabel label_6 = new JLabel("1.");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_6.setBounds(77, 173, 31, 24);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("2.");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_7.setBounds(77, 208, 31, 24);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("3.");
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_8.setBounds(77, 243, 31, 24);
		contentPane.add(label_8);
		
		JLabel label_9 = new JLabel("4.");
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_9.setBounds(77, 278, 31, 24);
		contentPane.add(label_9);
		
		JLabel label_10 = new JLabel("5.");
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_10.setBounds(77, 314, 31, 24);
		contentPane.add(label_10);
		
		JLabel label_11 = new JLabel("6.");
		label_11.setHorizontalAlignment(SwingConstants.CENTER);
		label_11.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_11.setBounds(77, 349, 31, 24);
		contentPane.add(label_11);
		
		JLabel label_12 = new JLabel("7.");
		label_12.setHorizontalAlignment(SwingConstants.CENTER);
		label_12.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_12.setBounds(77, 384, 31, 24);
		contentPane.add(label_12);
		
		JLabel label_13 = new JLabel("8.");
		label_13.setHorizontalAlignment(SwingConstants.CENTER);
		label_13.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_13.setBounds(77, 419, 31, 24);
		contentPane.add(label_13);
		
		JLabel label_14 = new JLabel("9.");
		label_14.setHorizontalAlignment(SwingConstants.CENTER);
		label_14.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_14.setBounds(77, 454, 31, 24);
		contentPane.add(label_14);
		
		JLabel label_15 = new JLabel("10.");
		label_15.setHorizontalAlignment(SwingConstants.CENTER);
		label_15.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_15.setBounds(77, 489, 31, 24);
		contentPane.add(label_15);
		
		textField = new JTextField();
		textField.setBounds(108, 173, 125, 24);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(243, 173, 137, 24);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(390, 173, 255, 24);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(655, 173, 90, 24);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(755, 173, 77, 24);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(108, 208, 125, 24);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(243, 208, 137, 24);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(390, 208, 255, 24);
		contentPane.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(655, 208, 90, 24);
		contentPane.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(755, 208, 77, 24);
		contentPane.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(108, 243, 125, 24);
		contentPane.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(243, 243, 137, 24);
		contentPane.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(390, 243, 255, 24);
		contentPane.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(655, 243, 90, 24);
		contentPane.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(755, 243, 77, 24);
		contentPane.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(108, 278, 125, 24);
		contentPane.add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(243, 278, 137, 24);
		contentPane.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(390, 278, 255, 24);
		contentPane.add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(655, 278, 90, 24);
		contentPane.add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(755, 278, 77, 24);
		contentPane.add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(108, 314, 125, 24);
		contentPane.add(textField_20);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(243, 314, 137, 24);
		contentPane.add(textField_21);
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(390, 314, 255, 24);
		contentPane.add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setColumns(10);
		textField_23.setBounds(655, 314, 90, 24);
		contentPane.add(textField_23);
		
		textField_24 = new JTextField();
		textField_24.setColumns(10);
		textField_24.setBounds(755, 314, 77, 24);
		contentPane.add(textField_24);
		
		textField_25 = new JTextField();
		textField_25.setColumns(10);
		textField_25.setBounds(108, 349, 125, 24);
		contentPane.add(textField_25);
		
		textField_26 = new JTextField();
		textField_26.setColumns(10);
		textField_26.setBounds(243, 349, 137, 24);
		contentPane.add(textField_26);
		
		textField_27 = new JTextField();
		textField_27.setColumns(10);
		textField_27.setBounds(390, 349, 255, 24);
		contentPane.add(textField_27);
		
		textField_28 = new JTextField();
		textField_28.setColumns(10);
		textField_28.setBounds(655, 349, 90, 24);
		contentPane.add(textField_28);
		
		textField_29 = new JTextField();
		textField_29.setColumns(10);
		textField_29.setBounds(755, 349, 77, 24);
		contentPane.add(textField_29);
		
		textField_30 = new JTextField();
		textField_30.setColumns(10);
		textField_30.setBounds(108, 384, 125, 24);
		contentPane.add(textField_30);
		
		textField_31 = new JTextField();
		textField_31.setColumns(10);
		textField_31.setBounds(243, 384, 137, 24);
		contentPane.add(textField_31);
		
		textField_32 = new JTextField();
		textField_32.setColumns(10);
		textField_32.setBounds(390, 384, 255, 24);
		contentPane.add(textField_32);
		
		textField_33 = new JTextField();
		textField_33.setColumns(10);
		textField_33.setBounds(655, 384, 90, 24);
		contentPane.add(textField_33);
		
		textField_34 = new JTextField();
		textField_34.setColumns(10);
		textField_34.setBounds(755, 384, 77, 24);
		contentPane.add(textField_34);
		
		textField_35 = new JTextField();
		textField_35.setColumns(10);
		textField_35.setBounds(108, 419, 125, 24);
		contentPane.add(textField_35);
		
		textField_36 = new JTextField();
		textField_36.setColumns(10);
		textField_36.setBounds(243, 419, 137, 24);
		contentPane.add(textField_36);
		
		textField_37 = new JTextField();
		textField_37.setColumns(10);
		textField_37.setBounds(390, 419, 255, 24);
		contentPane.add(textField_37);
		
		textField_38 = new JTextField();
		textField_38.setColumns(10);
		textField_38.setBounds(655, 419, 90, 24);
		contentPane.add(textField_38);
		
		textField_39 = new JTextField();
		textField_39.setColumns(10);
		textField_39.setBounds(755, 419, 77, 24);
		contentPane.add(textField_39);
		
		textField_40 = new JTextField();
		textField_40.setColumns(10);
		textField_40.setBounds(108, 454, 125, 24);
		contentPane.add(textField_40);
		
		textField_41 = new JTextField();
		textField_41.setColumns(10);
		textField_41.setBounds(243, 454, 137, 24);
		contentPane.add(textField_41);
		
		textField_42 = new JTextField();
		textField_42.setColumns(10);
		textField_42.setBounds(390, 454, 255, 24);
		contentPane.add(textField_42);
		
		textField_43 = new JTextField();
		textField_43.setColumns(10);
		textField_43.setBounds(655, 454, 90, 24);
		contentPane.add(textField_43);
		
		textField_44 = new JTextField();
		textField_44.setColumns(10);
		textField_44.setBounds(755, 454, 77, 24);
		contentPane.add(textField_44);
		
		textField_45 = new JTextField();
		textField_45.setColumns(10);
		textField_45.setBounds(108, 489, 125, 24);
		contentPane.add(textField_45);
		
		textField_46 = new JTextField();
		textField_46.setColumns(10);
		textField_46.setBounds(243, 489, 137, 24);
		contentPane.add(textField_46);
		
		textField_47 = new JTextField();
		textField_47.setColumns(10);
		textField_47.setBounds(390, 489, 255, 24);
		contentPane.add(textField_47);
		
		textField_48 = new JTextField();
		textField_48.setColumns(10);
		textField_48.setBounds(655, 489, 90, 24);
		contentPane.add(textField_48);
		
		textField_49 = new JTextField();
		textField_49.setColumns(10);
		textField_49.setBounds(755, 489, 77, 24);
		contentPane.add(textField_49);
		
		JButton button = new JButton("ADD");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int c = 0;
				try {
					Class.forName("org.h2.Driver");
					connection = DriverManager.getConnection("jdbc:h2:~/test","sa","");
					System.out.print("Connection Successful for add party");
					String addData = "insert into party values(?,?,?,?,?,?)";
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
						ps.setString(3,textField_2.getText());
						ps.setString(4,textField_3.getText());
						ps.setString(5,textField_4.getText());
						ps.setString(6,"0");
						c++;
						inserted = ps.executeUpdate();
					}
					
					if(textField_5.getText().equals("")) {
					}
					else {
						ps.setString(1,textField_5.getText());
						ps.setString(2,textField_6.getText());
						ps.setString(3,textField_7.getText());
						ps.setString(4,textField_8.getText());
						ps.setString(5,textField_9.getText());
						ps.setString(6,"0");
						c++;
						inserted = ps.executeUpdate();
					}
										
					if(textField_10.getText().equals("")) {
					}
					else {
						ps.setString(1,textField_10.getText());
						ps.setString(2,textField_11.getText());
						ps.setString(3,textField_12.getText());
						ps.setString(4,textField_13.getText());
						ps.setString(5,textField_14.getText());
						ps.setString(6,"0");
						c++;
						inserted = ps.executeUpdate();
					}
					
					if(textField_15.getText().equals("")) {
					}
					else {
						ps.setString(1,textField_15.getText());
						ps.setString(2,textField_16.getText());
						ps.setString(3,textField_17.getText());
						ps.setString(4,textField_18.getText());
						ps.setString(5,textField_19.getText());
						ps.setString(6,"0");
						c++;
						inserted = ps.executeUpdate();
					}
										
					if(textField_20.getText().equals("")) {
					}
					else {
						ps.setString(1,textField_20.getText());
						ps.setString(2,textField_21.getText());
						ps.setString(3,textField_22.getText());
						ps.setString(4,textField_23.getText());
						ps.setString(5,textField_24.getText());
						ps.setString(6,"0");
						c++;
						inserted = ps.executeUpdate();
					}
										
					if(textField_25.getText().equals("")) {
					}
					else {
						ps.setString(1,textField_25.getText());
						ps.setString(2,textField_26.getText());
						ps.setString(3,textField_27.getText());
						ps.setString(4,textField_28.getText());
						ps.setString(5,textField_29.getText());
						ps.setString(6,"0");
						c++;
						inserted = ps.executeUpdate();
					}

					
					if(textField_30.getText().equals("")) {
					}
					else {
						ps.setString(1,textField_30.getText());
						ps.setString(2,textField_31.getText());
						ps.setString(3,textField_32.getText());
						ps.setString(4,textField_33.getText());
						ps.setString(5,textField_34.getText());
						ps.setString(6,"0");
						c++;
						inserted = ps.executeUpdate();
					}

					
					if(textField_35.getText().equals("")) {
					}
					else {
						ps.setString(1,textField_35.getText());
						ps.setString(2,textField_36.getText());
						ps.setString(3,textField_37.getText());
						ps.setString(4,textField_38.getText());
						ps.setString(5,textField_39.getText());
						ps.setString(6,"0");
						c++;
						inserted = ps.executeUpdate();
					}

					if(textField_40.getText().equals("")) {
					}
					else {
						ps.setString(1,textField_40.getText());
						ps.setString(2,textField_41.getText());
						ps.setString(3,textField_42.getText());
						ps.setString(4,textField_43.getText());
						ps.setString(5,textField_44.getText());
						ps.setString(6,"0");
						c++;
						inserted = ps.executeUpdate();
					}
					
					if(textField_45.getText().equals("")) {
					}
					else {
						ps.setString(1,textField_45.getText());
						ps.setString(2,textField_46.getText());
						ps.setString(3,textField_47.getText());
						ps.setString(4,textField_48.getText());
						ps.setString(5,textField_49.getText());
						ps.setString(6,"0");
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
		button.setFont(new Font("Tahoma", Font.PLAIN, 20));
		button.setBounds(359, 553, 126, 35);
		contentPane.add(button);
	}

}
