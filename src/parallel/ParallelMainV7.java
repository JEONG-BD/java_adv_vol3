package parallel;

import java.util.List;
import java.util.concurrent.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static util.MyLogger.log;

public class ParallelMainV7 {
    public static void main(String[] args) throws InterruptedException {

        ForkJoinPool commonPool = ForkJoinPool.commonPool();

        ExecutorService logigPool = Executors.newFixedThreadPool(400);
        ExecutorService requestPool = Executors.newFixedThreadPool(100);

        int nThreads = 3;
        for (int i = 0; i < nThreads ; i++) {
            String requestName = "request " + i;
            requestPool.submit(() -> logic(requestName, logigPool));
            Thread.sleep(100);
        }
        requestPool.close();
        logigPool.close();

    }

    private static void logic(String requestName, ExecutorService es) {
        log("[ "+requestName+" ] START");
        long startTime = System.currentTimeMillis();
        List<Future<Integer>> futures = IntStream.range(1, 4)
                .mapToObj(i -> es.submit(() -> HeavyJob.heavyTask(i, requestName)))
                .toList();

        int sum = futures.stream()
                .mapToInt(f -> {
                    try {
                        return f.get();
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                }).sum();

        long endTime = System.currentTimeMillis();
        log("time: " + (endTime - startTime ) + "ms, sum " + sum);

    }
}
