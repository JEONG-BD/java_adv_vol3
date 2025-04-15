package lambda.lambda5.mystream;

import lambda.lambda5.filter.GenericFilter;
import lambda.lambda5.map.GenericMapper;

import java.util.ArrayList;
import java.util.List;

public class Ex1_Number {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9 ,10);

        List<Integer> resultList = direct(integerList);
        List<Integer> lambdaList = lambda(integerList);
        System.out.println(resultList);
        System.out.println(lambdaList);
    }

    private static List<Integer> direct(List<Integer> integerList) {
        List<Integer> result = new ArrayList<>();

        for (Integer value : integerList) {
            if(value % 2 == 0){
                result.add(value * 2);
            }
        }
        return result;
    }

    private static List<Integer> lambda(List<Integer> integerList) {
        List<Integer> filteredList = GenericFilter.filter(integerList, n -> n % 2 == 0);
        List<Integer> mappedList = GenericMapper.map(filteredList, n -> n * 2);
        return mappedList;
    }
}
