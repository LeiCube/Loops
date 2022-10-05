package Loop;

import java.util.Scanner;

public class LoopProb2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String word = scan.next();

		for (int i = 0; i < word.length(); i++) {
			char a = word.charAt(i);
			System.out.print(a + "*");
		}
	}
}
