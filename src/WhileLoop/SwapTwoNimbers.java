package WhileLoop;

import java.util.Scanner;

public class SwapTwoNimbers {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a value :");
		int a = s.nextInt();
		System.out.println("Enter b value :");
		int b = s.nextInt();
		int temp = 0;
		temp = a;
		a = b;
		b = temp;
		System.out.printf("After Swap a = %d , b = %d ", a, b);
	}
}
