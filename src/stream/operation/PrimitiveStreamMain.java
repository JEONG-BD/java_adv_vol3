package stream.operation;

import java.util.IntSummaryStatistics;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class PrimitiveStreamMain {
    public static void main(String[] args) {
        // 기본
        IntStream intStream = IntStream.of(1, 2, 3, 4, 5);
        intStream.forEach(i -> System.out.print( i + " "));

        System.out.println();

        IntStream range = IntStream.range(1, 6);
        range.forEach(System.out::print);
        IntStream intStream1 = IntStream.rangeClosed(1, 10);
        System.out.println();
        intStream1.forEach(System.out::print);

        // 통계 관련
        int sum = IntStream.range(1, 6).sum();
        System.out.println("sum = " + sum);

        double avg = IntStream.range(1, 6).average().getAsDouble();
        System.out.println("avg = " + avg);

        IntSummaryStatistics intSummaryStatistics = IntStream.range(1, 6).summaryStatistics();
        System.out.println(intSummaryStatistics.getMax());
        System.out.println(intSummaryStatistics.getAverage());
        System.out.println(intSummaryStatistics.getCount());
        System.out.println(intSummaryStatistics.getMin());

        // 타입 변환
        LongStream longStream = IntStream.range(1, 5).asLongStream();
        DoubleStream doubleStream = IntStream.range(1, 5).asDoubleStream();
        Stream<Integer> boxed = IntStream.range(1, 5).boxed();

        // 기본형 매핑
        LongStream longStream1 = IntStream.range(1, 5).mapToLong(i -> i * 1L);
        IntStream.range(1, 5).mapToDouble(i -> i  * 1.5);
        Stream<String> stringStream = IntStream.range(1, 5).mapToObj(i -> "Number" + i);

        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);
        IntStream intStream2 = integerStream.mapToInt(i -> i);
        int sum1 = intStream2.sum();

        int sum2 = Stream.of(1, 2, 3, 4, 5)
                .mapToInt(i -> i)
                .sum();

    }
}
