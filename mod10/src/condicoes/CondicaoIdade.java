package condicoes;

import java.util.Scanner;

public class CondicaoIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua idade");
        getIdade(scanner.nextInt());
    }

    public static void getIdade(int idade){
        if (idade >= 0 && idade <= 5){
            System.out.println("Você é um bebe");
        } else if (idade >= 6 && idade <= 10) {
            System.out.println("Você é uma criança");
        } else if (idade >= 11 && idade <= 18) {
            System.out.println("Você é um Adolescente");
        } else {
            System.out.println("Você já é adulto");
        }
    }
}
