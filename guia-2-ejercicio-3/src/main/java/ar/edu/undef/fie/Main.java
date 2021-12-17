package ar.edu.undef.fie;

public class Main {
    public static void main (String[] args) {
        Empleado empleado = new Empleado("Marina", "Donis", 265f);
        System.out.println("Salario: $" + empleado.getSalario());

        Empleado empleado2 = new Empleado("Test", "Test", -546f);
        System.out.println("Salario: $" + empleado2.getSalario());
    }
}
