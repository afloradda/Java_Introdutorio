package br.com.devsdoagi.Exerc010;

    /*
    2. Cálculo de Média Móvel de Ativos
    Receba os preços de uma ação nos últimos 10 dias e calcule a média móvel de 3 dias.

    - Se houver menos de 3 valores no vetor, lance IllegalArgumentException.
    - Se os preços forem informados incorretamente, capture NumberFormatException.


    Fórmula da Média Móvel:
    MM=(Patual+Panterior1+Panterior2)/3
    Exemplo de Entrada:
            {100.0, 102.0, 101.0, 103.0, 105.0}

    Saída Esperada:
    Média Móvel (dia 3): 101.0
    Média Móvel (dia 4): 102.0
    Média Móvel (dia 5): 103.0

            👉 Dica: Valide o tamanho do vetor antes de calcular.

    */

import java.util.Scanner;

public class Atvd002 {
    public static void controleMediaMovel() {
        Scanner inputs = new Scanner(System.in);
        double[] entradas = new double[10];

        System.out.println("Digite as entradas dos investimentos dos ultimos 10 dias: ");
        for (int i = 0; i < entradas.length; i++) {
            entradas[i] = inputs.nextDouble();
        }

        /*
        Continuar e Corrigir

        try {
            for (int i = 0; i < entradas.length; i++) {
                if(entradas.length < 3) {
                    throw new IllegalArgumentException("Menos de três valores encontrados.");
                }

            }


        }
        catch (NumberFormatException e) {

        }

        */


    }

    public static void main(String[] args) {
        controleMediaMovel();
    }
}
