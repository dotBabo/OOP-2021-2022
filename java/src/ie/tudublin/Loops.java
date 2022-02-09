package ie.tudublin;

import processing.core.PApplet;

public class Loops extends PApplet
{
	float rectX, rectY;
	//float rectWidth, rectHeight;

	public void settings()
	{
		size(500, 500);
	}

	public void setup() {
		colorMode(HSB,500);
		
	}

	void drawRect(float x, float y){
		
		for(int i = 0; i < 500; i+=50){
			noStroke();
			fill(i,500,500);
			rect(i,rectY,width / 10 ,height);
		}

	}

	void drawDiag(){
		for(int i = 0; i < 500; i+=50){
			noStroke();
			fill(i,500,500);
			rect(i, i,width/10  ,height/10);
		} 

	}
	void drawX(){
		for(int i = 0; i < 500; i+=50){
			noStroke();
			fill(i,500,500);
			rect(i, i,width/10  ,height/10);
		} 
		//Second Picture and also part of third
		 

		for(int i = 0; i < 500; i+=50){
			noStroke();
			fill(i,500,500);
			rect(450-i, i,width/10  ,height/10);
		} // third picture

	}

	void drawEllipse(){
		
		for(int i = 500; i > 0 ;i-=50){
			noStroke();
			fill(i,500,500);
			ellipse(250, 250, i, i);
		}

	}

	void drawCircles(){
		for(int i = 25; i < 500; i+=50){
			noStroke();
			fill(i,500,500);
			ellipse(i, 25,width/10  ,height/10);
		} // third picture
	}
	
	public void draw()
	{	
		//background(0);
		//drawRect(rectX, rectY);
		//drawDiag();
		//drawX();
		//drawEllipse();
		drawCircles();
	}
}
