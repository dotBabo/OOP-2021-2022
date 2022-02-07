package ie.tudublin;

import processing.core.PApplet;

public class BugZap extends PApplet
{
    float playerX, playerY, playerWidth;

	public void settings(){
		size(500, 500);
	}

	public void setup() {
        colorMode(RGB);
        smooth();

        playerX = width / 2;
        playerY = height - 50;
        playerWidth = 50;
		
	}

    float playerSpeed = 5;
    public void keyPressed()
	{
		if (keyCode == LEFT)
		{
			System.out.println("Left arrow pressed");
            playerX-=playerSpeed;
		}
		if (keyCode == RIGHT)
		{
			System.out.println("Right arrow pressed");
            playerX+=playerSpeed;
		}
		if (key == ' ')
		{
			System.out.println("SPACE key pressed");
		}
	}	

	
	public void draw(){	
        background(0);
		strokeWeight(2);
        drawPlayer(playerX, playerY, playerWidth);
	}

    void drawPlayer(float x, float y, float w){
        stroke(255);
        rectMode(CENTER);
        rect(x,y,w,20);
        line(x, y - 10, x, y-20);
    }
}
