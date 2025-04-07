package lambda.ex1;

import lambda.Procedure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class M3After {
    public static void measure(Procedure procedure){
        Long startMs = System.nanoTime();
        procedure.run();
        Long endMs = System.nanoTime();
        System.out.println("endMs - startMs = " + (endMs - startMs));
    }

    public static void main(String[] args) {

        Procedure procedure = () -> {
            int N = 100;
            int sum = 0;
            for (int i = 0; i < N; i++) {
                sum+= i;
            }
            System.out.println(sum);
        };
        measure(procedure);

        Procedure procedure1 = () -> {
            int [] arrayInt = {4, 3, 2, 1};
            Arrays.sort(arrayInt);
            System.out.println(arrayInt);
        };
        measure(procedure1);
    }
}
