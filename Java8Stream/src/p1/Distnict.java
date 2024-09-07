package p1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Distnict {
	
	 public static void main(String[] args) {
	        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);

	        List<Integer> finalList =list.stream()
	        .skip(3).distinct().collect(Collectors.toList());
	        System.out.println(finalList);
	        
	   double average =finalList.stream().mapToInt(Integer::intValue).average().getAsDouble();
	   		System.out.println(average);
	        

	 }
}
