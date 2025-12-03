package exercicios.Casting;

public class Casting {
    public static void main(String[] args) {

        char c = '5';
        System.out.println(c);
        int n = 5;

        boolean resultado = (c == n);
        System.out.println(resultado);


        // CONVERSAO
        int j = (int) c; // O valor de n será 53 (código ASCII), e não 5!
        System.out.println(c);


        // convertendo str "123" para int 123
        int x = Integer.parseInt("123");
        System.out.println(x);
    }
}
