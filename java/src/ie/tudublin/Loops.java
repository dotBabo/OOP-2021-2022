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
		
		/*for(int i = 0; i < 500; i+=50){
			noStroke();
			fill(i,500,500);
			rect(i,rectY,width / 10 ,height);
		}First picture*/ 

		 for(int i = 0; i < 500; i+=50){
		 noStroke();
		 fill(i,500,500);
		 rect(i,i,width/10  ,height/10);
		 } //Second Picture and also part of third
		 

		for(int i = 0; i < 500; i+=50){
			noStroke();
			fill(i,500,500);
			rect(450-i, i,width/10  ,height/10);
		}
	}
	
	public void draw()
	{	
		background(0);
		drawRect(rectX, rectY);
	}
}
