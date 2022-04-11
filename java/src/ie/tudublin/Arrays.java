package ie.tudublin;

import processing.core.PApplet;

public class Arrays extends PApplet {


    float[] rainfall = { 45, 37, 55, 27, 38, 50, 79, 48, 104, 31, 100, 58 };

    String[] months = {"JAN ","FEB","MAR","APR","MAY","JUN","JUL","AUG","SEP","OCT","NOV","DEC"};
    int maxIndex = 0;
    int minIndex = 0;
    public void settings()
    {
        size(500, 500);
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
         
    
    }    
}
