package swingPackage;


import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.*;


public class addStudent extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new addStudent();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public addStudent() {
		colorsFile cF = new colorsFile();
		setTitle("Add New Student");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 740, 445);
		contentPane = new JPanel();
		contentPane.setBackground(cF.bg);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New Student");
		lblNewLabel.setForeground(cF.lbClr);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(279, 0, 165, 42);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("First Name: ");
		lblNewLabel_1.setForeground(cF.lbClr);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(39, 63, 109, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Last Name:");
		lblNewLabel_2.setForeground(cF.lbClr);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(39, 86, 109, 13);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(205, 60, 96, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(205, 83, 96, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Date of Birth:");
		lblNewLabel_3.setForeground(cF.lbClr);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(39, 123, 109, 13);
		contentPane.add(lblNewLabel_3);
		
		textField_2 = new HintTextField("(dd-mm-yyyy)");
		textField_2.setBounds(205, 120, 96, 19);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Gender:");
		lblNewLabel_4.setForeground(cF.lbClr);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(39, 171, 109, 13);
		contentPane.add(lblNewLabel_4);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(200, 171, 101, 22);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Select Gender");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Male");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Female");
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Non-Binary");
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JLabel lblNewLabel_5 = new JLabel("Phone Number: ");
		lblNewLabel_5.setForeground(cF.lbClr);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_5.setBounds(39, 212, 109, 13);
		contentPane.add(lblNewLabel_5);
		
		textField_3 = new JTextField();
		textField_3.setBounds(205, 209, 96, 19);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Address:");
		lblNewLabel_6.setForeground(cF.lbClr);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_6.setBounds(39, 261, 109, 13);
		contentPane.add(lblNewLabel_6);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(205, 255, 179, 42);
		contentPane.add(textArea);
		
		JLabel lblNewLabel_7 = new JLabel("Email ID: ");
		lblNewLabel_7.setForeground(cF.lbClr);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_7.setBounds(39, 311, 109, 13);
		contentPane.add(lblNewLabel_7);
		
		textField_4 = new JTextField();
		textField_4.setBounds(205, 307, 96, 19);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnNewButton = new JButton("Enter Data");
		btnNewButton.setBackground(cF.btnClr1);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				homePagePrincipal hPP = new homePagePrincipal();
				hPP.setVisible(true);
				setVisible(false);
			}
			
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(87, 365, 127, 19);
		contentPane.add(btnNewButton);
	}
}
