package br.com.devsdoagi.Exerc007;

/* BLOCO CLASSE ABSTRATA */

    /*
    3. Investimento
    Crie a classe abstrata Investimento com atributo valorAplicado e o método abstrato double calcularRendimento().

    - Crie as subclasses:
    RendaFixa → rendimento de 5%.
    RendaVariavel → rendimento de 10%.

    - No Main, crie os dois investimentos e mostre o valor final de cada um.
    */

abstract class Investimento {
    protected double valorAplicado;

    public Investimento(double valorAplicado) {
        this.valorAplicado = valorAplicado;
    }

    public double getValorAplicado() {
        return valorAplicado;
    }

    public void setValorAplicado(double valorAplicado) {
        this.valorAplicado = valorAplicado;
    }

    public abstract double calcularRendimento();
}
