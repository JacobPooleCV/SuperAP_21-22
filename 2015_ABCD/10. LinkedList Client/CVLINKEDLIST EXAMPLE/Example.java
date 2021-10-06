import java.util.*;

public class Example
{
	private static CVLinkedList tempg;

	public static void main(String args[])
	{
		parseList k = new parseList("list.txt");
		tempg = k.get();
		traverse(tempg);
	}

	public static void traverse(CVLinkedList i)
	{
		for(int k=0;k<tempg.size();k++)
		{
			System.out.println(i.get(k));
		}
	}
}