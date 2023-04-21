package lacos;

public class ContinueFor {
    public static void main(String[] args) {

        /**
         * Continue serve para o laco continuar seguindo
         * quando chega nele, por exemplo se caso tem um continue
         * e abaixo tem um print no console, ele vai ignorar tudo que
         * vem deposi dele e comeca no proximo indice do laco.
         */
        for(int i = 0; i < 10; i++) {
            if (i % 5 == 0) { //Se resto de divisao de I por 5 for 0, entra no if.
                continue;
            }
            System.out.println(i);
        } // 1,2,3,4,6,7,8,9

        System.out.println("PAR");
        for(int i = 0; i < 10; i++) {
            if (i % 2 == 0){
                System.out.println(i);
            }
        }

        for(int i = 0; i < 10; i++) {
            if (i % 2 != 0){
                break;
            }
            System.out.println(i);
        }
    }
}
