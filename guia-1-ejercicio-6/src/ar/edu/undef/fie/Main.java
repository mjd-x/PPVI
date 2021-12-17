package ar.edu.undef.fie;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // definiciones
        Scanner scanner = new Scanner(System.in);

        // ingresar los numeros
        System.out.println("Ingrese el dividendo: ");
        int num1 = scanner.nextInt();

        System.out.println("Ingrese el divisor: ");
        int num2 = scanner.nextInt();

        // checkear el valor del divisor
        while (num2 == 0) {
            System.out.println("El divisor no puede ser cero.");
            System.out.println("Ingrese el divisor: ");
            num2 = scanner.nextInt();
        }

        // comparar

        if (num1 % num2 == 0){
            System.out.println(num1 + " es multiplo de " + num2);
        }
        else {
            System.out.println(num1 + " no es multiplo de " + num2);
        }

    }
}
