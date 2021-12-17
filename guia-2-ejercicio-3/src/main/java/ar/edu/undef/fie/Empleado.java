package ar.edu.undef.fie;

public class Empleado {
    private String nombre;
    private String apellido;
    private double salario;


    public Empleado(String nombre, String apellido, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;

        if (salario < 0) {
            System.out.println("El valor ingresado es inválido");
        } else {
            this.salario = salario;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario < 0) {
            System.out.println("El valor ingresado es inválido");
        } else {
            this.salario = salario;
        }
    }
}
