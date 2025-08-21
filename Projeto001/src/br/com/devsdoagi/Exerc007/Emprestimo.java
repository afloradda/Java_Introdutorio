package br.com.devsdoagi.Exerc007;

/* BLOCO CLASSE ABSTRATA */

    /*
    4. Empréstimo
    Crie a classe abstrata Emprestimo com atributos valor e taxaJuros e o método abstrato double calcularParcela(int meses).

    - Crie as subclasses:
    EmprestimoPessoal → calcula parcela simples: (valor * (1 + taxaJuros * meses)) / meses.
    EmprestimoEmpresarial → parcela reduzida em 10% como benefício.

    - No Main, simule os dois tipos de empréstimos e compare os valores das parcelas.
    */

abstract class Emprestimo {
    protected double valor;
    private double taxaJuros;

    public Emprestimo(double valor, double taxaJuros) {
        this.valor = valor;
        this.taxaJuros = taxaJuros;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }

    public abstract double calcularParcela(int meses);
}
