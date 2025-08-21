package br.com.devsdoagi.Exerc007;

/* BLOCO CLASSE ABSTRATA */

    /*
    1. Conta Bancária (Taxa x Rendimento)
    Crie a classe abstrata Conta com atributos numero e saldo e o método abstrato void atualizarMensal().

    - Crie as subclasses:
    ContaCorrente → desconta R$ 15,00 de taxa mensal.
    ContaPoupanca → aumenta o saldo em 0,5%.

    - No Main, crie uma conta corrente e uma poupança, faça depósito inicial e aplique a atualização mensal.

    */

abstract class Conta {
    protected double saldo;

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public abstract void atualizarMensal();
}
