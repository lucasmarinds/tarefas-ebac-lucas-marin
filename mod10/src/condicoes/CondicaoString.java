package condicoes;

import java.util.Scanner;

public class CondicaoString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do animal");
        String tipoAnimal = getAnimal(scanner.next());
        System.out.println(tipoAnimal);
    }

    private static String getAnimal(String animal) {
        if (animal.equalsIgnoreCase("CACHORRO") || animal.equalsIgnoreCase("GATO")) {
            return "Domestico";
        } else if (animal.equalsIgnoreCase("Tigre")) {
            return "Selvagem";
        } else {
            return "Nao e um animal";
        }
    }
}
