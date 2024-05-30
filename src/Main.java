// Clase principal para probar la jerarquía
public class Main {
    public static void main(String[] args) {
        Vehiculo miVehiculo = new Vehiculo("Genérica", "Model X", 180);
        System.out.println("Información del Vehículo:");
        miVehiculo.mostrarInformacion();
        miVehiculo.acelerar();
    }
}