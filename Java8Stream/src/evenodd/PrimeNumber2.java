package evenodd;

import java.util.Scanner;
import java.util.stream.IntStream;

public class PrimeNumber2 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter A number to check Prime is not:: ");
		int number = scanner.nextInt();
		
		boolean isPrime = isPrime(number);
		if(isPrime) {
			System.out.println("Enter Number Is a Prime Number");
		}else {
			System.out.println("Enter Number is Not Prime Number");
		}
		scanner.close();
	}
	
	public static boolean isPrime(int number) {
		if(number <=1) {
			System.out.println("Enter A Valid Number");
			return false;
		}
		return IntStream.rangeClosed(2,(int)Math.sqrt(number)).noneMatch(i->number %i ==0);
	}

}
