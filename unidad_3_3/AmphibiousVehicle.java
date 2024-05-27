package unidad_3_3;

// Clase AmphibiousVehicle
class AmphibiousVehicle extends Vehicle implements LandVehicle, WaterVehicle {
    private int landSpeed;
    private int waterSpeed;

    public AmphibiousVehicle(String name) {
        super(name);
        this.landSpeed = 0;
        this.waterSpeed = 0;
    }

    @Override
    public void accelerate(int increment) {
        landSpeed += increment;
        waterSpeed += increment / 2; // Supongamos que la velocidad del agua aumenta a la mitad de la velocidad terrestre
        System.out.println(getName() + " Esta acelerando. Land speed: " + landSpeed + " km/h, Water speed: " + waterSpeed + " km/h.");
    }

    @Override
    public void driveOnLand() {
        landSpeed = 20; // Arbitrary initial land speed
        System.out.println(getName() + " está conduciendo por tierra a " + landSpeed + " km/h.");
    }

    @Override
    public void sailOnWater() {
        waterSpeed = 10; // Arbitrary initial water speed
        System.out.println(getName() + " Esta navegando por agua a " + waterSpeed + " km/h.");
    }
}
