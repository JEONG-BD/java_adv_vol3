package lambda.ex1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class M3Before {
    public static void main(String[] args) {
        Long startMs = System.currentTimeMillis();

        List<Integer> test = new ArrayList<>(List.of(1, 2, 3, 4));

        InnerProcedure innerProcedure = (list) -> {
            int sum = 0;
            for (int i = 0; i < list.size(); i++) {
                sum+= list.get(i);
            }
            System.out.println(sum);
        };
        Long endMs = System.currentTimeMillis();

        innerProcedure.measure(test);
        System.out.println("시간 : " + (endMs - startMs));

        InnerProcedure innerProcedure1 = (list) -> {
            Collections.reverse(list);
            System.out.println(list);
        };
        innerProcedure1.measure(test);
    }

    static interface InnerProcedure {
        void measure(List<Integer> list);
    }
}
