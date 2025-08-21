package br.com.devsdoagi.Exerc007;

/* BLOCO CLASSE ABSTRATA */

    /*
    2. Cartão de Pagamento (Cartão de Crédito e Cartão de Debito)
    Crie a classe abstrata Cartao com atributos numero e limite e o método abstrato void processarCompra(double valor).


    - Crie as subclasses:
    CartaoCredito → compra reduz do limite disponível.
    CartaoDebito → compra reduz diretamente do saldo (atributo adicional saldoConta).

    - No Main, simule compras nos dois tipos de cartão e mostre os saldos/limites finais.

    */

abstract class Cartao {
    protected String numero;

    public Cartao(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public abstract void processarCompra(double valor);
}
