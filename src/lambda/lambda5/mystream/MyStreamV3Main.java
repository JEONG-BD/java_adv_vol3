package lambda.lambda5.mystream;

import java.util.List;

public class MyStreamV3Main {
    public static void main(String[] args) {
        List<Student> studens = List.of(new Student("Apple", 100),
                new Student("Banana", 90),
                new Student("Apple", 70),
                new Student("Tomato", 30));

        List<String> result1 = ex1(studens);
        System.out.println(result1);
        List<String> result2 = ex2(studens);
        System.out.println(result2);
    }

    private static List<String> ex2(List<Student> studens) {
        return MyStreamV3.of(studens)
                .filter(s -> s.getScore() >= 80)
                .filter(s -> s.getName().length() >= 5)
                .map(s -> s.getName().toUpperCase()).toList();
    }

    private static List<String> ex1(List<Student> studens) {
        return MyStreamV3.of(studens)
                .filter(s-> s.getScore() >= 80)
                .map(s-> s.getName()).toList();
    }
}
