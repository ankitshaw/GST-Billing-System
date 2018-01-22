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

public class AddProduct extends JFrame {

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
					AddProduct frame = new AddProduct();
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
	public AddProduct() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(150, 30, 900, 680);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAddProduct = new JLabel("Add Product");
		lblAddProduct.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblAddProduct.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddProduct.setBounds(0, 37, 884, 70);
		contentPane.add(lblAddProduct);
		
		JButton btnNewButton = new JButton("Close");
		btnNewButton.addActionListener(e -> this.dispose());
		btnNewButton.setBounds(778, 15, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblProductCode = new JLabel("Product Code");
		lblProductCode.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblProductCode.setHorizontalAlignment(SwingConstants.CENTER);
		lblProductCode.setBounds(196, 139, 95, 24);
		contentPane.add(lblProductCode);
		
		JLabel lblProductName = new JLabel("Product Name");
		lblProductName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblProductName.setHorizontalAlignment(SwingConstants.CENTER);
		lblProductName.setBounds(301, 139, 167, 24);
		contentPane.add(lblProductName);
		
		JLabel lblRate = new JLabel("Rate");
		lblRate.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRate.setHorizontalAlignment(SwingConstants.CENTER);
		lblRate.setBounds(478, 139, 70, 24);
		contentPane.add(lblRate);
		
		JLabel lblHsnCode = new JLabel("HSN Code");
		lblHsnCode.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblHsnCode.setHorizontalAlignment(SwingConstants.CENTER);
		lblHsnCode.setBounds(558, 139, 78, 24);
		contentPane.add(lblHsnCode);
		
		JLabel lblTaxRate = new JLabel("Tax Rate");
		lblTaxRate.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTaxRate.setHorizontalAlignment(SwingConstants.CENTER);
		lblTaxRate.setBounds(646, 139, 65, 24);
		contentPane.add(lblTaxRate);
		
		textField = new JTextField();
		textField.setBounds(196, 174, 95, 24);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(301, 174, 167, 24);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(478, 174, 70, 24);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(558, 174, 78, 24);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(646, 174, 78, 24);
		contentPane.add(textField_4);
		
		JLabel label = new JLabel("1.");
		label.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(165, 174, 31, 24);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("2.");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_1.setBounds(165, 209, 31, 24);
		contentPane.add(label_1);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(196, 209, 95, 24);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(301, 209, 167, 24);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(478, 209, 70, 24);
		contentPane.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(558, 209, 78, 24);
		contentPane.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(646, 209, 78, 24);
		contentPane.add(textField_9);
		
		JLabel label_2 = new JLabel("3.");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_2.setBounds(165, 244, 31, 24);
		contentPane.add(label_2);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(196, 244, 95, 24);
		contentPane.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(301, 244, 167, 24);
		contentPane.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(478, 244, 70, 24);
		contentPane.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(558, 244, 78, 24);
		contentPane.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(646, 244, 78, 24);
		contentPane.add(textField_14);
		
		JLabel label_3 = new JLabel("4.");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_3.setBounds(165, 279, 31, 24);
		contentPane.add(label_3);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(196, 279, 95, 24);
		contentPane.add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(301, 279, 167, 24);
		contentPane.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(478, 279, 70, 24);
		contentPane.add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(558, 279, 78, 24);
		contentPane.add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(646, 279, 78, 24);
		contentPane.add(textField_19);
		
		JLabel label_4 = new JLabel("5.");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_4.setBounds(165, 315, 31, 24);
		contentPane.add(label_4);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(196, 315, 95, 24);
		contentPane.add(textField_20);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(301, 315, 167, 24);
		contentPane.add(textField_21);
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(478, 315, 70, 24);
		contentPane.add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setColumns(10);
		textField_23.setBounds(558, 315, 78, 24);
		contentPane.add(textField_23);
		
		textField_24 = new JTextField();
		textField_24.setColumns(10);
		textField_24.setBounds(646, 315, 78, 24);
		contentPane.add(textField_24);
		
		JLabel label_5 = new JLabel("6.");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_5.setBounds(165, 350, 31, 24);
		contentPane.add(label_5);
		
		textField_25 = new JTextField();
		textField_25.setColumns(10);
		textField_25.setBounds(196, 350, 95, 24);
		contentPane.add(textField_25);
		
		textField_26 = new JTextField();
		textField_26.setColumns(10);
		textField_26.setBounds(301, 350, 167, 24);
		contentPane.add(textField_26);
		
		textField_27 = new JTextField();
		textField_27.setColumns(10);
		textField_27.setBounds(478, 350, 70, 24);
		contentPane.add(textField_27);
		
		textField_28 = new JTextField();
		textField_28.setColumns(10);
		textField_28.setBounds(558, 350, 78, 24);
		contentPane.add(textField_28);
		
		textField_29 = new JTextField();
		textField_29.setColumns(10);
		textField_29.setBounds(646, 350, 78, 24);
		contentPane.add(textField_29);
		
		JLabel label_6 = new JLabel("7.");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_6.setBounds(165, 385, 31, 24);
		contentPane.add(label_6);
		
		textField_30 = new JTextField();
		textField_30.setColumns(10);
		textField_30.setBounds(196, 385, 95, 24);
		contentPane.add(textField_30);
		
		textField_31 = new JTextField();
		textField_31.setColumns(10);
		textField_31.setBounds(301, 385, 167, 24);
		contentPane.add(textField_31);
		
		textField_32 = new JTextField();
		textField_32.setColumns(10);
		textField_32.setBounds(478, 385, 70, 24);
		contentPane.add(textField_32);
		
		textField_33 = new JTextField();
		textField_33.setColumns(10);
		textField_33.setBounds(558, 385, 78, 24);
		contentPane.add(textField_33);
		
		textField_34 = new JTextField();
		textField_34.setColumns(10);
		textField_34.setBounds(646, 385, 78, 24);
		contentPane.add(textField_34);
		
		JLabel label_7 = new JLabel("8.");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_7.setBounds(165, 420, 31, 24);
		contentPane.add(label_7);
		
		textField_35 = new JTextField();
		textField_35.setColumns(10);
		textField_35.setBounds(196, 420, 95, 24);
		contentPane.add(textField_35);
		
		textField_36 = new JTextField();
		textField_36.setColumns(10);
		textField_36.setBounds(301, 420, 167, 24);
		contentPane.add(textField_36);
		
		textField_37 = new JTextField();
		textField_37.setColumns(10);
		textField_37.setBounds(478, 420, 70, 24);
		contentPane.add(textField_37);
		
		textField_38 = new JTextField();
		textField_38.setColumns(10);
		textField_38.setBounds(558, 420, 78, 24);
		contentPane.add(textField_38);
		
		textField_39 = new JTextField();
		textField_39.setColumns(10);
		textField_39.setBounds(646, 420, 78, 24);
		contentPane.add(textField_39);
		
		JLabel label_8 = new JLabel("9.");
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_8.setBounds(165, 455, 31, 24);
		contentPane.add(label_8);
		
		textField_40 = new JTextField();
		textField_40.setColumns(10);
		textField_40.setBounds(196, 455, 95, 24);
		contentPane.add(textField_40);
		
		textField_41 = new JTextField();
		textField_41.setColumns(10);
		textField_41.setBounds(301, 455, 167, 24);
		contentPane.add(textField_41);
		
		textField_42 = new JTextField();
		textField_42.setColumns(10);
		textField_42.setBounds(478, 455, 70, 24);
		contentPane.add(textField_42);
		
		textField_43 = new JTextField();
		textField_43.setColumns(10);
		textField_43.setBounds(558, 455, 78, 24);
		contentPane.add(textField_43);
		
		textField_44 = new JTextField();
		textField_44.setColumns(10);
		textField_44.setBounds(646, 455, 78, 24);
		contentPane.add(textField_44);
		
		JLabel label_9 = new JLabel("10.");
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_9.setBounds(165, 490, 31, 24);
		contentPane.add(label_9);
		
		textField_45 = new JTextField();
		textField_45.setColumns(10);
		textField_45.setBounds(196, 490, 95, 24);
		contentPane.add(textField_45);
		
		textField_46 = new JTextField();
		textField_46.setColumns(10);
		textField_46.setBounds(301, 490, 167, 24);
		contentPane.add(textField_46);
		
		textField_47 = new JTextField();
		textField_47.setColumns(10);
		textField_47.setBounds(478, 490, 70, 24);
		contentPane.add(textField_47);
		
		textField_48 = new JTextField();
		textField_48.setColumns(10);
		textField_48.setBounds(558, 490, 78, 24);
		contentPane.add(textField_48);
		
		textField_49 = new JTextField();
		textField_49.setColumns(10);
		textField_49.setBounds(646, 490, 78, 24);
		contentPane.add(textField_49);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int c = 0;
				try {
					Class.forName("org.h2.Driver");
					connection = DriverManager.getConnection("jdbc:h2:~/test","sa","");
					System.out.print("Connection Successful for add product");
					String addData = "insert into product values(?,?,?,?,?,?)";
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
						ps.setString(4,"0");
						ps.setString(5,textField_3.getText());
						ps.setString(6,textField_4.getText());
						c++;
						inserted = ps.executeUpdate();
					}
					
					if(textField_5.getText().equals("")) {
					}
					else {
						ps.setString(1,textField_5.getText());
						ps.setString(2,textField_6.getText());
						ps.setString(3,textField_7.getText());
						ps.setString(4,"0");
						ps.setString(5,textField_8.getText());
						ps.setString(6,textField_9.getText());
						c++;
						inserted = ps.executeUpdate();
					}
										
					if(textField_10.getText().equals("")) {
					}
					else {
						ps.setString(1,textField_10.getText());
						ps.setString(2,textField_11.getText());
						ps.setString(3,textField_12.getText());
						ps.setString(4,"0");
						ps.setString(5,textField_13.getText());
						ps.setString(6,textField_14.getText());
						c++;
						inserted = ps.executeUpdate();
					}
					
					if(textField_15.getText().equals("")) {
					}
					else {
						ps.setString(1,textField_15.getText());
						ps.setString(2,textField_16.getText());
						ps.setString(3,textField_17.getText());
						ps.setString(4,"0");
						ps.setString(5,textField_18.getText());
						ps.setString(6,textField_19.getText());
						c++;
						inserted = ps.executeUpdate();
					}
										
					if(textField_20.getText().equals("")) {
					}
					else {
						ps.setString(1,textField_20.getText());
						ps.setString(2,textField_21.getText());
						ps.setString(3,textField_22.getText());
						ps.setString(4,"0");
						ps.setString(5,textField_23.getText());
						ps.setString(6,textField_24.getText());
						c++;
						inserted = ps.executeUpdate();
					}
										
					if(textField_25.getText().equals("")) {
					}
					else {
						ps.setString(1,textField_25.getText());
						ps.setString(2,textField_26.getText());
						ps.setString(3,textField_27.getText());
						ps.setString(4,"0");
						ps.setString(5,textField_28.getText());
						ps.setString(6,textField_29.getText());
						c++;
						inserted = ps.executeUpdate();
					}

					
					if(textField_30.getText().equals("")) {
					}
					else {
						ps.setString(1,textField_30.getText());
						ps.setString(2,textField_31.getText());
						ps.setString(3,textField_32.getText());
						ps.setString(4,"0");
						ps.setString(5,textField_33.getText());
						ps.setString(6,textField_34.getText());
						c++;
						inserted = ps.executeUpdate();
					}

					
					if(textField_35.getText().equals("")) {
					}
					else {
						ps.setString(1,textField_35.getText());
						ps.setString(2,textField_36.getText());
						ps.setString(3,textField_37.getText());
						ps.setString(4,"0");
						ps.setString(5,textField_38.getText());
						ps.setString(6,textField_39.getText());
						c++;
						inserted = ps.executeUpdate();
					}

					if(textField_40.getText().equals("")) {
					}
					else {
						ps.setString(1,textField_40.getText());
						ps.setString(2,textField_41.getText());
						ps.setString(3,textField_42.getText());
						ps.setString(4,"0");
						ps.setString(5,textField_43.getText());
						ps.setString(6,textField_44.getText());
						c++;
						inserted = ps.executeUpdate();
					}
					
					if(textField_45.getText().equals("")) {
					}
					else {
						ps.setString(1,textField_45.getText());
						ps.setString(2,textField_46.getText());
						ps.setString(3,textField_47.getText());
						ps.setString(4,"0");
						ps.setString(5,textField_48.getText());
						ps.setString(6,textField_49.getText());
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
		btnAdd.setBounds(365, 540, 126, 35);
		contentPane.add(btnAdd);
	}

}
