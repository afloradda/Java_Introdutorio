package br.com.devsdoagi.Exerc009;

public class MainHackaton001 {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Ana Julia C Leandro", 2000);
        Funcionario f2 = new Funcionario("Heloisa B Telles", 1500);

        Gerente g1 = new Gerente(f1);
        g1.setBonus(2000);
        System.out.println(g1.retornoSalario(g1.getBonus()));

        Analista a1 = new Analista(f2);
        System.out.println(a1.retornoSalario(a1.getBonus()));

    }

}
