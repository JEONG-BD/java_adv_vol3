package stream.start;

import java.util.List;

public class StreamStartMain {
    public static void main(String[] args) {
        List<String> names = List.of("Banana", "Apple", "Berry", "Tomato");
        List<String> list = names
                .stream()
                .filter(s -> s.startsWith("B")).map(s -> s.toUpperCase()).toList();

        System.out.println(list);
        names.stream().filter(s -> s.startsWith("B")).map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));
        names.stream().filter(s -> s.startsWith("B")).map(String::toUpperCase).forEach(System.out::println);

    }
}
