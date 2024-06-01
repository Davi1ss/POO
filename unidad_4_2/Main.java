package unidad_4_2;

// Clase principal para demostrar el uso del sistema
public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        Menu menu = restaurant.getMenu();
        
        // Agregar items al menú
        menu.addItem("Pizza");
        menu.addItem("Pasta");
        menu.addItem("Salad");

        // Crear un cliente
        Customer customer = new Customer("John Doe", "123456789");

        // Crear un pedido
        Order order = new Order(1, customer);
        order.addItem("Pizza");
        order.addItem("Salad");

        // Agregar el pedido al restaurante
        restaurant.addOrder(order);

        // Calcular el total del pedido
        double total = order.calculateTotal(menu);
        System.out.println("Total Order Cost: " + total);

        // Imprimir los detalles del pedido
        order.printOrderDetails();
    }
}
