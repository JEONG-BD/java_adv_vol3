package stream.collectors;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Collector1Basic {
    public static void main(String[] args) {
        
        // 기본 기능 
        List<String> list1 = Stream.of("Java", "String", "JPA").collect(Collectors.toList());
        System.out.println("list1 = " + list1);
        
        //Immutable 
        List<Integer> immutableList = Stream.of(1, 2, 3).collect(Collectors.toUnmodifiableList());
        System.out.println("immutableList = " + immutableList);

        Set<Integer> set = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 8, 1, 2, 3).collect(Collectors.toSet());
        System.out.println("set = " + set);

        TreeSet<Integer> collect = Stream.of(3, 4, 5, 1, 2).collect(Collectors.toCollection(TreeSet::new));
        System.out.println("collect = " + collect);
    }
}
