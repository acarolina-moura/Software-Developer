package Sudoku1.java;

import java.util.Scanner;

public class Sudoku {
    public static void main(String[] args) {
        System.out.println("******BEM VINDO AO SUDOKU *******");
        Scanner scanner = new Scanner(System.in);

        int d = 9; // PORQUE O É O MAIOR NUMERO e JÁ ESTÁ IMPLÍCITO NO EXEC
        boolean continuar = true; // PRECISO QUE O CÓDIGO CONTINUE ATÉ TODAS AS CONDIÇÕES SEREM VERDADES

        while (continuar) {
            System.out.print("Digite um número inteiro com 9 digitos, de 1 a 9: ");
            long num = scanner.nextLong(); // SCANNER DO NUMERO INTEIRO LONG DIGITADO PELO USUÁRIO

            int resultado = 0; // RESULTADO TEM QUE COMEÇAR NA POSIÇÃO 0

            // 1. num é positivo e tem 9 dígitos
            String numStr = String.valueOf(num); // Converte qualquer valor (int, long, float, objeto) em String // CONVERTI PARA STRING PARA ANALISAR OS dígitos como caracteres
            System.out.println(numStr.length());  // quantos caracteres existem dentro da String
            // Length() retorna a quantidade de caracteres de uma string
            // USEI METODO DE STRING lenght() para contar os caracteres da String


            int quantidadeDigitos = numStr.length(); // quantos caracteres foram digitados

            // 1. num é positivo e tem 9 dígitos
            if (num <= 0 || quantidadeDigitos != d) {
                resultado = 1; // guardar cada resultado em variáveis "resultados" para depois mostrar igual o ex pede a exibiçao dos resultados
            } else {
                // Guardar cada dígito num array
                int[] digitos = new int[d]; // Cria array igual a d(9) de modo que nunca ultrapasse as 9 posiçoes

                for (int i = 0; i < d; i++) {
                    digitos[i] = numStr.charAt(i) - '0'; // acessar o indice com charAt(i) // acessar cada dígito individual
                    // conversao do char para o valor de int, tabela ASCII
                }

                // 2. maior dígito é 9 e menor é 1

                // digitos[i] Acesso a array //Lê cada dígito do número
                int menorDigito = digitos[0];
                int maiorDigito = digitos[0];

                for (int i = 0; i < d; i++) {
                    if (digitos[i] < menorDigito) {
                        menorDigito = digitos[i];
                    }
                    if (digitos[i] > maiorDigito) {
                        maiorDigito = digitos[i];
                    }
                }

                if (menorDigito != 1 || maiorDigito != d) {
                    resultado = 2;
                } else {

                    // 3. a soma dos dígitos de num é igual a 1+2+...+d e o seu o produto é igual a 1x2x...xd
                    int soma = 0;
                    long produto = 1; // produto como long para não ultrapassar limite de int e SE TIVER 10 DIGITOS VAI QUEBRAR O

                    for (int i = 0; i < d; i++) {
                        soma = soma + digitos[i];
                        produto = produto * digitos[i];
                    }

                    int somaEsperada = 45;
                    long produtoEsperado = 362880;  // 1x2x3x4x5x6x7x8x9 (fatorial!!)

                    if (soma != somaEsperada || produto != produtoEsperado) {
                        resultado = 3;
                    }
                }
            }

            // Resultados igual o exercicio pediu
            if (resultado == 0) {
                System.out.println("O numero " + num + " passou todas as condicoes verificadas");
            } else if (resultado == 1) {
                System.out.println("O numero " + num + " nao verifica a condicao positivo e tem 9 digitos");
            } else if (resultado == 2) {
                System.out.println("O numero " + num + " nao verifica a condicao maior digito 9 e menor digito 1 ");
            } else if (resultado == 3) {
                System.out.println("O numero " + num + " nao verifica a condicao soma digitos 45 e produto digitos 362880");
            }

            // Perguntar se quer continuar
            System.out.print("Quer jogar novamente? (1 - Sim / 2 - Nao): ");
            int opcao = scanner.nextInt();

            if (opcao != 1) {
                continuar = false;
            }
            System.out.println();
        }
        System.out.println("*** Fim de Jogo***");
    }
}

