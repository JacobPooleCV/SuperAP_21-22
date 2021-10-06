import objectdraw.*;
import java.awt.*;

public class armedninja extends ninja
{
	sword w;
	public armedninja( int x, int y, DrawingCanvas canvas )
	{
		super(x,y,canvas);
		w = new sword(x+45, y+15-110, canvas);
	}
	public void move( double x, double y )
	{
		super.move(x,y);
		w.move(x,y);
	}
	public void moveTo( double x, double y )
	{
		super.moveTo(x,y);
		w.moveTo(x+45,y+15-110);
	}
	public void moveTo( Location L )
	{
		super.moveTo(L);
		w.moveTo(L.getX()+45,L.getY()+15-110);
	}
	public void frontSword()
	{
		super.frontPunch();
		w.move(10,-30);
		w.swingRight();
	}
	public void endFrontSword()
	{
		super.endFrontPunch();
		w.move(-10,30);
	}
	/*public void BackHit()
	{
		super.
	}*/
	
	
	
		

}