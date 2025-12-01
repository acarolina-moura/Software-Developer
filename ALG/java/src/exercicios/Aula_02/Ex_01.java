package exercicios.Aula_02;

import  java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args){
        // 1.Crie um programa que permita converter um valor em horas para segundos e mostre o valor em segundos.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite as horas");
        double horas = (double) scanner.nextInt();

        double conversao = horas / 120;
        System.out.println("O valor das horas convertidas para segundos sao: " + conversao);
    }
}
