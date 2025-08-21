package br.com.devsdoagi.Exerc006;

    /*
    2. Descontos de Produto
    - Crie uma interface IDescontavel com o método:
    `public double calcularPrecoFinal(double precoBase);`

    - Depois, crie duas classes que implementam essa interface:
    ProdutoComum: aplica 5% de desconto sobre o preço base.
    ProdutoPromocional: aplica 20% de desconto sobre o preço base.

    - Por fim, crie uma classe MainProduto que instancie os dois tipos de produto e exiba os preços finais com desconto.
    */

public interface IDescontavel {
    public double calcularPrecoFinal(double precoBase);
}
