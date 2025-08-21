package br.com.devsdoagi.Exerc006;

    /*
    1. Pagamentos
    - Crie uma interface chamada IPagamento com o seguinte método:
    public void processarPagamento(double valor);

    - Em seguida, implemente duas classes:
    PagamentoBoleto, que imprime: "Pagamento de R$valor realizado via boleto bancário."
    PagamentoCartao, que imprime: "Pagamento de R$valor realizado via cartão de crédito."

    - Crie uma classe MainPagamento que permita testar ambas as implementações.

     */

public interface IPagamento {
    public void processarPagamento(double valor);
}
