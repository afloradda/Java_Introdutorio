package br.com.devsdoagi.Exerc011.Set;

    /*
    2. Investidores em Produtos Exclusivos
    Um banco oferece produtos de investimento exclusivos. Cada investidor pode ter acesso apenas a um produto único de cada tipo.

    Métodos sugeridos:
    - void adicionarProduto(Set<String> produtos, String nomeProduto) – adiciona o produto ao conjunto, se não estiver presente.
    - void exibirProdutos(Set<String> produtos) – exibe todos os produtos adquiridos.

    */

import java.util.Set;

public class Atvd002 {
    public static void adicionarProduto(Set<String> produtos, String nomeProduto){
        try {
            System.out.println("Adicionando ao Set o produto: " + nomeProduto);
            produtos.add(nomeProduto);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void exibirProdutos(Set<String> produtos){
        if(produtos.isEmpty()){
            System.out.println("Set vazio.");
        } else {
            System.out.println("Lista de produtos");

            for(String i : produtos){
                System.out.println("- " + i);
            }
        }
    }

    public static void main(String[] args) {

    }
}
