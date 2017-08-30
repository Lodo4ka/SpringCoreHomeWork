package pojo;

import java.util.Random;

public class Jacket {

    private String name;
    private int id;

    public Jacket(String name) {
        this.name = name;
        id = Math.abs((byte)(new Random().nextInt()));
    }

    @Override
    public String toString() {
        return "Jacket{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
