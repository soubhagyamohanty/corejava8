package evenodd;

import java.util.Scanner;
import java.util.stream.IntStream;

public class PrimeNumber3 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number to check prime or not");
		int number = scanner.nextInt();
		
		boolean isPrime = isPrime(number);
		if(isPrime) {
			System.out.println("Is a Prime Number");
		}else {
			System.out.println("Is not a prime number");
		}
		scanner.close();
	}
	public static boolean  isPrime(int number) {
		if(number<=1) {
			System.out.println("Please Enter a valid Numberß");
			return false;
		}
		return IntStream.rangeClosed(2, (int)Math.sqrt(number)).noneMatch(i->number%i==0);
	}
}
