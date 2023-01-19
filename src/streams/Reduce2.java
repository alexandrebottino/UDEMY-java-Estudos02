package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce2 {

    public static void main(String[] args) {

        Aluno a1 = new Aluno("Joao", 7.1);
        Aluno a2 = new Aluno("Maria", 6.1);
        Aluno a3 = new Aluno("Pedro", 8.1);
        Aluno a4 = new Aluno("Ana", 10);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

        Predicate<Aluno> aprovadp = aluno -> aluno.nota >= 7;
        Function<Aluno, Double> apenasNota = aluno -> aluno.nota;
        BinaryOperator<Double> somatorio = (nota1, nota2) -> nota1 + nota2;

        alunos.parallelStream()
                .filter(aprovadp)
                .map(apenasNota)
                .reduce(somatorio)
                .ifPresent(System.out::println);


    }

}
