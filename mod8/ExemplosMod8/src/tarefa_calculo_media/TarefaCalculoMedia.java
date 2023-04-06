package tarefa_calculo_media;

public class TarefaCalculoMedia {
    public static void main(String[] args) {
        calculaMedia(5,4,6,6.5);
    }

    public static void calculaMedia(double nota1, double nota2, double nota3, double nota4){
        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("Media do aluno e " + String.format("%.1f",media));
    }
}
