package org.example;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nomeCliente;

        int opcoes = 0;
        double Valordocliente;

        System.out.print("Informe o seu Nome: ");
        nomeCliente = sc.nextLine();

        System.out.print("Informe o valor da conta:");
        Valordocliente = sc.nextDouble();

         while (opcoes == 0) {

            System.out.println("=================================");
            System.out.println("        Caixa eletrônico");
            System.out.println("=================================");
            System.out.print("Bem-vindo " + nomeCliente);
            System.out.println("selecione a opção desejada:");
            System.out.println("1-Saldo");
            System.out.println("2-Depósitos e Saques:");
            System.out.println("3-encerrar sessão");
            opcoes = sc.nextInt();


             while (opcoes == 1) {

                System.out.println("saldo da conta: R$" + Valordocliente);
                System.out.println("0-Voltar");


                opcoes = sc.nextInt();

                if (opcoes != 0) {
                    System.out.println("opção invalida, tente novamente.");
                } else {
                    System.out.println("ENCAMINHANDO...");
                }
            }

            while (opcoes == 2) {

                System.out.println("insira o valor de saque:");
                System.out.println("valor de saque máximo: R$" + Valordocliente);
                double saque = sc.nextDouble();

                if (saque > Valordocliente) {
                    System.out.println("valor inválido, retornando pro começo");
                    opcoes = 0;
                } else {
                    Valordocliente -= saque;
                    System.out.println("saque efetuado com sucesso!");
                    System.out.println("valor atual na conta:" + Valordocliente);
                    System.out.println(" ");
                    System.out.println("0-Voltar");


                    opcoes = sc.nextInt();

                    if (opcoes != 0) {
                        System.out.println("opção invalida, tente novamente.");
                    } else {
                        System.out.println("ENCAMINHANDO...");
                    }
                }
            }

            while (opcoes == 3) {

                System.out.println("insira o valor de deposito:");
                double deposito = sc.nextDouble();

                Valordocliente += deposito;
                System.out.println("deposito efetuado com sucesso!");
                System.out.println("valor atual na conta:" + Valordocliente);
                System.out.println(" ");
                System.out.println("0-Voltar");


                opcoes = sc.nextInt();

                if (opcoes != 0) {
                    System.out.println("opção invalida, tente novamente.");
                } else {
                    System.out.println("ENCAMINHANDO...");
                }
            }

            if (opcoes == 4) {
                System.out.println("Saindo...");
            } else {
                System.out.println(" ");
                opcoes = 0;
            }

        }

    }
}
