import java.util.List;

public class Order {
    private List<Drink> order;

    private String name;
    private int price;

    public Order() {
    }

    public Order(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public List<Drink> getOrder() {
        return order;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
