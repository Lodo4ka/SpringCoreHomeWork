package pojo;

import java.util.Random;

public class Shoes {


    private String name;
    private int id;


    public Shoes(String name) {
        this.name  =name;
        id = Math.abs((byte)(new Random().nextInt()));
    }

    @Override
    public String toString() {
        return "Shoes{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
