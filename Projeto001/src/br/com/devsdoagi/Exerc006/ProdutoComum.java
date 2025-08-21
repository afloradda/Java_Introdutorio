package br.com.devsdoagi.Exerc006;

public class ProdutoComum implements IDescontavel {

    public double calcularPrecoFinal(double precoBase){
        return precoBase + 0.95;
    }
}
