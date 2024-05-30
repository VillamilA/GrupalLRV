// Clase principal para probar la jerarquía
public class Main {
    public static void main(String[] args) {
        Vehiculo miVehiculo = new Vehiculo("China", "Model X", 180);
        System.out.println("Informacion del Vehiculo:");
        miVehiculo.mostrarInformacion();
        miVehiculo.acelerar();

        //creamos el objeto y mostramos la información del auto
        Automovil miAutomovil = new Automovil("Toyota", "Corolla", 220, 4);

        System.out.println("\nInformacion del Auto:");
        miAutomovil.mostrarInformacion();
        miAutomovil.acelerar();
    }
}