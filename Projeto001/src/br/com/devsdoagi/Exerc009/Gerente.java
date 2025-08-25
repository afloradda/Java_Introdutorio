package br.com.devsdoagi.Exerc009;

public class Gerente extends Funcionario {
    private Funcionario funcionario;
    private double bonus;

    public Gerente(Funcionario funcionario){
        super(funcionario.getNome(), funcionario.getSalario());
        // this.funcionario = new Funcionario(getNome(), getSalario());

    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    /*
    public String retornoSalario(){
        return getNome() + ", Segue seu salário deste mês após a aplicação do bônus mensal (" + getBonus() +"): " + (getSalario() + getBonus());
    }

     */
}
