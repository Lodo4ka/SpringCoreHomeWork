package pojo;

import java.util.List;

public class Store {

    private List<Client>clients;


    public Store(List<Client> clients) {
        this.clients = clients;
    }

    public List<Client> getClients() {
        return clients;
    }

    @Override
    public String toString() {
        return "Store{" +
                "clients=" + clients +
                '}';
    }
}
