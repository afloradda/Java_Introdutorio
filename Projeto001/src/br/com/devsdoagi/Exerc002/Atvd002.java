package br.com.devsdoagi.Exerc002;

/* SEGUNDO BLOCO - VETORES */

public class Atvd002 {
    /*
        todo: 1. Receba os preços de fechamento de uma ação durante 10 dias.
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
        todo: 2. Use o método variacaoDiaria(), que retorne um vetor com as variações percentuais diárias.
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
        todo: 3. Simulação de Carteira com os métodos totalInvestido() e percentualPorAcao()
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
        todo: 4. Cálculo de Impostos sobre Ganho de Capital
        com os métodos lucroPorAtivo(), lucroTotal() e calcularImposto()
    */
    public static String lucroPorAtivo(double[] compra, double[] venda){
        for(int i = 0; i < compra.length; i++){
            for(int j = i; j < venda.length; j++){
                if(compra[i] < venda[j]){
                    return "Lucro";
                } else {
                    return "Perda";
                }
            }
        }

        return null;
    }

    public static double lucroTotal(double[] compra, double[] venda){
        double totalCompra = 0;
        double totalVenda = 0;

        for(int i = 0; i < compra.length; i++){
            totalCompra += compra[i];

            for (int j = i; j < venda.length; j++) {
                totalVenda += venda[j];
            }
        }
        return totalVenda - totalCompra;
    }

    public static double calcularImposto(double lucroTotal){
        return 0;
    }

    /*
        todo: 5. Previsão de Juros compostos
        com o métodos calcularJurosCompostos(), etc
    */
    public static double calcularJurosCompostos(double valorInicial, double taxa, int meses){
        double percentualTaxa = taxa * 100;
        double total = 0;

        for(int i = 0; i < meses; i++){
            total += valorInicial + percentualTaxa;
        }

        return total;
    }


    /*
        todo: 6. Crie métodos para que recebam valor ao longo de 10 dias.
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
        todo: 7. Use o método calcularCrescimentoAcumulado(), que retorne o crescimento percentual acumulado em 5 dias.
    */
    public static double calcularCrescimentoAcumulado(double[] precos){

        double cumulativo = 0;
        double percentual = 0;

        for(int i = 0; i < precos.length; i++) {
            cumulativo = precos[i];
            for (int j = 1; j < 5; j++) {
                cumulativo += precos[j];
            }
            percentual = (cumulativo / precos.length) * 100;
        }

        return percentual;
    }


    /*
        todo: 8. Use o méto mediaMovel(), que calcule a média móvel simples dos últimos n dias.
    */
    public static double mediaMovel(double[] precos, int dias){

        return 0;

    }


    /*
        todo: 9. Identificação e Alta e Queda com métodos contarDiasAlta() e contarDiasQueda().
    */
    public static double[] contarDiasAlta(double[] precos){

        return null;
    }

    public static double[] contarDiasQueda(double[] precos){
        return null;
    }


    /*
        todo: 10. Calculo do Maior Drawdown
        com os métodos drawdons() e maiorDrawdown()
    */

}
