package ar.edu.undef.fie;

public class Fecha {
    private int dia;
    private int mes;
    private int año;

    public void mostrar() {
        System.out.println("La fecha es: " + dia + "/" + mes + "/" + año);
    }

    public Fecha(int dia, int mes, int año) {
        if (dia > 31 || dia < 1 || (dia > 29 && mes == 2)) {
            System.out.println("El día ingresado es inválido");
        } else {
            this.dia = dia;
        }

        if (mes > 12 || mes < 1) {
            System.out.println("El mes ingresado es inválido");
        } else {
            this.mes = mes;
        }

        if (año <= 0 ) {
            System.out.println("El año ingresado es inválido");
        } else {
            this.año = año;
        }
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if (mes > 12 || mes < 1) {
            System.out.println("El mes ingresado es inválido");
        } else {
            this.mes = mes;
        }
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if (dia > 31 || dia < 1 || (dia > 29 && mes == 2)) {
            System.out.println("El día ingresado es inválido");
        } else {
            this.dia = dia;
        }
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        if (año <= 0 ) {
            System.out.println("El año ingresado es inválido");
        } else {
            this.año = año;
        }
    }
}
