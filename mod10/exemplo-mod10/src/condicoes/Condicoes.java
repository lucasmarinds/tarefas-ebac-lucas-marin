package condicoes;

import java.util.Scanner;

public class Condicoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor");
        int valor = scanner.nextInt();

        if(valor < 5 && valor > 0){
            System.out.println("Valor está entre 1 e 5");
        } else if (valor > 5 && valor < 10) {
            System.out.println("Valor está entre 5 e 10");
        } else {
            System.out.println("Valor ta pitchulinha");
        }
    }
}
