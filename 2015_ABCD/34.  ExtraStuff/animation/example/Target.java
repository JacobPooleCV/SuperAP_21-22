import objectdraw.*;
import java.awt.*;

public class Target implements Movable 
{
	private static final int OUTERDIA = 30;
	private static final int INNERDIA = 15;
	private static final Color OUTERCOLOR = Color.blue;
	private static final Color INNERCOLOR = Color.yellow;
	private FilledOval inner;
	private FilledOval outer;


	public Target(double x, double y, DrawingCanvas neatcanvas)
	{
		outer = new FilledOval(x,y,OUTERDIA,OUTERDIA,neatcanvas);
		outer.setColor(OUTERCOLOR);
		inner = new FilledOval(x+OUTERDIA/2-INNERDIA/2,y+OUTERDIA/2-INNERDIA/2,
		INNERDIA,INNERDIA,neatcanvas);
		inner.setColor(INNERCOLOR);
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
	
}