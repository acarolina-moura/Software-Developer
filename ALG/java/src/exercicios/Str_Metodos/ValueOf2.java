package exercicios.Str_Metodos;

import java.util.Scanner;

public class ValueOf2 {
    public static void main(String[] args) {

        // Leia um número n e imprima cada dígito em linhas separadas.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num =  scanner.nextInt();

        String numStr = String.valueOf(num);
        for(int i = 0; i < numStr.length(); i++){
            System.out.println(numStr.charAt(i));

        }
    }
}
