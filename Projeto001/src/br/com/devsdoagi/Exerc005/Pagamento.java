package br.com.devsdoagi.Exerc005;

/* BLOCO POLIMORFISMO (OVERLOADING) */

public class Pagamento {
    protected double valor;

    public Pagamento(double valor){
        this.valor = valor;
    }

    public double getValor(){
        return this.valor;
    }

    public void setValor(double valor){
        this.valor = valor;
    }

    public void processarPagamento(){
        System.out.println("Processando pagamento genérico de R$ " + getValor() + ".");
    }

    public void processarPagamento(double valor, String moeda){
        System.out.println("Processando pagamento genérico de R$" + valor + "em " + moeda + ".");
    }

    public void processarPagamento(double valor, int parcelas){
        System.out.println("Processando pagamento genérico de R$" + valor + "em " + parcelas + " parcelas.");
    }
}
