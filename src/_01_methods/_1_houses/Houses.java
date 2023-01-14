package _01_methods._1_houses;

import org.jointheleague.graphical.robot.Robot;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */
public class Houses {
	Robot rob = new Robot();
	public void run() {
		// Check the recipe to find out what code to put here
		
		rob.setX(20);
		rob.setY(400);
		
		rob.setSpeed(15);
		rob.penDown();
		rob.setPenWidth(5);
		
		
		rob.turn(-270);
		
      for(int i=0;i<8;i++)  {
    	 
    	  drawhouse("small");
        
    	
      
      }
      
      
      
	}
	
	
	public void drawhouse(String size ) {
    	int height;
		if(size.equals("small")) {
    		height=60;
    	}
		else if(size.equals("medium")) {
			height=120;
		}
		else  {
			height=250;
			
		}
	
		
		rob.setPenColor(0,0,0);
		rob.turn(270);
        rob.move(height);
		rob.turn(90);
		rob.move(60);
		rob.turn(90);
		rob.move(height);
        rob.setPenColor(0,200,100);
		rob.turn(270);
        rob.move(50);
        

	}}
	
	
	

