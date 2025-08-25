package br.com.devsdoagi.Exerc009.MiniHackaton001;

public class Funcionario {
    private String nome;
    private double salario;


    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String retornoSalario(double bonus){
        return getNome() + ", Segue seu salário deste mês após a aplicação do bônus mensal (" + bonus +"): " + (getSalario() + bonus);
    }
}
