package functional;

import java.util.List;

public class ImmutableMain3 {
    public static void main(String[] args) {
        ImmutablePerson m1 = new ImmutablePerson("Kim", 10);
        ImmutablePerson m2 = new ImmutablePerson("Lee", 10);

        List<ImmutablePerson> originList = List.of(m1, m2);
        System.out.println("originList = " + originList);

        List<ImmutablePerson> afterList = originList.stream()
                .map(p -> new ImmutablePerson(p.getName(), p.getAge() + 1)).toList();
        System.out.println("afterList = " + afterList);

    }
}
