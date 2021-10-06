class starter {
	
        public static void main(String args[])
        {
		Thing j = new Thing(10,"Happy");
		Thing k = new Thing(20,"Jump");
		if(j.compareTo(k) > 0)
		{
			System.out.println(j+" is greater than "+k);
		}
		else if(j.compareTo(k) < 0)
		{
			System.out.println(j+ " is less than "+k);
		}
		else
		{
			System.out.println(j+" equals "+k);
		}		
	  }
        
}
