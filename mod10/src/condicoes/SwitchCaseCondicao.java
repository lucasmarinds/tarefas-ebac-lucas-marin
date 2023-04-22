package condicoes;

import java.util.Scanner;

public class SwitchCaseCondicao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um valor");
        Integer idade = scanner.nextInt();
        String result = null;
        switch (idade) {
            case 1:
                result = "valor 1";
                break;
            case 2:
                result = "Valor 2";
                break;
            case 3:
                result = "valor 3";
                break;
            default:
                result = "valor default";
                break;
        }
        System.out.println(result);
    }
}
