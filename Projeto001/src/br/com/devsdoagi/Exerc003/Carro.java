package br.com.devsdoagi.Exerc003;

public class Carro {
    public String marca;
    public String modelo;
    public int ano;
    public double consumoPorKm;

    public void acelerar(){
        System.out.println("O carro está sendo acelerado..");
    }

    public void frear(){
        System.out.println("O carro está sendo freado..");
    }

    public double calcularConsumo(double distancia){
        return this.consumoPorKm * distancia;
    }

    public void mostrarInformacoes(){
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
        System.out.println("Consumo por KM: " + this.consumoPorKm);
    }
}
