package lists;

import domains.Aluno;
import domains.ComparadorDeNota;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListAluno {
    public static void main(String[] args) {
        alunosSemOrdenacao();
        alunosComOrdenacao();
        alunosComOrdenacaoPorNota();
    }

    public static void alunosSemOrdenacao(){
        List<Aluno> alunos = new ArrayList<>();
        alunos.add(new Aluno("Josuke Kamado", "Biologia", 4));
        alunos.add(new Aluno("Zica Gripe", "Administração", 10));
        alunos.add(new Aluno("Chico Buarque", "TI", 8.5));
        System.out.println("Sem Ordenacao");
        System.out.println(alunos);
    }

    public static void alunosComOrdenacao(){
        List<Aluno> alunos = new ArrayList<>();
        alunos.add(new Aluno("Josuke Kamado", "Biologia", 4));
        alunos.add(new Aluno("Zica Gripe", "Administração", 10));
        alunos.add(new Aluno("Chico Buarque", "TI", 8.5));
        System.out.println("Apos Ordenacao");
        Collections.sort(alunos);
        System.out.println(alunos);
    }

    public static void alunosComOrdenacaoPorNota(){
        List<Aluno> alunos = new ArrayList<>();
        alunos.add(new Aluno("Josuke Kamado", "Biologia", 4));
        alunos.add(new Aluno("Zica Gripe", "Administração", 10));
        alunos.add(new Aluno("Chico Buarque", "TI", 8.5));
        ComparadorDeNota comparadorDeNota = new ComparadorDeNota();
        Collections.sort(alunos, comparadorDeNota);
        System.out.println("Apos Ordenacao por nota");
        System.out.println(alunos);
    }
}
