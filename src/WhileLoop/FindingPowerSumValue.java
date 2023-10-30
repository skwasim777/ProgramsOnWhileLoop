package WhileLoop;

import java.util.Scanner;

public class FindingPowerSumValue {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Base Value :");
		int b = s.nextInt();
		System.out.println("Enter Power Value :");
		int p = s.nextInt();
		int pwr = 1;
		int sum = 0;
		while (p >= 1) {
			pwr = pwr * b;
			sum = sum + pwr;
			p--;
		}
		System.out.printf("Power Sum value is = %d ", sum);
	}
}
