class starter {
	
        public static void main(String args[])
        {
		String joe,tempz;
		int counter=0;
		int size = 0;
		EasyReader inFile2 = new EasyReader("moby.txt");
		joe = inFile2.readWord();
		while((joe!= null))
		{	
			joe = inFile2.readWord();			
			++size;
		}
		String[] wordarray = new String[size];
		EasyReader inFile = new EasyReader("moby.txt");
		joe = inFile.readWord();
		while((joe!= null)&&(counter < size))
		{	
			wordarray[counter]=joe;
			joe = inFile.readWord();			
			++counter;
		}
		//printlist(wordarray);
		myHS(wordarray);
		//printlist(wordarray);		
        }

	  public static void printlist(String[] p)
	  {
		int i;
		for(i=0;i<p.length;i++)
		{
			System.out.println(p[i]);
		}
	  }

	  public static void myHS(Comparable[] list)
	  {
		int i;
		HeapPriorityQueue col = new HeapPriorityQueue(list.length);
		// put stuff in the heap
		for(i=0; i<list.length;i++)
		{
			col.add(list[i]);
		}
		// pull values out of the heap and put back in array

		for(i=0;i<list.length;i++)
		{
			list[i] = (String)col.removeMin();
		}

     	  }   
}
