public class Operadores {
    public static void main(String[] args) {
        operacoesAtribuicao();
        operacoesAritmeticas();
        operacoesDeIncrementacaoDecrementacao();
        operacoesRelacionais();
    }

    public static void operacoesAritmeticas(){
        System.out.println("------- Operacoes Aritmeticas -------");
        int num1 = 10;
        int num2 = 20;

        int num3 = num1 + num2;
        System.out.println(num3);
        int num4 = num1 - num2;
        System.out.println(num4);
        int num5 = num1 * num2;
        System.out.println(num5);
        int num6 = num1 / num2;
        System.out.println(num6);
        int num7 = (num1 * num2) / 2;
        System.out.println(num7);
    }

    public static void operacoesDeIncrementacaoDecrementacao(){
        System.out.println("--------- OPERACOES DE INCREMENTACAO E DECREMENTACAO ------------");
        int num1 = 10;

        num1++;
        System.out.println(num1);

        ++num1;
        System.out.println(num1);

        num1--;
        System.out.println(num1);

        --num1;
        System.out.println(num1);
    }

    public static void operacoesAtribuicao(){
        System.out.println("---- OPERACOES DE ATRIBUICAO ------");
        int num1 = 10;

        num1 += 10;
        System.out.println(num1);
        num1 -= 15;
        System.out.println(num1);
        num1 *= 4;
        System.out.println(num1);
        num1 /= 2;
        System.out.println(num1);
    }

    public static void operacoesRelacionais(){
        System.out.println("---------- OPERACOES RELACIONAIS ----------");
        int num1 = 10;
        int num2 = 5;

        boolean isBigger = num1 > num2;
        System.out.println(isBigger);

        boolean isDifferent = num1 != num2;
        System.out.println(isDifferent);

        boolean isBiggerOrSame = num1 >= num2;
        System.out.println(isBiggerOrSame);

        boolean isSmallOrSame = num2 <= num1;
        System.out.println(isSmallOrSame);

        boolean isSmall = num2 < num1;
        System.out.println(isSmall);

        boolean isSame = num1 == num2;
        System.out.println(isSame);

        System.out.println("---------- OPEDAORES RELACIONAIS COM PORTAS LOGICAS ----------");

        /**
         * Porta logica AND(&&) significa E em portugues ficando
         * numero1 tem que ser MAIOR ou IGUAL a 5 - primeira condicao
         * E
         * numero1 tem que ser MENOR ou IGUAL a 10 - segunda condicao
         * Se o numero1 for menor que 5 ou maior que 10, ele vai quebrar uma das condicoes
         * e se uma condicao quebrar, ele deve retornar falso
         * pq a porta AND so retorna verdadeiro caso ambos seja verdadeiros.
         */
        boolean betweenFiveAndTen = num1 >= 5 && num1 <=10;
        System.out.println(betweenFiveAndTen);

        /**
         * Porta Logica OR(||) significa OU em portugues ficando
         * numero2 tem que ser menor ou igual a 5
         * OU
         * numero2 tem que ser maior que 10
         * Diferente do AND, essa porta se uma das condicoes for verdadeiro ja e o suficiente
         * para poder retornar true, diferente do AND que AMBAS tem que ser verdadeiras para ele receber true.
         */
        boolean isSmallOrBigger = num2 <= 5 || num2 > 10;
        System.out.println(isSmallOrBigger);

        /**
         * Porta Logica NOT(!) significa NAO em portugues ficando
         * numero 1 e 2 forem maior que 0 entao retorne verdadeiro
         * porem a porta logica NOT entra ai, porque quando utilizo
         * do "!" antes do das condicoes dentro dos parenteses
         * eu quero que ele receba o valor contrario do que era para ser
         * ou SEJA, se numero 1 e 2 sao maior que zero e vao retornar true
         * a partir do momento que uso o not ele reverte o true para false.
         */
        boolean isFalse = !(num1 > 0 && num2 > 0);
        System.out.println(isFalse);
    }
}
