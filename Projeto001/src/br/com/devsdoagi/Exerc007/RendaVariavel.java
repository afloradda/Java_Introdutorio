package br.com.devsdoagi.Exerc007;

public class RendaVariavel extends Investimento {

    public RendaVariavel(double valorAplicado){
        super(valorAplicado);
    }

    @Override
    public double calcularRendimento() {
        return getValorAplicado() * 0.10;
    }
}
