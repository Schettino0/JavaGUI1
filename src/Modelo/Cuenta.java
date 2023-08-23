package Modelo;

public class Cuenta {
    private Cliente titular;
    private double saldo;

    public Cuenta(Cliente titular) {
        this.titular = titular;
        this.saldo = 130000;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double cantidad){
        setSaldo(getSaldo() + cantidad);
    }
    public double extraer(double cantidad){
        if (getSaldo() > cantidad){
//            setSaldo(getSaldo()- getSaldo()*0.01);
            setSaldo(getSaldo()- cantidad);
        }
        return getSaldo();
    }

    public double consultarSaldo(){
        return getSaldo();
    }
}
