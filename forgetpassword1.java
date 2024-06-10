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
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class forgetpassword extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final JLabel lblNewLabel = new JLabel("Forget Password");
	private JTextField email;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					forgetpassword frame = new forgetpassword();
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
	public forgetpassword() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 584, 331);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 20));
		lblNewLabel.setBounds(210, 35, 161, 31);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Email id");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("SansSerif", Font.BOLD, 17));
		lblNewLabel_1.setBounds(46, 128, 88, 31);
		contentPane.add(lblNewLabel_1);
		
		email = new JTextField();
		email.setBounds(199, 133, 273, 27);
		contentPane.add(email);
		email.setColumns(10);
		
		final JButton btnNewButton = new JButton("Continue");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String us = email.getText();
					//String ps = pass.getText();
					System.out.println(us);
					Class.forName("com.mysql.cj.jdbc.Driver");
					//System.out.println(ps);
					Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/voting1","root","science1@");
					System.out.println("1");
					Statement st = con.createStatement();
					System.out.println("1");
					String sql = "Select * from signlogin";
					System.out.println("1");
					ResultSet rs = st.executeQuery(sql);
					System.out.println("1");
					while(rs.next()){
					String username = rs.getString("email");
					System.out.println("1-");
					String password = rs.getString("password");
					System.out.println("1-");

					if(us.equals(username)){
						//String n=email.getText();			
						new forgetpassword1().setVisible(true);
					    System.out.println("true");
					//SwingUtilities.windowForComponent(btnNewButton).dispose();
					}
					else{
					email.setText("");
					//pass.setText("");
					System.out.println("false");
					continue;
					}
				}}
				catch(Exception o) {
					JOptionPane.showMessageDialog(btnNewButton, this, "Error while establishing connection failed", 0);
				}
			}
				
			//}
		});
		btnNewButton.setFont(new Font("SansSerif", Font.BOLD, 13));
		btnNewButton.setBounds(230, 250, 100, 31);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\ELCOT-Lenovo\\Desktop\\student attendance system\\images\\360_F_725676837_XdfhMdVQseSJf5mHH6pR6IzcgxYIJwlJ.jpg"));
		lblNewLabel_3.setBounds(0, 0, 568, 292);
		contentPane.add(lblNewLabel_3);
	}
}