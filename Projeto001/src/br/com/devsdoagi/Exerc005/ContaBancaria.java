package br.com.devsdoagi.Exerc005;

public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return this.titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /*
    public void gerarRelatorio(){
        System.out.println("Relatório Genérico: ");
        System.out.println("--------------------");
        System.out.println("Titular da conta: " + getTitular());
        System.out.println("Saldo atual: " + getSaldo());
        System.out.println("--------------------");
    }

    */

    public String gerarRelatorio(){
        return "Relatório Genério: Titular da conta " + getTitular() + " possui saldo de R$ " + getSaldo();
    }

    public String gerarRelatorio(int meses){
        return "";
    }
}
