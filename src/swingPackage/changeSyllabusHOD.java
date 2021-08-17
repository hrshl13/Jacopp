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

public class changeSyllabusHOD extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					changeSyllabusHOD frame = new changeSyllabusHOD();
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
	public changeSyllabusHOD() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 740, 445);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(167, 15, 101, 22);
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
		lblNewLabel_1.setBounds(23, 10, 133, 27);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblSubject = new JLabel("Subject");
		lblSubject.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSubject.setBounds(23, 89, 84, 20);
		contentPane.add(lblSubject);
		
		JButton btnNewButton = new JButton("Delete");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton.setBounds(344, 122, 85, 21);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("English");
		lblNewLabel_2.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_2.setBounds(34, 119, 76, 22);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton_1 = new JButton("Delete");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_1.setBounds(344, 154, 85, 21);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Marathi");
		lblNewLabel_2_1.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_2_1.setBounds(34, 153, 76, 22);
		contentPane.add(lblNewLabel_2_1);
		
		JButton btnNewButton_8 = new JButton("Edit Syllabus");
		btnNewButton_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_8.setBounds(390, 10, 147, 27);
		contentPane.add(btnNewButton_8);
		
		JLabel lblNewLabel_1_1 = new JLabel("Select Subjects");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(24, 47, 133, 27);
		contentPane.add(lblNewLabel_1_1);
		
		JMenuBar menuBar_1 = new JMenuBar();
		menuBar_1.setBounds(167, 47, 101, 22);
		contentPane.add(menuBar_1);
		
		JMenu mnNewMenu_1 = new JMenu("Subjects");
		menuBar_1.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("English");
		mnNewMenu_1.add(mntmNewMenuItem_6);
		
		JMenuItem mntmNewMenuItem_7 = new JMenuItem("Marathi");
		mnNewMenu_1.add(mntmNewMenuItem_7);
		
		JMenuItem mntmNewMenuItem_8 = new JMenuItem("Sanskrit");
		mnNewMenu_1.add(mntmNewMenuItem_8);
		
		JMenuItem mntmNewMenuItem_9 = new JMenuItem("Maths");
		mnNewMenu_1.add(mntmNewMenuItem_9);
		
		JMenuItem mntmNewMenuItem_10 = new JMenuItem("Science");
		mnNewMenu_1.add(mntmNewMenuItem_10);
		
		JMenuItem mntmNewMenuItem_11 = new JMenuItem("History");
		mnNewMenu_1.add(mntmNewMenuItem_11);
		
		JMenuItem mntmNewMenuItem_12 = new JMenuItem("Geography");
		mnNewMenu_1.add(mntmNewMenuItem_12);
		
		JLabel lblChapter = new JLabel("Chapter");
		lblChapter.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblChapter.setBounds(181, 89, 84, 20);
		contentPane.add(lblChapter);
		
		JLabel lblNewLabel_2_2 = new JLabel("Prepositions");
		lblNewLabel_2_2.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_2_2.setBounds(192, 119, 76, 22);
		contentPane.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Nibandh");
		lblNewLabel_2_1_1.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_2_1_1.setBounds(192, 153, 76, 22);
		contentPane.add(lblNewLabel_2_1_1);
		
		JButton btnNewButton_8_1 = new JButton("Add Chapter");
		btnNewButton_8_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_8_1.setBounds(547, 10, 147, 27);
		contentPane.add(btnNewButton_8_1);
	}
}
