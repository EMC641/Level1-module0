package _04_gui_from_scratch._1_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class fortuneCookie implements ActionListener {
	 
	        public void showButton() {
	            System.out.println("Button clicked");
	            JFrame frame= new JFrame();
	            frame.setVisible(true);
	            JButton button = new JButton();
	            frame.add(button);
	            frame.pack();
	            
	            button.addActionListener(this);
	            
	            int rand = new Random().nextInt(5);
	            
	            if(rand==1)  {
	            	JOptionPane.showMessageDialog(null, "You will have good luck");
	            }
	            
	            else if(rand==2) {
	            	JOptionPane.showMessageDialog(null, "You will have very x2 good luck");
	            }
	            
	            else if(rand==3) {
	            	JOptionPane.showMessageDialog(null, "You will have very x3 good luck");
	            }
	            
	            else if(rand==4) {
	            	JOptionPane.showMessageDialog(null, "You will have very x4 good luck");
	            }
	       }

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				//I ACTULLY GENERATED ON PUPOSE DO NOT DELETE
				JOptionPane.showMessageDialog(null, "Woohoo");
				
			}
	    

	 

}