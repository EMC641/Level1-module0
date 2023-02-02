package _01_methods._5_FlappyBird;

import processing.core.PApplet;

public class FlappyBird extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
int x=400;
int y=300;
int birdYVelocity = -10;
int gravity = 1;
    @Override
    public void settings() {
        size(800, 600);
    }

    @Override
    public void setup() {
        
    }
    @Override
    public void mousePressed() {
    	birdYVelocity = 0;
    }
    @Override
    public void draw() {
    	background(0, 100, 200);
    	fill(200, 0, 0);
    	y=y+birdYVelocity;
    	x=x+gravity;
    	ellipse(gravity,birdYVelocity, 50, 50);
    	
    	fill(0, 200, 100);
    	rect(300, 0, 50, 300);


    }

    static public void main(String[] args) {
        PApplet.main(FlappyBird.class.getName());
    }
}
