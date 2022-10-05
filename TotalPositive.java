package Loop;

import java.util.Scanner;

public class TotalPositive {

	public static void main(String[] args) {
		/*
		 * Write a program that reads 6 numbers. These numbers will only be positive or
		 * negative (disregard null values). Print the total number of positive numbers
		 */
		Scanner scan = new Scanner(System.in);
		int num = 0;
		for (int i = 1; i <= 6; i++) {
			int number = scan.nextInt();
			if (number > 0)
				num++;
		}
		System.out.println(num + " positive numbers");
	}

}
