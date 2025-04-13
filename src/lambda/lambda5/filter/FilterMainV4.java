package lambda.lambda5.filter;

import java.util.Arrays;
import java.util.List;

public class FilterMainV4 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4,5,6, 7, 8, 9, 10);
        List<String> strings = List.of("A", "BB", "CCC", "D");


        List<Integer> evenNumbers = GenericFilter.filter(numbers, n-> n %2 == 0);
        List<Integer> oddNumbers =  GenericFilter.filter(numbers, n -> n % 2 == 1);
        System.out.println(Arrays.toString(evenNumbers.toArray()));
        System.out.println(Arrays.toString(oddNumbers.toArray()));

        List<String> lengthResults = GenericFilter.filter(strings, s -> s.length() >= 2);
        System.out.println(lengthResults);
    }


}
