package _04_gui_from_scratch._2_jack_in_the_box;

import java.applet.AudioClip;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
public  class JackInTheBox implements ActionListener {
	JButton centerButton = new JButton();
	Dimension BIG = new Dimension(400, 400);
	Dimension SMALL = new Dimension(200, 200);
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	
	
private static String png;

   public void run() {    

	   frame.add(panel);
		frame.setVisible(true);
	    centerButton.setText("Click me!");	
		centerButton.addActionListener(this);
		panel.add(centerButton);
		frame.pack();
		frame.setTitle("Jack in the Box");
	
}

   //WORK ON MAKING THE PICTURE ACTULLY POP UP!!!
	private void showPicture() {
	     try {
	          JLabel imageLabel = createLabelImage();
	          JFrame frame = new JFrame();
	          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	          frame.add(imageLabel);
	          frame.setVisible(true);
	          frame.pack();

	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}

	private JLabel createLabelImage() {
	     try {
	          URL imageURL = getClass().getResource(JackInTheBox.png);
	          if (imageURL == null) {
	               System.err.println("Could not find image " + (JackInTheBox.png));
	               return new JLabel();
	          } else {
	               Icon icon = new ImageIcon(imageURL);
	               JLabel imageLabel = new JLabel(icon);
	               return imageLabel;
	          }
	     } catch (Exception e) {
	          System.err.println("Could not find image " + (JackInTheBox.png));
	          return new JLabel();
	     }
	}
	
	
	private void playSound(String soundFile) {
	     try {
	          AudioClip sound = JApplet.newAudioClip(getClass().getResource(soundFile));
	          sound.play();
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	     
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		//I ACTULLY GENERATED ON PUPOSE DO NOT DELETE
	
		
		
	}
	public void showButton() {
		// TODO Auto-generated method stub
		
	}
	
}

