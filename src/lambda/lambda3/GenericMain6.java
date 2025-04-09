package lambda.lambda3;

public class GenericMain6 {

    public static void main(String[] args) {
        GenericFunction<String, String> upperCase = (String s) -> s.toUpperCase();
        System.out.println(upperCase.apply("hello"));
        GenericFunction<String, Integer> stringLength = (String s) -> s.length();
        System.out.println(stringLength.apply("hello"));
        GenericFunction<Integer, Boolean> isEven = (Integer n) -> n % 2 == 0;
        System.out.println(isEven.apply(10));
        GenericFunction<Integer, Integer> square = (Integer n) -> n *  n;
        System.out.println(square.apply(3));
    }

    @FunctionalInterface
    interface GenericFunction<T, R>{
        R apply(T o);
    }

}
