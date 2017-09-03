package pojo;

public abstract class Group {

    private int number;


    public Group(int number) {
        this.number = number;
    }

    public int getGroup() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
