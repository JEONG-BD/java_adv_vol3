package lambda.ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class MapExampleEx1 {
    public static void main(String[] args) {
        List<String> words = List.of("hello", "java", "lambda");
        System.out.println("원본 리스트 = " + words);

        List<String> map = map(words, (str) -> str.toUpperCase());
        List<String> map1 = map(words, (str) -> "**" + str + "**");
        System.out.println("map1 = " + map1);
        System.out.println("map = " + map);
    }


    public static List<String> map(List<String> list, Function<String, String> function){
        List<String> result = new ArrayList<>();

        for (String str : list) {
            result.add(function.apply(str));
        }
        return result;
    }
}
