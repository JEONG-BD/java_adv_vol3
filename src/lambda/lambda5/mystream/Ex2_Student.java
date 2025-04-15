package lambda.lambda5.mystream;

import lambda.lambda5.filter.GenericFilter;
import lambda.lambda5.map.GenericMapper;

import java.util.ArrayList;
import java.util.List;

public class Ex2_Student {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            students.add(new Student("학생" + i, 79 + i));
        }
        List<String> studentName = direct(students);
        System.out.println(studentName);
        List<String> studentName2 = lambda(students);
        System.out.println(studentName2);
    }

    private static List<String> direct(List<Student> students) {

        List<String> result = new ArrayList<>();

        for (Student student : students) {
            if(student.getScore() >= 80){
                result.add(student.getName());
            }
        }
        return result;
    }

    private static List<String> lambda(List<Student> students) {

        List<Student> filterList = GenericFilter.filter(students, s -> s.getScore() >= 80);
        List<String> mapList = GenericMapper.map(filterList, s -> s.getName());
        return mapList;
    }


}
