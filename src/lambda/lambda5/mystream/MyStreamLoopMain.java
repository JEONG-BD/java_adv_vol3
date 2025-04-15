package lambda.lambda5.mystream;

import java.util.List;

public class MyStreamLoopMain {
    public static void main(String[] args) {
        List<Student> studens = List.of(new Student("Apple", 100),
                new Student("Banana", 90),
                new Student("Apple", 70),
                new Student("Tomato", 30));

        List<String> list = MyStreamV3.of(studens).filter(s -> s.getScore() >= 80)
                .map(s -> s.getName()).toList();

        MyStreamV3.of(studens).filter(s -> s.getScore() >= 80)
                .map(s -> s.getName()).forEach(name -> System.out.println("name : " + name));


    }

}
