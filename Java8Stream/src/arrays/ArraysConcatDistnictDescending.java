package arrays;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArraysConcatDistnictDescending {

	public static void main(String[] args) {

		Integer[] array1 = { 1, 2, 3, 4, 4, 5, 5, 6 };
		Integer[] array2 = { 5, 5, 6, 6, 7, 8, 9 };
		Integer[] array3 = { 5, 5, 6, 1, 2, 3, 6, 7, 8, 9 };
		
		Integer[] finalArray1 =Stream.concat(Stream.concat(Arrays.stream(array1), Arrays.stream(array2)),Arrays.stream(array3))
		.distinct().sorted((a,b)->b-a).toArray(Integer[]::new);
		
		System.out.println(Arrays.toString(finalArray1));
		 

	}

}
