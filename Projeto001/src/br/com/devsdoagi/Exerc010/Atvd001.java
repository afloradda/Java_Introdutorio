package br.com.devsdoagi.Exerc010;

import java.util.Scanner;

    /*
    1. Controle de Saldo de Contas
    Crie um programa que armazene os saldos de 10 contas bancárias em um vetor.
    O usuário deve poder buscar o saldo de uma conta pelo índice do vetor.
    Se o usuário inserir um índice inválido, capture e trate ArrayIndexOutOfBoundsException.


    - Exemplo de Entrada:
    Digite o índice da conta: 12

    - Saída Esperada:
    Erro: Conta não encontrada!

            👉 Dica: Use try { ... } catch (ArrayIndexOutOfBoundsException e) { ... }.

     */

public class Atvd001 {
    public static void controleSaldoContas(){

        Scanner inputs = new Scanner(System.in);
        int[] saldos = new int[10];

        System.out.println("Digite os saldos das 10 contas: ");
        for (int i = 0; i < saldos.length; i++) {
            saldos[i] = inputs.nextInt();
        }

        try {
            System.out.println("Digite o índice da conta que deseja consultas (0-9): ");
            int indice = inputs.nextInt();

            int saldo = saldos[indice];
            System.out.println("Saldo da conta " + indice + ": " + saldo);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: Conta não encontrada/" + e);
        }

    }

    public static void main(String[] args) {
        controleSaldoContas();
    }
}
