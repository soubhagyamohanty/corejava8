package evenodd;

import java.util.Arrays;
import java.util.List;

public class MissingNumber {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,8,9,10);
		
		int missingNumber = findMissingNumber(list);
		
		System.out.println("Missing Number Is:: "+missingNumber);
	}

	private static int findMissingNumber(List<Integer> list) {
		int n = list.size()+1;
		int expectedSum = n*(n+1)/2;
		
		int actualSum = list.stream().mapToInt(Integer::intValue).sum();
		return expectedSum - actualSum;
	}

}
