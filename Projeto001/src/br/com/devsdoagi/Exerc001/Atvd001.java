package br.com.devsdoagi.Exerc001;

import java.util.Scanner;

public class Atvd001 {
    public static void executar(){
        int opcao, num;

        Scanner sc = new Scanner(System.in);
        opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                // Primeira Atividade: Verificar se número é positivo, negativo ou zero
                System.out.println("Digite um número:");
                num = sc.nextInt();

                if (num > 0) {
                    System.out.println("Positivo");
                } else if (num < 0) {
                    System.out.println("Negativo");
                } else {
                    System.out.println("Zero");
                }
                break;

            case 2:
                // Segunda Atividade: Verificar se número é par ou ímpar
                System.out.println("Digite um número:");
                num = sc.nextInt();
                String resultado = (num % 2 == 0) ? "Número par." : "Número ímpar.";
                System.out.println(resultado);
                break;

            case 3:
                // Terceira Atividade: Situação do atleta pelo IMC
                double peso, altura;
                System.out.println("Digite respectivamente peso e altura: ");
                peso = sc.nextDouble();
                altura = sc.nextDouble();

                double IMC = peso / (altura * altura);
                System.out.printf("IMC de %.2f", IMC);

                if (IMC < 18.5) {
                    System.out.println("\nAbaixo do peso.");
                } else if (IMC < 25) {
                    System.out.println("\nPeso normal.");
                } else if (IMC < 30) {
                    System.out.println("\nSobrepeso.");
                } else {
                    System.out.println("\nObesidade.");
                }
                break;

            case 4:
                // Quarta Atividade: Aproximação de valor em relação à média
                System.out.println("Digite o valor: ");
                double valor = sc.nextDouble();
                System.out.println("Digite a média: ");
                double media = sc.nextDouble();

                double diferenca = Math.abs(valor - media);
                double percentual = (diferenca / media) * 100;

                System.out.printf("Segue: %.2f%%", percentual);
                break;

            case 5:
                // Quinta Atividade: Situação do aluno pela nota final
                System.out.println("Digite a nota final: ");
                double nota = sc.nextDouble();

                if (nota >= 6) {
                    System.out.println("Aprovado.");
                } else if (nota >= 4) {
                    System.out.println("Exame.");
                } else {
                    System.out.println("Reprovado.");
                }
                break;

            default:
                System.out.println("Opção inválida.");
        }
    }
}
