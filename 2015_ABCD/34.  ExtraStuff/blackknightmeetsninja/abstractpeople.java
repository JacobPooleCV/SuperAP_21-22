import java.awt.*;
import objectdraw.*;

public abstract class abstractpeople
{
	//ninja
	public abstract void swing();
	public abstract void move(double x, double y);	
	public abstract boolean contains(Location k);
	//public abstract void makeninja( double x, double y,DrawingCanvas canvas);
	public abstract double getX();
	public abstract double getY();
	public abstract Location FrontHit();
	public abstract Location UpHit();
	public abstract void hide();
	public abstract void show();
	public abstract void moveTo( double x, double y );
	public abstract void moveTo( Location point );
	public abstract Color getColor();
	public abstract void setColor( Color newColor );
	public abstract void frontPunch();
	public abstract void endFrontPunch();
	public abstract void backPunch();
	public abstract void endBackPunch();
	public abstract void upPunch();
	public abstract void endUpPunch();
	
	//armedninja
	public abstract void frontSword();
	public abstract void endFrontSword();
	
	
	
} 
 