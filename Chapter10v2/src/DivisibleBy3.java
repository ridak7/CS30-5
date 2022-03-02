
/*

Program: DivisibleBy3.java          Last Date of this Revision: 

Purpose: 

Author: Your Name, 
School: CHHS
Course: Computer Programming ??
 

*/

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DivisibleBy3 {

	private JFrame frame;
	private JTextField num;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DivisibleBy3 window = new DivisibleBy3();
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
	public DivisibleBy3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		num = new JTextField();
		num.setBounds(241, 26, 110, 30);
		frame.getContentPane().add(num);
		num.setColumns(10);
		
		JLabel disp = new JLabel("");
		disp.setBounds(230, 168, 147, 44);
		frame.getContentPane().add(disp);
		
		JLabel lblNewLabel = new JLabel("Enter an integer");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel.setBounds(22, 26, 172, 37);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Check");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				int x = Integer.valueOf(num.getText());
				
				
				if(x%3 != 0)
				{
					disp.setText(x + " is not divisible by 3");
				}
				
				else
				{
					disp.setText(x + " is divisible by 3");
				}
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 16));
		btnNewButton.setBounds(42, 170, 117, 42);
		frame.getContentPane().add(btnNewButton);
		
		
	}
}
