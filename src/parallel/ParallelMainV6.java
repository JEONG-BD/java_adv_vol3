package parallel;

import java.util.concurrent.*;
import java.util.stream.IntStream;

import static util.MyLogger.log;

public class ParallelMainV6 {
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
        int sum = 0;
        long startTime = System.currentTimeMillis();
        Future<Integer> future1 = es.submit(() -> HeavyJob.heavyTask(1, requestName));
        Future<Integer> future2 = es.submit(() -> HeavyJob.heavyTask(2, requestName));
        Future<Integer> future3 = es.submit(() -> HeavyJob.heavyTask(3, requestName));
        Future<Integer> future4 = es.submit(() -> HeavyJob.heavyTask(4, requestName));
        try {
            Integer v1 = future1.get();
            Integer v2 = future2.get();
            Integer v3 = future3.get();
            Integer v4 = future4.get();
            sum = v1 + v2 + v3 + v4 ;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }

        long endTime = System.currentTimeMillis();
        log("time: " + (endTime - startTime ) + "ms, sum " + sum);

    }
}
