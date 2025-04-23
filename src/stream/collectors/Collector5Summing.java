package stream.collectors;

import java.util.IntSummaryStatistics;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Collector5Summing {
    public static void main(String[] args) {
        Long count1 = Stream.of(1, 2, 3).collect(Collectors.counting());
        System.out.println("count1 = " + count1);

        long count2 = Stream.of(1, 2, 3).count();
        System.out.println("count2 = " + count2);

        Double average1 = Stream.of(1, 2, 3).collect(Collectors.averagingInt(i -> i));
        System.out.println("average1 = " + average1);
        double average2 = Stream.of(1, 2, 3).mapToInt(i -> i).average().getAsDouble();
        System.out.println("average2 = " + average2);

        double average3 = IntStream.of(1, 2, 3).average().getAsDouble();
        System.out.println("average3 = " + average3);


        //통계
        IntSummaryStatistics collect = Stream.of("Apple", "Banana", "Tomato")
                .collect(Collectors.summarizingInt(String::length));
        System.out.println("collect.getMin() = " + collect.getMin());
        System.out.println("collect.getMax() = " + collect.getMax());
        System.out.println("collect.getCount() = " + collect.getCount());
        System.out.println("collect.getSum() = " + collect.getSum());
        System.out.println("collect.getAverage() = " + collect.getAverage());

    }
}
