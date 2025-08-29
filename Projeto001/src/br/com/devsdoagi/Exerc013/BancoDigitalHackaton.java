package br.com.devsdoagi.Exerc013;

import java.util.*;

public class BancoDigitalHackaton {

    private static void cadastrarCliente(Scanner sc) {
        String cpf;
        String nome;
        System.out.print("Informe o nome: ");
        nome = sc.nextLine();
        System.out.print("Informe o CPF: ");
        cpf = sc.nextLine();
        Cliente c = new Cliente(nome, cpf);
        if(!clientes.add(c)){
            System.out.println("Cliente já existe!");
        }else{
            clientes.add(c);
            System.out.println("Cliente cadastrado!");
        }
        // Dica: pedir nome e CPF, criar objeto Cliente
        // ✅ Adicionar no Set de clientes
        // ✅ Garantir que CPF não esteja duplicado (Set já ajuda nisso)
    }

    private static void cadastrarConta(Scanner sc) {
        // Dica: solicitar CPF do cliente
        // Verificar se cliente existe no Set
        // Criar Conta e adicionar no Map de contas usando numeroConta como chave
    }

    private static void deposito(Scanner sc) {
        // Dica: solicitar número da conta e valor
        // Verificar se conta existe
        // Adicionar valor ao saldo da conta
        // Registrar transação no extrato da conta
    }

    private static void saque(Scanner sc) {
        // Dica: solicitar número da conta e valor
        // Verificar saldo suficiente
        // Subtrair valor do saldo
        // Registrar transação no extrato da conta
    }

    private static void transferencia(Scanner sc) {
        // Dica: solicitar conta origem, conta destino e valor
        // Verificar saldo na conta origem
        // Atualizar saldos de ambas as contas
        // Registrar transação em ambas contas
    }

    private static void consultarSaldo(Scanner sc) {
        // Dica: solicitar número da conta
        // Exibir saldo atual
    }

    private static void extrato(Scanner sc) {
        // Dica: solicitar número da conta
        // Listar todas as transações registradas na conta
    }

    private static void listarClientes() {
        // Dica: percorrer Set de clientes e exibir informações
    }

    private static Set<Cliente> clientes = new HashSet<>();
    private static Map<Integer, Conta> contas = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean rodando = true;

        while (rodando) {
            System.out.println("\n=== MENU BANCO DIGITAL ===");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Cadastrar Conta");
            System.out.println("3 - Depósito");
            System.out.println("4 - Saque");
            System.out.println("5 - Transferência");
            System.out.println("6 - Consultar Saldo");
            System.out.println("7 - Extrato");
            System.out.println("8 - Listar Clientes");
            System.out.println("9 - Sair");
            System.out.print("Escolha: ");

            int opcao = Integer.parseInt(sc.nextLine());

            switch (opcao) {
                case 1:
                    cadastrarCliente(sc);
                    break;
                case 2:
                    cadastrarConta(sc);
                    break;
                case 3:
                    deposito(sc);
                    break;
                case 4:
                    saque(sc);
                    break;
                case 5:
                    transferencia(sc);
                    break;
                case 6:
                    consultarSaldo(sc);
                    break;
                case 7:
                    extrato(sc);
                    break;
                case 8:
                    listarClientes();
                    break;
                case 9:
                    rodando = false;
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
        sc.close();

    }
}
