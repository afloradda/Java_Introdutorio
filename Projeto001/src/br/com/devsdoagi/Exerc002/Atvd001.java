package br.com.devsdoagi.Exerc002;


public class Atvd001 {

    public static double converterMoeda(double valor){
        double taxa_USD = 5.44;

        return valor / taxa_USD;
    }

    public static double calcularJurosSimples(double capital, double taxaAnual, int anos){

        return  capital + (capital * (taxaAnual /100) * anos);
    }

    public static double calcularCrescimento(double dia1, double dia2){
        double percentual;

        if(dia1 > dia2){
            percentual = (dia1 - dia2) / dia1 * 100;
        } else {
            percentual = (dia2 - dia1) / dia2 * 100;
        }

        return percentual;
    }

    public static double calcularMediaMovel(double[] precos, int intervalo){
        double[] medias = new double[precos.length - intervalo + 1];

        for(int i = 0; i < precos.length - intervalo; i++){
            double soma = 0;

            for(int j = i; j < i + intervalo; j++){
                soma += precos[j]; // acessando informação dentro do indice

            }


        }
        return 0;

    }

    public static String compararAtivos(double r1, double r2){
        String comparacao;
        if(r1 > r2){
            comparacao = "O ativo 1 é maior.";
        } else if (r2 > r1) {
            comparacao = "O ativo 2 é maior.";
        } else {
            comparacao = "Ambos iguais.";
        }

        return comparacao;
    }


}
