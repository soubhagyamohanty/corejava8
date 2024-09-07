package p1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MisslaniousNumber {

	public static void main(String[] args) {
		 List<Integer> list = Arrays.asList(0, 1, 4, 2, 3, 3, 4, 4, 5, 6, 7, 8, 9);
		 
		List<Integer> finalList =list.stream().distinct().collect(Collectors.toList());
		System.out.println(finalList);
		
		 Optional<Integer> max = list.stream().max(Integer::compareTo);
		 System.out.println(max.get());
		 
		 //
		 int max1 =list.stream().mapToInt(Integer::intValue).max().getAsInt();
		 int min1 = list.stream().mapToInt(Integer::intValue).min().getAsInt();
		 double average = list.stream().mapToInt(Integer::intValue).average().getAsDouble();
		 
		 System.out.println(max1);
		 System.out.println(min1);
		 System.out.println(average);
		 
		 IntSummaryStatistics summaryStatistics = list.stream().mapToInt(Integer::intValue).summaryStatistics();
		 System.out.println();
		 
	}

}
