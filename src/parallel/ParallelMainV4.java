package parallel;

import util.MyLogger;

import java.util.concurrent.ForkJoinPool;
import java.util.stream.IntStream;

import static util.MyLogger.log;

public class ParallelMainV4 {
    public static void main(String[] args) {
        int processorsCount = Runtime.getRuntime().availableProcessors();
        ForkJoinPool commonPool = ForkJoinPool.commonPool();
        MyLogger.log("processorCount = " + processorsCount+ " , commonPool = " + commonPool.getParallelism() );
        long startTime = System.currentTimeMillis();
        int sum = IntStream.rangeClosed(1, 8)
                .parallel()
                .map(HeavyJob::heavyTask)
                .reduce(0, (a, b) -> a + b);

        long endTime = System.currentTimeMillis();
        log("time: " + (endTime - startTime ) + "ms, sum " + sum);


    }
}
