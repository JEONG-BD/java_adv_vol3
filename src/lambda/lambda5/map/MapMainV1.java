package lambda.lambda5.map;

import java.util.ArrayList;
import java.util.List;

public class MapMainV1 {
    public static void main(String[] args) {
        List<String> list = List.of("1", "2", "3", "4", "5");
        List<Integer> numbers = mapStringToInteger(list);
        List<Integer> integers = mapStringToLength(list);
        System.out.println(numbers);
        System.out.println(integers);
    }


    private static List<Integer> mapStringToInteger(List<String> list) {
        List<Integer> numbers = new ArrayList<>();
        for (String s : list) {

            numbers.add(Integer.valueOf(s));
        }
        return numbers;
    }
    private static List<Integer> mapStringToLength(List<String> list) {
        List<Integer> numbers = new ArrayList<>();
        for (String s : list) {
            numbers.add(s.length());
        }
        return numbers;
    }
}
