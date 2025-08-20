package br.com.devsdoagi.Exerc005;

public class CDB extends Investimento{

    public CDB(double valorAplicado){
        super(valorAplicado);
    }

    @Override
    public double calcularRendimento(double valor, int meses){
        return valor;
    }
}
