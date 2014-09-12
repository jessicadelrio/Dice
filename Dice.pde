int one, two;


void setup()
{	size(500,400);
	noLoop();
}
void draw()
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
void mousePressed()
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
	void roll()
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
	void show()
	{
		//your code here
		fill(250);
		rect(myX,myY,150,150);
		fill(0);
		textSize(20);
	}
}
