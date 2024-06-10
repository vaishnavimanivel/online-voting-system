package onlinevote;

import java.awt.Color;


import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.imageio.ImageIO;
import javax.swing.AbstractButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.image.RenderedImage;
//import javax.swing.setIcon;
import javax.imageio.stream.ImageOutputStream;
import javax.sql.rowset.serial.SerialBlob;
import javax.swing.AbstractButton;
import java.io.InputStream;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;



public class page51 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField fname;
	private JTextField email;
	private JLabel image;
	private JTextField lname;
	private JTextField phone;
	private JComboBox gen;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					page51 frame = new page51();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
//	 */
//	private ImageIcon format=null;
//	String fname=null;
//	int s=0;
////	byte[] pimage=null;
     //  private JLabel photo_1;
//private String img;
	
int c=0;	
	public page51() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 626, 397);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Add Candidate");
		lblNewLabel.setForeground(new Color(248, 248, 255));
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 25));
		lblNewLabel.setBounds(208, 11, 180, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("First Name");
		lblNewLabel_1.setForeground(new Color(248, 248, 255));
		lblNewLabel_1.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblNewLabel_1.setBounds(94, 66, 142, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Last Name");
		lblNewLabel_2.setForeground(new Color(248, 248, 255));
		lblNewLabel_2.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblNewLabel_2.setBounds(91, 106, 83, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Email id");
		lblNewLabel_3.setForeground(new Color(248, 248, 255));
		lblNewLabel_3.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblNewLabel_3.setBounds(91, 145, 83, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Phone No");
		lblNewLabel_4.setForeground(new Color(248, 248, 255));
		lblNewLabel_4.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblNewLabel_4.setBounds(91, 180, 83, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Select Gender");
		lblNewLabel_5.setForeground(new Color(248, 248, 255));
		lblNewLabel_5.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblNewLabel_5.setBounds(84, 217, 103, 14);
		contentPane.add(lblNewLabel_5);
		
		fname = new JTextField();
		fname.setBounds(219, 65, 190, 20);
		contentPane.add(fname);
		fname.setColumns(10);
		
		lname = new JTextField();
		lname.setBounds(219, 105, 190, 20);
		contentPane.add(lname);
		lname.setColumns(10);
		
		email = new JTextField();
		email.setBounds(219, 144, 191, 20);
		contentPane.add(email);
		email.setColumns(10);
		
		phone = new JTextField();
		phone.setBounds(219, 179, 190, 20);
		contentPane.add(phone);
		phone.setColumns(10);
		
		gen = new JComboBox();
		gen.setBackground(Color.WHITE);
		gen.setModel(new DefaultComboBoxModel(new String[] {"Male", "Female"}));
		gen.setFont(new Font("SansSerif", Font.BOLD, 15));
		gen.setBounds(219, 215, 103, 22);
		contentPane.add(gen);
		
		JLabel lblNewLabel_6 = new JLabel("Photo");
		lblNewLabel_6.setForeground(new Color(248, 248, 255));
		lblNewLabel_6.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblNewLabel_6.setBounds(91, 258, 96, 14);
		contentPane.add(lblNewLabel_6);
		
		JButton btnNewButton = new JButton("Browse");
		btnNewButton.addActionListener(new ActionListener() {
			//private AbstractButton photo_1;

			//private JLabel lbl_photo;

			public void actionPerformed(ActionEvent e) {
				// JLabel photo_1 = null;
				JFileChooser chooser = new  JFileChooser();
				chooser.showOpenDialog(null);
				File f = chooser.getSelectedFile();
				String path = f.getAbsolutePath();
				//int count1=0;
				//ImageIcon imageIcon=new ImageIcon(new ImageIcon(path))
			//	private int c=0;
				try {
					//File image =new File(path);
					FileInputStream fis =new FileInputStream(path);
					//ByteArrayoutputStream bos = new ByteArrayoutStream();
					//FileReader reader=new FileReader(path);
					//InputStream is=.getInputStream();
					BufferedImage bi = ImageIO.read(new File(path));
					//ByteArrayOutputStream baos=new ByteArrayOutputStream();
				//	ByteArrayOutputStream baos=new ByteArrayOutputStream();
     				//ImageIO.write(bi,"jpg",baos);
              //       byte[]ima=baos.toByteArray();
//					InputStream is=new FileInputStream(new File(path));
					Image img = bi.getScaledInstance(134,160,Image.SCALE_SMOOTH);
			        ImageIcon icon = new ImageIcon(img);
			        image.setIcon(icon);
			        //byte[] buff=img.getBytes();
				//	Blob blob= baos.
			      //  byte[] buff=fis.getBytes();
					//Blob blob= new SerialBlob(buff);
			        String us = fname.getText();
					String l = lname.getText();
					String em = email.getText();
					String ph= phone.getText();
					String gender=gen.getSelectedItem().toString();
					//FileInputStream fis =new FileInputStream(path);
//					
					//int c=0;
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con =(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/voting","root","science1@");
					String sql="insert into candidate(fname,lname,email,phone,gender,image,count)values(?,?,?,?,?,?,?)";
					String count="0";
					PreparedStatement pstmt =con.prepareStatement(sql);
					pstmt.setString(1,us);;
					pstmt.setString(2,l);
					pstmt.setString(3,em);
					pstmt.setString(4,ph);
					pstmt.setString(5,gender);				
					pstmt.setBlob(6,fis);
				    pstmt.setString(7,count);
					ByteArrayOutputStream baos=new ByteArrayOutputStream();
					ImageIO.write(bi,"jpg",baos);
			    	byte[]image=baos.toByteArray();
					pstmt.executeUpdate();
					//JOptionPane.showMessageDialog(null,"candidate details is sucessfully added","message",JOptionPane.INFORMATION_MESSAGE);
					String q="update candidate set image='"+image+"'where fname='"+us+"'";;
					PreparedStatement pst=con.prepareStatement(q);
					pst.executeUpdate(q);
				
				     c++;
				}
				catch(Exception ex) {
					//JOptionPane.showMessageDialog(null,"candidate details is not added","message",JOptionPane.INFORMATION_MESSAGE);
					Logger.getLogger(page51.class.getName()).log(Level.SEVERE,null,ex);
					//.showMessageDialog(null,"candidate details is not added","message",JOptionPane.INFORMATION_MESSAGE);
				}
				
				
			}
		});
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnNewButton.setBounds(398, 274, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Save");
		btnNewButton_1.addActionListener(new ActionListener() {
      private String path;
//			 String path;
		    // String is=icon;
			private String path2=path;
private Blob fis ;
private AbstractButton jtable;

			public void actionPerformed(ActionEvent e) {
				try {
					if(c>0) {
						JOptionPane.showMessageDialog(null,"candidate details is sucessfully added","message",JOptionPane.INFORMATION_MESSAGE);
					}
					else {
						JOptionPane.showMessageDialog(null,"candidate details is not added","message",JOptionPane.INFORMATION_MESSAGE);
					}
//					  
			   }
			   catch (Exception e1) {
				   System.out.println(e1);
					//JOptionPane.showMessageDialog(null,"candidate details is not added","message",JOptionPane.INFORMATION_MESSAGE);
			   }
		
			}	
		});
		btnNewButton_1.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnNewButton_1.setBounds(398, 324, 89, 23);
		contentPane.add(btnNewButton_1);
		
		image = new JLabel("");
		image.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		image.setBackground(Color.WHITE);
		image.setFocusTraversalPolicyProvider(true);
		image.setRequestFocusEnabled(false);
		image.setOpaque(true);
		image.setForeground(Color.BLACK);
		image.setBounds(219, 248, 135, 99);
		contentPane.add(image);
		
		JLabel lblNewLabel_7 = new JLabel("<-");
		lblNewLabel_7.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				new page6().setVisible(true);
				
			}
		});
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel_7.setBounds(10, 11, 46, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setIcon(new ImageIcon("C:\\Users\\ELCOT-Lenovo\\Desktop\\student attendance system\\images\\360_F_725676837_XdfhMdVQseSJf5mHH6pR6IzcgxYIJwlJ.jpg"));
		lblNewLabel_8.setBounds(0, 0, 610, 358);
		contentPane.add(lblNewLabel_8);
	}

	protected Object Icon(Image img) {
		// TODO Auto-generated method stub
		return null;
	}
}
