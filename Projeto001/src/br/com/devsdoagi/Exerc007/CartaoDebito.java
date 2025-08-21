package br.com.devsdoagi.Exerc007;

public class CartaoDebito extends Cartao {
    private double saldoConta;

    public CartaoDebito(String numero, double saldoConta) {
        super(numero);
        this.saldoConta = saldoConta;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(double saldoConta) {
        this.saldoConta = saldoConta;
    }

    @Override
    public void processarCompra(double valor) {
        System.out.println("Processamento de compra no débito...");
        System.out.println("Total a pagar: " + valor);
        System.out.println("Saldo após pagamento: " + (getSaldoConta() - valor));
    }
}
