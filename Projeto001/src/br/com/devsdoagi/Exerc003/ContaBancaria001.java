package br.com.devsdoagi.Exerc003;

/* BLOCO CRIAÇÃO DE CLASSES ORIENTADAS A OBJETO */

public class ContaBancaria001 {
    public String titular;
    public String numeroConta;
    public double saldo;

    public void depositar(double valor){
        this.saldo += valor;
    }

    public void sacar(double valor){
        this.saldo -= valor;
    }

    public void exibirSaldo(){
        System.out.println("Saldo atual de: R/$ " + this.saldo);
    }
}
