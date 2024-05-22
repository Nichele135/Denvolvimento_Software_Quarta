import Banco.ContaBancaria;

public class Principal {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        conta.depositar(500.00);
        conta.depositar(1000);
        conta.saque(1000);
        conta.saque(100);
    }
}
