package lambda.lambda4;

public class RunnableMain {
    public static void main(String[] args) {
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello Runnable");
            }
        };

        Runnable runnable2 = () -> System.out.println("Hello lambda");

        runnable1.run();
        runnable2.run();
    }
}
