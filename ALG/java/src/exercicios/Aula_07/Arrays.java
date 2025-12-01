package exercicios.Aula_07;

public class Arrays {
    public static void main(String[] args) {
        int[] array1 = {5, 10, 15, 30};
        int soma = 0;

        for (int i = 0; i < array1.length; i++) {
            soma = soma + array1[i];
        }
        System.out.println("A soma é: " + soma);
    }
}