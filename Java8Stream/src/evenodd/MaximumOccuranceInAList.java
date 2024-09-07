package evenodd;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MaximumOccuranceInAList {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,2,2,2,2,223,4,5,6,7,8,9);
		//output ::Count the Highest Occurance ::2
		//No of Occurance ::5
		
		Optional<Map.Entry<Integer,Long>> countTheOccurance = 
				list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
				.entrySet().stream().max(Map.Entry.comparingByValue());
		if(countTheOccurance.isPresent()) {
			System.out.println("Count the Highest Occurance ::" +countTheOccurance.get().getKey());
			System.out.println("No of Occurance ::" +countTheOccurance.get().getValue());
		}else {
			System.out.println("List has no occurance");
		}

	}

}
