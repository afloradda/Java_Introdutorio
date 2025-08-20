package br.com.devsdoagi.Exerc005;

/* BLOCO POLIMORFISMO (OVERRIDE) */

public class PagamentoCartaoCredito extends Pagamento{
    private String numeroCartao;

    public PagamentoCartaoCredito(double valor, String numeroCartao){
        super(valor);
        this.numeroCartao = numeroCartao;
    }

    @Override
    public void processarPagamento() {
        System.out.println("Processando pagamento de R$" + getValor() + " com Cartão de Crédito.");
    }
    
    @Override
    public void processarPagamento(double valor, int parcelas){
        System.out.println("Processando pagamento de R$" + valor + "parcelado em " + parcelas + "vezes.");
    }

}
