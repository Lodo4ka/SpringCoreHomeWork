package pojo;

public class Profession {

    private String name;

    public Profession(String student) {
        name = student;
    }

    @Override
    public String toString() {
        return "Professional{" +
                "name='" + name + '\'' +
                '}';
    }
}
