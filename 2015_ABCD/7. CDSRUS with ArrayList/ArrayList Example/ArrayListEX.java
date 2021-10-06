import java.util.*;

public class ArrayListEX
{
	public static void main(String[] args)
	{
		EasyReader readIn = new EasyReader("EXlist.txt");

		//Initialize ArrayList
		ArrayList ex = new ArrayList();

		while(!readIn.eof())
		{
			//Read Values
			String temp = readIn.readLine();

			//Store Values
			if(temp != null)
			{
				ex.add(temp);
			}
		}

		//Get size of List and Output Size
		int Si = ex.size();
		System.out.println(Si);


		//Get Value from list and Output Value
		String A = (String)ex.get(0);
		System.out.println(A);


		//Remove and Output Values from list
		String B = (String)ex.remove(3);
		String C = (String)ex.remove(3);
		System.out.println(B+C);

		//Output current size of list
		System.out.println(ex.size());
	}
}