package _03_gui_with_help._2_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public void run() {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the Internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address” )
		String image = "https://www.thespruceeats.com/thmb/QjCQ4RTjmnhrovGkuJWzZCXYFX8=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/GettyImages-90053856-588b7aff5f9b5874ee534b04.jpg";
		// 2. create a variable of type "Component" that will hold your image
		Component image2;
		// 3. use the "createImage()" method below to initialize your Component
		image2 = createImage("https://www.thespruceeats.com/thmb/QjCQ4RTjmnhrovGkuJWzZCXYFX8=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/GettyImages-90053856-588b7aff5f9b5874ee534b04.jpg");
		// 4. add the image to the quiz window
		quizWindow.add(image2);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String iceCream = JOptionPane.showInputDialog(null, "Do you like ice cream?");
		// 7. print "CORRECT" if the user gave the right answer
		if(iceCream=="yes") {
			System.out.println("Correct");
		}
		// 8. print "INCORRECT" if the answer is wrong
		else {
			System.out.println("incorrect");
		}
		
		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
	
		quizWindow.remove(image2);
		// 10. find another image and create it (might take more than one line
		// of code)
		//done
		// 11. add the second image to the quiz window
		String image1 = "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwallpapers.com%2Fsky&psig=AOvVaw1FvxXzjMUk-VsbnMJZyQpP&ust=167";
		// 12. pack the quiz window
		quizWindow.pack();
		// 13. ask another question
		String color = JOptionPane.showInputDialog(null, "What color is the sky when it is daytime?");
		// 14+ check answer, say if correct or incorrect, etc.
		if(color=="blue") {
			System.out.println("Correct");
		}
		else {
			System.out.println("Incorrect");
		}
	}

	private Component createImage(String imageUrl) {
		JLabel imageLabel = new JLabel();
		URL url;
		try {
			url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			imageLabel.setIcon(icon);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "I can't find your image!!");
		}
		
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
