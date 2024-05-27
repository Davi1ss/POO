package unidad_3_3;


// Clase abstracta Vehicle
abstract class Vehicle {
    private String name;
    private int speed;

    public Vehicle(String name) {
        this.name = name;
        this.speed = 0;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public void start() {
        System.out.println(name + " está empezando.");
    }

    public void stop() {
        speed = 0;
        System.out.println(name + " está deteniendose.");
    }

    public abstract void accelerate(int increment);
}
