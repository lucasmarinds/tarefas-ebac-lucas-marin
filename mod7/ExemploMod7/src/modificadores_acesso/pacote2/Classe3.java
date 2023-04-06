package modificadores_acesso.pacote2;

import modificadores_acesso.pacote1.Classe1;

public class Classe3 extends Classe1{
    public void main(String[] args) {
        Classe1 classe1 = new Classe1();
        /**
         * Veja que diferente da Classe2, está classe só pode acessar o atributo/propriedade da classe que esta
         * como publica e protected, o porque disso e porque a classe1 e a classe2 estão no mesmo pacote logo os modificadores
         * de acesso default e public fornecem a possibilidade de acesso.
         */
        String propriedadePublica = classe1.propriedadePublica;

        /**
         * Enquanto na classe3 so e possivel acessar os atributos public porque e publico e o atributo protected porque
         * essa classe e a classe filha ja que usa a keyword extends para herdar todos atributos e metodos da classe
         * mae.
         */
        String propriedadeProtected1 = this.propriedadeProtected;
    }
}
