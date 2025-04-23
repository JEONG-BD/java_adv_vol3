package stream.collectors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DownStreamMain1 {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Kim", 1, 85),
                new Student("Park", 1, 70),
                new Student("Lee", 2, 70),
                new Student("Han", 2, 90),
                new Student("Hoon", 3, 90),
                new Student("Ha", 3, 89));
        
        // 학년 별로 학생들을 그룹 
        Map<Integer, List<Student>> collect1_1 = students.stream()
                .collect(Collectors.groupingBy(
                        Student::getGrade,
                        Collectors.toList()
                ));
        System.out.println("collect1_1 = " + collect1_1);


        // 다운 스트림에서 toList 생략 가능
        Map<Integer, List<Student>> collect1_2 = students.stream()
                .collect(Collectors.groupingBy(
                        Student::getGrade));
        System.out.println("collect1_2 = " + collect1_2);

//        Map<Integer, List<String>> collect1_3 = students.stream()
//                .collect(Collectors.groupingBy(
//                        Student::getGrade,
//                        Collectors.mapping(s -> s.getName(), Collectors.toList())));

        Map<Integer, List<String>> collect1_3 = students.stream()
                .collect(Collectors.groupingBy(
                        Student::getGrade,
                        Collectors.mapping(Student::getName,
                                Collectors.toList())));

        System.out.println("collect1_3 = " + collect1_3);

        Map<Integer, Long> collect1_4 = students.stream()
                .collect(Collectors.groupingBy(
                        Student::getGrade,
                        Collectors.counting()));

        System.out.println("collect1_4 = " + collect1_4);

        Map<Integer, Double> collect1_5 = students.stream()
                .collect(Collectors.groupingBy(
                        Student::getGrade,
                        Collectors.averagingDouble(
                                Student::getScore
                        )));
        System.out.println("collect1_5 = " + collect1_5);

    }

}
