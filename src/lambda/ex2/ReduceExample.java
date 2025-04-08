package lambda.ex2;

import java.util.List;

public class ReduceExample {
    public static void main(String[] args) {
        
        List<Integer> numbers = List.of(1, 2, 3, 4);
        int result = reduce(numbers, 0, (a, b) -> a + b);
        System.out.println("result = " + result);
        int result2 = reduce(numbers, 1, (a, b) -> a * b);
        System.out.println("result = " + result2);

    }
    
    public static int reduce(List<Integer> list, int initial, MyReducer myReducer){
        int result = initial;
        for (Integer val : list) {
            result =myReducer.reduce(result, val);
        }
        return result ;
    }
}
