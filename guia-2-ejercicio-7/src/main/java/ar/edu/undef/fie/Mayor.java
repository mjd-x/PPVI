package ar.edu.undef.fie;

import java.util.Scanner;

public class Mayor {
    Scanner scanner = new Scanner(System.in);

    private int contador = 1;
    private int numero;
    private int mayor;

    public void ingresar() {
        System.out.println("Ingrese 10 enteros: ");

        // tomo un primer numero de referencia como maximo
        System.out.println("Numero " + contador + ": ");
        numero = scanner.nextInt();
        mayor = numero;
        contador++;

        // tomo el resto de los numeros
        for (; contador <= 10; contador++) {
            System.out.println("Numero " + contador + ": ");
            numero = scanner.nextInt();

            // verifico si el num ingresado es mayor al max actual
            if (numero > mayor) {
                mayor = numero;
            }
        }
    }

    public int getMayor() {
        return mayor;
    }
}
