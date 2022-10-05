package Loop;

import java.util.Scanner;

public class LoopProb3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		String reverse = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			reverse = reverse + word.charAt(i);
		}

		System.out.println(reverse);
	}

}
