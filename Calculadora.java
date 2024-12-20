package Projeto;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Exibir as opções para o usuário e pedir para ele escolher uma
        int opcao;

        do {

            System.out.println("Escolha uma opção:");
            System.out.println("1 - Para adição!");
            System.out.println("2 - Para subtração!");
            System.out.println("3 - Para multiplicação!");
            System.out.println("4 - Para divisão!");
            System.out.println("0 - Para sair!");

            opcao = sc.nextInt();

            if (opcao >= 1 && opcao <= 4) {
                // Resgatar os números do usuário
                System.out.println("Digte o primeiro número: ");
                double numero_01 = sc.nextDouble();

                System.out.println("Digite o segundo número: ");
                double numero_02 = sc.nextDouble();

                double resultado = 0;

                boolean operacaoValida = true;

                System.out.println(numero_01 + " " + numero_02);

                // Encontrar o resultado da operação escolhida
                switch (opcao) {
                    case 1:
                        resultado = somar(numero_01, numero_02);
                        break;
                    case 2:
                        resultado = subtrair(numero_01, numero_02);
                        break;
                    case 3:
                        resultado = multiplicar(numero_01, numero_02);
                        break;
                    case 4:
                        if (numero_02 != 0) {
                            resultado = dividir(numero_01, numero_02);
                        } else {
                            System.out.println("Não é possível dividir por zero!");
                            operacaoValida = false;
                        }
                        break;
                    default:
                        operacaoValida = false;
                        break;
                }

                // Mostrar o resultado para o usuário
                if (operacaoValida) {
                    System.out.println(
                            "O resultado da operação entre " + numero_01 + " e " + numero_02 + " é: " + resultado);
                }

            } else if (opcao != 0) {
                System.out.println("OPÇÂO INVÁLIDA, SELECIONE AS OPÇÕES DE 1 A 4!!!");
            }

        } while (opcao != 0);

        // Liberar recursos de memória
        System.out.println("Calculadora encerrada!");
        sc.close();
    }

    // Funções(métodos) para realizar as operações matemáticas
    public static double somar(double a, double b) {
        return a + b;
    }

    public static double subtrair(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        return a / b;
    }
}
