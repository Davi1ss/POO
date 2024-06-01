package Unidad_4_1;

// Clase principal para demostrar el polimorfismo
public class Main {
    public static void main(String[] args) {
        // Creación de objetos de diferentes tipos de vehículos
        Vehicle car = new Car();
        Vehicle truck = new Truck();
        Vehicle motorcycle = new Motorcycle();

        // Uso del polimorfismo dinámico
        Vehicle[] vehicles = {car, truck, motorcycle};

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getClass().getSimpleName() + ":");
            System.out.println("Cost without weight: " + vehicle.calculateCost(100));
            System.out.println("Cost with weight (500 kg): " + vehicle.calculateCost(100, 500));
        }
    }
}