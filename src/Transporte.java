public class Transporte {
    int capacidad;
    double velocidad;

    public Transporte() {
    }

    public Transporte(int capacidad, double velocidad) {
        this.capacidad = capacidad;
        this.velocidad = velocidad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }
    //metodo mostrarDatos
    public void mostrarDatos(){
        System.out.println("La capacidad es: " + capacidad);
        System.out.println("la velocidad es: " + velocidad);
    }
}
