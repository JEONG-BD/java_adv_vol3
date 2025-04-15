package methodref;

import java.util.function.Function;

public class MethodRefEx3 {
    public static void main(String[] args) {
        Person person1 = new Person("Kim1");
        Person person2 = new Person("Park1");
        Person person3 = new Person("Lee1");

        Function<Person, String> fun1 = (Person person) -> person.introduce();
        System.out.println("Person1.introduce = " + fun1.apply(person1));
        System.out.println("Person2.introduce = " + fun1.apply(person2));
        System.out.println("Person3.introduce = " + fun1.apply(person3));
        System.out.println("============================");
        Function<Person, String> fun2 = Person::introduce;
        System.out.println("Person1.introduce = " + fun2.apply(person1));
        System.out.println("Person2.introduce = " + fun2.apply(person2));
        System.out.println("Person3.introduce = " + fun2.apply(person3));

    }
}
