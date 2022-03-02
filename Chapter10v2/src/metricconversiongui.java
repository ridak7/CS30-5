
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class metricconversiongui {

	private JFrame frame;
	private JTextField num;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					metricconversiongui window = new metricconversiongui();
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
	public metricconversiongui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Arial", Font.PLAIN, 12));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("Choose a metric conversion");
		label.setFont(new Font("Arial", Font.PLAIN, 12));
		label.setBounds(29, 24, 166, 51);
		frame.getContentPane().add(label);
		
		JLabel disp = new JLabel("");
		disp.setBounds(166, 193, 99, 34);
		frame.getContentPane().add(disp);
		
		JComboBox dropdown = new JComboBox();
		dropdown.setModel(new DefaultComboBoxModel(new String[] {"inchesToCentimetres", "feetToCentimetres", "yardsToMetres", "milesToKilometres"}));
		dropdown.setFont(new Font("Arial", Font.PLAIN, 12));
		dropdown.setBounds(244, 38, 140, 22);
		frame.getContentPane().add(dropdown);
		
		num = new JTextField();
		num.setBounds(29, 104, 140, 34);
		frame.getContentPane().add(num);
		num.setColumns(10);
		
		JButton button = new JButton("CHECK");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				int x = Integer.valueOf(num.getText());
				
				if(dropdown.getSelectedItem().equals("inchesToCentimetres"))
				{
					double num = x * 2.54;
					disp.setText(Double.toString(num));
				
				}
				
				else if(dropdown.getSelectedItem().equals("feetToCentimetres"))
				{
					double num = x * 30;
					disp.setText(Double.toString(num));
				
				}
				
				else if(dropdown.getSelectedItem().equals("yardsToMetres"))
				{
					double num = x * 0.91;
					disp.setText(Double.toString(num));
				
				}
				
				else if(dropdown.getSelectedItem().equals("milesToKilometres"))
				{
					double num = x * 1.6;
					disp.setText(Double.toString(num));
				
				}
				
			}
		});
		button.setFont(new Font("Arial", Font.BOLD, 14));
		button.setBounds(244, 110, 122, 28);
		frame.getContentPane().add(button);
		
		
	}
}
