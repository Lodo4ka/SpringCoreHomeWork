package pojo;


public class Student extends Group{

    private String name;
    private int rating;


    public Student(String name, int rating, int group) {
        super(group);
        this.name = name;
        this.rating = rating;

    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }


    @Override
    public String toString() {
        return "pojo.Student{" +
                "name='" + name + '\'' +
                ", rating=" + rating + ", " +
                "group=" + getGroup() +
                '}' + "";
    }
}
