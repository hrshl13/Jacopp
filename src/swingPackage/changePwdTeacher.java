package swingPackage;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class changePwdTeacher extends JFrame {

	private JPanel contentPane;
	private JPasswordField currentPwdTF;
	private JPasswordField newpwdTF;
	private JPasswordField confirmNPwd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new changePwdStudent();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public changePwdTeacher() {
		colorsFile cF = new colorsFile(); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Change Password");
		setBounds(100, 100, 740, 445);
		contentPane = new JPanel();
		contentPane.setBackground(cF.bg);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Change Password");
		lblNewLabel.setForeground(cF.lbClr);
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 18));
		lblNewLabel.setBounds(265, 114, 224, 32);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Current Password");
		lblNewLabel_1.setForeground(cF.lbClr);
		lblNewLabel_1.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(161, 168, 134, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New Password");
		lblNewLabel_2.setForeground(cF.lbClr);
		lblNewLabel_2.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(161, 205, 134, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Confirm New Password");
		lblNewLabel_3.setForeground(cF.lbClr);
		lblNewLabel_3.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblNewLabel_3.setBounds(161, 243, 165, 13);
		contentPane.add(lblNewLabel_3);
		
		currentPwdTF = new JPasswordField();
		currentPwdTF.setBounds(380, 165, 142, 19);
		contentPane.add(currentPwdTF);
		
		newpwdTF = new JPasswordField();
		newpwdTF.setBounds(380, 202, 142, 19);
		contentPane.add(newpwdTF);
		
		confirmNPwd = new JPasswordField();
		confirmNPwd.setBounds(380, 240, 142, 19);
		contentPane.add(confirmNPwd);
		
		String currentpassword=currentPwdTF.getText();
		String newpassword = newpwdTF.getText();
		String confirmpassword = confirmNPwd.getText();
		
		JButton btnNewButton = new JButton("Change Password");
		btnNewButton.setBackground(cF.btnClr1);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				@SuppressWarnings("deprecation")
				String currentpassword=currentPwdTF.getText();
				@SuppressWarnings("deprecation")
				String newpassword = newpwdTF.getText();
				@SuppressWarnings("deprecation")
				String confirmpassword = confirmNPwd.getText();
				if (newpassword.equals(currentpassword)) {
					JOptionPane.showMessageDialog(btnNewButton,"Current and New Passwords are same!!");
					}
					else {
						if (newpassword.equals(confirmpassword)) {
							JOptionPane.showMessageDialog(btnNewButton,"Password changed successfully!!");
							LoginPage lp = new LoginPage();
							lp.setVisible(true);
							setVisible(false);
					}
						else {
							JOptionPane.showMessageDialog(btnNewButton,"Confirm Password and New Password are not same!!");
						}
					
					}	
		}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(287, 295, 165, 32);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.setBackground(cF.btnClr1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				homePageTeacher hPT = new homePageTeacher();
				hPT.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_1.setBounds(10, 10, 85, 21);
		contentPane.add(btnNewButton_1);
	}
}
