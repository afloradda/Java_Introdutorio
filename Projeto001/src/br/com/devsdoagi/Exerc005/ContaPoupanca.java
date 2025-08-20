package br.com.devsdoagi.Exerc005;

public class ContaPoupanca extends ContaBancaria{

    public ContaPoupanca(String titular, double saldo){
        super(titular, saldo);
    }

    @Override
    public String gerarRelatorio(int meses) {
        double total = getSaldo();
        for (int i = 0; i < meses; i++) {
            total += 0.5;
        }

        return "Relatório Genério: Titular da conta " + getTitular() + " possui saldo de R$ " + total;
    }
}
