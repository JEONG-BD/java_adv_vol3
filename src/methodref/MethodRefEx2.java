package methodref;

import java.util.function.Function;
import java.util.function.Supplier;

public class MethodRefEx2 {
    public static void main(String[] args) {
        // static method

        Function<String, String> staticMethod1  = name -> Person.greetingWithName(name);
        Function<String, String> staticMethod2 = Person::greetingWithName;
        System.out.println("staticMethod1:  " + staticMethod1.apply("Park"));
        System.out.println("staticMethod2:  " + staticMethod2.apply("JEONG"));

        // instance reference

        Person person = new Person("Kim");
        Function<Integer, String> instanceMethod1 = (number) -> person.introduceWithNumber(number);
        Function<Integer, String> instanceMethod2 = person::introduceWithNumber;
        System.out.println("instanceMethod1:  " + instanceMethod1.apply(2));
        System.out.println("instanceMethod2:  " + instanceMethod2.apply(2));

        // constructor reference
        Function<String, Person> newPerson1 = name -> new Person(name);
        Function<String, Person>  newPerson2 =Person::new;
        System.out.println("newPerson1:  " + newPerson1.apply("testr"));
        System.out.println("newPerson2:  " + newPerson2.apply("test"));

    }
}
