package swingPackage;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Font;
import javax.swing.JButton;

public class changeSyllabusPrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					changeSyllabusPrincipal frame = new changeSyllabusPrincipal();
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
	public changeSyllabusPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 740, 445);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(167, 35, 101, 22);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Standards");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("5th");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("6th");
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("7th");
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("8th");
		mnNewMenu.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("9th");
		mnNewMenu.add(mntmNewMenuItem_4);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("10th");
		mnNewMenu.add(mntmNewMenuItem_5);
		
		JLabel lblNewLabel_1 = new JLabel("Select Standard");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(23, 30, 133, 27);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Subject Code");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(36, 91, 101, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblSubject = new JLabel("Subject");
		lblSubject.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSubject.setBounds(177, 91, 84, 20);
		contentPane.add(lblSubject);
		
		JButton btnNewButton = new JButton("Delete");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton.setBounds(344, 122, 85, 21);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("English");
		lblNewLabel_2.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_2.setBounds(187, 121, 76, 22);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("sub1");
		lblNewLabel_3.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_3.setBounds(60, 127, 45, 13);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton_1 = new JButton("Delete");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_1.setBounds(344, 154, 85, 21);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Marathi");
		lblNewLabel_2_1.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_2_1.setBounds(187, 153, 76, 22);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("sub2");
		lblNewLabel_3_1.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_3_1.setBounds(60, 159, 45, 13);
		contentPane.add(lblNewLabel_3_1);
		
		JButton btnNewButton_2 = new JButton("Delete");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_2.setBounds(344, 189, 85, 21);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_2_2 = new JLabel("Sanskrit");
		lblNewLabel_2_2.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_2_2.setBounds(187, 188, 76, 22);
		contentPane.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_3_2 = new JLabel("sub3");
		lblNewLabel_3_2.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_3_2.setBounds(60, 194, 45, 13);
		contentPane.add(lblNewLabel_3_2);
		
		JButton btnNewButton_3 = new JButton("Delete");
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_3.setBounds(344, 221, 85, 21);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel_2_3 = new JLabel("Maths");
		lblNewLabel_2_3.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_2_3.setBounds(187, 220, 76, 22);
		contentPane.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_3_3 = new JLabel("sub4");
		lblNewLabel_3_3.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_3_3.setBounds(60, 226, 45, 13);
		contentPane.add(lblNewLabel_3_3);
		
		JButton btnNewButton_4 = new JButton("Delete");
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_4.setBounds(344, 253, 85, 21);
		contentPane.add(btnNewButton_4);
		
		JLabel lblNewLabel_2_4 = new JLabel("Science");
		lblNewLabel_2_4.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_2_4.setBounds(187, 252, 76, 22);
		contentPane.add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_3_4 = new JLabel("sub5");
		lblNewLabel_3_4.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_3_4.setBounds(60, 258, 45, 13);
		contentPane.add(lblNewLabel_3_4);
		
		JButton btnNewButton_5 = new JButton("Delete");
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_5.setBounds(344, 285, 85, 21);
		contentPane.add(btnNewButton_5);
		
		JLabel lblNewLabel_2_5 = new JLabel("History");
		lblNewLabel_2_5.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_2_5.setBounds(187, 284, 76, 22);
		contentPane.add(lblNewLabel_2_5);
		
		JLabel lblNewLabel_3_5 = new JLabel("sub6");
		lblNewLabel_3_5.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_3_5.setBounds(60, 290, 45, 13);
		contentPane.add(lblNewLabel_3_5);
		
		JButton btnNewButton_6 = new JButton("Delete");
		btnNewButton_6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_6.setBounds(344, 317, 85, 21);
		contentPane.add(btnNewButton_6);
		
		JLabel lblNewLabel_2_6 = new JLabel("Geography");
		lblNewLabel_2_6.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_2_6.setBounds(187, 316, 76, 22);
		contentPane.add(lblNewLabel_2_6);
		
		JLabel lblNewLabel_3_6 = new JLabel("sub7");
		lblNewLabel_3_6.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_3_6.setBounds(60, 322, 45, 13);
		contentPane.add(lblNewLabel_3_6);
		
		JButton btnNewButton_8 = new JButton("Edit Syllabus");
		btnNewButton_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_8.setBounds(390, 10, 147, 27);
		contentPane.add(btnNewButton_8);
		
		JButton btnNewButton_7 = new JButton("Add Subject");
		btnNewButton_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_7.setBounds(158, 348, 138, 36);
		contentPane.add(btnNewButton_7);
	}
}
