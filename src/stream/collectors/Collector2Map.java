package stream.collectors;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Collector2Map {
    public static void main(String[] args) {
        Map<String, Integer> map1 = Stream.of("Apple", "Banana", "Tomato")
                .collect(Collectors.toMap(
                        name -> name,
                        name -> name.length()
                ));
        System.out.println("map1 = " + map1);

//        Map<String, Integer> map2 = Stream.of("Apple", "Apple", "Tomato")
//                .collect(Collectors.toMap(
//                        name -> name,
//                        name -> name.length()
//                ));
//        System.out.println("map2 = " + map2);
        Map<String, Integer> map3 = Stream.of("Apple", "Apple", "Tomato")
                .collect(Collectors.toMap(
                        name -> name,
                        name -> name.length(),
                        (oldVale, newVal) -> oldVale + newVal
                ));
        System.out.println("map3 = " + map3);

        Map<String, Integer> map4 = Stream.of("Apple", "Banana", "Tomato")
                .collect(Collectors.toMap(
                        name -> name,
                        name -> name.length(),
                        (oldVale, newVal) -> oldVale + newVal,
                        LinkedHashMap::new
                ));
        System.out.println("map4 = " + map4.getClass());



    }
}
