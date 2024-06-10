package onlinevote;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Component;

import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class loginpage1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField user;
	private JPasswordField pass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginpage1 frame = new loginpage1();
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
	public loginpage1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 654, 397);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LOGIN PAGE");
		lblNewLabel.setForeground(new Color(248, 248, 255));
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 27));
		lblNewLabel.setBounds(248, 25, 171, 35);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("username");
		lblNewLabel_1.setForeground(new Color(248, 248, 255));
		lblNewLabel_1.setFont(new Font("SansSerif", Font.BOLD, 20));
		lblNewLabel_1.setBounds(75, 112, 134, 22);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("password");
		lblNewLabel_2.setForeground(new Color(248, 248, 255));
		lblNewLabel_2.setFont(new Font("SansSerif", Font.BOLD, 20));
		lblNewLabel_2.setBounds(81, 179, 99, 22);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Forget Password?");
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
		//@Override
			public void mousePressed(MouseEvent e) {
				new forgetpassword().setVisible(true);
			}
		});
		lblNewLabel_3.setForeground(new Color(248, 248, 255));
		lblNewLabel_3.setFont(new Font("SansSerif", Font.BOLD, 16));
		lblNewLabel_3.setBounds(81, 242, 141, 22);
		contentPane.add(lblNewLabel_3);
		
		user = new JTextField();
		user.setText("Username");
		user.addMouseListener(new MouseAdapter() {
			//@Override
			public void mousePressed(MouseEvent e) {
				user.setText("");
			}
		});
		user.setBounds(234, 113, 227, 28);
		contentPane.add(user);
		user.setColumns(10);
		
		pass = new JPasswordField();
		//pass.setText("password");
		pass.addMouseListener(new MouseAdapter() {
			
			
			
		});
		pass.setBounds(234, 180, 227, 28);
		contentPane.add(pass);
		
		final JCheckBox chckbxNewCheckBox_1 = new JCheckBox("View Password");
		chckbxNewCheckBox_1.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
				if(chckbxNewCheckBox_1.isSelected()) {
					pass.setEchoChar((char)0);
				}
				
				else {
					pass.setEchoChar('*');
				}
			}
		});
		chckbxNewCheckBox_1.setForeground(new Color(0, 0, 0));
		chckbxNewCheckBox_1.setFont(new Font("SansSerif", Font.BOLD, 13));
		chckbxNewCheckBox_1.setBounds(492, 182, 134, 23);
		contentPane.add(chckbxNewCheckBox_1);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String us = user.getText();
					String ps = pass.getText();
					System.out.println(us);
					Class.forName("com.mysql.cj.jdbc.Driver");
					System.out.println(ps);
					Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/voting1","root","science1@");
					System.out.println("1");
					Statement st = con.createStatement();
					System.out.println("1");
					String sql = "Select * from signlogin";
					System.out.println("1");
					ResultSet rs = st.executeQuery(sql);
					System.out.println("1");
					while(rs.next()){
					String username = rs.getString("user");
					System.out.println("1-");
					String password = rs.getString("password");
					System.out.println("1-");

					if(us.equals(username) && ps.equals(password)){
					  new page51().setVisible(true);
					  System.out.println("true");
					 // SwingUtilities.windowForComponent(btnNewButton).dispose();
					}
					else{
					  user.setText("");
					  pass.setText("");
					  System.out.println("false");
					  continue;
					  //JOptionPane.showMessageDialog(null,"invalid pasword or username","error",JOptionPane.INFORMATION_MESSAGE);
					//JOptionPane.showMessageDialog(btnNewButton, e))
				    //  break;
					}
				}}
				catch(Exception o) {
					//JOptionPane.showMessageDialog(btnNewButton, this, "Error while establishing connection failed", 0);
				}
			}
		});
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnNewButton.setBounds(285, 240, 106, 28);
		contentPane.add(btnNewButton);

		lblNewLabel_4.setForeground(new Color(0, 255, 255));
		lblNewLabel_4.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblNewLabel_4.setBounds(532, 291, 94, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\ELCOT-Lenovo\\Desktop\\student attendance system\\images\\360_F_725676837_XdfhMdVQseSJf5mHH6pR6IzcgxYIJwlJ.jpg"));
		lblNewLabel_6.setBounds(0, 0, 638, 358);
		contentPane.add(lblNewLabel_6);
	}
}
