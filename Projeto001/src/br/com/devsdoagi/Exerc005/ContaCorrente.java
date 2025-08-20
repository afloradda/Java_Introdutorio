package br.com.devsdoagi.Exerc005;

public class ContaCorrente extends ContaBancaria{

    public ContaCorrente(String titular, double saldo){
        super(titular, saldo);
    }

    @Override
    public String gerarRelatorio() {
        return "Relatório Genério: Titular da conta " + getTitular() + " possui saldo de R$ " + (getSaldo() - 20);
    }
}
