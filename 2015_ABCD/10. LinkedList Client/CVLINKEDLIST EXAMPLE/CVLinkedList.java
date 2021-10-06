public class CVLinkedList implements CVList
{
	/*HIDDEN*/

	public CVLinkedList()
	{
		/*HIDDEN*/
	}

	public boolean add(Object o)
	{
		if(first == null)
		{
			first = new ListNode(o,null);
			size++;
		}
		else if(last == null)
		{
			last = new ListNode(o,first,null);
			first.setNext(last);
			size++;
		}
		else
		{
			ListNode next = new ListNode(o,last,null);
			last.setNext(next);
			last = next;
			size++;
		}

		return true;
	}

	public void add(int index, Object o)
	{
		/*HIDDEN*/
	}

	public Object set(int index, Object o)
	{
		/*HIDDEN*/
	}

	public Object remove(int index)
	{
		/*HIDDEN*/
	}

	public Object get(int index)
	{
		/*HIDDEN*/
	}

	public int size()
	{
		/*HIDDEN*/
	}
}