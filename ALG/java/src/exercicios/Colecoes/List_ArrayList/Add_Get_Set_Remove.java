package exercicios.Colecoes.ArrayList;

public class Add_Get_Set_Remove {
    public static void main(String[] args) {
        // Coleçoes em Java são Bibliotecas  de classes que oferece estruturas de dados poderosas e eficientes
        // Classes que permitem armazenar e manipular grupos de objetos

            //        Tipo de coleções:
            //        a.List;
            //        b.Set;
            //        c.Maps;
            //        d.Queue

//        A. List: Representa uma coleção ordenada, onde os elementos são acessados por um índice.
//        As listas permitem elementos duplicados e implementações populares são o ArrayList e o LinkedList.

//        Tipo de Listas:

//        * ArrayList - Oferece acesso rápido por índice, mas inserção e remoção de elementos no meio da lista podem ser lentas;
//        * LinkedList - inserção e remoção de elementos rápido, mas o acesso por índice é mais lento

        // Declarando ArrayList:

        java.util.ArrayList<String> cars = new java.util.ArrayList<String>();

        // to add elements in car Array List:

        // ADD:
        cars.add("Volvo");
        cars.add("Lamborghni");
        cars.add("Fiat");
        cars.add("Toyota");

        System.out.println(cars);
        System.out.println(cars.size());

        cars.add(0, "Fusca");
        System.out.println(cars);
        System.out.println(cars.size());

        // GET:
        // Buscando elemento na posiçao 0
        System.out.println(cars.get(0));

        // SET:
        cars.set(0, "Opel");
        System.out.println(cars.get(0));
        System.out.println(cars);
        System.out.println(cars.size());


        // REMOVE:

        cars.remove(1);
        cars.remove(2);
        System.out.println(cars);
        System.out.println(cars.size());

//        List Methods:
//        add()	Adds an element to the end of the list
//        get()	Returns the element at the specified position
//        set()	Replaces the element at the specified position
//        remove() Removes the element at the specified position
//        size() Returns the number of elements in the list

        /***************************************************************/
//        B. Set: Representa uma coleção que não permite elementos duplicados.
//        Implementações comuns incluem o HashSet e o TreeSet.

        /***************************************************************/

//        C. Map: Representa uma estrutura de chave-valor, onde cada elemento é armazenado como uma combinação de uma chave única e um valor associado a essa chave.
//        O HashMap e o TreeMap são exemplos comuns de implementações de Map.

        /***************************************************************/
//        D.Queue:




        }
    }

