package parallel.forkjoin;

import util.MyLogger;

import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.IntStream;

import static util.MyLogger.log;

public class ForkJoinMain2 {
    public static void main(String[] args) {
        int processorsCount = Runtime.getRuntime().availableProcessors();
        ForkJoinPool commonPool = ForkJoinPool.commonPool();
        MyLogger.log("processorCount = " + processorsCount+ " , commonPool = " + commonPool.getParallelism() );

        List<Integer> data = IntStream.rangeClosed(1, 8)
                .boxed()
                .toList();
        MyLogger.log("[생성] " + data);

        long startTime = System.currentTimeMillis();
        SumTask sumTask = new SumTask(data);
        Integer sum = sumTask.invoke();
        long endTime = System.currentTimeMillis();
        log("time: " + (endTime - startTime ) + "ms, sum " + sum);

    }

}
