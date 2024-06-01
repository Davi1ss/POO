package Unidad_4_1;

// Clase derivada Car
class Car extends Vehicle {
    @Override
    public double calculateCost(double distance) {
        return distance * 0.4; // Formula específica para Car
    }

    @Override
    public double calculateCost(double distance, double weight) {
        return distance * weight * 0.08; // Formula específica para Car con peso
    }
}
