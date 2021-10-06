import java.awt.Color;

public class deadFish extends Fish
{
    private int age;

    public deadFish(Environment env, Location loc)
    {
        super(env, loc, env.randomDirection(), Color.white);
        age = 0;
    }

    public deadFish(Environment env, Location loc, Direction dir)
    {
	super(env, loc, dir, Color.white);
	age = 0;
    }
    
    public deadFish(Environment env, Location loc, Direction dir, Color col)
    {
	super(env, loc, dir, col);
	age = 0;
    }

    public void act()
    {
        if ( isInEnv() )
        {
            if(age > 5)
	    {
                environment().remove(this);
	    }
	    else
	    {
		age++;
	    }
	}
    }
}