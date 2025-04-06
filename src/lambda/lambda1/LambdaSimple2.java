package lambda.lambda1;

import lambda.Procedure;

public class LambdaSimple2 {
    public static void main(String[] args) {
        Procedure procedure = () -> {
            System.out.println("Hello Lambda");
        };
        procedure.run();
        System.out.println();

        Procedure procedure2 = () -> System.out.println("Hello Lambda");
        procedure2.run();
    }
}
