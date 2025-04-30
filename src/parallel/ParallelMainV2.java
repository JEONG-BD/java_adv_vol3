package parallel;

import util.MyLogger;

import java.util.stream.IntStream;

import static util.MyLogger.log;

public class ParallelMainV2 {
    public static void main(String[] args) throws InterruptedException{
        long startTime = System.currentTimeMillis();
        SumTask task1 = new SumTask(1, 4);
        SumTask task2 = new SumTask(5, 8);
        Thread thread1 = new Thread(task1, "thread-1");
        Thread thread2 = new Thread(task2, "thread-2");

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        int sum = task1.result + task2.result;

        long endTime = System.currentTimeMillis();
        log("time: " + (endTime - startTime ) + "ms, sum " + sum);


    }

    static class SumTask implements Runnable{
        int startValue;
        int endValue;
        int result = 0;

        public SumTask(int startValue, int endValue) {
            this.startValue = startValue;
            this.endValue = endValue;
        }

        @Override
        public void run() {
            MyLogger.log("작업 시작");
            int sum = 0;
            for (int i = startValue; i <=endValue ; i++) {
                int calculated = HeavyJob.heavyTask(i);
                sum += calculated;
            }
            result = sum;
            log("작업 완료 result " + result);

        }
    }
}
