class Client {
        public static void main(String args[])
        {
		Apple one = new Apple(.5);
		Apple two = new Apple(.25);
		Object three = new Apple(.4);
		Fruit four = new Apple(.1);
		Fruit five = new Banana(.3);
		Banana six = new Banana(.2);
		Object seven = new Banana(.35);
		Fruit collection[] = {new Apple(.1),new Banana(1.3), new Banana(.4), new Apple(.9),
				new Apple(2.0)};

		System.out.println(one);
		System.out.println(two);
		System.out.println(three);
		System.out.println(four);
		System.out.println(four.getWeight());
		System.out.println(five);
		System.out.println(six);
		System.out.println(seven);
		System.out.println();
		System.out.println();
		System.out.println("Here is the array of Fruit: ");
		for(int i=0;i<collection.length;i++)
		{
			System.out.println(collection[i]);
		}	
        }
        
}
