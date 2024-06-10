package onlinevote;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.JTabbedPane;
import javax.swing.JInternalFrame;
import java.awt.BorderLayout;

public class page2 extends JFrame  {
	public page2() {
		getContentPane().setLayout(null);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new loginpage1().setVisible(true);
			}
		});
		btnNewButton_2.setForeground(new Color(0, 0, 0));
		btnNewButton_2.setFont(new Font("SansSerif", Font.BOLD, 16));
		btnNewButton_2.setBounds(378, 99, 120, 31);
		getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Sign Up");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new page6().setVisible(true);
			}
		});
		btnNewButton_3.setFont(new Font("SansSerif", Font.BOLD, 16));
		btnNewButton_3.setBounds(378, 193, 120, 31);
		getContentPane().add(btnNewButton_3);
		
		JLabel lblNewLabel_5 = new JLabel("Welcome");
		lblNewLabel_5.setFont(new Font("SansSerif", Font.BOLD, 25));
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setBounds(69, 75, 126, 25);
		getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("To");
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setFont(new Font("SansSerif", Font.BOLD, 24));
		lblNewLabel_6.setBounds(96, 115, 57, 25);
		getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Online Voting");
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel_7.setFont(new Font("SansSerif", Font.BOLD, 25));
		lblNewLabel_7.setBounds(42, 151, 169, 42);
		getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("System");
		lblNewLabel_8.setForeground(Color.WHITE);
		lblNewLabel_8.setFont(new Font("SansSerif", Font.BOLD, 25));
		lblNewLabel_8.setBounds(60, 221, 94, 25);
		getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("New label");
		lblNewLabel_9.setIcon(new ImageIcon("C:\\Users\\ELCOT-Lenovo\\Desktop\\student attendance system\\images\\360_F_725676837_XdfhMdVQseSJf5mHH6pR6IzcgxYIJwlJ.jpg"));
		lblNewLabel_9.setBounds(0, 0, 562, 289);
		getContentPane().add(lblNewLabel_9);
	}

private JFrame frame;
private final JButton btnNewButton_2 = new JButton("Login");

	/**
	 * Launch the application.
	 */
	public static void main(java.lang.String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					page2 window = new page2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
	
		});
	}

	/**
	 * Create the application.
	 */
//	public page2() {
//		initialize();
//	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setForeground(Color.CYAN);
		frame.setBackground(Color.CYAN);
		frame.setBounds(100, 100, 650, 380);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("WELCOME");
		lblNewLabel.setForeground(new Color(248, 248, 255));
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 25));
		lblNewLabel.setBounds(126, 62, 299, 35);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("TO");
		lblNewLabel_1.setForeground(new Color(248, 248, 255));
		lblNewLabel_1.setFont(new Font("SansSerif", Font.BOLD, 24));
		lblNewLabel_1.setBounds(171, 133, 58, 27);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("ONLINE");
		lblNewLabel_2.setForeground(new Color(248, 248, 255));
		lblNewLabel_2.setFont(new Font("SansSerif", Font.BOLD, 25));
		lblNewLabel_2.setBounds(145, 186, 124, 27);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("VOTING SYSTEM");
		lblNewLabel_3.setForeground(new Color(248, 248, 255));
		lblNewLabel_3.setFont(new Font("SansSerif", Font.BOLD, 25));
		lblNewLabel_3.setBounds(87, 245, 243, 35);
		frame.getContentPane().add(lblNewLabel_3);
		
		JButton btnNewButton_1 = new JButton("Sign up");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new page4().setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnNewButton_1.setForeground(Color.DARK_GRAY);
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setBounds(454, 208, 101, 35);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new loginpage1().setVisible(true);
			}
		});
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnNewButton.setBounds(454, 79, 101, 35);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\ELCOT-Lenovo\\Desktop\\student attendance system\\images\\360_F_725676837_XdfhMdVQseSJf5mHH6pR6IzcgxYIJwlJ.jpg"));
		lblNewLabel_4.setBounds(0, 0, 634, 341);
		frame.getContentPane().add(lblNewLabel_4);
	}
}