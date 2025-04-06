package lambda.lambda1;

import lambda.MyFunction;

public class LambdaSimple3 {
    public static void main(String[] args) {

        MyFunction myFunction = (int a, int b) -> {
            return a + b;
        };
        System.out.println("myFunction.apply(3, 4) = " + myFunction.apply(3, 4));

        MyFunction myFunction2 = (a, b) -> a + b;

        System.out.println("myFunction2.apply(3, 4) = " + myFunction2.apply(3, 4));
    }
}
