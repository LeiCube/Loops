package Loop;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		/*
		 * Write a program that prompts the user to input a positive integer. It should
		 * then print the multiplication table of that number.
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Please input a positive integer");
		int num = scan.nextInt();

		System.out.println("The multiplication table of " + num);

		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " x " + i + " = " + (num * i));
		}
	}

}
