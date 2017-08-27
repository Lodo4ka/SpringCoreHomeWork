package logger;

import pojo.Event;

public class ConsoleLogger implements Logger{
    public void doEvent(Event event) {
        System.out.println(event);
    }
}