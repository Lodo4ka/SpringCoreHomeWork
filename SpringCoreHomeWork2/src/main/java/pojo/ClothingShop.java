package pojo;

import java.util.List;
import java.util.Map;

public class ClothingShop {

    Map<String, Shoes> shoes;
    List<Jacket> jackets;

    public ClothingShop(Map<String, Shoes> shoes) {
        this.shoes = shoes;
    }

    public ClothingShop(List<Jacket> jackets) {
        this.jackets = jackets;
    }


    public Map<String, Shoes> getShoes() {
        return shoes;
    }

    public List<Jacket> getJackets() {
        return jackets;
    }

    @Override
    public String toString() {
        return "ClothingShop{" +
                "shoes=" + shoes +
                ", jackets=" + jackets +
                '}';
    }
}
