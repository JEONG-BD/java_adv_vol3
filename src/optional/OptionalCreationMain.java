package optional;

import java.util.Optional;

public class OptionalCreationMain {
    public static void main(String[] args) {

        //1 of. 확실이 null 이 아닐 경우
        String nonNullValue = "Hello Optional";
        Optional<String> opt1 = Optional.of(nonNullValue);
        System.out.println("opt1 = " + opt1);

        //2. ofNullable 값이 null일 수도 아닐 수도 있을 때
        Optional<String> opt2 = Optional.ofNullable("Hello");
        Optional<Object> opt3 = Optional.ofNullable(null);

        System.out.println("opt2 = " + opt2);
        System.out.println("opt3 = " + opt3);
        Optional<Object> opt4 = Optional.empty();
        System.out.println("opt4 = " + opt4);

    }
}
