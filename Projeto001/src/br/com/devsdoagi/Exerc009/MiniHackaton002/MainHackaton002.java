package br.com.devsdoagi.Exerc009.MiniHackaton002;

// 100 :)

public class MainHackaton002 {
    public static void main(String[] args) {
        Investimento[] listagem = {
                new RendaFixa(2000),
                new RendaFixa(2800),
                new RendaVariavel(1180),
                new RendaVariavel(600)
        };

        System.out.println("Investimentos: ");
        for(Investimento i : listagem){
            System.out.println("- " + i.calcularRendimento());
        }
    }
}
