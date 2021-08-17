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

public class homePage extends JFrame {

	private JPanel contentPane;
	private final JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					homePage frame = new homePage();
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
	public homePage() {
		Runtime r = Runtime.getRuntime();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 740, 445);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 6, 706, 398);
		contentPane.add(tabbedPane);
		
		JPanel panel1 = new JPanel();
		tabbedPane.addTab("Home", null, panel1, null);
		panel1.setLayout(null);
		
		JButton paintButton = new JButton("Paint");
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
		paintButton.setFont(new Font("Verdana", Font.PLAIN, 15));
		paintButton.setBounds(112, 185, 240, 100);
		panel1.add(paintButton);
		
		JButton toDoButton = new JButton("To Do List");
		toDoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				toDoList todo = new toDoList();
				todo.setVisible(true);
			}
		});
		toDoButton.setFont(new Font("Verdana", Font.PLAIN, 15));
		toDoButton.setBounds(112, 83, 240, 100);
		panel1.add(toDoButton);
		
		JButton notePadButton = new JButton("Notepad");
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
		notePadButton.setBounds(354, 83, 240, 100);
		panel1.add(notePadButton);
		
		JButton calciButton = new JButton("Calculator");
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
		calciButton.setBounds(354, 187, 240, 100);
		panel1.add(calciButton);
		
		JPanel panel2 = new JPanel();
		tabbedPane.addTab("Assignment", null, panel2, null);
		panel2.setLayout(null);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.setBounds(10, 10, 67, 25);
		btnNewButton.setFont(new Font("Verdana", Font.BOLD, 13));
		panel2.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("No Assignments as of now!!!");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Verdana", Font.BOLD, 18));
		lblNewLabel_1.setBounds(99, 40, 542, 38);
		panel2.add(lblNewLabel_1);
		
		JPanel panel3 = new JPanel();
		tabbedPane.addTab("Syllabus", null, panel3, null);
		
		JLabel lblNewLabel = new JLabel("Harshal Gondkar");
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblNewLabel.setBounds(450, 7, 122, 13);
		contentPane.add(lblNewLabel);
		
		JMenu mnNewMenu = new JMenu("Menu");
		mnNewMenu.setHorizontalAlignment(SwingConstants.CENTER);
		mnNewMenu.setFont(new Font("Roboto Slab ExtraBold", Font.PLAIN, 14));
		mnNewMenu.setBounds(600, 0, 100, 25);
		contentPane.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("My Profile");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Change Password");
		mnNewMenu.add(mntmNewMenuItem_1);
	}
}
