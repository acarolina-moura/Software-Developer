package exercicios.Aula_07;

import java.util.Scanner;

public class ArraySolucao {

        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);

            System.out.println("Qunatos elementos quere meter");
            int elementos=scanner.nextInt();

            int [] array=new int[elementos];

            int contador=0;

            for (int i = 0; i < array.length; i++) {

                System.out.println("Qual o "+ (i+1)  + " elemento");
                array[i]= scanner.nextInt();

                if(array[i] >50){
                    contador++;
                }
            }

            System.out.println("Existem " + contador+ " numeros acima de 50");

        }
}
