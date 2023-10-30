package WhileLoop;

import java.util.Scanner;

public class FindingSqureRoot {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number :");
		float n = s.nextFloat();
		System.out.printf("%f SQRT is %f ", n, Math.sqrt(n));
	}
}
