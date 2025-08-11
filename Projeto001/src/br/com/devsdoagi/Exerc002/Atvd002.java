package br.com.devsdoagi.Exerc002;

public class Atvd002 {
    /*
        todo: Receba os preços de fechamento de uma ação durante 10 dias.
        Use maiorPreco() e menorPreco() para realizar os retornos
    */
    public static String maiorPreco(double[] precos){

        double maior = precos[0];

        for(int i = 0; i < precos.length; i++){
            if(precos[i] > maior){
                maior = precos[i];
            }
        }

        return "Maior valor de ação dentro de 10 dias: " + maior;
    }


    public static String menorPreco(double[] precos){
        double menor = precos[0];

        /*
        for(int i = 0; i < precos.length; i++){

            if(precos[i] <= menor){
                menor = precos[i];
            }
        }
         */

        for(double p : precos){
            if(p <= menor){
                menor = p;
            }
        }

        return "Menor valor de ação dentro de 10 dias: " + menor;
    }


    /*
        todo: Use o método variacaoDiaria(), que retorne um vetor com as variações percentuais diárias.
        Variação de 5 dias
    */
    public static double variacaoDiaria(double[] precos){
        double percentual;

        double valorInicial = precos[0];
        double valorFinal = precos[precos.length - 1];

        percentual = (valorInicial - valorFinal / valorInicial) * 100;

        return percentual;
    }

    public static double[] variacaoDiariaVetor(double[] precos){
        double[] variacao = new double[precos.length - 1];

        for(int i = 0; i < precos.length; i++){
            variacao[i] = (precos[i] - precos[i + 1] / precos[i]) * 100;
        }
        return variacao;
    }


    /*
        todo: Crie métodos para que recebam valor ao longo de 10 dias.
        e retornem primeiraTrincaAlta(), primeiraTendenciaAlta() e todasTendencias Altas
    */
    public static int[] primeiraTrincaAlta(double[] precos){
        for(int i = 0; i < precos.length - 2; i++) {

            if(precos[i] < precos[i + 1] && precos[i + 1] < precos[i + 2]){
                return new int[] {i, i + 1, i + 2};
            } else {
                return null;
            }
        }

        return null;
    }


    /*
        todo: Use o método calcularCrescimentoAcumulado(), que retorne o crescimento percentual acumulado em 5 dias.
    */
    public static double calcularCrescimentoAcumulado(double[] precos){

        double cumulativo = 0;
        double percentual;

        for(int i = 0; i < precos.length; i++) {
            cumulativo = precos[i];
            for (int j = 1; j < 5; j++) {
                cumulativo += precos[j];
            }
            percentual = (cumulativo / precos.length) * 100;
        }

        // return percentual;
        return 0;
    }


    /*
        todo: Use o méto mediaMovel(), que calcule a média móvel simples dos últimos n dias.
    */
    public static double mediaMovel(double[] precos, int dias){

        return 0;

    }


    /*
        todo: Identificação e Alta e Queda com métodos contarDiasAlta() e contarDiasQueda().
    */
    public static double contarDiasAlta(double[] precos){
        return 0;
    }

    public static double contarDiasQueda(double[] precos){
        return 0;
    }


    /*
        todo: Simulação de Carteira com os métodos totalInvestido() e percentualPorAcao()
    */
    public static double totalInvestido(double[] carteira){
        double somaTotal = 0;

        for(int i = 0; i < carteira.length; i++){
            somaTotal = somaTotal + carteira[i];
        }

        return somaTotal;
    }

    public static double percentualPorAcao(double[] carteira){
        return (totalInvestido(carteira) * carteira.length + 1) / 100;

    }


    /*
        todo: Cálculo de Impostos sobre Ganho de Capital
        com os métodos lucroPorAtivo(), lucroTotal() e calcularImposto()
    */


}
