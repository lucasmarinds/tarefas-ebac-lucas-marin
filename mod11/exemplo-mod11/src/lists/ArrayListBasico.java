package lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListBasico {
    public static void main(String[] args) {
        listaOrdenada();
        listaNumeros();
    }

    public static void listaOrdenada(){
        List<String> listaNomes = new ArrayList<>();
        listaNomes.add("Lucas Martins Marin");
        listaNomes.add("Joaquin Phoenix Barbosa");
        listaNomes.add("Aldaberto Ximpas Leleto");
        Collections.sort(listaNomes);
        System.out.println("-------------------------");
        System.out.println("Lista Ordenada por Nomes");
        System.out.println(listaNomes);
    }

    public static void listaNumeros() {
        System.out.println("-------------------------");
        System.out.println("Lista de Numeros");
        List<Integer> numeros = new ArrayList<>();
        numeros.add(3);
        numeros.add(10);
        numeros.add(505);
        System.out.println(numeros);
    }
}
