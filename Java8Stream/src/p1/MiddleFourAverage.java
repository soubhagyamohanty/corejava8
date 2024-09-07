package p1;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class MiddleFourAverage {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(0, 1, 4, 2, 3, 3, 4, 4, 5, 6, 7, 8, 9);

        // Calculate the start index to skip and then limit to the middle 4 elements
        int start = (list.size() - 4) / 2; // starting point for middle 4 elements
        
        OptionalDouble average = list.stream()
                                     .skip(start)
                                     .limit(4)
                                     .mapToInt(Integer::intValue)
                                     .average();

        if (average.isPresent()) {
            System.out.println("Average of the middle 4 digits: " + average.getAsDouble());
        } else {
            System.out.println("List does not have enough elements.");
        }
    }
}
