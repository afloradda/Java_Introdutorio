package br.com.devsdoagi.Exerc005;

public class Poupanca extends Investimento{

    public Poupanca(double valorAplicado){
        super(valorAplicado);
    }

    public double calcularRendimento(double valor, int meses){
        return valor + (0.5 * meses);
    }
}
