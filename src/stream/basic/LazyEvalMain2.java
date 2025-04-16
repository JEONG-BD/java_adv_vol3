package stream.basic;

import lambda.lambda5.mystream.MyStreamV3;

import java.util.List;

public class LazyEvalMain2 {
    public static void main(String[] args) {
        List<Integer> data = List.of(1, 2, 3, 4, 5, 6);
        ex1(data);
        ex2(data);
    }

    private static void ex1(List<Integer> data) {
        System.out.println("== MystreamV3 Start == ");
        MyStreamV3.of(data)
                .filter(i -> {
                    boolean isEven = i % 2 == 0;
                    System.out.println("filter() 실행 " + i + " ( " + isEven + " )");
                    return isEven;
                })
                .map(i -> {
                    int mapped = i * 10;
                    System.out.println("map() 실행 " + i + " -> " + mapped);
                    return mapped;
                });
        //System.out.println(result);
        System.out.println("== MystreamV3 End ==");

    }

    private static void ex2(List<Integer> data) {
        System.out.println("== Stream API Start ==");
        data.stream()
                .filter(i -> {
                    boolean isEven = i % 2 == 0;
                    System.out.println("filter() 실행 " + i + " ( " + isEven + " )");
                    return isEven;
                })
                .map(i -> {
                    int mapped = i * 10;
                    System.out.println("map() 실행 " + i + " -> " + mapped);
                    return mapped;
                });

        System.out.println("== Stream API End ==");

    }
}
