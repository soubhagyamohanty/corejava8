package p1;

import java.util.Arrays;
import java.util.List;

public class MiddelFour {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
		int start = (list.size()-2)/2;
		
		double average =list.stream().skip(start).limit(2).mapToInt(Integer::intValue).average().getAsDouble();
		
		System.out.println(average);

	}

}
