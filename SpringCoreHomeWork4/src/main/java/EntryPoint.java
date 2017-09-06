import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.Profession;
import pojo.Student;
import pojo.Students;

import java.util.List;

public class EntryPoint {

    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("pojo.xml");
        Students studentsBean = ctx.getBean("students", Students.class);
        List<Student> students = studentsBean.getStudents();

        //1 Выбрать всех студентов групы по номеру N
        selectAllStudentForNum(students, 1);

        System.out.println("-----------------\n");

        //2 Выбрать всех студентов по номеру группы и среднему балу выше 50 из 100
        selectAllStudentForNumAndRat(students, 1, 80);

        System.out.println("-----------------\n");

        //3 Создать объект професий и если средний бал студента выше 80 то переобразовать его в провесионала (Професия)
        createProffes(students, 80);
    }

    private static void createProffes(List<Student> students ,int rating) {
        students.stream()
                .filter(student->student.getRating() > rating)
                .map(student->new Profession(student.getName()))
                .forEach(System.out::println);
    }

    private static void selectAllStudentForNumAndRat(List<Student> students ,int n, int rating) {
        students.stream()
                .filter(student -> student.getGroup() == n && student.getRating() > rating)
                .forEach(System.out::println);
    }

    private static void selectAllStudentForNum(List<Student> students, int n) {
        students.stream().filter(student->student.getGroup() == n).forEach(System.out::println);
    }

}
