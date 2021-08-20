package swingPackage;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JInternalFrame;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;

import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JMenuBar;
import javax.swing.border.BevelBorder;
import java.awt.Color;

public class homePageTeacher extends JFrame {

	private JPanel contentPane;
	private final JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new homePageTeacher();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	public homePageTeacher() {
		setTitle("Dashboard");
		colorsFile cF = new colorsFile();
		Runtime r = Runtime.getRuntime();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 740, 445);
		contentPane = new JPanel();
		contentPane.setBackground(cF.bg);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
		tabbedPane.setBounds(0, 29, 726, 392);
		contentPane.add(tabbedPane);
	
			JPanel assgnTeacher = new JPanel();
			assgnTeacher.setBackground(cF.TPanelbg);
			tabbedPane.addTab("Assignment", null, assgnTeacher, null);
			assgnTeacher.setLayout(null);
			
			JPanel panel = new JPanel();
			panel.setBackground(cF.TPanelbg);
			panel.setLayout(null);
			panel.setBorder(new BevelBorder(BevelBorder.RAISED, Color.DARK_GRAY, Color.GRAY, null, null));
			panel.setBounds(86, 30, 524, 96);
			assgnTeacher.add(panel);
			
			JButton btnNewButton_1_1 = new JButton("Show Result");
			btnNewButton_1_1.setBackground(cF.btnClr1);
			btnNewButton_1_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					showResultTeacher srT = new showResultTeacher();
					srT.setVisible(true);
					setVisible(false);
				}
			});
			btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
			btnNewButton_1_1.setBounds(394, 65, 120, 21);
			panel.add(btnNewButton_1_1);
			
			JLabel lblNewLabel_1 = new JLabel("Practical 4: Panel Examples");
			lblNewLabel_1.setForeground(cF.lbClr);
			lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblNewLabel_1.setBounds(10, 15, 189, 26);
			panel.add(lblNewLabel_1);
			
			JLabel lblNewLabel_1_1 = new JLabel("Try using multiple Panels in a Frame");
			lblNewLabel_1_1.setForeground(cF.lbClr);
			lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblNewLabel_1_1.setBounds(116, 51, 241, 21);
			panel.add(lblNewLabel_1_1);
			
			JLabel lblNewLabel_2 = new JLabel("Java Core");
			lblNewLabel_2.setForeground(cF.lbClr);
			lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblNewLabel_2.setBounds(10, 69, 66, 13);
			panel.add(lblNewLabel_2);
			
			JPanel panel_1 = new JPanel();
			panel_1.setForeground(cF.lbClr);
			panel_1.setBackground(cF.TPanelbg);
			panel_1.setLayout(null);
			panel_1.setBorder(new BevelBorder(BevelBorder.RAISED, Color.DARK_GRAY, Color.GRAY, null, null));
			panel_1.setBounds(86, 136, 524, 96);
			assgnTeacher.add(panel_1);
			
			JButton btnNewButton_1_1_1 = new JButton("Show Result");
			btnNewButton_1_1_1.setBackground(cF.btnClr1);
			btnNewButton_1_1_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					showResultTeacher srT = new showResultTeacher();
					srT.setVisible(true);
					setVisible(false);
				}
			});
			btnNewButton_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
			btnNewButton_1_1_1.setBounds(394, 65, 120, 21);
			panel_1.add(btnNewButton_1_1_1);
			
			JLabel lblPracticalTrigger = new JLabel("Practical 5: Trigger Problems");
			lblPracticalTrigger.setForeground(cF.lbClr);
			lblPracticalTrigger.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblPracticalTrigger.setBounds(10, 10, 189, 26);
			panel_1.add(lblPracticalTrigger);
			
			JLabel lblNewLabel_1_1_1 = new JLabel("Execute Trigger based problems in PL/SQL");
			lblNewLabel_1_1_1.setForeground(cF.lbClr);
			lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblNewLabel_1_1_1.setBounds(120, 46, 241, 21);
			panel_1.add(lblNewLabel_1_1_1);
			
			JLabel lblNewLabel_2_1 = new JLabel("DBMS");
			lblNewLabel_2_1.setForeground(cF.lbClr);
			lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblNewLabel_2_1.setBounds(10, 73, 66, 13);
			panel_1.add(lblNewLabel_2_1);
			
			JPanel panel_2 = new JPanel();
			panel_2.setForeground(cF.lbClr);
			panel_2.setBackground(cF.TPanelbg);
			panel_2.setLayout(null);
			panel_2.setBorder(new BevelBorder(BevelBorder.RAISED, Color.DARK_GRAY, Color.GRAY, null, null));
			panel_2.setBounds(86, 242, 524, 96);
			assgnTeacher.add(panel_2);
			
			JButton btnNewButton_1_2 = new JButton("Show Result");
			btnNewButton_1_2.setBackground(cF.btnClr1);
			btnNewButton_1_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					showResultTeacher srT = new showResultTeacher();
					srT.setVisible(true);
					setVisible(false);
				}
			});
			btnNewButton_1_2.setFont(new Font("Tahoma", Font.BOLD, 12));
			btnNewButton_1_2.setBounds(394, 65, 120, 21);
			panel_2.add(btnNewButton_1_2);
			
			JLabel lblInnovativePracticalCreate = new JLabel("Innovative Practical");
			lblInnovativePracticalCreate.setForeground(cF.lbClr);
			lblInnovativePracticalCreate.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblInnovativePracticalCreate.setBounds(10, 10, 189, 26);
			panel_2.add(lblInnovativePracticalCreate);
			
			JLabel lblNewLabel_1_2 = new JLabel("Create a GUI Application of School Management system");
			lblNewLabel_1_2.setForeground(cF.lbClr);
			lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblNewLabel_1_2.setBounds(63, 46, 317, 21);
			panel_2.add(lblNewLabel_1_2);
			
			JLabel lblNewLabel_2_2 = new JLabel("Java Core");
			lblNewLabel_2_2.setForeground(cF.lbClr);
			lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblNewLabel_2_2.setBounds(10, 73, 66, 13);
			panel_2.add(lblNewLabel_2_2);
			
			JLabel lblNewLabel_4 = new JLabel("Assignments");
			lblNewLabel_4.setForeground(cF.lbClr);
			lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_4.setBounds(286, 0, 133, 20);
			assgnTeacher.add(lblNewLabel_4);
			
			JPanel syllabusTeacher = new JPanel();
			syllabusTeacher.setForeground(cF.lbClr);
			syllabusTeacher.setBackground(cF.TPanelbg);
			tabbedPane.addTab("Syllabus", null, syllabusTeacher, null);
			syllabusTeacher.setLayout(null);
			
			JLabel lblNewLabel_3 = new JLabel("View Syllabus");
			lblNewLabel_3.setForeground(cF.lbClr);
			lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
			lblNewLabel_3.setBounds(285, 10, 143, 52);
			syllabusTeacher.add(lblNewLabel_3);
			
			JButton btnNewButton_1 = new JButton("English");
			btnNewButton_1.setBackground(cF.btnClr1);
			btnNewButton_1.setFont(new Font("Verdana", Font.PLAIN, 13));
			btnNewButton_1.setBounds(74, 139, 200, 30);
			syllabusTeacher.add(btnNewButton_1);
			
			JButton btnNewButton_2 = new JButton("Marathi");
			btnNewButton_2.setBackground(cF.btnClr1);
			btnNewButton_2.setFont(new Font("Verdana", Font.PLAIN, 13));
			btnNewButton_2.setBounds(74, 166, 200, 30);
			syllabusTeacher.add(btnNewButton_2);
			
			JButton btnNewButton_3 = new JButton("Sanskrit");
			btnNewButton_3.setBackground(cF.btnClr1);
			btnNewButton_3.setFont(new Font("Verdana", Font.PLAIN, 13));
			btnNewButton_3.setBounds(74, 192, 200, 30);
			syllabusTeacher.add(btnNewButton_3);
			
			JButton btnNewButton_4 = new JButton("Maths");
			btnNewButton_4.setBackground(cF.btnClr1);
			btnNewButton_4.setFont(new Font("Verdana", Font.PLAIN, 13));
			btnNewButton_4.setBounds(74, 217, 200, 30);
			syllabusTeacher.add(btnNewButton_4);
			
			JButton btnNewButton_5 = new JButton("Science");
			btnNewButton_5.setBackground(cF.btnClr1);
			btnNewButton_5.setFont(new Font("Verdana", Font.PLAIN, 13));
			btnNewButton_5.setBounds(74, 242, 200, 30);
			syllabusTeacher.add(btnNewButton_5);
			
			JButton btnNewButton_6 = new JButton("History");
			btnNewButton_6.setBackground(cF.btnClr1);
			btnNewButton_6.setFont(new Font("Verdana", Font.PLAIN, 13));
			btnNewButton_6.setBounds(74, 270, 200, 30);
			syllabusTeacher.add(btnNewButton_6);
			
			JButton btnNewButton_7 = new JButton("Geography");
			btnNewButton_7.setBackground(cF.btnClr1);
			btnNewButton_7.setFont(new Font("Verdana", Font.PLAIN, 13));
			btnNewButton_7.setBounds(74, 297, 200, 30);
			syllabusTeacher.add(btnNewButton_7);
			
			JLabel lblNewLabel_1_3 = new JLabel("Select Standard");
			lblNewLabel_1_3.setForeground(cF.lbClr);
			lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblNewLabel_1_3.setBounds(74, 91, 133, 27);
			syllabusTeacher.add(lblNewLabel_1_3);
			
			JMenuBar menuBar_1 = new JMenuBar();
			menuBar_1.setBounds(267, 91, 101, 22);
			syllabusTeacher.add(menuBar_1);
			
			JMenu mnNewMenu_1 = new JMenu("Standards");
			menuBar_1.add(mnNewMenu_1);
			
			JMenuItem mntmNewMenuItem_2 = new JMenuItem("5th");
			mnNewMenu_1.add(mntmNewMenuItem_2);
			
			JMenuItem mntmNewMenuItem_1_1 = new JMenuItem("6th");
			mnNewMenu_1.add(mntmNewMenuItem_1_1);
			
			JMenuItem mntmNewMenuItem_2_1 = new JMenuItem("7th");
			mnNewMenu_1.add(mntmNewMenuItem_2_1);
			
			JMenuItem mntmNewMenuItem_3 = new JMenuItem("8th");
			mnNewMenu_1.add(mntmNewMenuItem_3);
			
			JMenuItem mntmNewMenuItem_4 = new JMenuItem("9th");
			mnNewMenu_1.add(mntmNewMenuItem_4);
			
			JMenuItem mntmNewMenuItem_5 = new JMenuItem("10th");
			mnNewMenu_1.add(mntmNewMenuItem_5);
			
			JPanel panel_3 = new JPanel();
			panel_3.setForeground(cF.lbClr);
			panel_3.setBackground(cF.TPanelbg);
			tabbedPane.addTab("Edit", null, panel_3, null);
			panel_3.setLayout(null);
			
			JMenuBar menuBar_2 = new JMenuBar();
			menuBar_2.setBounds(154, 15, 60, 22);
			panel_3.add(menuBar_2);
			
			JMenu mnNewMenu_2 = new JMenu("Standards");
			menuBar_2.add(mnNewMenu_2);
			
			JMenuItem mntmNewMenuItem_6 = new JMenuItem("5th");
			mnNewMenu_2.add(mntmNewMenuItem_6);
			
			JMenuItem mntmNewMenuItem_1_2 = new JMenuItem("6th");
			mnNewMenu_2.add(mntmNewMenuItem_1_2);
			
			JMenuItem mntmNewMenuItem_2_2 = new JMenuItem("7th");
			mnNewMenu_2.add(mntmNewMenuItem_2_2);
			
			JMenuItem mntmNewMenuItem_3_1 = new JMenuItem("8th");
			mnNewMenu_2.add(mntmNewMenuItem_3_1);
			
			JMenuItem mntmNewMenuItem_4_1 = new JMenuItem("9th");
			mnNewMenu_2.add(mntmNewMenuItem_4_1);
			
			JMenuItem mntmNewMenuItem_5_1 = new JMenuItem("10th");
			mnNewMenu_2.add(mntmNewMenuItem_5_1);
			
			JLabel lblNewLabel_1_4 = new JLabel("Select Standard");
			lblNewLabel_1_4.setForeground(cF.lbClr);
			lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD, 15));
			lblNewLabel_1_4.setBounds(10, 10, 133, 27);
			panel_3.add(lblNewLabel_1_4);
			
			JLabel lblSubject = new JLabel("Subject");
			lblSubject.setForeground(cF.lbClr);
			lblSubject.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblSubject.setBounds(10, 89, 84, 20);
			panel_3.add(lblSubject);
			
			JButton btnNewButton = new JButton("Delete");
			btnNewButton.setBackground(cF.btnClr1);
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int result = JOptionPane.showConfirmDialog(null, "Do you want to Delete this Chapter?","Confirmation Message",JOptionPane.YES_NO_OPTION);
					if (result==0) {
						JOptionPane.showMessageDialog(btnNewButton,"Chapter Deleted Succesfully!");
					}
				}
			});
			btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
			btnNewButton.setBounds(331, 122, 85, 21);
			panel_3.add(btnNewButton);
			
			JLabel lblNewLabel_2_3 = new JLabel("English");
			lblNewLabel_2_3.setForeground(cF.lbClr);
			lblNewLabel_2_3.setFont(new Font("Verdana", Font.PLAIN, 11));
			lblNewLabel_2_3.setBounds(21, 119, 76, 22);
			panel_3.add(lblNewLabel_2_3);
			
			JButton btnNewButton_1_3 = new JButton("Delete");
			btnNewButton_1_3.setBackground(cF.btnClr1);
			btnNewButton_1_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int result = JOptionPane.showConfirmDialog(null, "Do you want to Delete this Chapter?","Confirmation Message",JOptionPane.YES_NO_OPTION);
					if (result==0) {
						JOptionPane.showMessageDialog(btnNewButton,"Chapter Deleted Succesfully!");
					}
				}
			});
			btnNewButton_1_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
			btnNewButton_1_3.setBounds(331, 154, 85, 21);
			panel_3.add(btnNewButton_1_3);
			
			JLabel lblNewLabel_2_1_1 = new JLabel("Marathi");
			lblNewLabel_2_1_1.setForeground(cF.lbClr);
			lblNewLabel_2_1_1.setFont(new Font("Verdana", Font.PLAIN, 11));
			lblNewLabel_2_1_1.setBounds(21, 153, 76, 22);
			panel_3.add(lblNewLabel_2_1_1);
			
			JButton btnNewButton_8 = new JButton("Edit Syllabus");
			btnNewButton_8.setBackground(cF.btnClr1);
			btnNewButton_8.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(btnNewButton_8,"Syllabus editted succesfully!!!");
				}
			});
			btnNewButton_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
			btnNewButton_8.setBounds(377, 10, 147, 27);
			panel_3.add(btnNewButton_8);
			
			JLabel lblNewLabel_1_1_2 = new JLabel("Select Subjects");
			lblNewLabel_1_1_2.setForeground(cF.lbClr);
			lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 15));
			lblNewLabel_1_1_2.setBounds(11, 47, 133, 27);
			panel_3.add(lblNewLabel_1_1_2);
			
			JMenuBar menuBar_1_1 = new JMenuBar();
			menuBar_1_1.setBounds(154, 47, 60, 22);
			panel_3.add(menuBar_1_1);
			
			JMenu mnNewMenu_1_1 = new JMenu("Subjects");
			menuBar_1_1.add(mnNewMenu_1_1);
			
			JMenuItem mntmNewMenuItem_6_1 = new JMenuItem("English");
			mnNewMenu_1_1.add(mntmNewMenuItem_6_1);
			
			JMenuItem mntmNewMenuItem_7 = new JMenuItem("Marathi");
			mnNewMenu_1_1.add(mntmNewMenuItem_7);
			
			JMenuItem mntmNewMenuItem_8 = new JMenuItem("Sanskrit");
			mnNewMenu_1_1.add(mntmNewMenuItem_8);
			
			JMenuItem mntmNewMenuItem_9 = new JMenuItem("Maths");
			mnNewMenu_1_1.add(mntmNewMenuItem_9);
			
			JMenuItem mntmNewMenuItem_10 = new JMenuItem("Science");
			mnNewMenu_1_1.add(mntmNewMenuItem_10);
			
			JMenuItem mntmNewMenuItem_11 = new JMenuItem("History");
			mnNewMenu_1_1.add(mntmNewMenuItem_11);
			
			JMenuItem mntmNewMenuItem_12 = new JMenuItem("Geography");
			mnNewMenu_1_1.add(mntmNewMenuItem_12);
			
			JLabel lblChapter = new JLabel("Chapter");
			lblChapter.setForeground(cF.lbClr);
			lblChapter.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblChapter.setBounds(168, 89, 84, 20);
			panel_3.add(lblChapter);
			
			JLabel lblNewLabel_2_2_1 = new JLabel("Prepositions");
			lblNewLabel_2_2_1.setForeground(cF.lbClr);
			lblNewLabel_2_2_1.setFont(new Font("Verdana", Font.PLAIN, 11));
			lblNewLabel_2_2_1.setBounds(179, 119, 76, 22);
			panel_3.add(lblNewLabel_2_2_1);
			
			JLabel lblNewLabel_2_1_1_1 = new JLabel("Nibandh");
			lblNewLabel_2_1_1_1.setForeground(cF.lbClr);
			lblNewLabel_2_1_1_1.setFont(new Font("Verdana", Font.PLAIN, 11));
			lblNewLabel_2_1_1_1.setBounds(179, 153, 76, 22);
			panel_3.add(lblNewLabel_2_1_1_1);
			
			JButton btnNewButton_8_1 = new JButton("Add Chapter");
			btnNewButton_8_1.setBackground(cF.btnClr1);
			btnNewButton_8_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					addChapters aC = new addChapters();
					aC.setVisible(true);
					setVisible(false);
				}
			});
			btnNewButton_8_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
			btnNewButton_8_1.setBounds(534, 10, 147, 27);
			panel_3.add(btnNewButton_8_1);
		
		JLabel lblNewLabel = new JLabel("Teacher1");
		lblNewLabel.setForeground(cF.lbClr);
		lblNewLabel.setBounds(521, 4, 125, 22);
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 14));
		contentPane.add(lblNewLabel);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(cF.btnClr1);
		menuBar.setBounds(650, 4, 50, 25);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Menu");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Change Password");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changePwdTeacher cpT = new changePwdTeacher();
				cpT.setVisible(true);
				setVisible(false);
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("My Profile");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myProfileTeacher mpT = new myProfileTeacher();
				mpT.setVisible(true);
				setVisible(false);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_13 = new JMenuItem("Log Out");
		mntmNewMenuItem_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginPage lP = new LoginPage();
				lP.setVisible(true);
				setVisible(false);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_13);
		menuBar.setVisible(true);
	setVisible(true);
		
	}
}
