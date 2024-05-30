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

//creamos la clase hija automovil
//Hecho por Angelo Loor
class Automovil extends Vehiculo {
    int numeroDePuertas;

    public Automovil(String marca, String modelo, int velocidadMaxima, int numeroDePuertas) {
        super(marca, modelo, velocidadMaxima);
        this.numeroDePuertas = numeroDePuertas;
    }

    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Numero de puertas: " + numeroDePuertas);
    }


    public void acelerar() {
        System.out.println("El automovil está acelerando.");
    }
}

// Clase derivada Motocicleta(nieta)
//Echo Por Richard Robalino
class Motocicleta extends Vehiculo {
    String tipoDeManillar;

    public Motocicleta(String marca, String modelo, int velocidadMaxima, String tipoDeManillar) {
        super(marca, modelo, velocidadMaxima);
        this.tipoDeManillar = tipoDeManillar;
    }

    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tipo de manillar: " + tipoDeManillar);
    }
    public void acelerar() {
        System.out.println("La motocicleta esta acelerando.");
    }
}