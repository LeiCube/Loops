package Loop;

import java.util.Scanner;

public class FactorialValue {

	public static void main(String[] args) {
		/*
		 * Write a program to find the factorial value of any number entered through the
		 * keyboard.
		 */
		int num;
		int fact = 1; // holds the factorial
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a number: ");
		num = scan.nextInt();
		for (int i = 1; i <= num; i++) {
			fact *= i;
		}
		System.out.println("Factorial: " + fact);
	}

}
