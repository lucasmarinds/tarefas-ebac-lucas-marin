package tarefa_modulo_10;

import java.util.Scanner;

public class ExercicioMod10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite quantidade de notas para media");
        int quantidadeDeNotas = scanner.nextInt();
        double somaNotas = 0;
        for (int i = 1; i <= quantidadeDeNotas; i++){
            System.out.println("Valor da nota " + i);
            somaNotas += scanner.nextInt();
        }
        double media = somaNotas / quantidadeDeNotas;
        if (media >= 7) {
            System.out.println("APROVADO");
        } else if (media >= 5) {
            System.out.println("RECUPERACAO");
        } else {
            System.out.println("REPROVADO");
        }
    }
}
