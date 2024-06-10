package onlinevote;

import java.awt.EventQueue;



import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.JScrollPane;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.Image;
import java.sql.Blob;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;

public class vote extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JScrollPane scrollPane;

	/**
	 * Launch the application.
	 */
	//int count=0;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vote frame = new vote();
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
	int count=0;
	public vote() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 618, 353);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.addMouseListener(new MouseAdapter() {
			int count=0;
			public void mouseClicked(MouseEvent e) {
//			
			}
		});
		//int count=0;
		scrollPane.setBounds(10, 70, 582, 233);
		contentPane.add(scrollPane);
	//	int count=0;
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				
				int st = table.getSelectedRow();
				table.getSelectedRow();
				TableModel model = table.getModel();
				//String t=model.getValueAt(table.getSelectedRow(st,0)).toString();
				String t1=model.getValueAt(st, 0).toString();
				int column=0;
				int row=table.getSelectedRow();
				String value =table.getModel().getValueAt(row, column).toString();
				count=count+1;
				String s=Integer.toString(count);
				JOptionPane.showMessageDialog(null,"your vote is successfully store","message",JOptionPane.INFORMATION_MESSAGE);
//				
				new onlineresult(t1,s).setVisible(false);
				new page6().setVisible(true);
				//str(s,t);
			   
				
				
			}
		});
		scrollPane.setViewportView(table);

		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"FirstName", "LastName", "photo", "Vote"
			}
		));

//		
		JButton btnNewButton = new JButton("show andidate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int count=0;
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con =(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/voting","root","science1@");
					Statement st=con.createStatement();	
			     	String sql="Select *from candidate";
					ResultSet rs =st.executeQuery(sql);
    				ResultSetMetaData rm=rs.getMetaData();
    				DefaultTableModel model =(DefaultTableModel)table.getModel();
    				String name,vote,last, photo;
    				ImageIcon fotamt;
  				    while(rs.next()) {
    				    name=rs.getString(1);
    				    last=rs.getString(2);
    				    photo = rs.getString(6);
    				    Blob im= rs.getBlob(6);
    				    Blob p=rs.getBlob("image");
    				    
    				 
    				    byte[] ph=rs.getBytes(6);
//    				   
    				  ImageIcon format =new ImageIcon(new ImageIcon(ph).getImage().getScaledInstance(200, 200,java.awt.Image.SCALE_SMOOTH));
    				
    				    vote="click here to vote";
    				    JButton b=new JButton();
    				     b.setName(vote);
    				     b.setOpaque(true);
    				     b.setSize(100,100);
    				   
    				    JLabel image1=new JLabel();
    				    ImageIcon imageicon=(ImageIcon)image1.getIcon();
    				    image1.setBounds(100, 100, 100, 100);
    				    image1.setIcon(imageicon);
    				  
    				   
    				  
    				    model.addRow(new Object[] {name,last,ph,vote});
//    				   
    				    
//    				    
    				  
    			  }
  				    rs.close();
   				    st.close();
    				con.close();
    			
    			}
    			catch(Exception e1) {
    				System.out.println(e1);
				   
			      }
			}
		});
		btnNewButton.setBounds(229, 36, 103, 23);
		contentPane.add(btnNewButton);
	}
	public void vote1(String mp) {
		
	}
}
