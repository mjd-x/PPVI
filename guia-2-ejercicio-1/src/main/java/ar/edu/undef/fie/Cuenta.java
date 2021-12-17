package ar.edu.undef.fie;

public class Cuenta {
    private String titular;
    private float saldo;

    public void retiro (float valor) {
        if (valor > 0) {
            if (valor >= saldo) {
                System.out.println("La cantidad de retiro excedió el saldo de la cuenta");
            } else {
                saldo -= valor;
                System.out.println("Se retiraron $" + valor + ". Saldo final: $" + saldo);
            }
        } else {
            System.out.println("El valor ingresado no es válido");
        }
    }

    public Cuenta(String titular, float saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
}
