package ar.edu.undef.fie;

public class Factura {
    private String pieza;
    private String descripcion;
    private int cantidad;
    private double precio;

    public double getInvoiceAmount () {
        return (cantidad * precio);
    }

    public Factura(String pieza, String descripcion, int cantidad, double precio) {
        this.pieza = pieza;
        this.descripcion = descripcion;

        if (cantidad < 0) {
            this.cantidad = 0;
        } else {
            this.cantidad = cantidad;
        }

        if (precio < 0) {
            this.precio = 0.0f;
        } else {
            this.precio = precio;
        }
    }

    public String getPieza() {
        return pieza;
    }

    public void setPieza(String pieza) {
        this.pieza = pieza;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        if (cantidad < 0) {
            this.cantidad = 0;
        } else {
            this.cantidad = cantidad;
        }
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio < 0) {
            this.precio = 0.0f;
        } else {
            this.precio = precio;
        }
    }
}