import objectdraw.*;
import java.awt.*;

public class WhatADrag extends WindowController
{
	private FilledRect box;
	private Location lastPoint;
	private boolean inBox;

	public void begin()
	{
		box = new FilledRect(30,30,50,50,canvas);
		box.setColor(Color.blue);
	}

	public void onMousePress(Location point)
	{
		lastPoint=point;
		inBox=box.contains(point);
	}
	public void onMouseDrag(Location point)
	{
		if(inBox)
		{
			box.move(point.getX()-lastPoint.getX(),
			point.getY() - lastPoint.getY());
			lastPoint = point;
		}
	}
	
}