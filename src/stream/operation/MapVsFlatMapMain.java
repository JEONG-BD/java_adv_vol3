package stream.operation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MapVsFlatMapMain {
    public static void main(String[] args) {

        List<List<Integer>> outerList = List.of(
                List.of(1, 2),
                List.of(3, 4),
                List.of(5, 6));


        List<Integer> forResult = new ArrayList<>();

        for (List<Integer> innerList : outerList) {
            for (Integer i : innerList) {
                forResult.add(i);
            }
        }
        System.out.println(forResult);


        List<Stream<Integer>> mapResult = outerList.stream()
                .map(list -> list.stream())
                .toList();

        System.out.println(mapResult);

        List<Integer> flatResult = outerList.stream()
                .flatMap(list -> list.stream())
                .toList();
        System.out.println(flatResult);
    }
}
