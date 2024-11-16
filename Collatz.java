// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int n = Integer.parseInt(args[0]);
		String mode = args[1];
	    boolean print = "v".equals(mode);
		for (int i = 1; i <= n; i++) {
			steps(i, print);
		}
		System.out.println("\nEvery one of the first " + n + " hailstone sequences reached 1.");
	}

	public static int steps(int count, boolean print) {
		
		int steps = 1;
		int currentNum = count;

		do {
			System.out.print(print ? currentNum + " " : "");
			if (currentNum % 2 == 0){
				currentNum /= 2;
			} else {
				currentNum = (currentNum * 3) + 1;
			}
			steps++;
		} while (currentNum != 1);
		if (print) {
			System.out.print(currentNum + " ");
			System.out.print("(" + steps + ")");
			System.out.println("");
		}
		return steps;
	}
}
