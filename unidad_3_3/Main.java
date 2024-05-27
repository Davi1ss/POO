package unidad_3_3;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de AmphibiousVehicle
        AmphibiousVehicle amphibiousVehicle = new AmphibiousVehicle("Vehiculo Amphibious");

        // Usar los métodos de AmphibiousVehicle
        amphibiousVehicle.start();
        amphibiousVehicle.driveOnLand();
        amphibiousVehicle.sailOnWater();
        amphibiousVehicle.accelerate(30);
        amphibiousVehicle.stop();
    }
}
