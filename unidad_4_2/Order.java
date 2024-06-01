package unidad_4_2;

import java.util.ArrayList;
import java.util.List;

// Clase Order con alta cohesión
class Order {
    private int orderId;
    private Customer customer;
    private List<String> items;

    public Order(int orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
        this.items = new ArrayList<>();
    }

    public void addItem(String item) {
        items.add(item);
    }

    public int getOrderId() {
        return orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<String> getItems() {
        return items;
    }

    public double calculateTotal(Menu menu) {
        // Aquí podríamos tener una lógica más compleja para calcular el total del pedido
        return items.size() * 10.0; // Supongamos que cada item cuesta 10.0
    }

    public void printOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer: " + customer.getName());
        System.out.println("Items: " + items);
    }
}