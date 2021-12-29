/*write program to filter even number and print output in sorted order
 using java8 stream feature
I/P : 21,46,23,12,32,50,14,6,18,9,92,76,77,27,13,16,18,98
O/P : 6,12,14,16,18,18,32,46,50,76,92,98
*/



import java.util.Arrays;

import java.util.List;
import java.util.stream.Collectors;

public class EvenNumbers {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(21, 46, 23, 12, 32, 50, 14, 6, 18, 9, 92, 76, 77, 27, 13, 16, 18, 98);
		List<Integer> sortedNumbers = numbers.stream().
				sorted().
				collect(Collectors.toList());
		
		List<Integer> evenNumbers = sortedNumbers.stream().
				filter(o -> o % 2 == 0).
				collect(Collectors.toList());
		System.out.println(evenNumbers);

	}

}
