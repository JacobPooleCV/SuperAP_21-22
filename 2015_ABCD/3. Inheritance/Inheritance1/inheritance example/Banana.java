public class Banana extends Fruit
{
     	private double weight;
	private static final String name = "banana";
	
	public Banana()
	{
		weight = 0.0;
	}
	public Banana(double w)
	{
		weight = w;
	} 
 
	public double getWeight()
	{
		return weight;
	}

	public String toString()
	{
		return "The " + name + " weighs " + weight + " lbs";
	}  
}
