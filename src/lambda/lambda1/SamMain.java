package lambda.lambda1;

public class SamMain {
    public static void main(String[] args) {

        SamInterface samInterface = () -> {
            System.out.println("run");
        };
        samInterface.run();
    }
}
