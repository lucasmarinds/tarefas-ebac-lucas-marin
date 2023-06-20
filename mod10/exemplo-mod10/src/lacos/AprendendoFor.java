package lacos;

import java.util.ArrayList;
import java.util.List;

public class AprendendoFor {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();

        // For(para) com contador, determino ate quantas vezes ele deve rodar.
        for(int i = 0; i < 11; i++){
            System.out.println(i);
            numeros.add(i);
        }

        // ForEach(para cada) por Collection, so rodo um for em cima de listas.
        for(Integer numero : numeros){
            System.out.println("Esse e o numero " + numero);
        }

        // O mesmo que o de cima.
        numeros.forEach(numero -> System.out.println("Esse e o numero " + numero));
    }
}
