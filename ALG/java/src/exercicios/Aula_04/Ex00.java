package exercicios.Aula_04;

import java.util.Scanner;

public class Ex00 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero ");
        int numero = scanner.nextInt();
        if (numero < 0) {
            System.out.println("Este numero é negativo");
        } else if (numero > 0) {
            System.out.println("Este numero é positivo");
        } else {
            System.out.println("Este numero é neutro");
        }
    }
}
