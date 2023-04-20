public class Casting {
    public static void main(String[] args) {
        int numero32Bits = 30;
        byte numero8bits = 8;
        short numero16bits = 16;
        long numero64bits = 64;

        /**
         * Outra maneira de casting é o explicito que é igual o exemplo abaixo
         */
        int num1 = 10;
        short num2 = (short) num1; // explicito

        /**
         * Ele é explicito porque colocamos o (short) antes do valor que a variavel vai receber
         * e podemos fazer casting de tipo diferentes igual o de cima mas temos um problema
         * quando o valor é muito acima do esperado como o exemplo abaixo que preciso de um valor
         * grande mas resolvi fazer um casting para um tipo menor, e acabo perdendo o valor.
         */
        long numeroLong = 1111111111111111111l;
        int numeroInteger = (int) numeroLong; // explicito
        System.out.println(numeroInteger); //  734294471

        /**
         * Casting implicito é quando nao precisamos colocar (tipo) igual exemplo abaixo
         */

        long numeroLong2;
        int numeroInt = 200;
        numeroLong2 = numeroInt; //implicito
    }
}
