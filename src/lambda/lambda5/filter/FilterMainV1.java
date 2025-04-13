package lambda.lambda5.filter;

import java.util.ArrayList;
import java.util.List;

public class FilterMainV1 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4,5,6, 7, 8, 9, 10);

        //짝수
        List<Integer> evenNumbers = filterEvenNumber(numbers);
        //홀수
        List<Integer> oddNumbers = filterOddNumber(numbers);

    }

    private static List<Integer> filterEvenNumber(List<Integer> numbers) {
        List<Integer> filtered = new ArrayList<>();
        for (Integer number : numbers) {
            if(number % 2 == 0){
                filtered.add(number);
            }
        };
        return filtered;
    }
    private static List<Integer> filterOddNumber(List<Integer> numbers) {
        List<Integer> filtered = new ArrayList<>();
        for (Integer number : numbers) {
            if(number % 2 == 1){
                filtered.add(number);
            }
        };
        return filtered;
    }
}
