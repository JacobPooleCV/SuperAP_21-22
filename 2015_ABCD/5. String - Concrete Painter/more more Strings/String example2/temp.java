// String examples using String class methods.

class temp {
        public static void main(String args[])
        {
 		String w1 = new String("These computers are sure fast.");
		String w2;
		String w3;

		System.out.println(w1);
		w2 = w1.substring(w1.indexOf("are"));		
		System.out.println(w2);
		w3 = "Cheetah's " + w2;
		System.out.println(w3);

        }
}
