package br.com.devsdoagi.Exerc003;

public class Aluno {
    public String nome;
    public double nota1;
    public double nota2;

    public double calcularMedia(){
        return (this.nota1 + this.nota2) / 2;
    }

    public String verificarSituacao(){
        String situacao = "";

        if(calcularMedia() <= 4){
            situacao = "Abaixo da média: Reprovado.";
        } else if (calcularMedia() == 5) {
            situacao = "Abaixo da média: Recuperação.";
        } else {
            situacao = "Acima da média: Aprovado";
        }

        return situacao;
    }

    public void exibirRelatorio(){
        System.out.println("Notas: " + this.nota1 + ", " + this.nota2 + ".");
        System.out.println("Média: " + calcularMedia());
        System.out.println("Situação: " + verificarSituacao());
    }

}
