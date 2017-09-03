import pojo.Profession;
import pojo.Student;

import java.util.LinkedList;
import java.util.List;

public class EntryPoint {

    public static void main(String[] args) {

        List<Student> students = new LinkedList<>();

        students.add(new Student("Vasya", 70, 1));
        students.add(new Student("Petya", 80, 2));
        students.add(new Student("Vova", 50, 3));
        students.add(new Student("Amiran", 90, 1));


        //1
        students.stream().filter(student->student.getGroup() == 1).forEach(System.out::println);

        //2
        students.stream()
                .filter(student -> student.getGroup() == 1 && student.getRating() > 80)
                .forEach(System.out::println);

        //3
        students.stream()
                .filter(student->student.getRating() > 80)
                .map(student->new Profession(student.getName()))
                .forEach(System.out::println);
    }

}
