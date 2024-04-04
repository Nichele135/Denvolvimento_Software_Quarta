package Banco;

public class ContaBancaria {
    private Double saldo;

    public ContaBancaria(){
        this.saldo = 0.0;
    }

    public Double getSaldo() {
        return saldo;
    }
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public void saque(double valor){
        if (valor > this.saldo){
            System.out.println("Saldo insuficiente");
            return;
        }
        this.saldo -= valor;
    }
    public double obterSaldo(){
        return this.saldo;
    }
}
