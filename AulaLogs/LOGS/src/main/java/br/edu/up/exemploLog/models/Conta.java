package br.edu.up.exemploLog.models;

public abstract class Conta {

    private double saldo;
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public abstract void imprimirExtrato();
}
