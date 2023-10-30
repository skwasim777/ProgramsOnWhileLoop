package WhileLoop;

import java.util.Scanner;

public class AbsluteValue {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a value :");
		int n = s.nextInt();
		if (n < 0) {
			n = n * -1;
		}
		System.out.printf("Abslute Value Is = %d ", n);
	}
}
