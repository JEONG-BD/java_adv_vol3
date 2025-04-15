package lambda.lambda5.map;

import java.util.List;

public class MapMainV4 {
    public static void main(String[] args) {
        List<String> fruits = List.of("apple", "banana", "orange");
        List<String> fruitsMap = GenericMapper.map(fruits, s -> s.toUpperCase());
        System.out.println(fruitsMap);

        List<Integer> lengthMap = GenericMapper.map(fruits, s -> s.length());
        System.out.println(lengthMap);

        List<Integer> integers = List.of(1, 2, 3);
        List<String> starList = GenericMapper.map(integers, n -> "*".repeat(n));
        System.out.println(starList);
    }
}
