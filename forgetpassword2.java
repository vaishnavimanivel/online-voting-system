package onlinevote;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class forgetpassword1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final JLabel lblNewLabel_2 = new JLabel("New Password");
	private JTextField np;
	private JTextField cp;
	private JTextField em;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//String title;
					forgetpassword1 frame = new forgetpassword1();
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
	public forgetpassword1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 584, 331);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblNewLabel_2.setBounds(54, 128, 173, 31);
		contentPane.add(lblNewLabel_2);
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("SansSerif", Font.BOLD, 17));
		
		np = new JTextField();
		np.setColumns(10);
		np.setBounds(237, 133, 273, 27);
		contentPane.add(np);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.addActionListener(new ActionListener() {
			private String sql;

			public void actionPerformed(ActionEvent e) {
				String np1= np.getText();
				String cp2= cp.getText();
				String us1=em.getText();
				
				try {
					int i=1;
					String npp= np.getText();
					String cpp= cp.getText();
					String use=em.getText();
					//confirmpass.getText();
					Class.forName("com.mysql.cj.jdbc.Driver");
					//Connection con1=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:")
					Connection con =(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/voting1","root","science1@");
					Statement st1=con.createStatement();
					String sql="select *from signlogin";
					//String sql="select *from signlogin where user=?";
					//PrearedStatement pst=con.preparedStatement(sql);
					//PreparedStatement pst=con.prepareStatement(st1);
					//PreparedStatement pts=con.prepareStatement(st1);
					//pst.setString(1, us1);
					//ResultSet res1=pst.executeQuery();
					ResultSet res1=st1.executeQuery(sql);
					//ResultSet res1=st1.executeQuery(sql);
					while(res1.next()) {
					  String use1=res1.getString("user");
					  if(us1.equals(use1)&& npp.equals(cpp)) {
						String q="update signlogin set password='"+np1+"' where user='"+us1+"'";
						PreparedStatement pst=con.prepareStatement(q);
						pst.executeUpdate(q);
						//pst.setString(1, np1);
						//pst.setString(2, us1);
						//nt rowsUpdate=pst.executeUpdate(q);
//						if(rowsUpdate>0) {
							JOptionPane.showMessageDialog(null,"password is reset","message",JOptionPane.INFORMATION_MESSAGE);
							new loginpage1().setVisible(true);
						}
					}				    
					}
				//}
				catch(Exception os) {
					System.out.print(os);
				//	JOptionpane.showMessageDialog(btnNewButto,this,"Error while establishing connection failed",0);
					JOptionPane.showMessageDialog(null,"password is not reset","message",JOptionPane.INFORMATION_MESSAGE);
					
							}
				}
			
					
				
		});
		btnNewButton_1.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnNewButton_1.setBounds(228, 254, 100, 27);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("Reset Password");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 20));
		lblNewLabel.setBounds(206, 11, 178, 27);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Confrom Pssword");
		lblNewLabel_1.setFont(new Font("SansSerif", Font.BOLD, 16));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(54, 199, 152, 27);
		contentPane.add(lblNewLabel_1);
		
		cp = new JTextField();
		cp.setBounds(237, 202, 273, 26);
		contentPane.add(cp);
		cp.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("UserName");
		lblNewLabel_3.setFont(new Font("SansSerif", Font.BOLD, 18));
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(54, 74, 109, 24);
		contentPane.add(lblNewLabel_3);
		
		em = new JTextField();
		em.setBounds(234, 76, 273, 27);
		contentPane.add(em);
		em.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\ELCOT-Lenovo\\Desktop\\student attendance system\\images\\360_F_725676837_XdfhMdVQseSJf5mHH6pR6IzcgxYIJwlJ.jpg"));
		lblNewLabel_4.setBounds(0, 0, 568, 292);
		contentPane.add(lblNewLabel_4);
	}
}