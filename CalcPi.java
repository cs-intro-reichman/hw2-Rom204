// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) {
		// inputs
		int terms = Integer.parseInt(args[0]);
		
		double approximatedPI = 0.0;
		int divisor = 3;

		if (terms == 1) {
			approximatedPI = 1.0;
		} else {
			approximatedPI = 1.0;
			// after the initial 1
			for (int i = 0; i < terms - 1; i++){
				if (i % 2 == 0){
					approximatedPI -= (1.0 / divisor); 
				} else {
					approximatedPI += (1.0 / divisor); 
				}
				divisor += 2;
			}
		}

		// output
	    System.out.println("pi according to Java: " + Math.PI);
	    System.out.println("pi, approximated:     " + approximatedPI * 4);
	}
}
