package Loop;

import java.util.Scanner;

public class Nterms {

	public static void main(String[] args) {
		// Write a program that displays N terms of natural numbers and their sum.
		int num;
		int sum = 0; // counter
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		num = scan.nextInt();

		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

}
