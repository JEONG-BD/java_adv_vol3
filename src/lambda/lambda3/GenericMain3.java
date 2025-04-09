package lambda.lambda3;

public class GenericMain3 {

    public static void main(String[] args) {
        ObjectFunction upperCase = new ObjectFunction() {
            @Override
            public Object apply(Object s) {
                return ((String) s).toUpperCase();
            }
        };
        System.out.println(upperCase.apply("hello"));
        ObjectFunction square = new ObjectFunction() {
            @Override
            public Object apply(Object n) {
                return (Integer) n * (Integer) n;
            }
        };
        System.out.println(square.apply(3));
    }

    @FunctionalInterface
    interface ObjectFunction{
        Object apply(Object o);
    }

}
