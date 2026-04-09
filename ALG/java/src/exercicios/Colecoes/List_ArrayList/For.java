package exercicios.Colecoes.ArrayList;

import java.util.ArrayList;

public class For {
    public static void main(String[] args) {
        ArrayList<String> paises = new ArrayList<String>();
       paises.add("Portugal");
       paises.add("Brasil");
       paises.add("Canadá");
       paises.add("Chile");
        for (int i = 0; i < paises.size() ; i++) {
            System.out.println(paises.get(i));

        }
    }
}
