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
        scanner.close();
        System.out.println("Cliente registrado!");
        System.out.println("Nome: " + c.getNomeTitular());
        System.out.println("Numero Conta: " + c.getNumConta());
    }
}