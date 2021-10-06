import objectdraw.*;
import java.awt.*;

public class MoveTarget2 extends WindowController
{
	private TargetPlus bullsqu;
	private Target bullseye;
	private Square sbox;
	private Location pos;
	private Location lastPoint;
	private boolean inBox;
	private Movable dragme;
	private boolean dragged;

	public void begin()
	{
		pos = new Location (70,70);
		bullseye = new Target(30,30,canvas);
		sbox = new Square(pos, canvas);
		bullsqu = new TargetPlus(10,1,canvas);
	}

	public void onMousePress(Location point)
	{
		lastPoint=point;
		if(bullseye.contains(point))
		{
			dragme = bullseye;
			dragged = true;
		}
		else if(sbox.contains(point))
		{
			dragme = sbox;
			dragged = true;
		}
		else if(bullsqu.contains(point))
		{
			dragme = bullsqu;
			dragged = true;
		}
		else
		{
			dragged = false;
		}
	}

	public void onMouseDrag(Location point)
	{
		if(dragged)
		{
			dragme.move(point.getX()-lastPoint.getX(),
			point.getY() - lastPoint.getY());
			lastPoint = point;
		}
	}
	
}