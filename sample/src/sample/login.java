package sample;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class login {

	private JFrame frame;
	private JTextField tb1;
	private JPasswordField p1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 17));
		frame.getContentPane().setForeground(Color.MAGENTA);
		frame.getContentPane().setBackground(new Color(64, 128, 128));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBounds(133, 75, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		tb1 = new JTextField();
		tb1.setBounds(218, 72, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("password");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(133, 118, 64, 18);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Name=tb1.getText();
				String Password=p1.getText();
				if(Name.equals("bhanusri") && Password.equals("24102003"))
				{
				 JOptionPane.showMessageDialog(btnNewButton, " Valid Login\n Welcome "+Name+" your password is "+Password);
				}
				else
				{
					JOptionPane.showMessageDialog(btnNewButton, "Invalid login");
				}
			}
		});
		btnNewButton.setForeground(Color.DARK_GRAY);
		btnNewButton.setBackground(new Color(192, 192, 192));
		btnNewButton.setBounds(161, 172, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewJgoodiesTitle = DefaultComponentFactory.getInstance().createTitle("LOGIN PAGE");
		lblNewJgoodiesTitle.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewJgoodiesTitle.setForeground(Color.WHITE);
		lblNewJgoodiesTitle.setBackground(new Color(128, 0, 255));
		lblNewJgoodiesTitle.setBounds(131, 11, 160, 29);
		frame.getContentPane().add(lblNewJgoodiesTitle);
		
		p1 = new JPasswordField();
		p1.setBounds(218, 118, 86, 20);
		frame.getContentPane().add(p1);
	}
}
