/**
 * Classe Criada para mostrar tipos primitivos usados e seus nomes são os tipos de dados que eles recebem.
 */
public class VariaveisPrimitivas {

    private int numerosInteiros32Bits;

    private long numerosInteiros64Bits;

    private float numeroPontoFlutuante;

    private double numeroPontoFlutuanteComMaiorPrecisao;

    private String caracteresEmGeral;

    private byte numerosInteiros8Bits;

    private short numerosInteiros16bits;

    private boolean verdadeiroOuFalso;

    /**
     * Quando criamos um construtor igual o de baixo que recebe um parametro do tipo int
     * passamos a perder o construtor default, que nao solicita nenhum parametro para sua
     * inicializacao, e quando perdemos ele e necessário criar outro igual esse abaixo.
     */
    public VariaveisPrimitivas(){}

    public VariaveisPrimitivas(int valor){
        this.numerosInteiros32Bits = valor;
    }

}