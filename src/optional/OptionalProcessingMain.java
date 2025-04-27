package optional;

import java.util.Optional;

public class OptionalProcessingMain {
    public static void main(String[] args) {
        Optional<String> optValue = Optional.of("Hello");
        Optional<String> optEmpty = Optional.empty();

        //값이 존재 하면 consumer
        optValue.ifPresent(v -> System.out.println("v = " + v));
        optEmpty.ifPresent(v -> System.out.println("v = " + v));

        // 값이 있으면 consumer 없으면 runnable
        optEmpty.ifPresentOrElse(
                v -> System.out.println("v = " + v),
                () -> System.out.println("비어 있음"));

        // 값이 있으면 Function 적용 
        Optional<Integer> lengthOpt1 = optValue.map(String::length);
        System.out.println("lengthOpt1 = " + lengthOpt1);
        Optional<Integer> lengthOpt2 = optEmpty.map(String::length);
        System.out.println("lengthOpt2 = " + lengthOpt2);
        
        // FlatMap 
        Optional<Optional<Integer>> nestedOpt = optValue.map(s -> Optional.of(s.length()));
        System.out.println("nestedOpt = " + nestedOpt);
        Optional<Integer> flatOpt = optValue.flatMap(s -> Optional.of(s.length()));
        System.out.println("flatOpt = " + flatOpt);

        Optional<String> filtered1 = optValue.filter(s -> s.startsWith("H"));
        Optional<String> filtered2 = optEmpty.filter(s -> s.startsWith("X"));
        System.out.println("filtered2 = " + filtered2);
        System.out.println("filtered1 = " + filtered1);

        optValue.stream()
                .forEach(s -> System.out.println("optValue.stream() -> " + s));
    }
    
}
