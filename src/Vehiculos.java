// HECHO PORR ANGEL VILLAMIL
// Clase base Vehiculo
class Vehiculo {
     String marca;
     String modelo;
     int velocidadMaxima;

    public Vehiculo(String marca, String modelo, int velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }

    public void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidad Máxima: " + velocidadMaxima + " km/h");
    }

    public void acelerar() {
        System.out.println("El vehículo esta acelerando.");
    }
}
