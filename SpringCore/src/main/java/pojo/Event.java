
package pojo;

import java.util.Date;
import java.util.Random;

public class Event extends Client {


    private int id;
    private Date date;
    private String msg;

    public Event(Date date) {
        this.id = new Random(1000).nextInt();
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", date=" + date +
                ", name='" + getName() +
                ", age='" + getAge() + '\'' +
                '}';
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public void doEvent(Event event) {
        super.doEvent(event);
    }
}