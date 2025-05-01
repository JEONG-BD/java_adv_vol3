package functional;

import java.util.function.Function;

public class SideEffectMain3 {

    public static void main(String[] args) {

        Function<Integer, Integer> func = x -> {
            int result = x * 2;
            return  result;
        };
        int x = 10;
        Integer result = func.apply(x);

        System.out.println(" x = " + x + " result " + result);
    }
}
