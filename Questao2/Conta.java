
public class Conta {

    private int numero;
    private double saldo;
    private String titular;

    public Conta(int numero, double saldo, String titular) {

        this.numero = numero;
        this.saldo = saldo;
        this.titular = titular;
    }

    public int getNumero() {

        return numero;
    }

    public double getSaldo() {

        return saldo;
    }

    public String getTitular() {
        
        return titular;
    }
}