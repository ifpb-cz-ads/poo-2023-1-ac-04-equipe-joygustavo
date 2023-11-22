package tests;

import models.Conta;

import java.util.Scanner;

public class ContaTest{
    public static void main(String[] args) {
        Conta c = new Conta();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do titular da conta: ");
        c.setNomeTitular(scanner.nextLine());
        System.out.print("Digite o numero da conta: ");
        c.setNumConta(scanner.nextLine());
        System.out.println("Cliente registrado!");
        System.out.println("Nome: " + c.getNomeTitular());
        System.out.println("Numero Conta: " + c.getNumConta());
        int opcao;
        do {
            System.out.println("1- Depositar 100\n" +
                    "2- Sacar 100\n" +
                    "0- Sair");
            opcao = Integer.parseInt(scanner.nextLine());
            switch (opcao) {
                case 1:
                    c.depositar(100);
                    System.out.println(c.getSaldo());
                    break;
                case 2:
                    c.sacar(100);
                    System.out.println(c.getSaldo());
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    break;
            }

        } while(opcao != 0);
    }
}