package br.com.devsdoagi.Exerc002;
import java.util.Scanner;

public class Hackaton001 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int opcao;

            // Variáveis principais (poderão ser preenchidas na opção 1)
            int idadeAtual = 0, idadeAposentadoria = 0, expectativaVida = 0;
            double contribuicaoMensal = 0;
            double[] taxasAnuais = null;
            double[] saldoAnual = null;
            double[][] matrizCenarios = null;
            double[] rendaMensal = null;

            do {
                System.out.println("\n===== MENU SIMULADOR DE PREVIDÊNCIA =====");
                System.out.println("1 - Inserir dados");
                System.out.println("2 - Calcular saldo anual (vetor)");
                System.out.println("3 - Gerar matriz de cenários");
                System.out.println("4 - Calcular renda mensal na aposentadoria");
                System.out.println("5 - Exibir todos os resultados");
                System.out.println("0 - Sair");
                System.out.print("Escolha uma opção: ");
                opcao = sc.nextInt();

                switch (opcao) {
                    case 1:
                        // >>> INSERIR DADOS (ler do usuário e armazenar nas variáveis)
                        break;

                    case 2:
                        // >>> CHAMAR O MÉTODO calcularSaldoAnual() e armazenar no vetor saldoAnual
                        break;

                    case 3:
                        // >>> CHAMAR O MÉTODO gerarMatrizCenarios() e armazenar na matriz matrizCenarios
                        break;

                    case 4:
                        // >>> CHAMAR O MÉTODO calcularRendaMensal() e armazenar no vetor rendaMensal
                        break;

                    case 5:
                        // >>> CHAMAR O MÉTODO exibirResultados() para mostrar tudo
                        break;

                    case 0:
                        System.out.println("Encerrando o sistema...");
                        break;

                    default:
                        System.out.println("⚠ Opção inválida. Tente novamente.");
                }
            } while (opcao != 0);

            sc.close();
        }

        // ================================
        // ===== MÉTODOS ESTÁTICOS ========
        // ================================

        // 1. Cálculo do saldo acumulado ano a ano (Vetor)
        public static double[] calcularSaldoAnual(int idadeAtual, int idadeAposentadoria, double contribuicaoMensal, double taxaAnual) {
            // >>> IMPLEMENTAR O CÁLCULO DO SALDO ANUAL
            return null;
        }

        // 2. Projeção com cenários diferentes (Matriz)
        public static double[][] gerarMatrizCenarios(int idadeAtual, int idadeAposentadoria, double contribuicaoMensal, double[] taxasAnuais) {
            int tamanhoColuna = idadeAposentadoria - idadeAtual;

            double[][] matrizCenarios = new double[taxasAnuais.length][tamanhoColuna];

            for (int l = 0; l < taxasAnuais.length; l++) {
                for (int c = 0; c < tamanhoColuna; c++) {
                    double equacao = contribuicaoMensal * Math.pow((1 + taxasAnuais[l]), ((tamanhoColuna + 1) * 12) - 1) / contribuicaoMensal;
                    matrizCenarios[l][c] = equacao;
                }

            }

            return matrizCenarios;
        }

        // 3. Cálculo da renda mensal na aposentadoria
        public static double[] calcularRendaMensal(double[][] matrizCenarios, double[] taxasAnuais, int expectativaVida) {
            // >>> IMPLEMENTAR O CÁLCULO DA RENDA MENSAL PARA CADA CENÁRIO
            return null;
        }

        // 4. Exibir todos os resultados
        public static void exibirResultados(double[] saldoAnual, double[][] matrizCenarios, double[] taxasAnuais, double[] rendaMensal) {
            // >>> IMPLEMENTAR A EXIBIÇÃO DOS RESULTADOS
        }
}
