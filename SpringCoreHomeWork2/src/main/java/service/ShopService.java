package service;

import logger.Logger;
import pojo.ClothingShop;
import pojo.Event;

import java.util.Date;

public class ShopService {


    private Logger logger;


    public ShopService(Logger logger) {
        this.logger = logger;
    }

    public void createShop(ClothingShop shop){
        Event event = new Event(new Date());
        event.setMsg("Shop added: " + shop);
        logger.doEvent(event);
    }
}
