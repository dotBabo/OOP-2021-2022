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
		ellipseMode(CORNER);
		float shapeHue = 0;
		float shapeX = 0;
        float shapeY = 0;
        float size = 50;
		for(int i = 0; i <10; i++){
			noStroke();
			ellipse(shapeX, shapeY, size,size);
			fill(shapeHue,255,255);
			shapeHue =  (25 * i);
			shapeX+=50;
		} // third picture
	}
float offset;
	void drawCircleGrid(){
		noStroke();
				ellipseMode(CORNER);
                float shapeHue = 0;
                float shapeY = 0;
                float size = 50;
                // horizontal
                for (int i = 0; i < 10; i++)
                {
                    float shapeX = 0;
                    shapeHue = 0 + 10 * i;
                    for (int j = 0; j < 10; j++)
                    {
                        fill(shapeHue, 255, 255);
                        ellipse(shapeX, shapeY, size,size);
                        shapeHue += 10;
                        shapeX += size;
                    }
                    shapeY += size;
                }
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
