public class Thing implements Comparable
{
	private int mynum;
	private String myName;
	
	public Thing(int num, String S)
	{
		mynum = num;
		myName = S;
	}

	public String toString()
	{
		return myName;
	}

	public int getNum()
	{
		return mynum;
	}

	public int compareTo(Object O)
	{
		Thing local = (Thing)O;
		if(mynum > local.getNum())
		{
			return 1;
		}
		else if(mynum < local.getNum())
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}	        
}
