package stream.operation;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class InrermediateOperationMain {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 2, 3, 4, 5, 5, 6, 7, 8, 9, 10);
        System.out.println("Filter ==");
        // filter
        numbers.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);

        //map
        System.out.println("Map ==");
        numbers.stream()
                .map(n -> n * n )
                .forEach(System.out::println);

        //distinct
        System.out.println("Distinct ==");
        numbers.stream()
                .distinct()
                .forEach(System.out::println);


        //sorted
        System.out.println("Sorted - 기본 정렬");
        Stream.of(3, 2, 5, 1, 0, 7).sorted().forEach(System.out::println);

        System.out.println("Sorted - 기본 정렬");
        Stream.of(3, 2, 5, 1, 0, 7).sorted(Comparator.reverseOrder()).forEach(System.out::println);

        //peek
        System.out.println("Peek == ");
        numbers.stream()
                .peek(n -> System.out.print("before : " + n + ","))
                        .map(n -> n* n)
                        .peek(n -> System.out.println("after : " + n + " , "))
                        .limit(5)
                        .forEach(n -> System.out.println("final : " + n));
        System.out.println("Limit ==");
        numbers.stream()
                .limit(5)
                .forEach(n -> System.out.print(n + " "));


        System.out.println("Skip == ");
        numbers.stream()
                .skip(5)
                .forEach(n -> System.out.print(n + " "));
        System.out.println("");

        List<Integer> numbers2 = List.of(1, 2, 3, 4, 5, 1, 2, 3);

        System.out.println("Takewhile ==");

        numbers2.stream()
                .takeWhile(n -> n < 5)
                .forEach(n -> System.out.print(n + " "));
        System.out.println("");


        System.out.println("DropWhile ==");
        numbers2.stream()
                .dropWhile(n -> n < 5)
                .forEach(n -> System.out.print( n));
        System.out.println();
    }
}
