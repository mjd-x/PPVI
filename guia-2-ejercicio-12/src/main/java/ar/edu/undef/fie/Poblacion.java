package ar.edu.undef.fie;

import java.util.Scanner;

public class Poblacion {
    int año;
    int añoDoble;
    double pobOriginal;
    double pobActual;
    double pobAnterior;
    double tasa = 1.1f;  // https://datos.bancomundial.org/indicador/SP.POP.GROW

    public Poblacion(int año, double pobOriginal) {
        if (año <= 0) {
            System.out.println("Año inválido");
        } else {
            this.año = año;
        }

        if (pobOriginal <= 0) {
            System.out.println("Número de población inválido");
        } else {
            this.pobOriginal = pobOriginal;
        }
    }

    public void imprimir() {
        pobActual = pobOriginal;
        pobAnterior = pobOriginal;

        System.out.println("Año\t\tP.M.\t\tAumento\n");

        for (int i = 0; i < 75 ; i++) {
            pobActual *= tasa;
            System.out.printf("%d\t%.2f\t%.2f\n", año+i, pobActual, (pobActual - pobAnterior));
            pobAnterior = pobActual;

            // verifico si es el doble
            if (pobActual >= 2 * pobOriginal && añoDoble == 0) {
                añoDoble = año + i;
                System.out.println("La población se duplicará en el año " + añoDoble);
            }
        }
    }
}
