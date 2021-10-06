import java.awt.Color;
import java.util.ArrayList;

public class reaperFish extends Fish
{

    public reaperFish(Environment env, Location loc)
    {
        super(env, loc, env.randomDirection(), Color.black);//new Color(153,0,0));
    }

    public reaperFish(Environment env, Location loc, Direction dir)
    {
		super(env, loc, dir, Color.white);
    }
    
    public reaperFish(Environment env, Location loc, Direction dir, Color col)
    {
		super(env, loc, dir, col);
    }

    public void act()
    {
        if ( isInEnv() )
        {
        	move();
	    }
	}
	protected void move()
    {
        Debug.print("Fish " + toString() + " attempting to move.  ");
        Location oldLoc = location();
        Location nextLoc = nextLocation();
        //ArrayList others = environment().neighborsOf(location());

        if ( ! nextLoc.equals(location()) )
        {
        	changeLocation(nextLoc);
        	
        	int row0 = nextLoc.row();
        	int col0 = nextLoc.col();
        	int row1 = row0; int row2 = row0;
        	int col1 = col0; int col2 = col0;
        	
        	for(int i = 0; i < 1+((int)(Math.random()*4)); i++)
        	{
        		if(row1 > 0)
        		{
        			row1 --;
        		}
        		if(row2 < environment().numRows())
        		{
        			row2 ++;
        		}
        		if(col1 > 0)
        		{
        			col1 --;
        		}
        		if(col2 < environment().numCols())
        		{
        			col2++;
        		}
        		if(environment().numCols() == -1)
        		{
        			row1 --;
        			row2 ++;
        			col1 --;
        			col2 ++;
        		}
        	}
        	
        	Locatable[] allFish = environment().allObjects();
        	
        	for(int i = row1; i < row2; i++)
        	{
        		for(int a = col1; a < col2; a++)
        		{
        			Location tempLoc = new Location(i,a);
        			if(i != nextLoc.row() && a != nextLoc.col())
        			{
        				if(environment().objectAt(tempLoc) != null && ((Fish)environment().objectAt(tempLoc)).color() != Color.white)
        				{
        					environment().remove(environment().objectAt(tempLoc));
	        				new deadFish(environment(),tempLoc);
        				}
        			}
        		}
        	}
        	
        	/*
        	for(int i = 0; i < others.size(); i++)
        	{
        		Location tempLoc = (Location)others.get(i);
     	    	if(!environment().isEmpty(tempLoc))
            	{
            		if(((Fish)environment().objectAt(tempLoc)).color() != Color.white)
            		{
	        			environment().remove(environment().objectAt(tempLoc));
	        			new deadFish(environment(),tempLoc);
	        			ArrayList more = environment().neighborsOf(tempLoc);
            			for(int a = 0; a < more.size(); a ++)
            			{
            				Location morLoc = (Location) more.get(a);
            				if(morLoc != location())
            				{
            					if(environment().objectAt(morLoc) != null && ((Fish)environment().objectAt(morLoc)).color() != Color.white)
            					{
            						System.out.println(morLoc);
            					}
            				}
            			}
            		}
            	}
            	else
            	{
            	}
        	}
        	*/


            Direction newDir = environment().getDirection(oldLoc, nextLoc);
            changeDirection(newDir);

            Debug.println("  Moves to " + location() + direction());
        }
        else
            Debug.println("  Does not move.");
    }
}