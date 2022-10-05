package Loop;

public class Reverse2 {

	public static void main(String[] args) {

		int num, reversed = 0;

		for (num = 123; num > 0; num /= 10) {
			int digit = num % 10;
			reversed = reversed * 10 + digit;
		}
		// start with 123 || if num is > 0 || num /= 10

		System.out.println("Reversed Number: " + reversed + " and " + num);
	}

}
