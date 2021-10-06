import objectdraw.*;
import java.awt.*;


public class ninja extends abstractpeople
{
	private Color flesh = new Color(255,194,128);
	private FilledRect body;
	private FilledRect head;
	private FilledRect band;
	private FilledRect eyes;
	private FilledRect rightE;
	private FilledRect leftE;
	private FilledRect rightA;
	private FilledRect rightH;
	private FilledRect leftA;
	private FilledRect leftA2;
	private FilledRect leftH;
	private FilledRect waist;
	private FilledRect leftL;
	private FilledRect rightL;
	private FilledRect leftF;
	private FilledRect rightF;
	private FilledRect frontPunch;
	private FilledRect backPunch;
	private FilledRect upPunch;
	private FilledRect frontPunchH;
	private FilledRect backPunchH;
	private FilledRect backPunchH2;
	private FilledRect upPunchH;
	private Location lastPoint;
	private boolean inBox;
	private int mover=1;
	
	public ninja( double x, double y, DrawingCanvas canvas )
	{
		makeninja( x, y, canvas );
	}

	private void makeninja( double x, double y, DrawingCanvas canvas )
	{	
		body = new FilledRect(x,y,30,50,canvas);
		
		head = new FilledRect(x,y-30,30,30,canvas);
		
		band = new FilledRect(x,y-25,30,5,canvas);
		band.setColor(Color.red);
		
		eyes = new FilledRect(x+5,y-20,20,10,canvas);
		eyes.setColor(flesh);
		
		rightE = new FilledRect(x+10,y-20,2,5,canvas);
	
		leftE = new FilledRect(x+17,y-20,2,5,canvas);
		
		rightA = new FilledRect(x-10,y,10,25,canvas);
		
		rightH = new FilledRect(x+10,y,10,10,canvas);
		rightH.setColor(flesh);
		
		leftA = new FilledRect(x+30,y,10,25,canvas);
		
		leftA2 = new FilledRect(x+30,y+15,25,10,canvas);
		
		leftH = new FilledRect(x+45,y+15,10,10,canvas);
		leftH.setColor(flesh);
		
		waist = new FilledRect(x-10,y+40,50,20,canvas);
		
		leftL = new FilledRect(x-10,y+60,20,20,canvas);
		
		rightL = new FilledRect(x+20,y+60,20,20,canvas);
		
		leftF = new FilledRect(x,y+80,10,20,canvas);
		
		rightF = new FilledRect(x+20,y+80,10,20,canvas);
		
		frontPunch = new FilledRect(x+30,y,40,10,canvas);
		frontPunch.hide();
		
		frontPunchH = new FilledRect(x+60,y,10,10,canvas);
		frontPunchH.setColor(flesh);
		frontPunchH.hide();
		
		backPunch = new FilledRect(x-40,y,40,10,canvas);
		backPunch.hide();
		
		backPunchH = new FilledRect(x-50,y,10,10,canvas);
		backPunchH.setColor(flesh);
		backPunchH.hide();
		
		backPunchH2 = new FilledRect(x+10,y+10,10,10,canvas);
		backPunchH2.setColor(flesh);
		backPunchH2.hide();
		
		upPunch =  new FilledRect(x,y-40,10,40,canvas);
		upPunch.hide();
		
		upPunchH = new FilledRect(x,y-50,10,10,canvas);
		upPunchH.setColor(flesh);
		upPunchH.hide();
	}
	public double getX()
	{
		return body.getX();
	}
	
	public double getY()
	{
		return body.getY();
	}
	public Location FrontHit()
	{
		return leftH.getLocation();
	}
	public Location UpHit()
	{
		return rightH.getLocation(); 
	}

	public void hide()
	{
		body.hide();
		head.hide();
		band.hide();
		eyes.hide();
		rightE.hide();
		leftE.hide();
		rightA.hide();
		rightH.hide();
		leftA.hide();
		leftA2.hide();
		leftH.hide();
		waist.hide();
		leftL.hide();
		rightL.hide();
		leftF.hide();
		rightF.hide();
	}

	public void show()
	{
		body.show();
		head.show();
		band.show();
		eyes.show();
		rightE.show();
		leftE.show();
		rightA.show();
		rightH.show();
		leftA.show();
		leftA2.show();
		leftH.show();
		waist.show();
		leftL.show();
		rightL.show();
		leftF.show();
		rightF.show();
	}

	public void move( double x, double y )
	{
		body.move(x,y);
		head.move(x,y);
		band.move(x,y);
		eyes.move(x,y);
		rightE.move(x,y);
		leftE.move(x,y);
		rightA.move(x,y);
		rightH.move(x,y);
		leftA.move(x,y);
		leftA2.move(x,y);
		leftH.move(x,y);
		waist.move(x,y);
		leftL.move(x,y);
		rightL.move(x,y);
		leftF.move(x,y);
		rightF.move(x,y);
		frontPunch.move(x,y);
		backPunch.move(x,y);
		upPunch.move(x,y);
		
		frontPunchH.move(x,y);
		backPunchH.move(x,y);
		backPunchH2.move(x,y);
		upPunchH.move(x,y);	
	}

	public void moveTo( double x, double y )
	{
		move( x-getX(), y-getY() );
	}

	public void moveTo( Location point )
	{
		moveTo( point.getX(), point.getY() );
	}

	public Color getColor()
	{
		return band.getColor();
	}

	public void setColor( Color newColor )
	{
		band.setColor( newColor );
	}
	public void frontPunch()
	{
		leftA.hide();
		leftA2.hide();
		leftH.hide();
		frontPunch.show();
		frontPunchH.show();
	}
	public void endFrontPunch()
	{
		frontPunch.hide();
		frontPunchH.hide();
		leftA.show();
		leftA2.show();
		leftH.show();
	}
	public void backPunch()
	{
		rightA.hide();
		leftA2.hide();
		leftH.hide();
		rightH.hide();
		backPunch.show();
		backPunchH.show();
		backPunchH2.show();
	}
	public void endBackPunch()
	{
		rightA.show();
		leftA2.show();
		leftH.show();
		rightH.show();
		backPunch.hide();
		backPunchH.hide();
		backPunchH2.hide();
	}
	public void upPunch()
	{
		rightA.hide();
		rightH.hide();
		upPunch.show();
		upPunchH.show();
	}
	public void endUpPunch()
	{
		rightA.show();
		rightH.show();
		upPunch.hide();
		upPunchH.hide();
	}
	public boolean contains( Location point )
	{	
				return body.contains(point) ||
		       head.contains(point) || band.contains(point) ||
		        eyes.contains(point) || rightE.contains(point) ||
		       leftE.contains(point) || rightA.contains(point) || rightH.contains(point) ||
		       leftA.contains(point) || leftA2.contains(point) || leftH.contains(point) ||
		       waist.contains(point) || leftL.contains(point) || rightL.contains(point) ||
		       leftF.contains(point) || rightF.contains(point);
	}
	
	//abstract
	public void swing()
	{
	}
	public void frontSword()
	{
		frontPunch();
	}
	public void endFrontSword()
	{
		endFrontPunch();
	}
	
	
}
