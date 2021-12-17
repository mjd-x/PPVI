package ar.edu.undef.fie;

public class Main {
    public static void main (String[] args) {
        Cuenta cuenta = new Cuenta("Test", 1000f);

        cuenta.retiro(500f);
        cuenta.retiro(65f);
        cuenta.retiro(-56f);
        cuenta.retiro(845f);

    }
}
