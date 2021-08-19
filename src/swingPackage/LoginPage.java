package swingPackage;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.Color;

public class LoginPage extends JFrame {

	private JPanel contentPane;
	private JTextField useridTF;
	private JPasswordField passwordFieldLogin;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage frame = new LoginPage();
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

	public LoginPage() {
		colorsFile cF = new colorsFile();
		setTitle("Login Page");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 740, 445);    // Dims for the whole app is 740,445
		contentPane = new JPanel();
		contentPane.setBackground(cF.bg);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel H1 = new JLabel("High School");
		H1.setForeground(cF.lbClr);
		H1.setBounds(66, 89, 589, 134);
		H1.setHorizontalAlignment(SwingConstants.CENTER);
		H1.setFont(new Font("Verdana", Font.PLAIN, 24));
		contentPane.add(H1);
		
		JLabel H2 = new JLabel("Login");
		H2.setForeground(cF.lbClr);
		H2.setBounds(76, 169, 560, 86);
		H2.setFont(new Font("Verdana", Font.PLAIN, 14));
		H2.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(H2);
		
		JLabel userIDLabel = new JLabel("User ID :  ");
		userIDLabel.setForeground(cF.lbClr);
		userIDLabel.setFont(new Font("Verdana", Font.PLAIN, 12));
		userIDLabel.setHorizontalAlignment(SwingConstants.CENTER);
		userIDLabel.setBounds(194, 233, 140, 41);
		contentPane.add(userIDLabel);
		
		JLabel lblNewLabel = new JLabel("Password : ");
		lblNewLabel.setForeground(cF.lbClr);
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblNewLabel.setBounds(218, 279, 80, 13);
		contentPane.add(lblNewLabel);
		
		useridTF = new JTextField();
		useridTF.setBounds(313, 245, 96, 19);
		contentPane.add(useridTF);
		useridTF.setColumns(10);
		
		passwordFieldLogin = new JPasswordField();
		passwordFieldLogin.setBounds(313, 277, 96, 19);
		contentPane.add(passwordFieldLogin);
		
		
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.setBackground(cF.btnClr1);
		btnNewButton.setFont(new Font("Verdana", Font.PLAIN, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String inputUsername = useridTF.getText();
				@SuppressWarnings("deprecation")
				String inputPassword = passwordFieldLogin.getText();
				if(inputUsername.equals("user1") && inputPassword.equals("usr1pwd")) {
					homePageStudent home = new homePageStudent();
					home.setVisible(true);
					setVisible(false);
				}
				else if(inputUsername.equals("user2") && inputPassword.equals("usr2pwd")) {
					homePageTeacher hpT = new homePageTeacher();
					hpT.setVisible(true);
					setVisible(false);
				}else if(inputUsername.equals("user3") && inputPassword.equals("usr3pwd")) {
					homePagePrincipal hPP= new homePagePrincipal();
					hPP.setVisible(true);
					setVisible(false);
				}
				else {
					JOptionPane.showMessageDialog(btnNewButton, "Enter correct User ID and Password","Error!!", JOptionPane.WARNING_MESSAGE);		
				}
				
			}
		});
		btnNewButton.setBounds(306, 326, 85, 21);
		contentPane.add(btnNewButton);
		
	}
}
