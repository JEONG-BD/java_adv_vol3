package stream.operation;

import java.util.Optional;

public class OptionSimpleMain {
    public static void main(String[] args) {
        Optional<Integer> optional1 = Optional.of(10);
        System.out.println(optional1);
        if(optional1.isPresent()){
            Integer integer = optional1.get();
            System.out.println("i = " + integer );
        }

        Optional<Object> optional2 = Optional.ofNullable(null);
        System.out.println(optional2);

        if (optional2.isPresent()){
            Object object = optional2.get();
            System.out.println("object" + object);
        }
        optional2.get();
    }
}
