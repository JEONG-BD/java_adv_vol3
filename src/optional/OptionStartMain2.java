package optional;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OptionStartMain2 {
    private static final Map<Long, String> map = new HashMap<>();

    static {
        map.put(1L, "Kim");
        map.put(2L, "Seo");
    }

    public static void main(String[] args) {
        findAndPrint(1L);
        findAndPrint(3L);
    }

    static Optional<String> findNameById(Long id){
//        String findName = map.get(id);
//        Optional<String> optName = Optional.ofNullable(findName);
        Optional<String> optName = Optional.ofNullable(map.get(id));

        return optName;
    }

    static void findAndPrint(Long id){
        Optional<String> optName = findNameById(id);
        String name = optName.orElse("UNKNOWN");
        System.out.println(id + ":" + name.toUpperCase());
    }
}
