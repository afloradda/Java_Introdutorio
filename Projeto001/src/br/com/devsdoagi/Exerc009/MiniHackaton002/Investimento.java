package br.com.devsdoagi.Exerc009.MiniHackaton002;

abstract class Investimento {
    private double valorInicial;

    public Investimento(double valorInicial){
        this.valorInicial = valorInicial;
    }

    public double getValorInicial() {
        return this.valorInicial;
    }

    public abstract double calcularRendimento();
}
