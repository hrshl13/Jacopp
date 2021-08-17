package swingPackage;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;

public class teacherAssgn extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					teacherAssgn frame = new teacherAssgn();
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
	public teacherAssgn() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 740, 445);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, Color.DARK_GRAY, Color.GRAY, null, null));
		panel.setBounds(102, 40, 524, 96);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Show Result");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.setBounds(394, 65, 120, 21);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("Practical 4: Panel Examples");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 15, 189, 26);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Try using multiple Panels in a Frame");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(116, 51, 241, 21);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Java Core");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(10, 69, 66, 13);
		panel.add(lblNewLabel_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.RAISED, Color.DARK_GRAY, Color.GRAY, null, null));
		panel_1.setBounds(102, 146, 524, 96);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton_1_1 = new JButton("Show Result");
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1_1.setBounds(394, 65, 120, 21);
		panel_1.add(btnNewButton_1_1);
		
		JLabel lblPracticalTrigger = new JLabel("Practical 5: Trigger Problems");
		lblPracticalTrigger.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPracticalTrigger.setBounds(10, 10, 189, 26);
		panel_1.add(lblPracticalTrigger);
		
		JLabel lblNewLabel_1_1 = new JLabel("Execute Trigger based problems in PL/SQL");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(120, 46, 241, 21);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("DBMS");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2_1.setBounds(10, 73, 66, 13);
		panel_1.add(lblNewLabel_2_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.RAISED, Color.DARK_GRAY, Color.GRAY, null, null));
		panel_2.setBounds(102, 252, 524, 96);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewButton_1_2 = new JButton("Show Result");
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1_2.setBounds(394, 65, 120, 21);
		panel_2.add(btnNewButton_1_2);
		
		JLabel lblInnovativePracticalCreate = new JLabel("Innovative Practical");
		lblInnovativePracticalCreate.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblInnovativePracticalCreate.setBounds(10, 10, 189, 26);
		panel_2.add(lblInnovativePracticalCreate);
		
		JLabel lblNewLabel_1_2 = new JLabel("Create a GUI Application of School Management system");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2.setBounds(63, 46, 317, 21);
		panel_2.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_2_2 = new JLabel("Java Core");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2_2.setBounds(10, 73, 66, 13);
		panel_2.add(lblNewLabel_2_2);
		
		JButton btnNewButton = new JButton("Add Assignment");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(300, 10, 157, 21);
		contentPane.add(btnNewButton);
	}
}
