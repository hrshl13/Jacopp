package swingPackage;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JMenu;
import javax.swing.JList;
import javax.swing.JButton;

public class syllabusTeachers extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					syllabusTeachers frame = new syllabusTeachers();
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
	public syllabusTeachers() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 740, 445);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("View Syllabus");
		lblNewLabel.setBounds(281, 10, 143, 52);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("English");
		btnNewButton_1.setFont(new Font("Verdana", Font.PLAIN, 13));
		btnNewButton_1.setBounds(70, 139, 200, 30);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Marathi");
		btnNewButton_2.setFont(new Font("Verdana", Font.PLAIN, 13));
		btnNewButton_2.setBounds(70, 166, 200, 30);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Sanskrit");
		btnNewButton_3.setFont(new Font("Verdana", Font.PLAIN, 13));
		btnNewButton_3.setBounds(70, 192, 200, 30);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Maths");
		btnNewButton_4.setFont(new Font("Verdana", Font.PLAIN, 13));
		btnNewButton_4.setBounds(70, 217, 200, 30);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Science");
		btnNewButton_5.setFont(new Font("Verdana", Font.PLAIN, 13));
		btnNewButton_5.setBounds(70, 242, 200, 30);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("History");
		btnNewButton_6.setFont(new Font("Verdana", Font.PLAIN, 13));
		btnNewButton_6.setBounds(70, 270, 200, 30);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("Geography");
		btnNewButton_7.setFont(new Font("Verdana", Font.PLAIN, 13));
		btnNewButton_7.setBounds(70, 297, 200, 30);
		contentPane.add(btnNewButton_7);
		
		JLabel lblNewLabel_1 = new JLabel("Select Standard");
		lblNewLabel_1.setBounds(70, 91, 133, 27);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(lblNewLabel_1);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(248, 91, 101, 22);
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
	}
}
