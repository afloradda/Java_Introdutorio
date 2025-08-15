package br.com.devsdoagi.Exerc003;

public class Produto {
    public String nome;
    public double preco;
    public int quantidade;

    public void adicionarEstoque(int quantidade){
        this.quantidade += quantidade;
    }

    public void removerEstoque(int quantidade){
        this.quantidade -= quantidade;
    }

    void exibirDados(){
        System.out.println("Produto: " + this.nome);
        System.out.println("Valor: " + this.preco);
        System.out.println("Estoque com o total de: " + this.quantidade + " peças.");
    }
}
