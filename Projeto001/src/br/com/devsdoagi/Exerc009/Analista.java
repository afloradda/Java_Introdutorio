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

    /*
    public void retornoSalario(){
        System.out.println(getNome() + ", Segue seu salário deste mês após a aplicação do bônus mensal (" + getBonus() +"): " + (getSalario() + getBonus()));
    }

    */
}
