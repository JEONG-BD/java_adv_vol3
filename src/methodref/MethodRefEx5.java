package methodref;

import lambda.lambda5.mystream.MyStreamV3;

import java.util.List;

public class MethodRefEx5 {
    public static void main(String[] args) {
        List<Person> persons = List.of(
                new Person("Kim"),
                new Person("Park"),
                new Person("LEE"));

        List<String> result1= MyStreamV3.of(persons).map(person -> person.introduce())
                .map(str -> str.toUpperCase()).toList();

        System.out.println("result1 = " + result1);

        List<String> result2 = MyStreamV3.of(persons).map(Person::introduce)
                .map(String::toUpperCase).toList();

        System.out.println("result2 = " + result2);

    }
}
