package WhileLoop;

import java.util.Scanner;

public class FindFactorialNumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = s.nextInt();
		long f = 1;
		while (n >= 1) {
			f = f * n;
			n--;
		}
		System.out.println("Factorial Number is " + f);
	}
}
