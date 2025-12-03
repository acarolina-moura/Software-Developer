package exercicios.Str_Metodos;

import java.util.Scanner;

public class CharAt_01 {
    public static void main(String[] args) {
    // Leia uma palavra e imprima o primeiro e o último caractere.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");

        String palavra = scanner.next();

        for (int i = 0; i < palavra.length(); i++){

            System.out.println(palavra.charAt(i));
            System.out.println("Essa palavra tem " + palavra.length() + " " + "caracteres");

        }

    }
}
