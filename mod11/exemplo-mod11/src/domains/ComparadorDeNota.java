package domains;

import java.util.Comparator;

public class ComparadorDeNota implements Comparator<Aluno> {

    /**
     * Caso queira em ordem crescente coloque para o primeiro Aluno ser o o1,
     * no retorno esta como o2 primeiro porque quero decrescente, ou seja
     * da maior nota para a menor.
     * @param o1 the first object to be compared.
     * @param o2 the second object to be compared.
     * @return
     */
    @Override
    public int compare(Aluno o1, Aluno o2) {
        return Double.compare(o2.getNota(), o1.getNota());
    }
}
