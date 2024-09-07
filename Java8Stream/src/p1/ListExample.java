package p1;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		 List<Integer> list = Arrays.asList(0, 1, 4, 2, 3, 3, 4, 4, 5, 6, 7, 8, 9);
		 
		IntSummaryStatistics sum = 
				list.stream().mapToInt(Integer::intValue).summaryStatistics();
		System.out.println(sum.getAverage());
		//Last 4
		double averge  =
				list.stream().skip(list.size()-4).mapToInt(Integer::intValue).average().getAsDouble();
		System.out.println(averge);
	}

}
