package ar.edu.undef.fie;

public class Main {
    public static void main (String[] args) {
        Fecha fecha = new Fecha(2, 5, 2020);
        fecha.mostrar();

        Fecha fecha2 = new Fecha(31, 2, 1548);
        fecha2.mostrar();
    }
}
