package methodref;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class MethodRefEx4 {
    public static void main(String[] args) {
        List<Person> persons = List.of(
                new Person("Kim"),
                new Person("Park"),
                new Person("LEE"));

        List<String> result1 = mapPersonToString(persons, (Person p) -> p.introduce());
        List<String> result2 = mapPersonToString(persons, Person::introduce);
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);

        List<String> upperResult1 = mapStringToString(result1, (String s) -> s.toUpperCase());
        List<String> upperResult2 = mapStringToString(result1, String::toUpperCase);
        System.out.println("upperResult2 = " + upperResult2);
        System.out.println("upperResult1 = " + upperResult1);

    }


    static List<String> mapPersonToString(List<Person> personList, Function<Person, String> fun){
        List<String> result = new ArrayList<>();
        for (Person person : personList) {
            String applied = fun.apply(person);
            result.add(applied);
        }
        return result;
    }

    static List<String> mapStringToString(List<String> strings, Function<String, String> fun){
        List<String> result = new ArrayList<>();
        for (String s : strings) {
            String applied = fun.apply(s);
            result.add(applied);
        }
        return result;
    }
}
