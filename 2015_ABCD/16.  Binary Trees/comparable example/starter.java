class starter {
	
        public static void main(String args[])
        {
		String j = new String("Happy");
		String k = new String("Jump");
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
