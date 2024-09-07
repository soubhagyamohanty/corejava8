package p1;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class MaxMinAverage {
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(0,1,2,2,3,3,4,4,5,6,7,8,9);
		
		//Normal Approach
		//Calculate the sum using Normal Approach
		int sum =list.stream().mapToInt(Integer::intValue).sum();
		System.out.println("Sum Is:: "+ sum);
		
		//Calculate the Average using Normal Approach
		//It returns OptionalDouble
		 OptionalDouble average = list.stream().mapToInt(Integer::intValue).average();
		 System.out.println("Average Is:: "+ average.getAsDouble());
		 
		 //Calculate the Max using Normal Approach
		//It returns OptionalInt
		 OptionalInt max = list.stream().mapToInt(Integer::intValue).max();
		 System.out.println("Max Is:: "+ max.getAsInt());
		 
		  //Calculate the Min using Normal Approach
		 //It returns OptionalInt
		 OptionalInt min = list.stream().mapToInt(Integer::intValue).min();
		 System.out.println("Min Is:: "+ min.getAsInt());
		 
		 ///Using SummmaryStatictics
		 //Calculate the sum using SummmaryStatictics Approach
		 IntSummaryStatistics sum1 =list.stream().mapToInt(Integer::intValue).summaryStatistics();
		 //Average 3rd way
		 double average2 = list.stream().mapToInt(Integer::intValue).summaryStatistics().getAverage();
		 System.out.println("sum using SummmaryStatictics Approach "+sum1.getSum());
		 //2 way 
		 System.out.println("Average using SummmaryStatictics Approach "+sum1.getAverage());
		 System.out.println("Average using SummmaryStatictics Approach-2nd Way:: "+average2);
		 //
		 System.out.println("Max using SummmaryStatictics Approach "+sum1.getMax());
		 System.out.println("Min using SummmaryStatictics Approach "+sum1.getMin());
		 
		 
	}

}
