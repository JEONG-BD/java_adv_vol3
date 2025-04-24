package optional;

import java.util.Optional;

public class OptionalRetrievalMain {
    public static void main(String[] args) {
        //
        Optional<String> optValue = Optional.of("Hello");
        Optional<String> optEmpty = Optional.empty();

        // isPresent isEmpty
        System.out.println("isPresent / isEmpty" );
        System.out.println("optValue.isPresent() = " + optValue.isPresent());
        System.out.println("optEmpty.isPresent() = " + optEmpty.isPresent());
        System.out.println("optValue.isEmpty() = " + optValue.isEmpty());
        System.out.println("optEmpty.isEmpty() = " + optEmpty.isEmpty());


        // get
        System.out.println("optValue.get() = " + optValue.get());
        //System.out.println("optEmpty.get() = " + optEmpty.get());
        
        // 값 
        String value1 = optValue.orElse("기본값");
        String empty1 = optEmpty.orElse("기본값");
        System.out.println("value1 = " + value1);
        System.out.println("empty1 = " + empty1);

        // 값 -> 람다.
        String value2 = optValue.orElseGet(() -> {
            System.out.println("람다 호출 - optValue");
            return "NewValue";
        });
        System.out.println("value2 = " + value2);

        String empty2 = optEmpty.orElseGet(() -> {
            System.out.println("람다 호출 - optEmpty");
            return "NewValue";
        });
        System.out.println("empty2 = " + empty2);
        
        //예외 
        String value3 = optValue.orElseThrow(() -> new RuntimeException("값이 없습니다."));
        try{
            String empty3 = optEmpty.orElseThrow(() -> new RuntimeException("값이 없습니다"));
            System.out.println("empty3 = " + empty3);
        } catch (Exception e){
            System.out.println("e = " + e);
        }

        System.out.println("value3 = " + value3);

        // or
        Optional<String> result1 = optValue.or(() -> Optional.of("Fallback"));
        Optional<String> result2 = optEmpty.or(() -> Optional.of("Fallback"));

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
    }
}
