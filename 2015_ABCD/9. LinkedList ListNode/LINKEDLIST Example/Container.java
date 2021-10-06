public class Container
{
	private String label, container;
	private int amt,per;
	
	public Container(String labelo, String containo, int pero, int amto)
	{
		label = labelo;
		container = containo;
		amt = amto;
		per = pero;
	}
	
	public String getLabel()
	{
		return label;
	}
	
	public String getContent()
	{
		return container;
	}
	
	public int getAmountInStock()
	{
		return amt;
	}
	
	public int getAmountPerCase()
	{
		return per;
	}
	
	public void newLabel(String labelg)
	{
		label = labelg;
	}
	
	public void newContent(String contentg)
	{
		container = contentg;
	}
	
	public void newAmountInStock(int amtg)
	{
		amt = amtg;
	}
	
	public void newAmountPerCase(int perg)
	{
		per = perg;
	}
	
	public String toString()
	{
		return label+" "+container+" "+amt+" "+per;
	}
}