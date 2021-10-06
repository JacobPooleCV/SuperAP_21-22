import objectdraw.*;
import java.awt.*;

public class Square extends Movable
{

//	Note the following is a to define constants for
//	the class.

	private static final double OUTERSIDE=30.0;
	private static final int INNERSIDE=15;
	private static final Color OUTERCOLOR = Color.blue;
	private static final Color INNERCOLOR = Color.yellow;
	private FilledRect inner;
	private FilledRect outer;


	public Square(Location loc, DrawingCanvas neatcanvas)
	{
		Location in = new Location(loc);
		in.translate(7,8);
		outer = new FilledRect(loc,OUTERSIDE,OUTERSIDE,neatcanvas);
		outer.setColor(OUTERCOLOR);
		inner = new FilledRect(in,INNERSIDE,INNERSIDE,neatcanvas);
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

	public void hide()
	{
		outer.hide();
		inner.hide();
	}
	
}