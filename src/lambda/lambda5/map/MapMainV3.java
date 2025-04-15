package lambda.lambda5.map;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class MapMainV3 {
    public static void main(String[] args) {
        List<String> list = List.of("1", "2", "3", "4", "5");
        List<Integer> numbers = StringToIntegerMapper.map(list, s -> Integer.valueOf(s));
        List<Integer> integers = StringToIntegerMapper.map(list, s -> s.length());
        System.out.println(numbers);
        System.out.println(integers);
    }



}
