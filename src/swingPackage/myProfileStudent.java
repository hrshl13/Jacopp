package swingPackage;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class myProfileStudent extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new myProfileStudent();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public myProfileStudent() {
		colorsFile cF = new colorsFile();
		setTitle("My Profile-Student1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 740, 445);
		contentPane = new JPanel();
		contentPane.setBackground(cF.bg);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("My Profile");
		lblNewLabel.setForeground(cF.lbClr);
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 18));
		lblNewLabel.setBounds(321, 92, 123, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("User ID : ");
		lblNewLabel_1.setForeground(cF.lbClr);
		lblNewLabel_1.setFont(new Font("Verdana", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(265, 132, 95, 23);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("user5918");
		lblNewLabel_2.setForeground(cF.lbClr);
		lblNewLabel_2.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(426, 132, 75, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Name : ");
		lblNewLabel_3.setForeground(cF.lbClr);
		lblNewLabel_3.setFont(new Font("Verdana", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(275, 175, 83, 13);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Student1");
		lblNewLabel_4.setForeground(cF.lbClr);
		lblNewLabel_4.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblNewLabel_4.setBounds(426, 175, 131, 13);
		contentPane.add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.setBackground(cF.btnClr1);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				homePageStudent h = new homePageStudent();
				h.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton.setBounds(10, 10, 63, 21);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_5 = new JLabel("DOB : ");
		lblNewLabel_5.setForeground(cF.lbClr);
		lblNewLabel_5.setFont(new Font("Verdana", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(287, 212, 67, 13);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("26/09/2002");
		lblNewLabel_6.setForeground(cF.lbClr);
		lblNewLabel_6.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblNewLabel_6.setBounds(426, 212, 95, 13);
		contentPane.add(lblNewLabel_6);
	}
}
