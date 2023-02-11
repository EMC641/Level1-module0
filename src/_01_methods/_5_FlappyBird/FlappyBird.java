package _01_methods._5_FlappyBird;

import processing.core.PApplet;

public class FlappyBird extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
int x=400;
int y=300;
int birdYVelocity=-10;
int gravity = 1;
int pipeX= 800;
int pipeGap=100;
int upperPipeHeight = (int) random(100, 400);
int lowerY = upperPipeHeight + pipeGap;
boolean hasLost=false;
int point=0;
    @Override
    public void settings() {
        size(800, 600);
    }

    @Override
    public void setup() {
     
    }
    @Override
    public void mousePressed() {
    	birdYVelocity= birdYVelocity-20;
    }
    @Override
    public void draw() {
    	background(173, 216, 230);
    
    	fill(210,180,140);
    	rect(0,500,800,100);
    	
    	fill(0,0,0);
    	text("Score: " +point, 40, 20);
    	
    	fill(200, 0, 0);
    	ellipse(x,y, 50, 50);
    	
    	birdYVelocity=birdYVelocity+gravity;
    	y=y+birdYVelocity;
    	
    	fill(0, 200, 100);
    	rect(pipeX--, 0, 50,upperPipeHeight);
    	
    	lowerY = upperPipeHeight + pipeGap;
    	rect(pipeX--,lowerY, 50,700);
    	
    	if(y==upperPipeHeight-lowerY) {
    		point++;
    	}

    	
    	  if(pipeX==-10) {
    	    	teleportPipes(); 
    	    	}

    	  if(y>600) {
    		  hasLost=true;    		  
    		      	  }
    	  
    
       if(intersectsPipes()) {
    	  hasLost=true;
       }
       
       if(hasLost==true) {
     	  text("You lost",300,400);
     	  
       }

    } 
    public void teleportPipes() {
  pipeX=850;
  pipeX=pipeX--;
  upperPipeHeight = (int) random(100, 400);
    }
    boolean intersectsPipes() { 
        if (y < upperPipeHeight && x > pipeX && x < (pipeX+50)){
           return true; }
       else if (y>lowerY && x > pipeX && x < (pipeX+50)) {
           return true; }
       else { return false; }
}

    static public void main(String[] args) {
        PApplet.main(FlappyBird.class.getName());
    }
}
