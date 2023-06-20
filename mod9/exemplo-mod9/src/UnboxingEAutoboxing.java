public class UnboxingEAutoboxing {
    public static void main(String[] args) {
        Boolean status = true; // aqui é utilizado autoboxing, pq ele pega um valor primitivo e aplica para um tipo wrapper
        boolean statusPrimitivo = status;
        Boolean valorWrapper = Boolean.TRUE; // valor wrapper, não é utilizado autoboxing
        System.out.println(statusPrimitivo);

        //Autoboxing, falo primitivo para wrapper
        Character character = 'A';
        //Sem Autoboxing, mas normalmente utilizamos no dia a dia da maneira do autoboxing.
        Character character1 = new Character('B');
        //Outra maneira de passar um valor sem precisar do autobixing que é o padrão
        Character character2 = Character.valueOf('C');
        problemaAutoboxing(valorWrapper);

        /**
         * Fazendo o unboxing agora,
         * o Unboxing é quando passamos um wrapper para um tipo primitivo igual os
         * exemplos abaixo.
         */
        char letra = Character.valueOf('L');
        int numero = Integer.valueOf(1000);
        //Lembrando que utilizar que instanciar um wrapper usando new, hoje é má pratica, por isso usamos valueOf.
        long numeroLong = new Long(100);
    }

    public static Boolean problemaAutoboxing(boolean aBoolean){
        return aBoolean;
    }
}
