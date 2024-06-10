package onlinevote;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class page6 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					page6 frame = new page6();
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
	public page6() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 636, 397);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Online");
		lblNewLabel_1.setForeground(new Color(248, 248, 255));
		lblNewLabel_1.setFont(new Font("SansSerif", Font.BOLD, 25));
		lblNewLabel_1.setBounds(41, 104, 93, 32);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Voting");
		lblNewLabel.setForeground(new Color(248, 248, 255));
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 25));
		lblNewLabel.setBounds(130, 101, 93, 38);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("System");
		lblNewLabel_2.setForeground(new Color(248, 248, 255));
		lblNewLabel_2.setFont(new Font("SansSerif", Font.BOLD, 25));
		lblNewLabel_2.setBounds(76, 186, 113, 32);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Add Candidate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new page51().setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("SansSerif", Font.BOLD, 16));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBounds(396, 46, 151, 32);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Vote");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new vote().setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("SansSerif", Font.BOLD, 16));
		btnNewButton_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1.setBounds(396, 149, 151, 32);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Result");
		btnNewButton_2.setFont(new Font("SansSerif", Font.BOLD, 16));
		btnNewButton_2.setForeground(new Color(0, 0, 0));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new onlineresult(null,null).setVisible(true);
			}
		});
		btnNewButton_2.setBounds(396, 255, 151, 32);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\ELCOT-Lenovo\\Desktop\\student attendance system\\images\\360_F_725676837_XdfhMdVQseSJf5mHH6pR6IzcgxYIJwlJ.jpg"));
		lblNewLabel_3.setBounds(0, 0, 620, 358);
		contentPane.add(lblNewLabel_3);
	}
}
