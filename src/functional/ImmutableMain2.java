package functional;

import java.util.List;

public class ImmutableMain2 {
    public static void main(String[] args) {
        MutablePerson m1 = new MutablePerson("Kim", 10);
        MutablePerson m2 = new MutablePerson("Lee", 10);

        List<MutablePerson> originList = List.of(m1, m2);
        System.out.println("originList = " + originList);

        List<MutablePerson> afterList = originList.stream()
                .map(p -> {
                    p.setAge(p.getAge() + 1);
                    return p;
                }).toList();
        System.out.println("afterList = " + afterList);

    }
}
