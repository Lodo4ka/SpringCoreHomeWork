import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.Client;
import service.ClientService;

public class EntryPoint {

    public static void main(String[] args) {

        ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");

        ClientService service = ctx.getBean("clientService", ClientService.class);
        service.createUser(new Client());


        ctx.close();
    }
}