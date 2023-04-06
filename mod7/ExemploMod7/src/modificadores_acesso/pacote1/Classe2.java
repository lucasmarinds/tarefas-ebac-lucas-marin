package modificadores_acesso.pacote1;

public class Classe2 extends Classe1{
    public static void main(String[] args) {
        Classe1 classe1 = new Classe1();
        /**
         * Quando tenta ver os atributos e/ou métodos veja que vai aparecer todos menos os privados
         * que são de exclusividade apenas para a mesma classe.
         */
        String propriedadeDefault = classe1.propriedadeDefault;
        String propriedadeProtected = classe1.propriedadeProtected;
        String propriedadePublica = classe1.propriedadePublica;
    }
}
