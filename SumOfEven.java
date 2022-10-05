package Loop;

public class SumOfEven {

	public static void main(String[] args) {
		// Write a program that will get the sum of all even numbers from 1000-3000.
		int sum = 0;
		for (int i = 1000; i <= 3000; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}

}
