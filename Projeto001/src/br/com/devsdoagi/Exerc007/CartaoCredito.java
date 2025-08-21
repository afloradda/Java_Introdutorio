package br.com.devsdoagi.Exerc007;

public class CartaoCredito extends Cartao {
    private double limiteCartao;

    public CartaoCredito(String numero, double limiteCartao) {
        super(numero);
        this.limiteCartao = limiteCartao;
    }

    public double getLimiteCartao() {
        return limiteCartao;
    }

    public void setLimiteCartao(double limiteCartao) {
        this.limiteCartao = limiteCartao;
    }

    @Override
    public void processarCompra(double valor) {
        System.out.println("Processamento de compra no crétido...");
        System.out.println("Total a pagar: " + valor);
        System.out.println("Limite após pagamento: " + (getLimiteCartao() - valor));
    }
}
