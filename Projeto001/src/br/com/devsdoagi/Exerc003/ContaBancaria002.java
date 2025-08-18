package br.com.devsdoagi.Exerc003;

/* BLOCO DE ENCAPSULAMENTO (MODIFICADORES) */

    /*
    1. Conta Bancária (Setor Financeiro)
    Crie a classe ContaBancaria com os seguintes atributos privados:
    titular (String), numeroConta (String), saldo (double).

    Implemente os métodos getters e setters, garantindo que:
    - [X] o saldo não pode ser alterado diretamente (sem setSaldo)
    - [X] o método depositar(double valor) só aceita valores positivos
    - [X] o método sacar(double valor) só permite saque se houver saldo suficiente
    - [X] crie um método exibirExtrato() para mostrar os dados da conta e o saldo atual.
    */

public class ContaBancaria002 {
    private String titular;
    private String numeroConta;
    private double saldo;

    public String getTitular() {
        return this.titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumeroConta() {
        return this.numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    /*
    public double getSaldo() {
        return this.saldo;
    }

    Neste contexto, o atributo saldo deve ser acessado única e exclusivamente
    atráves dos métodos delimitados pelo enunciado. A própria classe ContaBancaria002
    tem o serviço exibirExtrato e desta forma não precisamos obter o saldo diretamente.

    */

    public void depositar(double valor){
        if(valor >= 1){
            this.saldo += valor;
        } else {
            System.out.println("Valor de deposito inválido.");
        }
    }

    public void sacar(double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
        } else {
            System.out.println("Valor de saldo insuficiente.");
        }
    }

    public void exibirExtrato(){
        System.out.println("Titular: " + getTitular());
        System.out.println("Número de Conta: " + getNumeroConta());
        System.out.println("Saldo: " + this.saldo);
    }


}
