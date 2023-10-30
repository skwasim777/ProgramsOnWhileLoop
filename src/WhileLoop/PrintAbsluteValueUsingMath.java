package WhileLoop;

import java.util.Scanner;

public class PrintAbsluteValueUsingMath {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter n value :");
		int n = s.nextInt();
		System.out.printf("Abslute value is = %d ", Math.abs(n));
	}
}
