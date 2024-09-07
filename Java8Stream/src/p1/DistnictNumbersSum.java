package p1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class DistnictNumbersSum {

	public static void main(String[] args) {
		 List<Integer> list = Arrays.asList(0, 1, 4, 2, 3, 3, 4, 4, 5, 6, 7, 8, 9);
		 
//		 	 Stream<Integer> distinct = list.stream().distinct();
//		 	int sum =distinct.mapToInt(Integer::intValue).sum();
//		 	//or int sum = list.stream().distinct().mapToInt(Integer::intValue).sum();
//		 	System.out.println(sum);
		 	
		 	//distinct first 4 number sum 
		 	
		 	int sum1= list.stream().distinct().limit(4).mapToInt(Integer::intValue).sum();
		 	System.out.println(sum1);
		 	
		 	//sum of last 4 digit
		 	int sum2 =list.stream().skip(list.size()-4).mapToInt(Integer::valueOf).sum();
		 	System.out.println(sum2);
	}

}
