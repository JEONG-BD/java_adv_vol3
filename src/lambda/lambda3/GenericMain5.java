package lambda.lambda3;

public class GenericMain5 {

    public static void main(String[] args) {
        GenericFunction<String, String> upperCase = (String s) -> s.toUpperCase();
        System.out.println(upperCase.apply("hello"));
        GenericFunction<Integer, Integer> square = (Integer n) -> n *  n;
        System.out.println(square.apply(3));
    }

    @FunctionalInterface
    interface GenericFunction<T, R>{
        R apply(T o);
    }

}
