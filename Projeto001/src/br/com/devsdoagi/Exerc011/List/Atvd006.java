package br.com.devsdoagi.Exerc011.List;

    /*
    Crie uma lista de clientes usando um List<Cliente>, onde Cliente é uma classe com atributos nome e saldo.

    Métodos sugeridos:
    - void adicionarCliente(List<Cliente> clientes, String nome, double saldo) – adiciona um cliente na lista.
    - void ordenarPorSaldo(List<Cliente> clientes) – ordena a lista em ordem decrescente de saldo.
    - void exibirClientes(List<Cliente> clientes) – exibe todos os clientes com nome e saldo.

    */

import java.util.ArrayList;
import java.util.List;

public class Atvd006 {
    public static void adicionarCliente(List<Cliente> clientes, String nome, double saldo) {
        clientes.add(new Cliente(nome, saldo));

        /*
        Opção 2:
        Cliente c = new Cliente(nome, saldo);
        clientes.add(c);
        */
    }

    public static void ordenarPorSaldo(List<Cliente> clientes) {
        clientes.sort((c1, c2) -> Double.compare(c2.getSaldo(), c1.getSaldo()));
    }

    public static void exibirClientes(List<Cliente> clientes) {
        System.out.println("Passagem pelos clientes: ");

        for(Cliente indice : clientes) {
            System.out.println(indice);
        }

        // Opção 2: clientes.forEach(System.out::println);

    }


    public static void main(String[] args) {
        List<Cliente> clientes = new ArrayList<>();

        adicionarCliente(clientes, "Ana", 2000);
        adicionarCliente(clientes, "Julia", 2300);
        adicionarCliente(clientes, "Juliana", 500);
        // Opção 2: clientes.add(new Cliente("Ana", 2000));

        ordenarPorSaldo(clientes);
        
        exibirClientes(clientes);

    }
}
