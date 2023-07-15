package domains;

/**
 * Comparable é uma interface que quando colocada em uma classe
 * essa classe necessita que seja colocado o método de compareTo
 * e nesse método voce coloca a forma de comparação padrão da classe.
 * Agora sempre que houver uma estrutura de Lista que necessite usar
 * o tipo Aluno, automaticamente ele vai fazer a ordenacao pelo que foi
 * colocado no método compareTo que vem da interface comparable.
 * Caso não houvesse essa implementacao teriamos que utilizar
 * do método sort do Collections para ordenar os itens dentro da lista.
 */
public class Aluno implements Comparable<Aluno>{
    private String nome;
    private String curso;
    private double nota;
    private String sala;

    public Aluno() {
    }

    public Aluno(String nome) {
        this.nome = nome;
    }

    public Aluno(String nome, String curso) {
        this.nome = nome;
        this.curso = curso;
    }

    public Aluno(String nome, String curso, double nota) {
        this.nome = nome;
        this.curso = curso;
        this.nota = nota;
    }

    public Aluno(String nome, String curso, double nota, String sala) {
        this.nome = nome;
        this.curso = curso;
        this.nota = nota;
        this.sala = sala;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    @Override
    public String toString() {
        return this.nome;
    }

    @Override
    public int compareTo(Aluno aluno) {
        return this.nome.compareTo(aluno.getNome());
    }
}
