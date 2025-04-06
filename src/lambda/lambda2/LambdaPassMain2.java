package lambda.lambda2;

import lambda.MyFunction;

public class LambdaPassMain2 {
    public static void main(String[] args) {
        MyFunction add = (int a, int b) -> a + b;
        MyFunction sub = (int a, int b) -> a - b;

        calculate(add);
        calculate(sub);

        calculate((a, b) -> a * b);
    }

    static void calculate(MyFunction myFunction){
        int a = 1;
        int b = 2;

        System.out.println("계산 시작");
        int result = myFunction.apply(a, b);
        System.out.println("result = " + result);
    }
}
