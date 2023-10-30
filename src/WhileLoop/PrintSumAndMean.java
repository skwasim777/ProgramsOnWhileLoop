package WhileLoop;

import java.util.Scanner;

public class PrintSumAndMean {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int n = s.nextInt();
		int sum = 0, i = 0;
		while (i <= n) {
			sum = sum + i;
			i++;
		}
		System.out.println("Sum " + sum + " Mean " + (sum / n));
	}
}
