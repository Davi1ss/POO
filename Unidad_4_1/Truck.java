package Unidad_4_1;

// Clase derivada Truck
class Truck extends Vehicle {
    @Override
    public double calculateCost(double distance) {
        return distance * 0.7; // Formula específica para Truck
    }

    @Override
    public double calculateCost(double distance, double weight) {
        return distance * weight * 0.2; // Formula específica para Truck con peso
    }
}
