package parallel;

import util.MyLogger;

import java.util.concurrent.*;

import static util.MyLogger.log;

public class ParallelMainV3 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ExecutorService es = Executors.newFixedThreadPool(2);

        long startTime = System.currentTimeMillis();
        SumTask task1 = new SumTask(1, 4);
        SumTask task2 = new SumTask(5, 8);

        Future <Integer> future1 = es.submit(task1);
        Future <Integer> future2 = es.submit(task1);

        Integer result1 = future1.get();
        Integer result2 = future2.get();


        int sum = result1 + result2;

        long endTime = System.currentTimeMillis();
        log("time: " + (endTime - startTime ) + "ms, sum " + sum);


    }

    static class SumTask implements Callable {
        int startValue;
        int endValue;
        int result = 0;

        public SumTask(int startValue, int endValue) {
            this.startValue = startValue;
            this.endValue = endValue;
        }

        @Override
        public Integer call() {
            MyLogger.log("작업 시작");
            int sum = 0;
            for (int i = startValue; i <=endValue ; i++) {
                int calculated = HeavyJob.heavyTask(i);
                sum += calculated;
            }
            result = sum;
            log("작업 완료 result " + result);
            return sum;
        }
    }
}
