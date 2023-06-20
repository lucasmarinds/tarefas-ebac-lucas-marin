package lacos;

import java.util.Scanner;

public class ExemploDoWhileEWhile {
    public static void main(String[] args) {
        String resposta;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quer acessar a tabuada ?");
        resposta = scanner.nextLine();
        /**
         * While e um fluxo de repeticao controlado
         * atraves de uma variavel igual exemplo abaixo.
         */
        while(resposta.equalsIgnoreCase("sim")){
            System.out.println("Escolha uma tabuada");
            int tabuada = scanner.nextInt();

            for (int i = 1; i < 11; i++) {
                System.out.println(tabuada + " X " + i + " = " + tabuada*i);
            }
            System.out.println("Quer continuar na tabuada ?");
            resposta = scanner.next();
        }
        System.out.println("Obrigado por utilizar a tabuada");
    }
}
