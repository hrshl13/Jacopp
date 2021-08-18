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

public class changePwdStudent extends JFrame {

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
					changePwdStudent frame = new changePwdStudent();
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
	public changePwdStudent() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 740, 445);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Change Password");
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 18));
		lblNewLabel.setBounds(265, 114, 224, 32);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Current Password");
		lblNewLabel_1.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(161, 168, 134, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New Password");
		lblNewLabel_2.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(161, 205, 134, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Confirm New Password");
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
		
		char[] currentpassword=currentPwdTF.getPassword();
		char[] newpassword = newpwdTF.getPassword();
		char[] confirmpassword = confirmNPwd.getPassword();
		
		JButton btnNewButton = new JButton("Change Password");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (currentpassword!=newpassword) {
					if (newpassword==confirmpassword) {
						JOptionPane.showMessageDialog(btnNewButton,"Password changed successfully!!");
						LoginPage lp = new LoginPage();
						lp.setVisible(true);
						setVisible(false);
					}
					else {
						JOptionPane.showMessageDialog(btnNewButton,"Confirm Password and New Password are not same!!");
					}
					
			}
				else {
					JOptionPane.showMessageDialog(btnNewButton,"Current and New Passwords are same!!");
				}
		}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(287, 295, 165, 32);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				homePageStudent hP = new homePageStudent();
				hP.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_1.setBounds(10, 10, 85, 21);
		contentPane.add(btnNewButton_1);
	}
}
