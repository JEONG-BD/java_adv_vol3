package stream.basic;

import java.util.List;

public class ImmutableMain {
    public static void main(String[] args) {
        List<Integer> originList = List.of(1, 2, 3, 4);
        System.out.println(originList);

        List<Integer> filterdList = originList.stream().filter(n -> n % 2 == 0).toList();

        System.out.println(filterdList);
        System.out.println(originList);
    }
}
