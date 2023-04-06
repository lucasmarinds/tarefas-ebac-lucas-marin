package tarefa_classes;

public class Carro {

    private String modelo;
    private int ano;
    private int valor;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    /**
     * Liga o carro.
     * @return uma String falando que o carro foi ligado.
     */
    public String ligar(){
        this.ligarBateria();
        this.ligarMotor();
        return "Carro Ligado!";
    }

    public void ligarBateria(){
        System.out.println("Bateria Ligada!");
    }

    public void ligarMotor(){
        System.out.println("Motor Ligado!");
    }

    // Desliga o carro.
    public String desligar() {
        this.desligarBateria();
        this.desligarMotor();
        return "Carro Desligado!";
    }

    public void desligarBateria(){
        System.out.println("Bateria Desligada!");
    }

    public void desligarMotor(){
        System.out.println("Motor Desligado!");
    }


}
