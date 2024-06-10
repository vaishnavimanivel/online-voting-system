package onlinevote;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import javax.swing.ScrollPaneConstants;
import java.awt.Component;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class onlineresult extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final JTable table = new JTable();
	private DefaultTableModel model;
	private JScrollPane tables;
	private final JButton btnShowResult = new JButton("show result");
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					onlineresult frame = new onlineresult(null,null);
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
	public onlineresult(final String m,final String mp) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 645, 381);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tables = new JScrollPane();
		tables.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		tables.setAlignmentX(Component.RIGHT_ALIGNMENT);
		tables.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		tables.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
		tables.setBounds(10, 73, 602, 258);
		contentPane.add(tables);
		tables.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"firstname", "lastname", "count"
			}
	    		
		));
		
		
		JLabel lblNewLabel = new JLabel("online voting system result");
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 18));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(188, 0, 239, 40);
		contentPane.add(lblNewLabel);
		btnShowResult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con =(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/voting","root","science1@");
					Statement st=con.createStatement();	
			     	String sql="Select *from candidate";
					ResultSet rs =st.executeQuery(sql);
    				ResultSetMetaData rm=rs.getMetaData();
    				DefaultTableModel model =(DefaultTableModel)table.getModel();
    				String no,name, marks;
    				String mar= m;
    			//	String m1=mp;
//    				int l=Integer.parseInt(m1);
//    				int c=l+1;
//    				String m=String.valueOf(c);
  				    while(rs.next()) {
  				    	//String mar=m;
    				    no=rs.getString(1);
    				    name=rs.getString(2);
    				    marks = rs.getString(7);
    				    int l=Integer.parseInt(marks);
        				int c=l+1;
        				String m=String.valueOf(c);
    				    String q="update candidate set count='"+c+"'where fname='"+mar+"'";;
    					PreparedStatement pst=con.prepareStatement(q);
    					pst.executeUpdate(q);
   					    String no1=rs.getString(1);
     				    String  name1=rs.getString(2);
     				    String  marks1 = rs.getString(7);
    				    int mp1=Integer.parseInt(marks1);
    				    int c1=1+mp1;
    				    String mp2=String.valueOf(c1);
    				    
    				    model.addRow(new Object[] {no1,name1,mp2});
    				    //}
//    				    
    			  }
   				    st.close();
    				con.close();
    			
    			}
    			catch(Exception e1) {
    				System.out.println(e1);
				   
			      }
			}
			
		});
		btnShowResult.setBackground(new Color(255, 255, 255));
		btnShowResult.setForeground(new Color(0, 0, 0));
		btnShowResult.setBounds(263, 39, 106, 23);
		contentPane.add(btnShowResult);
		
		lblNewLabel_1 = new JLabel("<-");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				new page6().setVisible(true);
			}
		});
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(0, 0, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\ELCOT-Lenovo\\Desktop\\student attendance system\\images\\360_F_725676837_XdfhMdVQseSJf5mHH6pR6IzcgxYIJwlJ.jpg"));
		lblNewLabel_2.setBounds(0, 0, 619, 342);
		contentPane.add(lblNewLabel_2);
		
	}

	

}

