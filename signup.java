package onlinevote;
import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
//import java.sql.*;

public class page4 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final JLabel lblNewLabel_3 = new JLabel("Password");
	private JTextField user;
	private JTextField email;
	private JPasswordField pass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					page4 frame = new page4();
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
	public page4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 591, 405);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SIGN UP");
		lblNewLabel.setForeground(new Color(248, 248, 255));
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 25));
		lblNewLabel.setBounds(240, 32, 113, 26);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setForeground(new Color(248, 248, 255));
		lblNewLabel_1.setFont(new Font("SansSerif", Font.BOLD, 20));
		lblNewLabel_1.setBounds(64, 104, 113, 26);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Email id");
		lblNewLabel_2.setForeground(new Color(248, 248, 255));
		lblNewLabel_2.setFont(new Font("SansSerif", Font.BOLD, 20));
		lblNewLabel_2.setBounds(64, 175, 113, 26);
		contentPane.add(lblNewLabel_2);
		lblNewLabel_3.setForeground(new Color(248, 248, 255));
		lblNewLabel_3.setFont(new Font("SansSerif", Font.BOLD, 20));
		lblNewLabel_3.setBounds(64, 241, 98, 31);
		contentPane.add(lblNewLabel_3);
		
		user = new JTextField();
		user.setText("user name");
		user.addMouseListener(new MouseAdapter() {
		//	@Override
			public void mousePressed(MouseEvent e) {
				user.setText("");
			}
		});
		user.setBounds(217, 108, 256, 27);
		contentPane.add(user);
		user.setColumns(10);
		
		email = new JTextField();
		email.setText("enter the eamil id");
		email.addMouseListener(new MouseAdapter() {
			//@Override
			public void mousePressed(MouseEvent e) {
				email.setText("");
			}
		});
		email.setBounds(218, 175, 256, 26);
		contentPane.add(email);
		email.setColumns(10);
		
		pass = new JPasswordField();
		pass.setText("");
		pass.addMouseListener(new MouseAdapter() {
			//@Override
			public void mousePressed(MouseEvent e) {
				pass.setText("");
			}
		});
		pass.setBounds(217, 241, 256, 29);
		contentPane.add(pass);
		
		JButton btnNewButton = new JButton("Sign up");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String us = user.getText();
					String em = email.getText();
					String pa = pass.getText();
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con =(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/voting1","root","science1@");
					Statement st =con.createStatement();
					st.executeUpdate("insert into signlogin values('"+us+"','"+em+"',"+pa+")");
//					PrintWriter out =response.getWriter();
//					if(i > 0) {
//						System.out.println("success");
//						new loginpage1().setVisible(true);
//					}
//					else {
//					     System.out.println("fail");
//					}
					System.out.println(us);
					System.out.println(em);
					System.out.println(pa);
				    JOptionPane.showMessageDialog(null,"sign in sucessfully","message",JOptionPane.INFORMATION_MESSAGE);
					new loginpage1().setVisible(true);
				}
			
			
			catch(Exception o) {
				System.out.println(o);
				
			}
			}
			
		});
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnNewButton.setBounds(240, 308, 98, 31);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\ELCOT-Lenovo\\Desktop\\student attendance system\\images\\360_F_725676837_XdfhMdVQseSJf5mHH6pR6IzcgxYIJwlJ.jpg"));
		lblNewLabel_4.setBounds(0, 0, 575, 366);
		contentPane.add(lblNewLabel_4);
	}
}