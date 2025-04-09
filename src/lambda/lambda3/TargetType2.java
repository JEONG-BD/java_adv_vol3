package lambda.lambda3;

import java.util.function.Function;

public class TargetType2 {
    public static void main(String[] args) {

        Function<String, String>  upperCase = s-> s.toUpperCase();
        String upper = upperCase.apply("test1");
        System.out.println("upper = " + upper);
    
        Function<Integer, Integer> square = n -> n * n;
        Integer squareResult = square.apply(3);
        System.out.println("squareResult = " + squareResult);
    }
}
