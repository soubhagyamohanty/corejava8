package arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class IntegerArrayConcat {

	public static void main(String[] args) {
		
		Integer[] array1 = {1,2,3,4,4,5,5,6};
		Integer[] array2 = {5,5,6,6,7,8,9};
		//Sort ascending order way-1
		Integer[] finalArray =Stream.concat(Arrays.stream(array1), Arrays.stream(array2))
		.distinct().sorted((a,b)->a-b).toArray(Integer[]::new);
		//Sort descending order way-1
		Integer[] finalArray1 =Stream.concat(Arrays.stream(array1), Arrays.stream(array2))
				.distinct().sorted((a,b)->b-a).toArray(Integer[]::new);
		//Sort descending order way-2
		Integer[] finalArray2 =Stream.concat(Arrays.stream(array1), Arrays.stream(array2))
				.distinct().sorted(Comparator.reverseOrder()).toArray(Integer[]::new);
		
		
		System.out.println(Arrays.toString(finalArray));
		System.out.println(Arrays.toString(finalArray1));
		System.out.println(Arrays.toString(finalArray2));

	}

}
