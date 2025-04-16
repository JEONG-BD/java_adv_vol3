package methodref;

import java.util.function.BiFunction;

public class MethodRefEx6 {
    public static void main(String[] args) {
        Person person = new Person("Kim");

        BiFunction<Person, Integer, String> func1 =
                (Person p, Integer number) -> p.introduceWithNumber(number);

        System.out.println("person.introduceWithNumber = " + func1.apply(person, 10));

        BiFunction<Person, Integer, String> func2 = Person::introduceWithNumber;
        System.out.println("person.introduceWithNumber = " + func2.apply(person, 10));

    }
}
