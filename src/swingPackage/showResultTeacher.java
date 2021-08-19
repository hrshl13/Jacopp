package swingPackage;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class showResultTeacher extends JFrame {

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
					showResultTeacher frame = new showResultTeacher();
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
	public showResultTeacher() {
		colorsFile cF = new colorsFile();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 740, 445);
		contentPane = new JPanel();
		contentPane.setBackground(cF.bg);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("List of submissions");
		lblNewLabel.setForeground(cF.lbClr);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(28, 10, 267, 35);
		contentPane.add(lblNewLabel);	
		
		JButton btnNewButton_1 = new JButton("Submit");
		btnNewButton_1.setBackground(cF.btnClr1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				homePageTeacher hpT = new homePageTeacher();
				hpT.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1.setBounds(498, 19, 85, 21);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("Student ID");
		lblNewLabel_1.setForeground(cF.lbClr);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(38, 55, 75, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Student Name");
		lblNewLabel_2.setForeground(cF.lbClr);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(169, 55, 95, 16);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(311, 85, 96, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Add Marks");
		lblNewLabel_3.setForeground(cF.lbClr);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(320, 55, 75, 16);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_5 = new JLabel("user5918");
		lblNewLabel_5.setForeground(cF.lbClr);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_5.setBounds(38, 88, 70, 16);
		contentPane.add(lblNewLabel_5);
		
		textField_1 = new JTextField();
		textField_1.setBounds(311, 132, 96, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Student1");
		lblNewLabel_4.setForeground(cF.lbClr);
		lblNewLabel_4.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_4.setBounds(164, 88, 100, 16);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5_1 = new JLabel("user5919");
		lblNewLabel_5_1.setForeground(cF.lbClr);
		lblNewLabel_5_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_5_1.setBounds(38, 135, 70, 16);
		contentPane.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("Student2");
		lblNewLabel_4_1.setForeground(cF.lbClr);
		lblNewLabel_4_1.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_4_1.setBounds(164, 135, 100, 16);
		contentPane.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("Marks");
		lblNewLabel_3_1.setForeground(cF.lbClr);
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3_1.setBounds(457, 55, 75, 16);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_4_2 = new JLabel(" ");
		lblNewLabel_4_2.setForeground(cF.lbClr);
		lblNewLabel_4_2.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_4_2.setBounds(444, 81, 100, 16);
		contentPane.add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_4_3 = new JLabel(" ");
		lblNewLabel_4_3.setForeground(cF.lbClr);
		lblNewLabel_4_3.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_4_3.setBounds(444, 135, 100, 16);
		contentPane.add(lblNewLabel_4_3);
		
		JButton btnNewButton_1_1 = new JButton("Done");
		btnNewButton_1_1.setBackground(cF.btnClr1);
		btnNewButton_1_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lblNewLabel_4_2.setText(textField.getText());
				lblNewLabel_4_3.setText(textField_1.getText());
			}
		});
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1_1.setBounds(608, 55, 85, 21);
		contentPane.add(btnNewButton_1_1);
		
		
	}
}
