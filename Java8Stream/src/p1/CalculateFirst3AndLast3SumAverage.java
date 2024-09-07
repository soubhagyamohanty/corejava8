package p1;

import java.util.Arrays;
import java.util.List;

public class CalculateFirst3AndLast3SumAverage {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(0,1,4,2,3,3,4,4,5,6,7,8,9);
		//first 3 no sum
		int sum1 =list.stream().limit(3).mapToInt(Integer::intValue).sum();
		System.out.println("first 3 no sum "+sum1);
		
		//last 3 No sum 
		int sum2 = list.stream().skip(list.size()-3).mapToInt(Integer::intValue).sum();
		System.out.println("last 3 no sum "+sum2);
		
		//First 3 no Average
		double Average1 =list.stream().limit(3).mapToInt(Integer::intValue).average().getAsDouble();
		System.out.println("First 3 no Average "+ Average1);
		
		//Last 3 no Average
		double Average2 =list.stream().skip(list.size()-3).mapToInt(Integer::intValue).average().getAsDouble();
		System.out.println("First 3 no Average "+ Average2);

	}

}
