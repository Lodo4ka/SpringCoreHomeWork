import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.Client;
import pojo.ClothingShop;
import pojo.Store;
import service.ClientService;
import service.ShopService;

import java.util.stream.Collectors;

public class EntryPoint {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        ApplicationContext context = new ClassPathXmlApplicationContext("clothingshop.xml");


        ClientService service = ctx.getBean("clientService", ClientService.class);
        ClothingShop clothingShopShoes = context.getBean("clothingShop", ClothingShop.class);
        ClothingShop clothingShopsec = context.getBean("clothingShopsec", ClothingShop.class);

        Store store = ctx.getBean("store", Store.class);

        service.createUser(new Client());
        ctx.close();



        store.getClients().stream()
                .map(client -> client.getName())
                .collect(Collectors.toList())
                .forEach(System.out::println);


        clothingShopsec.getJackets().stream()
                .map(jacket -> jacket.getName())
                .collect(Collectors.toList());


        System.out.println(store);
        System.out.println(clothingShopShoes);
        System.out.println(clothingShopsec);
    }
}