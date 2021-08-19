package swingPackage;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JMenuBar;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class homePagePrincipal extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					homePagePrincipal frame = new homePagePrincipal();
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
	public homePagePrincipal() {
		colorsFile cF = new colorsFile();
		setTitle("Dashboard");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 740, 445);
		contentPane = new JPanel();
		contentPane.setBackground(cF.bg);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 26, 726, 382);
		contentPane.add(tabbedPane);
		
		JPanel editFacultyPanel = new JPanel();
		editFacultyPanel.setBackground(cF.TPanelbg);
		tabbedPane.addTab("Edit Faculty Info", null, editFacultyPanel, null);
		editFacultyPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Faculty Info");
		lblNewLabel.setForeground(cF.lbClr);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(310, 10, 158, 33);
		editFacultyPanel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Search : ");
		lblNewLabel_1.setForeground(cF.lbClr);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(180, 73, 76, 16);
		editFacultyPanel.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(266, 73, 146, 19);
		editFacultyPanel.add(textField);
		
		JButton btnNewButton = new JButton("Add New");
		btnNewButton.setBackground(cF.btnClr1);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addFaculty aF = new addFaculty();
				aF.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton.setBounds(433, 72, 102, 21);
		editFacultyPanel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Search");
		btnNewButton_1.setBackground(cF.btnClr1);
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_1.setBounds(170, 118, 85, 21);
		editFacultyPanel.add(btnNewButton_1);
		
		JPanel editStudentPanel = new JPanel();
		editStudentPanel.setBackground(cF.TPanelbg);
		tabbedPane.addTab("Edit Student Info", null, editStudentPanel, null);
		editStudentPanel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Student Info");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(310, 10, 158, 33);
		editStudentPanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("Search : ");
		lblNewLabel_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_1.setBounds(180, 73, 76, 16);
		editStudentPanel.add(lblNewLabel_1_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(266, 73, 146, 19);
		editStudentPanel.add(textField_1);
		
		JButton btnNewButton_2 = new JButton("Add New");
		btnNewButton_2.setBackground(cF.btnClr1);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addStudent aS = new addStudent();
				aS.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_2.setBounds(433, 72, 104, 21);
		editStudentPanel.add(btnNewButton_2);
		
		JButton btnNewButton_1_1 = new JButton("Search");
		btnNewButton_1_1.setBackground(cF.btnClr1);
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_1_1.setBounds(170, 118, 85, 21);
		editStudentPanel.add(btnNewButton_1_1);
		
		JPanel editSubjectsPanel = new JPanel();
		editSubjectsPanel.setBackground(cF.TPanelbg);
		tabbedPane.addTab("Edit Subject Info", null, editSubjectsPanel, null);
		editSubjectsPanel.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(270, 25, 101, 22);
		editSubjectsPanel.add(menuBar);
		
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
		
		JLabel lblNewLabel_1_2 = new JLabel("Select Standard");
		lblNewLabel_1_2.setForeground(cF.lbClr);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_2.setBounds(126, 20, 133, 27);
		editSubjectsPanel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_3 = new JLabel("Subject Code");
		lblNewLabel_3.setForeground(cF.lbClr);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(139, 81, 101, 20);
		editSubjectsPanel.add(lblNewLabel_3);
		
		JLabel lblSubject = new JLabel("Subject");
		lblSubject.setForeground(cF.lbClr);
		lblSubject.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSubject.setBounds(280, 81, 84, 20);
		editSubjectsPanel.add(lblSubject);
		
		JButton btnNewButton_3 = new JButton("Delete");
		btnNewButton_3.setBackground(cF.btnClr1);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(btnNewButton_3,"Do you want to delete this subject??","Confirmation Message",JOptionPane.YES_NO_OPTION);
				if (result==0) {
					JOptionPane.showMessageDialog(btnNewButton_3, "Subject deleted successfully!");
					}
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_3.setBounds(447, 112, 85, 21);
		editSubjectsPanel.add(btnNewButton_3);
		
		JLabel lblNewLabel_2_1 = new JLabel("English");
		lblNewLabel_2_1.setForeground(cF.lbClr);
		lblNewLabel_2_1.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_2_1.setBounds(290, 111, 76, 22);
		editSubjectsPanel.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("sub1");
		lblNewLabel_3_1.setForeground(cF.lbClr);
		lblNewLabel_3_1.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_3_1.setBounds(163, 117, 45, 13);
		editSubjectsPanel.add(lblNewLabel_3_1);
		
		JButton btnNewButton_1_2 = new JButton("Delete");
		btnNewButton_1_2.setBackground(cF.btnClr1);
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(btnNewButton_3,"Do you want to delete this subject??","Confirmation Message",JOptionPane.YES_NO_OPTION);
				if (result==0) {
					JOptionPane.showMessageDialog(btnNewButton_3, "Subject deleted successfully!");
					}	
			}
		});
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_1_2.setBounds(447, 144, 85, 21);
		editSubjectsPanel.add(btnNewButton_1_2);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Marathi");
		lblNewLabel_2_1_1.setForeground(cF.lbClr);
		lblNewLabel_2_1_1.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_2_1_1.setBounds(290, 143, 76, 22);
		editSubjectsPanel.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("sub2");
		lblNewLabel_3_1_1.setForeground(cF.lbClr);
		lblNewLabel_3_1_1.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_3_1_1.setBounds(163, 149, 45, 13);
		editSubjectsPanel.add(lblNewLabel_3_1_1);
		
		JButton btnNewButton_2_1 = new JButton("Delete");
		btnNewButton_2_1.setBackground(cF.btnClr1);
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(btnNewButton_3,"Do you want to delete this subject??","Confirmation Message",JOptionPane.YES_NO_OPTION);
				if (result==0) {
					JOptionPane.showMessageDialog(btnNewButton_3, "Subject deleted successfully!");
					}
			}
		});
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_2_1.setBounds(447, 179, 85, 21);
		editSubjectsPanel.add(btnNewButton_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Sanskrit");
		lblNewLabel_2_2.setForeground(cF.lbClr);
		lblNewLabel_2_2.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_2_2.setBounds(290, 178, 76, 22);
		editSubjectsPanel.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_3_2 = new JLabel("sub3");
		lblNewLabel_3_2.setForeground(cF.lbClr);
		lblNewLabel_3_2.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_3_2.setBounds(163, 184, 45, 13);
		editSubjectsPanel.add(lblNewLabel_3_2);
		
		JButton btnNewButton_3_1 = new JButton("Delete");
		btnNewButton_3_1.setBackground(cF.btnClr1);
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(btnNewButton_3,"Do you want to delete this subject??","Confirmation Message",JOptionPane.YES_NO_OPTION);
				if (result==0) {
					JOptionPane.showMessageDialog(btnNewButton_3, "Subject deleted successfully!");
					}
			}
		});
		btnNewButton_3_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_3_1.setBounds(447, 211, 85, 21);
		editSubjectsPanel.add(btnNewButton_3_1);
		
		JLabel lblNewLabel_2_3 = new JLabel("Maths");
		lblNewLabel_2_3.setForeground(cF.lbClr);
		lblNewLabel_2_3.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_2_3.setBounds(290, 210, 76, 22);
		editSubjectsPanel.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_3_3 = new JLabel("sub4");
		lblNewLabel_3_3.setForeground(cF.lbClr);
		lblNewLabel_3_3.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_3_3.setBounds(163, 216, 45, 13);
		editSubjectsPanel.add(lblNewLabel_3_3);
		
		JButton btnNewButton_4 = new JButton("Delete");
		btnNewButton_4.setBackground(cF.btnClr1);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(btnNewButton_3,"Do you want to delete this subject??","Confirmation Message",JOptionPane.YES_NO_OPTION);
				if (result==0) {
					JOptionPane.showMessageDialog(btnNewButton_3, "Subject deleted successfully!");
					}
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_4.setBounds(447, 243, 85, 21);
		editSubjectsPanel.add(btnNewButton_4);
		
		JLabel lblNewLabel_2_4 = new JLabel("Science");
		lblNewLabel_2_4.setForeground(cF.lbClr);
		lblNewLabel_2_4.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_2_4.setBounds(290, 242, 76, 22);
		editSubjectsPanel.add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_3_4 = new JLabel("sub5");
		lblNewLabel_3_4.setForeground(cF.lbClr);
		lblNewLabel_3_4.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_3_4.setBounds(163, 248, 45, 13);
		editSubjectsPanel.add(lblNewLabel_3_4);
		
		JButton btnNewButton_5 = new JButton("Delete");
		btnNewButton_5.setBackground(cF.btnClr1);
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(btnNewButton_3,"Do you want to delete this subject??","Confirmation Message",JOptionPane.YES_NO_OPTION);
				if (result==0) {
					JOptionPane.showMessageDialog(btnNewButton_3, "Subject deleted successfully!");
					}
			}
		});
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_5.setBounds(447, 275, 85, 21);
		editSubjectsPanel.add(btnNewButton_5);
		
		JLabel lblNewLabel_2_5 = new JLabel("History");
		lblNewLabel_2_5.setForeground(cF.lbClr);
		lblNewLabel_2_5.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_2_5.setBounds(290, 274, 76, 22);
		editSubjectsPanel.add(lblNewLabel_2_5);
		
		JLabel lblNewLabel_3_5 = new JLabel("sub6");
		lblNewLabel_3_5.setForeground(cF.lbClr);
		lblNewLabel_3_5.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_3_5.setBounds(163, 280, 45, 13);
		editSubjectsPanel.add(lblNewLabel_3_5);
		
		JButton btnNewButton_6 = new JButton("Delete");
		btnNewButton_6.setBackground(cF.btnClr1);
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(btnNewButton_3,"Do you want to delete this subject??","Confirmation Message",JOptionPane.YES_NO_OPTION);
				if (result==0) {
					JOptionPane.showMessageDialog(btnNewButton_3, "Subject deleted successfully!");
					}
			}
		});
		btnNewButton_6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_6.setBounds(447, 307, 85, 21);
		editSubjectsPanel.add(btnNewButton_6);
		
		JLabel lblNewLabel_2_6 = new JLabel("Geography");
		lblNewLabel_2_6.setForeground(cF.lbClr);
		lblNewLabel_2_6.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_2_6.setBounds(290, 306, 76, 22);
		editSubjectsPanel.add(lblNewLabel_2_6);
		
		JLabel lblNewLabel_3_6 = new JLabel("sub7");
		lblNewLabel_3_6.setForeground(cF.lbClr);
		lblNewLabel_3_6.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_3_6.setBounds(163, 312, 45, 13);
		editSubjectsPanel.add(lblNewLabel_3_6);
		
		JButton btnNewButton_8 = new JButton("Save");
		btnNewButton_8.setBackground(cF.btnClr1);
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btnNewButton_8, "Syllabus saved successfully!!");
			}
		});
		btnNewButton_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_8.setBounds(493, 0, 147, 27);
		editSubjectsPanel.add(btnNewButton_8);
		
		JButton btnNewButton_7 = new JButton("Add Subject");
		btnNewButton_7.setBackground(cF.btnClr1);
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addSubjects aS = new addSubjects();
				aS.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_7.setBounds(493, 25, 147, 27);
		editSubjectsPanel.add(btnNewButton_7);
		
		JLabel lblNewLabel_4 = new JLabel("Principal");
		lblNewLabel_4.setForeground(cF.lbClr);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(551, 0, 81, 32);
		contentPane.add(lblNewLabel_4);
		
		JMenuBar menuBar_1 = new JMenuBar();
		menuBar_1.setBounds(640, 5, 50, 25);
		contentPane.add(menuBar_1);
		
		JMenu mnNewMenu_1 = new JMenu("Menu");
		menuBar_1.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("Change Password");
		mntmNewMenuItem_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changePwdPrincipal cPP = new changePwdPrincipal();
				cPP.setVisible(true);
				setVisible(false);
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_6);
		
		JMenuItem mntmNewMenuItem_7 = new JMenuItem("My Profile");
		mntmNewMenuItem_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myProfilePrincipal mPP = new myProfilePrincipal();
				mPP.setVisible(true);
				setVisible(false);
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_7);
	}
}
