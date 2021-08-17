package swingPackage;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class toDoList extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					toDoList frame = new toDoList();
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
	public toDoList() {
		setTitle("To Do List");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 740, 445);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JCheckBox checkbox1 = new JCheckBox("Java Swing Project");
		checkbox1.setFont(new Font("Verdana", Font.PLAIN, 13));
		checkbox1.setBounds(5, 5, 716, 21);
		contentPane.add(checkbox1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Git Java Innovative Practical");
		chckbxNewCheckBox.setFont(new Font("Verdana", Font.PLAIN, 13));
		chckbxNewCheckBox.setBounds(6, 34, 242, 21);
		contentPane.add(chckbxNewCheckBox);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				homePage home1 = new homePage();
				home1.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Verdana", Font.PLAIN, 13));
		btnNewButton.setBounds(10, 377, 85, 21);
		contentPane.add(btnNewButton);
	}
}
