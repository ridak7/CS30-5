import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class breakAPlate {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					breakAPlate window = new breakAPlate();
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
	public breakAPlate() 
	{
		initialize();
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		ImageIcon plates = new ImageIcon("..\\Chapter10v2\\src\\broken plates\\plates.gif ");
		
		ImageIcon placeholder = new ImageIcon("..\\Chapter10v2\\src\\broken plates\\placeholder.gif ");
		
		ImageIcon plates_all_broken = new ImageIcon("..\\Chapter10v2\\src\\broken plates\\plates_all_broken.gif ");
		
		ImageIcon plates_two_broken = new ImageIcon("..\\Chapter10v2\\src\\broken plates\\plates_two_broken.gif ");
		
		ImageIcon sticker = new ImageIcon("..\\Chapter10v2\\src\\broken plates\\sticker.gif ");
		
		ImageIcon tiger_plush = new ImageIcon("..\\Chapter10v2\\src\\broken plates\\tiger_plush.gif ");
		
		
		JLabel pla = new JLabel("");
		pla.setBounds(68, 35, 286, 71);
		
		
		pla.setIcon(plates);
		
		
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 414, 239);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel pri = new JLabel("");
		pri.setBounds(164, 175, 101, 53);
		panel.add(pri);
		
		JButton play = new JButton("Play");
		play.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				// pick four random integers, each 1-10
				int a = 1 + (int)(3*Math.random() );
				
				
				if(a == 1)
				{
					if(play.getText().equals("Play"))
					{
						play.setText("play again");
						
						pla.setIcon(plates_all_broken);
						
						pri.setIcon(tiger_plush);
					}
					else if(play.getText().equals("play again"))
					{
						
                        play.setText("play again");
						
						pla.setIcon(plates_all_broken);
						
						pri.setIcon(tiger_plush);
						
					}
				}
				else if(a == 2)
				{
					if(play.getText().equals("Play"))
					{
						play.setText("play again");
						
						pla.setIcon(plates_two_broken);
						
						pri.setIcon(sticker);
					}
					
					else if(play.getText().equals("play again"))
					{
						
						play.setText("play again");
						
						pla.setIcon(plates_two_broken);
						
						pri.setIcon(sticker);
						
					}
				}
				
				
				
				
				
			}
		});
		play.setBounds(164, 133, 101, 31);
		play.setFont(new Font("Arial", Font.BOLD, 12));
		panel.add(play);
		
		panel.add(pla);
		

	}
}
