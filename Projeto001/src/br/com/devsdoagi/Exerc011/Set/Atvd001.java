package br.com.devsdoagi.Exerc011.Set;

    /*
    1. Clientes com Contas Únicas
    Um banco precisa armazenar os números das contas bancárias dos clientes, garantindo que nenhuma conta seja duplicada.

    Métodos sugeridos:
    - void adicionarConta(Set<Integer> contas, int numeroConta) – adiciona uma conta ao conjunto, caso ainda não exista.
    - boolean existeConta(Set<Integer> contas, int numeroConta) – verifica se a conta já está cadastrada.
    - void exibirContas(Set<Integer> contas) – exibe todas as contas cadastradas.

    */

import java.util.Set;

public class Atvd001 {

    public static void adicionarConta(Set<Integer> contas, int numeroConta){
        try {
            contas.add(numeroConta);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean existeConta(Set<Integer> contas, int numeroConta) {
        boolean retorno = false;

        if (contas != null) {
            try {
                if (contas.contains(numeroConta)) {
                    retorno = true;
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        return retorno;
    }

    public static void exibirContas (Set < Integer > contas) {
        if (contas != null) {
            System.out.println("Iterando pelo conjunto: ");
            for (Integer conta : contas) {
                    System.out.println(conta);
            }
        }


    }

    public static void main(String[] args) {

    }
}