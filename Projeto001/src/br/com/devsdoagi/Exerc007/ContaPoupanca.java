package br.com.devsdoagi.Exerc007;

public class ContaPoupanca extends Conta {
    private String titular;

    public ContaPoupanca(double saldo, String titular) {
        super(saldo);
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    @Override
    public void atualizarMensal() {
        System.out.println("Olá, " + getTitular() + ". Seu saldo atual após o rendimento de taxa mensal é de: " + (getSaldo() * 0.5));
    }
}
