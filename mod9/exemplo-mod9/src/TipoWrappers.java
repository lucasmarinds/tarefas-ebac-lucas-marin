public class TipoWrappers {

    private int codigo1;
    private Integer codigo;
    private String nome;
    private Character letra; //seria o "char"
    private Double numeroDecimal;
    private Float numeroDecimal2;
    private Boolean condicionalWrapper;

    /**
     * Diferença entre uma classe wrapper e um tipo primitivo,
     * que o tipo wrapper pode receber null por ser um "objeto"
     * enquanto a classe primitiva não pode receber já que é um tipo primitivo
     * e nao uma classe, tirando que os tipo wrapper tem métodos que podem
     * ajudar igual o Integer que tem um metodo que retorna um double com o
     * metodo doubleValue entre outros.
     */
    public void diferencasEntrePrimitivoWrapper(){
        this.codigo = null;
        this.codigo.doubleValue();
        //this.codigo1 = null;
    }
}
