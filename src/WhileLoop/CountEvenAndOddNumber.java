package WhileLoop;

import java.util.Scanner;

public class CountEvenAndOddNumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = s.nextInt();
		int en = 0, on = 0;
		while (n >= 1) {
			if (n % 2 == 0)
				en++;
			else
				on++;
			n--;

		}
		System.out.printf("Even = %d  , Odd = %d ", en,on);
	}
}
