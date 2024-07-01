package login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import java.awt.Color;

public class Loginproject extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Loginproject frame = new Loginproject();
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
	public Loginproject() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 639, 420);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("USER LOGIN");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblNewLabel_2.setBounds(215, 11, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("USER LOGIN");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblNewLabel_3.setBounds(141, 46, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("USER LOGIN");
		lblNewLabel.setBackground(Color.LIGHT_GRAY);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblNewLabel.setBounds(151, 0, 335, 80);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("USERNAME");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(71, 132, 139, 64);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_4 = new JLabel("PASSWORD");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_4.setBounds(71, 190, 139, 56);
		contentPane.add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setBackground(Color.WHITE);
		textField.setBounds(250, 146, 260, 29);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(273, 167, 0, 20);
		contentPane.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(250, 198, 260, 29);
		contentPane.add(passwordField_1);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String username = textField.getText();
				String password = passwordField.getText();
				if(password.contains("world")&& username.contains("hello")) {
					textField.setText(null);
					passwordField.setText(null);
				}
				else 
				{
					JOptionPane.showMessageDialog(null,"INVALID LOGIN","ERROR",JOptionPane.ERROR_MESSAGE);
					textField.setText(null);
					passwordField.setText(null);
					
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(125, 305, 110, 23);
		contentPane.add(btnNewButton);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				passwordField.setText(null);
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnReset.setBounds(275, 302, 110, 29);
		contentPane.add(btnReset);
		
		JButton btnNewButton_1_1 = new JButton("EXIT");
		btnNewButton_1_1.setBackground(Color.RED);
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1_1.setBounds(429, 305, 110, 23);
		contentPane.add(btnNewButton_1_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(133, 223, 377, -10);
		contentPane.add(separator_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 94, 623, 14);
		contentPane.add(separator);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(0, 273, 623, 14);
		contentPane.add(separator_2);
	}
}
