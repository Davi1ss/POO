package unidad_4_2;

import java.util.ArrayList;
import java.util.List;

// Clase Restaurant con alta cohesión y bajo acoplamiento
class Restaurant {
    private Menu menu;
    private List<Order> orders;

    public Restaurant() {
        menu = new Menu();
        orders = new ArrayList<>();
    }

    public Menu getMenu() {
        return menu;
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public List<Order> getOrders() {
        return orders;
    }
}
