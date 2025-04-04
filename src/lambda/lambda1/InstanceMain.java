package lambda.lambda1;

import lambda.Procedure;

public class InstanceMain {
    public static void main(String[] args) {
        Procedure procedure = new Procedure() {
            @Override
            public void run() {
                System.out.println("Hello Lambda");
            }
        };
        System.out.println(procedure);
        System.out.println("class.class" + procedure.getClass());
        System.out.println("class.getSimpleName" + procedure.getClass().getSimpleName());

        Procedure procedure1 = () -> {
            System.out.println("Hello Lambda");
        };
        System.out.println(procedure1);
        System.out.println("class.class "+ procedure1.getClass());
        System.out.println("class.getSimpleName"  + procedure1.getClass().getSimpleName());
    }
}
