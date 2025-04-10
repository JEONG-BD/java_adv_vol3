package lambda.lambda4;

import java.util.function.IntFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.ToIntFunction;

public class PrimitiveFunction {
    public static void main(String[] args) {
        // 기본형
        IntFunction<String> function = x -> "숫자 : " + x;
        System.out.println(function.apply(3));

        ToIntFunction<String> toIntFunction = s -> s.length();
        System.out.println(toIntFunction.applyAsInt("hello"));

        IntToLongFunction intToLongFunction = x -> x * 100L;
        System.out.println(intToLongFunction.applyAsLong(19));


        IntUnaryOperator intUnaryOperator = x -> x * 100;
        intUnaryOperator.applyAsInt(10);

    }
}
