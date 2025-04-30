package parallel.forkjoin;

import util.MyLogger;

import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.IntStream;

import static util.MyLogger.log;

public class ForkJoinMain1 {
    public static void main(String[] args) {
        List<Integer> data = IntStream.rangeClosed(1, 8)
                .boxed()
                .toList();
        MyLogger.log("[생성] " + data);

        long startTime = System.currentTimeMillis();
        ForkJoinPool forkJoinPool = new ForkJoinPool(10);
        SumTask sumTask = new SumTask(data);

        Integer sum = forkJoinPool.invoke(sumTask);
        forkJoinPool.close();
        long endTime = System.currentTimeMillis();
        log("time: " + (endTime - startTime ) + "ms, sum " + sum);

    }

}
