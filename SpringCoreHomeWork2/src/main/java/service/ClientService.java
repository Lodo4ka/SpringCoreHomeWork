package service;

import logger.Logger;
import pojo.Client;
import pojo.Event;

import java.util.Date;

public class ClientService {

    private Logger defaultLogger;


    public ClientService( Logger logger) {
        this.defaultLogger = logger;
    }


    public void createUser(Client client){
        Event event = new Event(new Date());
        event.setMsg("USER ADDED: " + client);
        defaultLogger.doEvent(event);
    }

}