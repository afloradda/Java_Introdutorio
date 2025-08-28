package br.com.devsdoagi.Exerc012.Atvd001;

    /*
    Exercício 1 – List (Clientes em Ordem de Chegada)
        Contexto: Um sistema de cadastro de clientes precisa manter a ordem de chegada para promoções especiais.

        Cada cliente possui: id, nome, cpf.

        Desafio:
        - Crie a classe Cliente.
        - Use List<Cliente> para armazenar os clientes.
        - Cadastre pelo menos 5 clientes.
        - Exiba todos os clientes na ordem de cadastro.
        - Implemente busca de cliente por CPF.

        Objetivo: trabalhar com List, ordem de inserção e busca linear.
     */

import java.util.List;

public class Main {
    public static void adicionarCliente(List<Cliente> clientes, int id, String nome, String cpf) {
        clientes.add(new Cliente(id, nome, cpf));
    }

    public static void buscaPorCPF(List<Cliente> clientes) {

    }

    public static void main(String[] args) {

    }
}
