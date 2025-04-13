package lambda.lambda5.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FilterMainV2 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4,5,6, 7, 8, 9, 10);

        //짝수
        //List<Integer> evenNumbers = filterTestNumber(numbers);
        TestFunction testFunction1 = n -> n % 2 == 0;
        TestFunction testFunction2 = n -> n % 2 == 1;
        //List<Integer> evenNumbers = filterTestNumber(numbers, testFunction1);
        //List<Integer> oddNumbers = filterTestNumber(numbers, testFunction2);
        List<Integer> evenNumbers = filterPridecateNumber(numbers, n -> n % 2 == 0);
        List<Integer> oddNumbers = filterPridecateNumber(numbers, n -> n % 2 == 1);
        System.out.println(Arrays.toString(evenNumbers.toArray()));
        System.out.println(Arrays.toString(oddNumbers.toArray()));


    }

    private static List<Integer> filterTestNumber(List<Integer> numbers) {
        List<Integer> filtered = new ArrayList<>();
        for (Integer number : numbers) {

        };
        return filtered;
    }
    private static List<Integer> filterTestNumber(List<Integer> numbers, TestFunction function) {
        List<Integer> filtered = new ArrayList<>();
        for (Integer number : numbers) {
            if(function.apply(number)){
                filtered.add(number);
            }
        };
        return filtered;
    }
    private static List<Integer> filterPridecateNumber(List<Integer> numbers, Predicate<Integer> predicate) {
        List<Integer> filtered = new ArrayList<>();
        for (Integer number : numbers) {
            if(predicate.test(number)){
                filtered.add(number);
            }
        };
        return filtered;
    }

    @FunctionalInterface
    public interface TestFunction {
        Boolean apply(Integer n);
    }


}
