package lambda.lambda4;

import java.util.function.Consumer;

public class ConsumerMain {
    public static void main(String[] args) {
        Consumer<String> consumer1 = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s.toUpperCase());
            }
        };

        Consumer<String> consumer2 = s -> System.out.println(s);
        consumer1.accept("test");
        consumer2.accept("hi");
    }
}
