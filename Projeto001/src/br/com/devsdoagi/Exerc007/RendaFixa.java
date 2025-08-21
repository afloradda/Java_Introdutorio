package br.com.devsdoagi.Exerc007;

public class RendaFixa extends Investimento {

    public RendaFixa(double valorAplicado){
        super(valorAplicado);
    }

    @Override
    public double calcularRendimento() {
        return getValorAplicado() * 0.5;
    }
}
