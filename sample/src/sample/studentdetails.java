package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JScrollBar;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.ImageIcon;
import java.awt.Label;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class studentdetails {

	private JFrame frame;
	private JTextField tb1;
	private JTextField tb2;
	private JTextField tb3;
	private JTextField tb4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					studentdetails window = new studentdetails();
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
	public studentdetails() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(0, 0, 0));
		frame.getContentPane().setBackground(new Color(128, 128, 192));
		frame.setBounds(100, 100, 450, 656);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setForeground(new Color(64, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(103, 57, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewJgoodiesTitle = DefaultComponentFactory.getInstance().createTitle("REGISTRATION FORM");
		lblNewJgoodiesTitle.setForeground(new Color(64, 0, 0));
		lblNewJgoodiesTitle.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewJgoodiesTitle.setBounds(103, 11, 242, 20);
		frame.getContentPane().add(lblNewJgoodiesTitle);
		
		tb1 = new JTextField();
		tb1.setBounds(222, 56, 123, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("RollNo");
		lblNewLabel_1.setForeground(new Color(64, 0, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(103, 113, 73, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		tb2 = new JTextField();
		tb2.setBounds(222, 111, 123, 20);
		frame.getContentPane().add(tb2);
		tb2.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Gender");
		lblNewLabel_2.setForeground(new Color(64, 0, 0));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(103, 155, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JRadioButton r1 = new JRadioButton("Male");
		r1.setBackground(new Color(128, 128, 192));
		r1.setBounds(225, 152, 94, 23);
		frame.getContentPane().add(r1);
		
		JRadioButton r2 = new JRadioButton("Female");
		r2.setBackground(new Color(128, 128, 192));
		r2.setBounds(225, 178, 94, 23);
		frame.getContentPane().add(r2);
		
		JRadioButton r3 = new JRadioButton("Other");
		r3.setBackground(new Color(128, 128, 192));
		r3.setBounds(225, 204, 94, 20);
		frame.getContentPane().add(r3);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(128, 243, 46, 0);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Mobile no");
		lblNewLabel_4.setForeground(new Color(64, 0, 0));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_4.setBounds(103, 235, 57, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		tb3 = new JTextField();
		tb3.setBounds(278, 231, 85, 23);
		frame.getContentPane().add(tb3);
		tb3.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setBounds(150, 285, 35, -10);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Department");
		lblNewLabel_6.setForeground(new Color(64, 0, 0));
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_6.setBounds(103, 272, 73, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Academic Year");
		lblNewLabel_7.setForeground(new Color(64, 0, 0));
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_7.setBounds(103, 313, 85, 14);
		frame.getContentPane().add(lblNewLabel_7);
		
		tb4 = new JTextField();
		tb4.setBounds(222, 311, 123, 20);
		frame.getContentPane().add(tb4);
		tb4.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("CGPA");
		lblNewLabel_8.setForeground(new Color(64, 0, 0));
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_8.setBounds(103, 409, 73, 14);
		frame.getContentPane().add(lblNewLabel_8);
		JLabel lblNewLabel_9 = new JLabel("programming language");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_9.setForeground(new Color(64, 0, 0));
		lblNewLabel_9.setBounds(68, 454, 145, 14);
		frame.getContentPane().add(lblNewLabel_9);
		
		JCheckBox c1 = new JCheckBox("c-language");
		c1.setBackground(new Color(128, 128, 192));
		c1.setBounds(222, 441, 97, 23);
		frame.getContentPane().add(c1);
		
		JCheckBox c2 = new JCheckBox("python");
		c2.setBackground(new Color(128, 128, 192));
		c2.setBounds(222, 467, 97, 23);
		frame.getContentPane().add(c2);
		
		JCheckBox c3 = new JCheckBox("java");
		c3.setBackground(new Color(128, 128, 192));
		c3.setBounds(222, 493, 97, 23);
		frame.getContentPane().add(c3);
		
		JLabel lblNewLabel_10 = new JLabel("Year");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_10.setForeground(new Color(64, 0, 0));
		lblNewLabel_10.setBounds(114, 365, 46, 14);
		frame.getContentPane().add(lblNewLabel_10);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "CSE", "DATA SCIENCE", "CYBER SECURITY", "IOT", "ECE", "EEE", "IT"}));
		cb1.setBounds(222, 266, 130, 22);
		frame.getContentPane().add(cb1);
		
		textField_5 = new JTextField();
		textField_5.setBounds(222, 403, 123, 20);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JComboBox cb2 = new JComboBox();
		cb2.setModel(new DefaultComboBoxModel(new String[] {"+91", "+040", "+81", "+71"}));
		cb2.setBounds(222, 231, 46, 22);
		frame.getContentPane().add(cb2);
		
		ButtonGroup brg = new ButtonGroup();
		brg.add(r1);
		brg.add(r2);
		brg.add(r3);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=tb1.getText();
				String RollNo =tb2.getText();
				String Mobileno = (String) cb2.getSelectedItem()+ (String) tb3.getText();
				String Department=(String) cb1.getSelectedItem();
				String Academicyear =tb4.getText();
				
				String gender=" ";
				if (r1.isSelected()) {
					gender="Male";
				}
				else if(r2.isSelected()) {
					gender="Female";
				}
				else {
					gender="other";
				}
				
				String language=" ";
				
				if (c1.isSelected()) {
					language +="c-language";
				}
				 if(c2.isSelected()) {
					 language +="python";
				}
				 if(c3.isSelected()) {
					 language +="java";
				}
				
			
				JOptionPane.showMessageDialog(btnNewButton,"NAME"+name+"\n ROLLNO"+RollNo+"\n gender:"+gender+ "\n Mobile No:"+Mobileno+"\nDepatment"+Department+"\n Academic Year:"+Academicyear);
				
		
			}
		});
		btnNewButton.setForeground(new Color(64, 0, 0));
		btnNewButton.setBounds(187, 552, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(1, 1, 4, 1));
		spinner.setBounds(232, 363, 30, 20);
		frame.getContentPane().add(spinner);
		
		
		
		JLabel lblNewLabel_11 = new JLabel("New label");
		lblNewLabel_11.setBounds(24, 19, 46, 0);
		frame.getContentPane().add(lblNewLabel_11);
	}
}
