package br.com.devsdoagi.Exerc004;

public class InvestimentoRendaFixa extends Investimento{
    public double taxaAnual;
    public int periodoMeses;

    public InvestimentoRendaFixa(String codigo, double valorInicial, double taxaAnual, int periodoMeses){
        super(codigo, valorInicial);
        this.taxaAnual = taxaAnual;
        this.periodoMeses = periodoMeses;
    }

    public double calcularValorFinal(){
        return valorInicial * (1 + taxaAnual * (periodoMeses / 12));
    }
}
