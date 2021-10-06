import objectdraw.*;
import java.awt.*;

public class FallingTarget extends ActiveObject
{
	private static final int DELAY_TIME = 33;
	private Target joe;
	private DrawingCanvas canvas;


	public FallingTarget(double x, double y, DrawingCanvas neatcanvas)
	{
		canvas = neatcanvas;
		joe = new Target(x,y,canvas);
		start();
	}
	
	public void run()
	{
		while(joe.getY() < canvas.getHeight())
		{
			joe.move(0,4);
			pause(DELAY_TIME);
		}
		joe.removeFromCanvas();
	}
	
}