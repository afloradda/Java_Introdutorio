package br.com.devsdoagi.Exerc009;

public class Analista extends Funcionario {
    private Funcionario funcionario;
    private double bonus = 1000;

    public Analista(Funcionario funcionario){
        super(funcionario.getNome(), funcionario.getSalario());
    }

    public double getBonus() {
        return bonus;
    }
}
