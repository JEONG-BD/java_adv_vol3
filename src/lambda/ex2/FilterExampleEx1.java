package lambda.ex2;

import java.util.ArrayList;
import java.util.List;

public class FilterExampleEx1 {
    public static void main(String[] args) {

        List<Integer> list = List.of(1, -2, 3, 5, 10, 7);
        System.out.println("원본 리스트 = " + list);

        MyPredicate myPredicate = (value) -> value < 1? true : false;
        MyPredicate myPredicate2 = (value) -> value % 2 == 0? true : false;

        List<Integer> filter1 = filter(list, myPredicate);
        List<Integer> filter2 = filter(list, myPredicate2);
        System.out.println(filter1);
        System.out.println(filter2);

    }

    public static List<Integer> filter(List<Integer> list, MyPredicate predicate){
        List<Integer> result = new ArrayList<>();
        for (Integer val : list) {
            if(predicate.test(val)){
                result.add(val);
            }
        }
        return result;
    }
}
