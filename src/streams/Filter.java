package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
    public static void main(String[] args) {

        Aluno a1 = new Aluno("Ana", 7.8);
        Aluno a2 = new Aluno("Nath", 4.8);
        Aluno a3 = new Aluno("Lourence", 7.3);
        Aluno a4 = new Aluno("Pedro", 5.4);
        Aluno a5 = new Aluno("Gui", 9.2);
        Aluno a6 = new Aluno("Bia", 6.4);


        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);

        Predicate<Aluno> aprovado = a -> a.nota >= 7;
        Function<Aluno, String> saudacacaoArpovado = a -> a.nome + "! Você foi aprovado! ";

        alunos.stream()
                .filter(aprovado)
                .map(saudacacaoArpovado)
                .forEach(System.out::println);
    }
}
