package Loop;

import java.util.Scanner;

public class LoopExercise {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int sum = num;
		while (sum < 100) {
			num = scan.nextInt();
			sum += num;
		}
		System.out.println("DONE");

	}
}
