import java.util.*;

public class Example
{
	public static void main(String args[])
	{
		parseList k = new parseList("list.txt");

		ListNode first = null;

		for(int i = 0; i<k.size(); i++)
		{
			first = new ListNode(k.get(i),first);
		}

		traverse(first);
	}

	public static void traverse(ListNode l)
	{
		ListNode o = l;
		while(o != null)
		{
			System.out.println(o.getValue());
			o = o.getNext();
		}
	}
}