package stream.operation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreateStreamMain {
    public static void main(String[] args) {
        System.out.println("1 컬렉션으로 부터 생성");
        List<String> list = List.of("a", "b", "c");
        Stream<String> stream = list.stream();
        stream.forEach(System.out::println);

        System.out.println("2 배열로 부터 생성");
        String[] arr = {"a", "b", "c"};
        Arrays.stream(arr).forEach(System.out::println);

        System.out.println("3 Stream of");
        Stream.of("a", "b", "c").forEach(System.out::println);

        System.out.println("4 무한 스트림 생성 - iterate()");
        Stream.iterate(0, n -> n + 2).limit(3).forEach(System.out::println);

        System.out.println("4 무한 스트림 생성 - generate()");
        Stream.generate(Math::random).limit(3).forEach(System.out::println);
    }
}
