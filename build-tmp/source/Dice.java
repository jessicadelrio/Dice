import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Dice extends PApplet {

int one, two;


public void setup()
{	size(500,400);
	noLoop();
}
public void draw()
{
	background(150,50,150);
	Die one = new Die(50,50);
	Die two = new Die(250,50);
	
	one.show();
	two.show();
	one.roll();
	two.roll();

	int together = one.dots1+two.dots1; 
	text("Total number of the dice:"+together,110,250);
	


}
public void mousePressed()
{	
	redraw();
	
}
class Die //models one single dice cube
{	int myX, myY, dots1;
	//variable declarations here
	Die(int x, int y) //constructor
	{
		//variable initializations here
		myX = x;
		myY = y;
		dots1 = (int)(Math.random()*6)+1;
		
	}
	public void roll()
	{
		//background(150,50,150);
		fill(250);
		rect(myX,myY,150,150);
		//your code here
	if(dots1==1){
		fill(0);
		ellipse(myX+75,myY+75,30,30);
	}if(dots1==2){
		fill(0);
		ellipse(myX+40,myY+40,30,30);
		ellipse(myX+110,myY+110,30,30);
		
	}if(dots1==3){
		fill(0);
		ellipse(myX+40,myY+40,30,30);
		ellipse(myX+75,myY+75,30,30);
		ellipse(myX+110,myY+110,30,30);
	}if(dots1==4){
		fill(0);
		ellipse(myX+40,myY+40,30,30);
		ellipse(myX+110,myY+40,30,30);
		ellipse(myX+40,myY+110,30,30);
		ellipse(myX+110,myY+110,30,30);
	}if(dots1==5){
		fill(0);
		ellipse(myX+40,myY+40,30,30);
		ellipse(myX+110,myY+40,30,30);
		ellipse(myX+40,myY+110,30,30);
		ellipse(myX+110,myY+110,30,30);
		ellipse(myX+75,myY+75,30,30);

	}if(dots1==6){
		fill(0);
		ellipse(myX+40,myY+40,30,30);
		ellipse(myX+110,myY+40,30,30);
		ellipse(myX+40,myY+110,30,30);
		ellipse(myX+110,myY+110,30,30);
		ellipse(myX+40,myY+75,30,30);
		ellipse(myX+110,myY+75,30,30);


	}
	
	}
	public void show()
	{
		//your code here
		fill(250);
		rect(myX,myY,150,150);
		fill(0);
		textSize(20);
	}
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Dice" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
