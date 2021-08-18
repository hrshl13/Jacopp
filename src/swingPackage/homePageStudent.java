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
import javax.swing.JMenuBar;

public class homePageStudent extends JFrame {

	private JPanel contentPane;
	private final JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new homePageStudent();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	public homePageStudent() {
		Runtime r = Runtime.getRuntime();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 740, 445);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
		tabbedPane.setBounds(10, 29, 716, 392);
		contentPane.add(tabbedPane);
		LoginPage lp = new LoginPage();
		
		JPanel homeTabPanel = new JPanel();
		tabbedPane.addTab("Home", null, homeTabPanel, null);
		
		JButton paintButton = new JButton("Paint");
		paintButton.setBounds(112, 185, 240, 100);
		paintButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				      Process p = r.exec("mspaint.exe");
				      p.waitFor();
				    } catch (IOException | InterruptedException ie) {
				      ie.printStackTrace();
				    }
			}
		});
		homeTabPanel.setLayout(null);
		paintButton.setFont(new Font("Verdana", Font.PLAIN, 15));
		homeTabPanel.add(paintButton);
		
		JButton toDoButton = new JButton("To Do List");
		toDoButton.setBounds(112, 83, 240, 100);
		toDoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				toDoList todo = new toDoList();
				todo.setVisible(true);
			}
		});
		toDoButton.setFont(new Font("Verdana", Font.PLAIN, 15));
		homeTabPanel.add(toDoButton);
		
		JButton notePadButton = new JButton("Notepad");
		notePadButton.setBounds(354, 83, 240, 100);
		notePadButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				      Process p = r.exec("notepad.exe");
				      p.waitFor();
				    } catch (IOException | InterruptedException ie) {
				      ie.printStackTrace();
				    }
			}
		});
		notePadButton.setFont(new Font("Verdana", Font.PLAIN, 15));
		homeTabPanel.add(notePadButton);
		
		JButton calciButton = new JButton("Calculator");
		calciButton.setBounds(354, 187, 240, 100);
		calciButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				      Process p = r.exec("calc");
				      p.waitFor();
				    } catch (IOException | InterruptedException ie) {
				      ie.printStackTrace();
				    }
			}
		});
		calciButton.setFont(new Font("Verdana", Font.PLAIN, 15));
		homeTabPanel.add(calciButton);

			JPanel assgnStudent = new JPanel();
			tabbedPane.addTab("Assignment", null, assgnStudent, null);
			assgnStudent.setLayout(null);
			
			JLabel lblNewLabel_1 = new JLabel("No Assignments as of now!!!");
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1.setFont(new Font("Verdana", Font.BOLD, 18));
			lblNewLabel_1.setBounds(99, 40, 542, 38);
			assgnStudent.add(lblNewLabel_1);
			
			JPanel syllabusStudent = new JPanel();
			tabbedPane.addTab("Syllabus", null, syllabusStudent, null);
			syllabusStudent.setLayout(null);
			
			JButton btnNewButton_1 = new JButton("English");
			btnNewButton_1.setFont(new Font("Verdana", Font.PLAIN, 13));
			btnNewButton_1.setBounds(281, 10, 200, 30);
			syllabusStudent.add(btnNewButton_1);
			
			JButton btnNewButton_2 = new JButton("Marathi");
			btnNewButton_2.setFont(new Font("Verdana", Font.PLAIN, 13));
			btnNewButton_2.setBounds(281, 60, 200, 30);
			syllabusStudent.add(btnNewButton_2);
			
			JButton btnNewButton_3 = new JButton("Sanskrit");
			btnNewButton_3.setFont(new Font("Verdana", Font.PLAIN, 13));
			btnNewButton_3.setBounds(281, 112, 200, 30);
			syllabusStudent.add(btnNewButton_3);
			
			JButton btnNewButton_4 = new JButton("Maths");
			btnNewButton_4.setFont(new Font("Verdana", Font.PLAIN, 13));
			btnNewButton_4.setBounds(281, 164, 200, 30);
			syllabusStudent.add(btnNewButton_4);
			
			JButton btnNewButton_5 = new JButton("Science");
			btnNewButton_5.setFont(new Font("Verdana", Font.PLAIN, 13));
			btnNewButton_5.setBounds(281, 214, 200, 30);
			syllabusStudent.add(btnNewButton_5);
			
			JButton btnNewButton_6 = new JButton("History");
			btnNewButton_6.setFont(new Font("Verdana", Font.PLAIN, 13));
			btnNewButton_6.setBounds(281, 274, 200, 30);
			syllabusStudent.add(btnNewButton_6);
			
			JButton btnNewButton_7 = new JButton("Geography");
			btnNewButton_7.setFont(new Font("Verdana", Font.PLAIN, 13));
			btnNewButton_7.setBounds(281, 325, 200, 30);
			syllabusStudent.add(btnNewButton_7);
		
		JLabel lblNewLabel = new JLabel("Student1");
		lblNewLabel.setBounds(521, 4, 125, 22);
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 14));
		contentPane.add(lblNewLabel);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(650, 4, 50, 25);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Menu");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Change Password");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changePwdStudent cp = new changePwdStudent();
				cp.setVisible(true);
				setVisible(false);
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("My Profile");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myProfileStudent mPS = new myProfileStudent();
				mPS.setVisible(true);
				setVisible(false);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);
		menuBar.setVisible(true);
	setVisible(true);
		
	}
}
