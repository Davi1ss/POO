package Unidad_4_1;

// Clase derivada Motorcycle
class Motorcycle extends Vehicle {
    @Override
    public double calculateCost(double distance) {
        return distance * 0.2; // Formula específica para Motorcycle
    }

    @Override
    public double calculateCost(double distance, double weight) {
        return distance * weight * 0.05; // Formula específica para Motorcycle con peso
    }
}
