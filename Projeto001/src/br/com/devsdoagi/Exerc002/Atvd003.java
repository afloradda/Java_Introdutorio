package br.com.devsdoagi.Exerc002;

/* TERCEIRO BLOCO - MATRIZ */

import java.util.Scanner;

public class Atvd003 {
    // 1.
    public static void preencherMatriz(double[][] matriz){
        Scanner sc = new Scanner(System.in);

        for(int l=0; l < matriz.length; l++){
            for(int c=0; c < matriz[l].length; c++){
                System.out.println("Digite o valor: ");
                matriz[l][c] = sc.nextDouble();

            }
        }
    }

    public static double calcularSomaTotal(double[][] matriz){
        double soma = 0;

        for(int l=0; l < matriz.length; l++){
            for(int c=0; c < matriz[l].length; c++){
                soma += matriz[l][c];
            }
        }

        return soma;
    }

    // 2.
    public static double encontrarMaiorValor(double[][] matriz){
        double maior = matriz[0][0];

        for(int l=0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[l].length; c++) {
                if(matriz[l][c] > maior){
                    maior = matriz[l][c];
                }
            }
        }

        return maior;
    }

    // 3.
    public static double[] encontrarMenorPrecoPorProduto(double[][] matriz){
        double menor;
        double[] menorPreco = new double[matriz[0].length];

        for (int p = 0; p < matriz[0].length; p++) { // lê-se "Enquanto p (indice) for menor que a quantidade de colunas
            menor = matriz[0][p];
            for (int l = 0; l < matriz.length; l++) {
                if(matriz[l][p] < menor) {
                    menor = matriz[l][p];
                }
            }
            menorPreco[p] = menor;
        }

        return menorPreco;
    }

    public static void main(String[] args) {
        double[][] matriz = new double[2][2];
        double total;

        // 1.
        preencherMatriz(matriz);

        total = calcularSomaTotal(matriz);
        System.out.println("total: " + total);

        // 2.
        double[][] mat = {{102, 110, 150, 210},
                          {120, 125, 130, 301},
                          {202, 210, 250, 204},
                         };

        System.out.println("Maior dívida encontrada na Matriz:" + encontrarMaiorValor(mat));
    }
}
