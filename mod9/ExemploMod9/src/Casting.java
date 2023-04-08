public class Casting {
    public static void main(String[] args) {
        int numero32Bits = 30;
        byte numero8bits = 8;
        short numero16bits = 16;
        long numero64bits = 64;

        /**
         * Casting é quando fazemos conversao de um tipo para outro igual os de baixo.
         */
        //A linha abaixo nao executa pq um variavel de 8 bits nao consegue aceitar um tipo que tenh mais bits que ele.
        // numero8bits = numero16bits;

        //Aqui o casting é feito tranquilamente porque o numero de bits é bem maior igual ao Long que aceita esse que é 32
        numero32Bits = numero8bits;

        //Essa linha de baixo se aplica ao mesmo caso do 8 bits que nao aceita 16, igual esse que e 16 e nao aceita um 32
        // numero16bits = numero32Bits;

        //Pelo tipo ser long e long ser 64 ele consegue aceitar qualquer outro tipo abaixo dele que seja numerico.
        numero64bits = numero32Bits;

        /**
         * Temos também como fazer casts de tipos diferentes como por exemplo String para Integer.
         */
        String numeroString = "1200";
        int castStringNumero = Integer.getInteger(numeroString);
        System.out.println(castStringNumero);
    }
}
