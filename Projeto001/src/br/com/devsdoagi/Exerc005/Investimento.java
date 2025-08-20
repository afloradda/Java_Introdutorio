package br.com.devsdoagi.Exerc005;

public abstract class Investimento {
    private double valorAplicado;

    public Investimento(double valorAplicado){
        this.valorAplicado = valorAplicado;
    }

    public double getValorAplicado(){
        return this.valorAplicado;
    }

    public void setValorAplicado(double valorAplicado){
        this.valorAplicado = valorAplicado;
    }

    public double calcularRendimento(double valor, int meses){
        return 0;
    }

   /* public abstract double calcularRendimento(double valor, int meses); */
}
