public class ContaCorrente extends ContaBasica implements Conta{
    public void depositar(Double valor){
        double newValor = valor + getSaldo();
        super.setSaldo(newValor);
    }

    public void sacar(Double valor) {
        double newValor = getSaldo() - valor;
        super.setSaldo(newValor);
    }
}
