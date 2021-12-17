package ar.edu.undef.fie;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // definiciones
        Scanner scanner = new Scanner(System.in);

        // tomo el primer num para tener de referencia para max y min
        System.out.print("Ingrese un entero: ");
        int numBase = scanner.nextInt();
        int max = numBase;
        int min = numBase;

        // tomo los otros 4 numeros y comparo
        for (int i=0; i<4; i++) {
            System.out.print("Ingrese un entero: ");
            int num = scanner.nextInt();

            // verifico si reemplaza a max o min
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        // imprimir max y min
        System.out.println("Maximo: " + max);
        System.out.println("Minimo: " + min);
    }
}
