package br.com.devsdoagi.Exerc005;

/* BLOCO POLIMORFISMO (OVERRIDE) */

public class PagamentoPix extends Pagamento{
    private String chavePix;

    public PagamentoPix(double valor, String chavePix){
        super(valor);
        this.chavePix = chavePix;
    }

    @Override
    public void processarPagamento() {
        System.out.println("Processando pagamento de R$ " + getValor() + " por Pix.");
    }
}
