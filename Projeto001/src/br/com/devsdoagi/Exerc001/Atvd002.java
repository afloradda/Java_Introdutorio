package br.com.devsdoagi.Exerc001;

import java.util.Scanner;

public class Atvd002 {
    public static void executar(){

        int opcao;

        Scanner sc = new Scanner(System.in);
        opcao = sc.nextInt();

        switch (opcao){
            case 1:
                // Sexta Atividade: Faça uma programa que permita que o cliente entre com o valor
                // dos produtos comprados e mostre o total da compra, o valor do desconto e o preço a pagar

            case 2:
                // Sétima Atividade: Faça um programa que permita o usuário de informar seus gastos mensais.
                // O programa soma os valores e para quando um gasto negativo for digitado. Se o total ultrapassar
                // R$ 5000,00 o programa exibe um alerta

            case 3:
                // O usuário tem uma dívida e quer simular pagamentos mensais. A cada mês, o saldo da dívida é reduzida
                // pelo valor pago. O programa deve mostrar o saldo atualizado até a dívida ser quitada.

            case 4:
                // Simule um caixa eletrônico onde o usuário pode sacar dinheiro. O saldo inicial da conta será digitado
                // pelo usuário e o mesmo pode realizar saques até que o saldo acabe.

            case 5:
                // Um usuário deseja converter Reais (BRL) em Dólares (USD), mas há um limite diário de R$ 1000,00 para
                // conversão. O programa deve perguntar o valor desejado, verificar se está dentro do limite e calcular
                // a conversão com uma taxa de câmbio de 1 USD = 5 BRL.
        }

    }
}
