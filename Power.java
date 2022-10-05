package Loop;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		/*
		 * Two numbers are entered through the keyboard. Write a program to find the
		 * value of one number raised to the power of another. (Do not use Java built-in
		 * method)
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter Two numbers: ");
		int num = scan.nextInt();
		int power = scan.nextInt();
		int answer = 1; // holds the answer

		// i starts with 1; i should be <= power, i++
		for (int i = 1; i <= power; i++) {
			answer *= num;
		}
		System.out.println("Answer : " + answer);
	}

}
