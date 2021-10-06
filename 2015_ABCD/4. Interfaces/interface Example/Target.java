import objectdraw.*;
import java.awt.*;

// The Target class now has return methods added to it.

public class Target implements Movable 
{
	private FilledOval inner;
	private FilledOval outer;

	public Target(double x, double y, DrawingCanvas neatcanvas)
	{
		outer = new FilledOval(x,y,30,30,neatcanvas);
		outer.setColor(Color.blue);
		inner = new FilledOval(x+15-7,y+15-7,
		15,15,neatcanvas);
		inner.setColor(Color.yellow);
	}
	
	public void move(double dx, double dy)
	{
		outer.move(dx,dy);
		inner.move(dx,dy);
	}

	public boolean contains(Location p)
	{
		if(outer.contains(p))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void removeFromCanvas()
	{
		outer.removeFromCanvas();
		inner.removeFromCanvas();
	}

	public double getX()
	{
		return outer.getX();
	}
	
	public double getY()
	{
		return outer.getY();
	}

	public void hide()
	{
		outer.hide();
		inner.hide();
	}
	
	public void show()
	{
		outer.show();
		inner.show();
	}
	
}