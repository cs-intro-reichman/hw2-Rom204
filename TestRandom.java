// Tests the distribution generated by Java's Math.random() function.
public  class  TestRandom {
	public static void main(String[]  args) {
	    // recieve input
		int n = Integer.parseInt(args[0]);

		// vars
		int greater = 0;
		int smaller = 0;

		// recall the random fun n times
		for (int i = 0; i < n; i++){
			double randomNum = Math.random();
			if (randomNum <= 0.5){
				smaller++;
			} else {
				greater++;
			}
		}
		double ratio = 0;
		if (smaller == 0){
			ratio = 0;
		} else {
			ratio = (double) greater / smaller;
		}
		System.out.println("> 0.5:  " + greater + " times");
		System.out.println("<= 0.5: " + smaller + " times");
		if (!(smaller == 0)){
			System.out.println("Ratio:  " + ratio);
		}
	}
}
