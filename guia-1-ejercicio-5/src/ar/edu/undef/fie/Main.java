package ar.edu.undef.fie;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // declaraciones
        Scanner scanner = new Scanner(System.in);

        // ingresar el numero
        System.out.println("Ingrese un numero: ");
        int num = scanner.nextInt();

        // comparar
        if (num % 2 == 0){
            System.out.println("El numero ingresado es par");
        }
        else {
            System.out.println("El numero ingresado es impar");
        }

    }
}
