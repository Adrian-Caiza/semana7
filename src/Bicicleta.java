public class Bicicleta extends Transporte {
    String tipo;
    int marchas;

    public Bicicleta() {
    }

    public Bicicleta(int capacidad, double velocidad, String tipo, int marchas) {
        super(capacidad, velocidad);
        this.tipo = tipo;
        this.marchas = marchas;
    }

    public String getTipo() {
        return tipo;
    }

    public int getMarchas() {
        return marchas;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setMarchas(int marchas) {
        this.marchas = marchas;
    }

    public void prenderLuces() {
        System.out.println("Se prenden las luces");
    }
}