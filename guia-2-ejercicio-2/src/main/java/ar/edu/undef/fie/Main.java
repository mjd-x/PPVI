package ar.edu.undef.fie;

public class Main {
    public static void main (String[] args) {
        Factura factura = new Factura("test001", "descTest", 5, 20f);
        System.out.println("El total es: $" + factura.getInvoiceAmount());

        Factura factura2 = new Factura("test002", "descTest2", -4, -50f);
        System.out.println("El total es: $" + factura2.getInvoiceAmount());
    }
}
