// String examples using String class methods.

class temp {
        public static void main(String args[])
        {
 		String w1 = new String("zeus");
		String w2 = new String("alpha");

		if(w1.compareTo(w2) > 0)
		{
			System.out.println(w1 + " is alphabetically greater than " + w2);
		}
		else if(w1.compareTo(w2) == 0)
		{
			System.out.println("The words are the same.");
		}
		else if(w1.compareTo(w2) < 0)
		{
			System.out.println(w1 + " is alphabetically less than " + w2);
		}
		else
		{
			System.out.println("Something is crazy.");
		}
		
        }
}
