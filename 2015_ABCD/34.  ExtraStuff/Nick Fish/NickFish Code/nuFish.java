import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;

public class nuFish extends Fish
{
    private boolean fed;
    private Fish oldFish;
    private int hunger;

    public nuFish(Environment env, Location loc)
    {
        super(env, loc, env.randomDirection(), Color.red);
        fed = false;
        hunger = 100;
    }

     public nuFish(Environment env, Location loc, Direction dir)
    {
        super(env, loc, dir, Color.red);
        fed = false;
        hunger = 100;
    }

    public nuFish(Environment env, Location loc, Direction dir, Color col)
    {
        super(env, loc, dir, col);
        fed = false;
        hunger = 100;
    }
    
    protected void die()
    {
        Debug.println(toString() + " about to die.");
        environment().remove(this);
        deadFish corpse = new deadFish(environment(), location(), direction(), color());
    }

    public void act()
    {
        if ( isInEnv() )
        {
	    if ( hunger > 0 )
            { move(); }
            else
	    { die(); }
	}
    }

    protected void move()
    {
        Debug.print("Fish " + toString() + " attempting to move.  ");
        Location nextLoc = nextLocation();

	if(fed==true)
        {
            if(environment().isEmpty(oldFish.location()))
            {
                deadFish corpse = new deadFish(environment(), oldFish.location(), oldFish.direction(), oldFish.color());
                fed = false;
            }
	}

        if ( ! nextLoc.equals(location()) )
        {
            Location oldLoc = location();
     	    if(!environment().isEmpty(nextLoc))
            {
                oldFish = (Fish)(environment().objectAt(nextLoc));
	        environment().remove(environment().objectAt(nextLoc));
	        fed=true;
	        hunger += 10;
            }
            else
            { hunger -= 2; }

            changeLocation(nextLoc);

            Direction newDir = environment().getDirection(oldLoc, nextLoc);
            changeDirection(newDir);

            Debug.println("  Moves to " + location() + direction());
        }
        else
            Debug.println("  Does not move.");
    }

    protected ArrayList fullNeighbors()
    {
        // Get all the neighbors of this fish, empty or not.
        ArrayList nbrs = environment().neighborsOf(location());

        // Figure out which neighbors are empty and add those to a new list.
        ArrayList fullNbrs = new ArrayList();
        for ( int index = 0; index < nbrs.size(); index++ )
        {
            Location loc = (Location) nbrs.get(index);
            if ( !environment().isEmpty(loc) )
                fullNbrs.add(loc);
        }

        return fullNbrs;
    }

    protected Location nextLocation()
    {
        ArrayList fullNbrs = fullNeighbors();
        ArrayList emptyNbrs = emptyNeighbors();

        Direction oppositeDir = direction().reverse();
        Location locationBehind = environment().getNeighbor(location(), oppositeDir);
        fullNbrs.remove(locationBehind);
        emptyNbrs.remove(locationBehind);
        Debug.print("Possible new locations are: " + fullNbrs.toString() + " or " + emptyNbrs.toString());

        if ( fullNbrs.size() == 0 )
        {
           Random randNumGen = RandNumGenerator.getInstance();
           int randNum = randNumGen.nextInt(emptyNbrs.size());
	       return (Location) emptyNbrs.get(randNum);
	}
	else
	{
           Random randNumGen = RandNumGenerator.getInstance();
     	   int randNum = randNumGen.nextInt(fullNbrs.size());
	       return (Location) fullNbrs.get(randNum);
	}
    }
}