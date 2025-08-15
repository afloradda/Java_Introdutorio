package br.com.devsdoagi.Exerc003;

public class Funcionario {
    public String nome;
    public double salarioBruto;
    public double descontoINSS;
    public double descontoIR;

    public double calcularSalarioLiquido(){
        double descontos = this.descontoINSS + this.descontoIR;
        return this.salarioBruto - descontos;
    }

    public void exibirFolhaPagamento(){
        System.out.println("Salário Bruto: " + this.salarioBruto);
        System.out.println("Desconto INSS: " + this.descontoINSS);
        System.out.println("Desconto IR: " + this.descontoIR);
        System.out.println("-----------------------------------");
        System.out.println("Salário Liquido: " + calcularSalarioLiquido());
    }
}
