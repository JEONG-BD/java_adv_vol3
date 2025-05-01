package parallel;

import util.MyLogger;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.IntStream;

import static util.MyLogger.log;

public class ParallelMainV5 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("java.util.concurrent.ForkJoinPool.common.parallelism", "3");
        ForkJoinPool commonPool = ForkJoinPool.commonPool();

        ExecutorService requestPool = Executors.newFixedThreadPool(100);
        int nThreads = 1;
        for (int i = 0; i < nThreads ; i++) {
            String requestName = "request " + i;
            requestPool.submit(() -> logic(requestName));
            Thread.sleep(100);
        }
        requestPool.close();

    }

    private static void logic(String requestName) {
        log("[ "+requestName+" ] START");
        long startTime = System.currentTimeMillis();
        int sum = IntStream.rangeClosed(1, 8)
                .parallel()
                .map(i -> HeavyJob.heavyTask(i, requestName))
                .reduce(0, (a, b) -> a + b);

        long endTime = System.currentTimeMillis();
        log("time: " + (endTime - startTime ) + "ms, sum " + sum);

    }
}
