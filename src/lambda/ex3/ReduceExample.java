package lambda.ex3;


import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class ReduceExample {
    public static void main(String[] args) {
        
        List<Integer> numbers = List.of(1, 2, 3, 4);
        int result = reduce(numbers, 0, (a, b) -> a + b);
        System.out.println("result = " + result);
        int result2 = reduce(numbers, 1, (a, b) -> a * b);
        System.out.println("result = " + result2);

    }
    
    public static int reduce(List<Integer> list, int initial, BinaryOperator<Integer> myReducer){
        int result = initial;
        for (Integer val : list) {
            result =myReducer.apply(result, val);
        }
        return result ;
    }
}
