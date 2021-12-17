package ar.edu.undef.fie;

public class Main {
    public static void main (String[] args) {
        Mayor mayor = new Mayor();

        mayor.ingresar();
        System.out.println("Mayor: "+ mayor.getMayor());
    }
}
