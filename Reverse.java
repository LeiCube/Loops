package Loop;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		/*
		 * Write a program that prompts the user to input an integer and then outputs
		 * the number with the digits reversed. For example, if the input is 12345, the
		 * output should be 54321.
		 */
		Scanner scan = new Scanner(System.in);
		int reversed = 0; // store the reversed number
		int remainder;
		int num = 123; // 12 || 1 ||
//		System.out.println("Please enter a number");
//		int num = scan.nextInt();

		while (num > 0) {
			remainder = num % 10; // remainder = 3 || remainder = 2 || remainder = 1
			reversed = reversed * 10 + remainder;
			// reversed = 0 * 10 + 3 = 3 || reversed = 3 * 10 + 2 = 32 || reversed = 32 * 10
			// + 1 = 321
			num /= 10; // num = 123/10 = 12 || num = 12/10 = 1 || num = 0
		}
		System.out.println(reversed);
	}

}
