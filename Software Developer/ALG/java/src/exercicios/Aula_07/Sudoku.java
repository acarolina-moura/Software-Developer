package exercicios.Aula_07;

import java.util.Scanner;

public class Sudoku {
    public static void main(String[] args) {
        System.out.println("******BEM VINDO AO SUDOKU *******");
        Scanner scanner = new Scanner(System.in);
        int d = 9;
        boolean continuar = true;

        while (continuar) {
            System.out.print("Digite um número com 9 digitos, de 1 a 9: ");
            long num = scanner.nextLong();

            int resultado = 0;

            // 1. num é positivo e tem d dígitos
            if (num <= 0) {
                resultado = 1;
            } else {
                String numStr = String.valueOf(num);
                if (numStr.length() != d) {
                    resultado = 1;
                } else {
                    // 2. o maior dígito é d e o menor é 1
                    int menorDigito = 9;
                    int maiorDigito = 0;
                    int soma = 0;
                    long produto = 1;

                    for (int i = 0; i < d; i++) {
                        int digito = numStr.charAt(i) - '0'; // conversao do char parao valor do numero int da tabela ASCII

                        if (digito < menorDigito) {
                            menorDigito = digito;
                        }
                        if (digito > maiorDigito) {
                            maiorDigito = digito;
                        }

                        soma += digito;
                        produto *= digito;
                    }

                    if (menorDigito != 1 || maiorDigito != d) {
                        resultado = 2;
                    } else {
                        // 3. a soma dos dígitos é 1+2+...+d e o produto é 1x2x...xd
                        int somaEsperada = d * (d + 1) / 2;
                        long produtoEsperado = 1;
                        for (int i = 1; i <= d; i++) {
                            produtoEsperado *= i;
                        }

                        if (soma != somaEsperada || produto != produtoEsperado) {
                            resultado = 3;
                        }
                    }
                }
            }

            // mostrarresultado das verificaçoes conforme descrito na última parte
            if (resultado == 0) {
                System.out.println("O numero " + num + " passou todas as condicoes verificadas.");
            } else if (resultado == 1) {
                System.out.println("O numero " + num + " nao verifica a condicao: positivo e tem " + d + " digitos.");
            } else if (resultado == 2) {
                System.out.println("O numero " + num + " nao verifica a condicao: maior digito " + d + " e menor digito 1.");
            } else if (resultado == 3) {
                int somaEsperada = d * (d + 1) / 2;
                long produtoEsperado = 1;
                for (int i = 1; i <= d; i++) {
                    produtoEsperado *= i;
                }
                System.out.println("O numero " + num + " nao verifica a condicao: a soma dos digitos " + somaEsperada + " e produto digitos " + produtoEsperado);
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





//import java.util.Scanner;
//
//public class Sudoku {
//    public static void main(String[] args) {
//        System.out.println("*************************");
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Digite um numero de 1 a 9 \n");
//        int numJogador = scanner.nextInt();
//
//        //1. num é positivo e tem d dígitos e // 2. O maior dígito de num é d e o menor é 1
//
//        int menorNumero = 1;
//        int maiorNumero = 9;
//
//        int soma = 45;
//        int produto = 362880;
//
//        int guardarJogada = 0;
//
//        int numeroOriginal = numJogador;
//        int qtdDigitos = 0;
//
//        if (numJogador < 1 || numJogador > 9) {
//            System.out.println("Digite um numero válido");
//            return;
//        }
//        if (numJogador < menorNumero || numJogador > maiorNumero){
//            System.out.println("Digite um numero válido");
//        }
//
//        // VERIFICANDO A SOMA
//
//        int guardarSoma = 0;
//        if (numJogador < menorNumero){
//            for (int i = 1; i <= maiorNumero; i++) {
//                guardarSoma += i;
//                if (guardarJogada == soma)
//                    System.out.println("Digite um numero valido");
//            }
//        }
//
//        // VERIFICANDO O PRODUTO
//
//        int guardarProduto = 1;
//
//        for (int i = 1; i <= maiorNumero; i++) {
//            guardarProduto *= i;
//            if (guardarProduto == produto) {
//                System.out.println("O produto está correto " + guardarProduto);
//            } else {
//                System.out.println("Digite um numero válido");
//            }
//        }
//        return ;
//
//
//        int guardarSoma = 0;
//
//        for (int i = 1; i <= maiorNumero; i++) {
//            guardarSoma += i;
//        }
//        System.out.println("a soma é " + guardarSoma);
//
//        if (guardarSoma == soma) {
//            return;
//        }
//        return 3;
//        System.out.println("Digite um numero válido");
//
//
//        // Fatorial ou seja o PRODUTO. O produto é igual a 1x2x...xd
//
//        int guardarProduto = 1;
//
//        for (int i = 1; i <= maiorNumero; i++) {
//            guardarProduto *= i;
//            if (guardarProduto == produto) {
//                return;
//            }
//            return 3;
//            System.out.println("Digite um numero válido");
//        }
//
//    }
//}


//System.out.println("*************************");
//
//Scanner scanner = new Scanner(System.in);
//        System.out.println("Digite um numero de 1 a 9 \n");
//int numJogador = scanner.nextInt();
//
//1. num é positivo e tem d dígitos e // 2. O maior dígito de num é d e o menor é 1
//
//int menorNumero = 1;
//int maiorNumero = 9;
//
//int soma = 45;
//int produto = 362880;
//
//int guardarJogada = 0;
//
//int numeroOriginal = numJogador;
//int qtdDigitos = 0;
//
//        if (numJogador < 1 || numJogador > 9) {
//        System.out.println("Digite um numero válido");
//            return;
//                    }
//                    if (numJogador < menorNumero || numJogador > maiorNumero){
//        System.out.println("Digite um numero válido");
//        }
//
// VERIFICANDO A SOMA
//
//int guardarSoma = 0;
//        if (numJogador < menorNumero){
//        for (int i = 1; i <= maiorNumero; i++) {
//guardarSoma += i;
//                if (guardarJogada == soma)
//        System.out.println("Digite um numero valido");
//            }
//                    }
//
// VERIFICANDO O PRODUTO
//
//int guardarProduto = 1;
//
//        for (int i = 1; i <= maiorNumero; i++) {
//guardarProduto *= i;
//            if (guardarProduto == produto) {
//        System.out.println("O produto está correto " + guardarProduto);
//            } else {
//                    System.out.println("Digite um numero válido");
//            }
//                    }
//                    return ;
//
//
//int guardarSoma = 0;
//
//        for (int i = 1; i <= maiorNumero; i++) {
//guardarSoma += i;
//        }
//                System.out.println("a soma é " + guardarSoma);
//
//        if (guardarSoma == soma) {
//        return;
//        }
//        return 3;
//        System.out.println("Digite um numero válido");
//
//
// Fatorial ou seja o PRODUTO. O produto é igual a 1x2x...xd
//
//int guardarProduto = 1;
//
//        for (int i = 1; i <= maiorNumero; i++) {
//guardarProduto *= i;
//            if (guardarProduto == produto) {
//        return;
//        }
//        return 3;
//        System.out.println("Digite um numero válido");
//        }
//
//                }
//                }


