package parallel.forkjoin;

import parallel.HeavyJob;
import util.MyLogger;

import java.util.List;
import java.util.concurrent.RecursiveTask;

public class SumTask extends RecursiveTask<Integer> {

    //private static final int THRESHOLD = 4;
    private static final int THRESHOLD = 2;


    private final List<Integer> list;

    public SumTask(List<Integer> list) {
        this.list = list;
    }

    @Override
    protected Integer compute() {

        if (list.size() <= THRESHOLD){
            MyLogger.log("[처리 시작] " + list);
            int sum = list.stream()
                    .mapToInt(HeavyJob::heavyTask)
                    .sum();
            MyLogger.log("[처리 완료] " + list + " -> sum " + sum);
            return sum;
        }else {
            int mid = list.size() / 2;
            List<Integer> leftList = list.subList(0, mid);
            List<Integer> rightList = list.subList(mid, list.size());
            MyLogger.log("[분할] " + list + " -> LEFT " + leftList + " , RIGHT " + rightList );
            SumTask leftTask = new SumTask(leftList);
            SumTask rightTask = new SumTask(rightList);

            leftTask.fork();
            Integer rightResult = rightTask.compute();
            Integer leftResult = leftTask.join();
            int sum = rightResult + leftResult;
            MyLogger.log("LEFT[" + leftResult + " ] RIGHT[" + rightResult + "]" + " SUM" + sum);
            return sum;
        }
    }
}
