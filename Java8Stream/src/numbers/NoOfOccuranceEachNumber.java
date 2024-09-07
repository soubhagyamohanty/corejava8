package numbers;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NoOfOccuranceEachNumber {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,2,3,3,3,4,4,4,4,5,6,7,8,9);
		
		Map<Integer,Long> countTheOccuranceEachNumber =
				list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		countTheOccuranceEachNumber.forEach((numbers,count)->System.out.println(numbers+" occurs "+count+" times "));
	}

}
