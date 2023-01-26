package _01_methods._1_houses;

import java.awt.Color;
import java.util.Random;

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
    	 
    	  String height="small";
    	  Random generator= new Random();
    int h = generator.nextInt(3);
    	
    if(h==0) {
    		height="small";
    	}
    	else if(h==1) {
    		height="medium";
    	}
    	else if(h==2) {
    		height="large";
    	}
    	
    Color color= Color.CYAN;
    Random generator1= new Random();
    int c = generator1.nextInt(4);
    
    if(c==0) {
    	color=Color.CYAN;
    }
    else if(c==1) {
    	color=Color.RED;
    }
    else if(c==2) {
    	color=Color.YELLOW;
    }
    else if(c==3) {
    	color=Color.BLUE;
    }
    else if(c==4){
    	color=Color.GREEN;
    }
    
    if(height.equals("large")) {
    	
    }
    else {
    	Random generator2=new Random();
    	int f= generator2.nextInt(2);
    	
    	if(f==0) {
    		
    	}
    	
    
    }
    	  drawhouse(height,color);
      }
	}
	
	
	public void drawhouse(String size,  Color color ) {
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
	 
		
		rob.setPenColor(color);
		rob.turn(-90);
        rob.move(height);
		rob.turn(90);
		rob.move(60);
		rob.turn(90);
		rob.move(height);
        rob.setPenColor(0,200,100);
		rob.turn(-90);
        rob.move(50);
        
    	Random generator2=new Random();
    	int f= generator2.nextInt(2);
    	
    if(height.equals("tall"))	{
    	rob.setPenColor(color);
		rob.turn(-90);
        rob.move(height);
		rob.turn(90);
		rob.move(60);
		rob.turn(90);
		rob.move(height);
        rob.setPenColor(0,200,100);
		rob.turn(-90);
        rob.move(50);
    }
    
    else {
    	if(f==0) {
    		rob.setPenColor(color);
    		rob.turn(-90);
            rob.move(height);
    		rob.turn(90);
    		rob.move(60);
    		rob.turn(90);
    		rob.move(height);
            rob.setPenColor(0,200,100);
    		rob.turn(-90);
            rob.move(50);
    	}
    	
    	else if(f==1) {
    		rob.setPenColor(color);
    		rob.turn(-90);
            rob.move(height);
    		rob.turn(45);
    		rob.move(60);
    		rob.turn(90);
    		rob.move(60);
    		rob.turn(45);
    		rob.move(height);
            rob.setPenColor(0,200,100);
    		rob.turn(-90);
            rob.move(50);
    	}
        
    }
	}}
	
	
	

