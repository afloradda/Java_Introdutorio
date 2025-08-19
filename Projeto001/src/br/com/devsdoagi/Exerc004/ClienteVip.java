package br.com.devsdoagi.Exerc004;

public class ClienteVip extends Cliente{
    private int nivel;
    private double descontoPercentual;

    public ClienteVip(String nome, String cpf, int nivel, double descontoPercentual){
        super(nome, cpf);
        this.nivel = nivel;
        this.descontoPercentual = descontoPercentual;
    }

    public double calcularPrecoComDesconto(double valor){
        double percentualCalculado = descontoPercentual / 100;
        return valor * percentualCalculado;
    }

}
