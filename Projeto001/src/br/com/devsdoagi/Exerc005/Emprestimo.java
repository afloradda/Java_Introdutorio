package br.com.devsdoagi.Exerc005;

public class Emprestimo {
    protected double valorEmprestado;

    public Emprestimo(double valorEmprestado){
        this.valorEmprestado = valorEmprestado;
    }

    public double getValorEmprestado() {
        return this.valorEmprestado;
    }

    public void setValorEmprestado(double valorEmprestado) {
        this.valorEmprestado = valorEmprestado;
    }

    public double calcularParcela(int meses){
        return getValorEmprestado() / meses;
    }
}
