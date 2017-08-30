package pojo;

import logger.Logger;

import java.util.Random;
import java.util.UUID;

public class Client implements Logger {

    private String name;
    private int age;

    public Client() {
        this.name = UUID.randomUUID().toString();
        this.age = Math.abs((byte)(new Random().nextInt()));
    }

    public void doEvent() {
        System.out.println(toString());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void doEvent(Event event) {

    }
}