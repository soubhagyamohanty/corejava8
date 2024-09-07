package arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntegerArray {

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1,2,3,4,5);
		List<Integer> list2 = Arrays.asList(5,6,7,8,4,4,5,7,9,1);
		//1st Approach
		List<Integer> finalList =Stream.concat(list1.stream(), list2.stream())
		.distinct().sorted((a,b)->b-a).collect(Collectors.toList());
		//2nd Approach
		List<Integer> finalList2 =Stream.concat(list1.stream(), list2.stream())
				.distinct().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		
		System.out.println(finalList);
		
		System.out.println(finalList2);
		
	}

}
