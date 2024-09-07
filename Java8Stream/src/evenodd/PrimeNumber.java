package evenodd;

import java.util.Scanner;
import java.util.stream.IntStream;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter A Number:: ");
		int input = scanner.nextInt();
		boolean isPrime = isPrime(input);
		if (isPrime) {
			System.out.println(input + " Is a prime Number");
		} else {
			System.out.println(input + " Not a prime Number");
		}
		scanner.close();
	}

	public static boolean isPrime(int input) {
		if(input<=1) {
			System.out.println("Enter A Valid Number");
			return false;
		}
		return IntStream.rangeClosed(2, (int)Math.sqrt(input))
					.noneMatch(i-> input % i == 0);
	}

}
