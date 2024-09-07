package evenodd;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenOddExample {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,2,2,23,4,5,6,7,8,9);
		List<Integer> finalList=list.stream().filter(x->x%2 ==0).collect(Collectors.toList());
		List<Integer> finalList1=list.stream().filter(x->x%2 !=0).collect(Collectors.toList());
		System.out.println("Even Number ::"+ finalList);
		System.out.println("Odd Number ::"+ finalList1);
		
	}

}
