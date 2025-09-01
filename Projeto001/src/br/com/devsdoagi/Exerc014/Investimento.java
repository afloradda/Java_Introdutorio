package br.com.devsdoagi.Exerc014;

public class Investimento {
    // Atributos
    private String tipo;   // Ex.: Tesouro Selic, CDB, Ações
    private double valor;

    // Construtor
    public Investimento(String tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    // Getters
    public String getTipo() { return tipo; }
    public double getValor() { return valor; }

}
