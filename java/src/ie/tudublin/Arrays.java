package ie.tudublin;

import processing.core.PApplet;

public class Arrays extends PApplet {
    int mode = 0;

    float[] rainfall = { 45, 37, 55, 27, 38, 50, 79, 48, 104, 31, 100, 58 };

    String[] months = {"JAN ","FEB","MAR","APR","MAY","JUN","JUL","AUG","SEP","OCT","NOV","DEC"};
    int maxIndex = 0;
    int minIndex = 0;
    public void settings()
    {
        size(500, 500);
    }

    public void keyPressed()
    {
        if (key >= '0' && key <= '9') {
			mode = key - '0';
		}
		println(mode);
    }

    public void setup()
    {
        for(int i = 0; i< rainfall.length; i++)
        {
            println(rainfall[i]+ "\t" +months[i]); 
        }

        for(int j = rainfall.length -1; j >= 0; j --)
        {
            println(rainfall[j] + "\t" + months[j]);
        }

        for (int k = 0; k< rainfall.length; k++)
        {
            if (rainfall[k] < rainfall[minIndex])
            {
                minIndex = k;
            }

            else if(rainfall[k]> rainfall[maxIndex])
            {
                maxIndex = k;
            }

        }
        println("Max rainfall: " + rainfall[maxIndex]+ " in month " + months[maxIndex]);
        println("Min rainfall: " + rainfall[minIndex]+ " in month " + months[minIndex]);
    }

    public void draw()
    {
        switch(mode)
        {
            case 0:
            background(0);
            colorMode(HSB);
            float w = width /(float)rainfall.length;
            noStroke();
            for(int i = 0 ; i < rainfall.length; i++)
            {
                float x = map(i ,0, rainfall.length, 0, width);
                int c = (int)map(i,0, rainfall.length, 0, 255);
                fill(c,255,255);
                float h = map(rainfall[i], 0 , rainfall[maxIndex], 0, -height);
                rect(x,height,w,h);
                fill(255);
                textAlign(CENTER, CENTER);
                text(months[i], x+(w/2),height-50);
        
            }
            break;
            case 1:
            background(0);
            colorMode(HSB);
            line(50, 50, 50, 450);
            stroke(255);
            line(50,450, 450,450);
            stroke(255);
            for(int i = 0; i < rainfall.length+1; i++)
            {
                float h= map(i, 0, 12,450, 50);
                line(45,h,50,h);
                textAlign(CENTER, CENTER);
                float values = map(i, 0,12,0,120);
                text((int)values,20,h);
                float x = map(i,0,12, 50, 450);
                float d = 400 / (float)rainfall.length;
                rect(x,450,d,0);

               
                float q = map(rainfall[i], 0, rainfall[maxIndex], 50,450);
                rect(x,450,d,-q-1);
                

                
            }
        }
    
    }    
}
