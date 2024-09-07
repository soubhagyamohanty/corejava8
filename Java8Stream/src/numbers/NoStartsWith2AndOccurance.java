package numbers;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NoStartsWith2AndOccurance {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 2,2,2, 3, 3, 3, 4, 4, 4, 4, 5, 6, 7, 8, 9);

		Map<Integer, Long> noStartsWith2AndOccurance = list.stream().filter(num -> String.valueOf(num).startsWith("5"))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		noStartsWith2AndOccurance.forEach(
				(number, count) -> System.out.println(number + " NoStartsWith2AndOccurance" + " Times" + count));

	}

}
