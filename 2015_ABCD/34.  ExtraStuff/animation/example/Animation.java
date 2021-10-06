import objectdraw.*;
import java.awt.*;

public class Animation extends WindowController
{
	private FallingTarget fred;
	//private Text message;
	//private int xdia, ydia;

	public void begin()
	{
		//fred = new FallingTarget(50,0,canvas);
		//message = new Text("Please click the mouse repeatedly", 20,20,canvas);
	}

	public void onMouseClick(Location point)
	{
		new FallingTarget(point.getX(),point.getY(),canvas);
	}

/*
	public void onMouseExit(Location point)
	{
		canvas.clear();
		xdia = 10;
		ydia = 10;
		hotsun = new FilledOval(50,50,xdia,ydia,canvas);
		message = new Text("Please click the mouse repeatedly", 20,20,canvas);
	}
*/	
}