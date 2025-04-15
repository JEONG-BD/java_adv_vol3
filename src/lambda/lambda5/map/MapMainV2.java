package lambda.lambda5.map;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class MapMainV2 {
    public static void main(String[] args) {
        List<String> list = List.of("1", "2", "3", "4", "5");
        List<Integer> numbers = mapStringToInteger(list, s -> Integer.valueOf(s));
        List<Integer> integers = mapStringToLength(list, s -> s.length());
        System.out.println(numbers);
        System.out.println(integers);
    }


    private static List<Integer> mapStringToInteger(List<String> list, Function<String, Integer> mapper) {
        List<Integer> numbers = new ArrayList<>();
        for (String s : list) {

            numbers.add(mapper.apply(s));
        }
        return numbers;
    }
    private static List<Integer> mapStringToLength(List<String> list, Function<String, Integer> mapper) {
        List<Integer> numbers = new ArrayList<>();
        for (String s : list) {
            numbers.add(mapper.apply(s));
        }
        return numbers;
    }
}
