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
		colorMode(HSB);
		
	}

	void drawRect(float x, float y){
		
		for(int i = 0; i < 500; i+=50){
		
		rect(i,rectY,width / 10 ,height);
		}
	}
	
	public void draw()
	{	
		background(0);
		drawRect(rectX, rectY);
	}
}
