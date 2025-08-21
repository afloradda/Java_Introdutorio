package br.com.devsdoagi.Exerc006;

public class PagamentoBoleto implements IPagamento{

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$ " + valor + " realizado via boleto bancário.");
    }
}
