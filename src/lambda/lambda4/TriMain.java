package lambda.lambda4;

public class TriMain {
    public static void main(String[] args) {
        TriFucntion<Integer, Integer, Integer, Integer> triFucntion = (a, b, c )-> a + b + c;
        System.out.println(triFucntion.apply(1, 2, 3));

    }



    @FunctionalInterface
    interface TriFucntion<A, B, C, R>{
        R apply(A a, B b, C c);
    }
}
