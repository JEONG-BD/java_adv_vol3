package stream.operation;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TerminateOperationMain {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println("1. collect - List 수집 ");
        List<Integer> evenNumber1 = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("evenNumber1 = " + evenNumber1);

        System.out.println("2. toList 수집 ");
        List<Integer> evenNumber2 = numbers.stream()
                .filter(n -> n % 2 == 0)
                .toList();
        System.out.println("evenNumber2 = " + evenNumber2);
        System.out.println("3. toArray - 배열 변환");
        Integer[] arr = numbers.stream()
                .filter(n -> n % 2 == 0)
                .toArray(Integer[]::new);
        System.out.println("arr = " +  Arrays.toString(arr));

        System.out.println("4. foreach - 각 요소 처리");
        numbers.stream()
                .limit(5)
                .forEach(n -> System.out.print(n + " "));
        System.out.println();

        System.out.println("5. count- 요소 개수");
        long count = numbers.stream()
                .filter(n -> n > 5)
                .count();
        System.out.println(count);

        System.out.println("6. reduce - 요소들의 합");
        System.out.println("초기값 없는 reduce");
        Optional<Integer> sum1 = numbers.stream()
                .reduce((a, b) -> a + b);
        System.out.println("sum1 = " + sum1);


        System.out.println("7. reduce - 요소들의 합");
        System.out.println("초기값 없는 reduce");
        Integer sum2 = numbers.stream().reduce(100, (a, b) -> a + b);
        System.out.println(sum2);

        System.out.println("7. min - 최소 값");
        Optional<Integer> min = numbers.stream()
                .min(Integer::compareTo);

        System.out.println("min = " + min);

        System.out.println("8. max - 최대 값");
        Optional<Integer> max = numbers.stream()
                .max(Integer::compareTo);

        System.out.println("max = " + max);
        System.out.println("9. findFirst");
        Integer first = numbers.stream()
                .filter(n -> n > 5)
                .findFirst().get();
        System.out.println("integer = " + first);

        System.out.println("10. findAny");
        Integer any = numbers.stream()
                .filter(n -> n > 5)
                .findAny().get();
        System.out.println("any = " + any);

        System.out.println("11. anyMatch");
        boolean hasEven = numbers.stream()
                .anyMatch(n -> n % 2 == 0);

        System.out.println("hasEven = " + hasEven);

        System.out.println("11. allMatch");
        boolean all = numbers.stream()
                .allMatch(n -> n > 0);

        System.out.println("all = " + all);

        System.out.println("13. noneMatch");
        boolean noneMatch = numbers.stream().noneMatch(n -> n < 0);
        System.out.println("noneMatch = " + noneMatch);
    }
}
