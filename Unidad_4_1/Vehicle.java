package Unidad_4_1;

abstract class Vehicle {
    // Método abstracto que se implementará en las clases derivadas
    public abstract double calculateCost(double distance);

    // Sobrecarga del método calculateCost para aceptar un parámetro adicional de peso
    public double calculateCost(double distance, double weight) {
        return calculateCost(distance) * weight * 0.1; // Formula general con peso
    }
}
