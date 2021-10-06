public class Apple extends Fruit
{
     	private double weight;
 	private static final String name = "apple";

	public Apple()
	{
		weight = 0.0;
	}
	public Apple(double w)
	{
		weight = w;
	} 
 
	public double getWeight()
	{
		return weight;
	}

	public String toString()
	{
		return "The "+ name +"  weighs " + weight + " lbs";
	}  
}
