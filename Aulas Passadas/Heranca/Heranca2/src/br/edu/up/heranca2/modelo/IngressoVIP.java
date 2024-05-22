package br.edu.up.heranca2.modelo;

public class IngressoVIP extends Ingresso {
    private Double valorAdicional;

    public IngressoVIP(Double valor, Double valorAdicional) {
        super(valor);
        this.valorAdicional = valorAdicional;
    }

    public Double getValorAdicional() {
        return valorAdicional;
    }

    @Override
    public String toString() {
        var total = valorAdicional + getValor();
        return "IngressoVIP{" +
                "valor=" + total +
                '}';
    }
}
