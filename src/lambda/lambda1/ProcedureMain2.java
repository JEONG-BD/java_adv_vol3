package lambda.lambda1;

import lambda.Procedure;

public class ProcedureMain2 {
    public static void main(String[] args) {

        Procedure procedure = new Procedure() {
            @Override
            public void run() {
                System.out.println("Hello lambda!");
            }
        };
        procedure.run();

        Procedure procedure2 = () -> {
            System.out.println("Hello lambda!");
        };
        procedure.run();
    }
}
