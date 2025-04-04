package lambda.lambda1;

import lambda.MyFunction;

public class MyFunction1 {
    public static void main(String[] args) {
        MyFunction myFunction = new MyFunction() {
            @Override
            public int apply(int a, int b) {
                return a + b;
            }
        };

        int apply1 = myFunction.apply(1, 2);
        System.out.println("apply1 = " + apply1);


        MyFunction myFunction2 = (int a, int b)  -> {return a + b;};
        int apply2 = myFunction2.apply(1, 2);
        System.out.println("apply2 = " + apply2);
    }
}
