import objectdraw.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;


public class Final extends WindowController 
{
	int xk=0;
	int save=0;
	int fg=0;
	int fg2=0;
	armedninja shawn;
	abstractpeople[] john = new abstractpeople[20];
	
	ninja shane;
	FilledRect top;
	FilledRect bottom;
	FilledRect right;
	FilledRect left;
	FilledRect punch;
	FilledRect up;
	FilledRect side;
	public void begin()
	{
		dojo();
		controles();
		shane = new ninja(500,400,canvas);
		
		shawn = new armedninja(700,400,canvas);
		for(int u=0;u<john.length-1;u++)
		{
			fg = (int)(Math.random()*1000);
			fg2 = (int)(Math.random()*1000);
			if(fg<500)
			{
				john[u] = new armedninja(fg,fg2,canvas);
			}
			if(fg>=500)
			{
				john[u] = new ninja(fg,fg2,canvas);
			}
		}			
	}
	public void onMousePress(Location point)
	{
		if(punch.contains(point))
		{
			shane.frontPunch();
			shawn.frontSword();
			for(int k=0;k<john.length-1;k++)
			{
				john[k].frontSword();
			}
		}
		if(up.contains(point))
		{
			shane.upPunch();
			shawn.upPunch();
			for(int k=0;k<john.length-1;k++)
			{
				john[k].upPunch();
			}
		}
		if(side.contains(point))
		{
			shane.backPunch();
			shawn.backPunch();
			for(int k=0;k<john.length-1;k++)
			{
				john[k].backPunch();
			}
		}
		else
		{
			for(int xk=0;xk<john.length-1;xk++)
			{
				if(john[xk].contains(point))
				{
					save=xk;
				}
			}
		}
	}
	public void onMouseRelease(Location point)
	{
		if(punch.contains(point))
		{
			shane.endFrontPunch();
			shawn.endFrontSword();
			for(int k=0;k<john.length-1;k++)
			{
				john[k].endFrontSword();
			}
		}
		if(up.contains(point))
		{
			shane.endUpPunch();
			shawn.endUpPunch();
			for(int k=0;k<john.length-1;k++)
			{
				john[k].endUpPunch();
			}
		}
		if(side.contains(point))
		{
			shane.endBackPunch();
			shawn.endBackPunch();
			for(int k=0;k<john.length-1;k++)
			{
				john[k].endBackPunch();
			}
			
		}
	}
	public void onMouseDrag(Location er)
	{
		if(shane.contains(er))
		{
			shane.moveTo(er.getX()-15, er.getY()-15);
		}
		if(shawn.contains(er))
		{
			shawn.moveTo(er.getX()-15, er.getY()-15);
		}
		if(john[save].contains(er))
		{
			john[save].moveTo(er.getX()-15, er.getY()-15);
		}
		/*while(john[k].contains(er)==false)
		{
			k++;
			
		}*/
		/*for(int k=0;k<john.length-1;k++)
		{
			if(john[k].contains(er))
			{
				john[k].moveTo(er.getX()-15, er.getY()-15);
			}
		}*/
	}
	public void onMouseMove(Location point)
	{
		
	}
	public void controles()
	{
		
		top = new FilledRect(340,40,20,20,canvas);
		bottom = new FilledRect(340,80,20,20,canvas);
		right = new FilledRect(320,60,20,20,canvas);
		left = new FilledRect(360,60,20,20,canvas);
		punch = new FilledRect(300,120,20,20,canvas);
		up = new FilledRect(340,120,20,20,canvas);
		side = new FilledRect(380,120,20,20,canvas);
		
	}
	public void dojo()
	{
		Color backdrop;
		backdrop = new Color(213,106,0);
		Color wood;
		wood = new Color(255,165,64);
		Color frame;
		frame = new Color(130,65,0);
		FilledRect floor;
		floor = new FilledRect(0,350,1000,500,canvas);
		floor.setColor(wood);
		FilledRect backwall;
		backwall = new FilledRect(0,0,1000,350,canvas);
		backwall.setColor(backdrop);
		FilledRect frameone;
		frameone = new FilledRect(50,40,230,230,canvas);
		frameone.setColor(frame);
		FilledRect frametwo;
		frametwo = new FilledRect(590,40,230,230,canvas);
		frametwo.setColor(frame);
		FilledRect glassone;
		glassone = new FilledRect(60,50,100,100,canvas);
		glassone.setColor(Color.blue);
		FilledRect glasstwo;
		glasstwo = new FilledRect(170,50,100,100,canvas);
		glasstwo.setColor(Color.blue);
		FilledRect glassthree;
		glassthree = new FilledRect(60,160,100,100,canvas);
		glassthree.setColor(Color.blue);
		FilledRect glassfour;
		glassfour = new FilledRect(170,160,100,100,canvas);
		glassfour.setColor(Color.blue);
		FilledRect glassfive;
		glassfive = new FilledRect(600,50,100,100,canvas);
		glassfive.setColor(Color.blue);
		FilledRect glasssix;
		glasssix = new FilledRect(710,50,100,100,canvas);
		glasssix.setColor(Color.blue);
		FilledRect glassseven;
		glassseven = new FilledRect(600,160,100,100,canvas);
		glassseven.setColor(Color.blue);
		FilledRect glasseight;
		glasseight = new FilledRect(710,160,100,100,canvas);
		glasseight.setColor(Color.blue);
		Line one;
		one = new Line(0,350,1000,350,canvas);
		Line two;
		two = new Line(0,360,1000,360,canvas);
		Line three;
		three = new Line(0,371,1000,371,canvas);
		Line four;
		four = new Line(0,382,1000,382,canvas);
		Line five;
		five = new Line(0,394,1000,394,canvas);
		Line six;
		six = new Line(0,406,1000,406,canvas);
		Line seven;
		seven = new Line(0,419,1000,419,canvas);
		Line eight;
		eight = new Line(0,432,1000,432,canvas);
		Line nine;
		nine = new Line(0,446,1000,446,canvas);
		Line ten;
		ten = new Line(0,460,1000,460,canvas);
		Line elevin;
		elevin = new Line(0,475,1000,475,canvas);
		Line twelve;
		twelve = new Line(0,490,1000,490,canvas);
		Line therteen;
		therteen = new Line(0,506,1000,506,canvas);
		Line fourteen;
		fourteen = new Line(0,522,1000,522,canvas);
		Line fifteen;
		fifteen = new Line(0,539,1000,539,canvas);
		Line sixteen;
		sixteen = new Line(0,556,1000,556,canvas);
		Line seventeen;
		seventeen = new Line(0,574,1000,574,canvas);
		Line eighteen;
		eighteen = new Line(0,592,1000,592,canvas);
		Line nineteen;
		nineteen = new Line(0,611,1000,611,canvas);
		Line twenty;
		twenty = new Line(0,630,1000,630,canvas);
	}	
	
}
