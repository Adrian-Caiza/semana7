//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("AUTOS");
        Auto auto1 = new Auto();
        auto1.prenderRadio();
        auto1.mostrarDatos();

        Auto auto2 = new Auto(5,60.0,"Gasolina",80);
        auto2.prenderRadio();
        auto2.mostrarDatos();

        Auto auto3 = new Auto();
        auto3.setCapacidad(6);
        auto3.setVelocidad(80.0);
        auto3.setTipo("Hibrido");
        auto3.setCilindraje(120);
        auto3.prenderRadio();
        auto3.mostrarDatos();

    }
}