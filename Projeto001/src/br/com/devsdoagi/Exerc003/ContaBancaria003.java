package br.com.devsdoagi.Exerc003;

/* BLOCO DE CONSTRUTOR */

    /*
    Exercício 1 – Conta Bancária (Finanças)
    Crie a classe ContaBancaria com os atributos privados:
    titular (String), numeroConta (String), saldo (double)


    - [X] Implemente os seguintes construtores:
        1. Um construtor sem parâmetros que inicialize titular e numeroConta com strings vazias e saldo com zero.
        2. Um construtor que receba titular e numeroConta, inicializando saldo com zero.
        3. Um construtor que receba todos os três atributos.

     */

public class ContaBancaria003 {
    private String titular;
    private String numeroConta;
    private double saldo;

    public ContaBancaria003(String titular, String numeroConta, double saldo){
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public ContaBancaria003(String titular, String numeroConta){
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = 0;
    }

    public ContaBancaria003(){

    }

    public String getTitular() {
        return this.titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumeroConta(){
        return this.numeroConta;
    }

    public void setNumeroConta(String numeroConta){
        this.numeroConta = numeroConta;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
