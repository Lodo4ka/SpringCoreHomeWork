package pojo;

import java.util.List;

public class Students {


    List<Student> students;

    public Students(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }


    @Override
    public String toString() {
        return "Students{" +
                "students=" + students +
                '}';
    }
}
