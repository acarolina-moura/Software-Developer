package exercicios.Str_Metodos;

import java.util.Scanner;

public class ValueOf1 {
    public static void main(String[] args) {
        // Métodos de String em JAVA

//        Exercícios para manipulação de strings:
//        Converta um número inteiro digitado pelo usuário em String e imprima quantos caracteres ele tem

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero");
        int num = scanner.nextInt();

        String numStr = String.valueOf(num); // Primeiro converte usando valueOf()

        // Depois imprime mostrando a quantidade de caracteres
        System.out.println("O número digitado tem " + numStr.length() + " caracteres");



        // Segundo
        long num2 = 505050;
        String num2Str = String.valueOf(num2);
        System.out.println("O número digitado tem " + num2Str.length() + " caracteres");


        // Terceiro

        // Só mostrando a quantidade de CARACTERES
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println(txt.length());
    }
}
