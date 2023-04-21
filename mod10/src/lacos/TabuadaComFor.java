package lacos;

import java.util.Scanner;

public class TabuadaComFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha uma tabuada");
        int tabuada = scanner.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.println(tabuada + " X " + i + " = " + tabuada*i);
        }
    }
}
