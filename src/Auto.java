public class Auto extends Transporte{
    String tipo;
    int cilindraje;

    public Auto() {
    }

    public Auto(int capacidad, double velocidad, String tipo, int cilindraje) {
        super(capacidad, velocidad);
        this.tipo = tipo;
        this.cilindraje = cilindraje;
    }

    public Auto(int capacidad, double velocidad) {
        super(capacidad, velocidad);
    }

    public Auto(int cilindraje, String tipo) {
        this.cilindraje = cilindraje;
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public void prenderRadio() {
        System.out.println("Se enciende el radio");

    }
}

