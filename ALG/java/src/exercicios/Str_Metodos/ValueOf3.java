package exercicios.Str_Metodos;

import java.util.Scanner;

public class ValueOf3 {
    public static void main(String[] args) {

// Leia um número inteiro e verifique se ele tem exatamente 5 dígitos; se não, informe ao usuário.

        System.out.println("Digite um numero inteiro: ");
        Scanner scanner = new Scanner(System.in);

        int num =  scanner.nextInt();

        String numStr = String.valueOf(num);

        int result = 0;

        for(int i = 0; i < numStr.length(); i++ ){
            System.out.println(numStr.charAt(i));
        }



        //System.out.print("Digite um número inteiro com 9 digitos, de 1 a 9: ");

        //long teste = scanner.nextLong();

//        long teste = 123456789;
//        System.out.println(teste);
//
//        String testeStr = String.valueOf(teste);
//
//        System.out.println(testeStr.length());



    }
}
