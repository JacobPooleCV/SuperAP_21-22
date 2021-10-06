import objectdraw.*;
import java.awt.*;

public class TargetPlus extends Target 
{
	private FramedRect joe;

	public TargetPlus(double x, double y, DrawingCanvas neatcanvas)
	{
		super(x,y,neatcanvas);
		joe = new FramedRect(getX(),getY(),targetWidth(),targetWidth(),neatcanvas);
	}

	public void move(double x, double y)
	{
		super.move(x,y);
		joe.move(x,y);
	}
	
}