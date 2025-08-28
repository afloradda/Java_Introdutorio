package br.com.devsdoagi.Exerc011.List;

    /*
    5. Histórico de Transações
    Mantenha o histórico de transações de um cliente em um List<String>.

    Métodos sugeridos:
    - void registrarTransacao(List<String> historico, String transacao) – adiciona uma transação no histórico.
    - boolean buscarTransacao(List<String> historico, String transacao) – verifica se uma transação específica existe.
    - void exibirHistorico(List<String> historico) – exibe todas as transações na ordem em que ocorreram.

    */

import java.util.List;

public class Atvd005 {
    public static void registrarTransacao(List<String> historico, String transacao) {
        historico.add(transacao);
    }

    protected static boolean buscarTransacao(List<String> historico, String transacao) {
        boolean exite = false;
        if (historico.contains(transacao)) {
            exite = true;
        }

        return exite;
    }

    protected static void exibirHistorico(List<String> historico) {
        System.out.println("Historico de Transações: ");
        for(String indice : historico){
            System.out.println("- " + indice);
        }
    }



    public static void main(String[] args) {

    }
}
