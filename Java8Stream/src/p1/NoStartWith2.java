package p1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NoStartWith2 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,2,2,23,4,5,6,7,8,9);
		
		List<Integer> noStartsWith2 = list.stream()
		.filter(num->Integer.toString(num).startsWith("2"))
		.collect(Collectors.toList());
		
		int count = noStartsWith2.size();
		
		int count1 = (int)noStartsWith2.stream().mapToInt(Integer::intValue).summaryStatistics().getCount();
		System.out.println("count1 "+count1);
		double average = noStartsWith2.stream()
				.mapToInt(Integer::intValue).average().orElse(0);
		
		System.out.println(noStartsWith2);
		System.out.println(count);
		System.out.println(average);
	}

}
