package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class FilterDesafio {
    public static void main(String[] args) {

        ProdutoDesafio p1 = new ProdutoDesafio("Farinha", 5.88, 235, false);
        ProdutoDesafio p2 = new ProdutoDesafio("Macarrao", 3.45, 85, false);
        ProdutoDesafio p3 = new ProdutoDesafio("Leite", 7.52, 189, false);
        ProdutoDesafio p4 = new ProdutoDesafio("Caderno",4, 68, true);
        ProdutoDesafio p5 = new ProdutoDesafio("Caneta",1.20, 564, true);

        List<ProdutoDesafio> produtos = Arrays.asList(p1, p2, p3, p4, p5);

        Predicate<ProdutoDesafio> materialEscolar = mat -> mat.materialEscolar == true;
        Predicate<ProdutoDesafio> comida = mat -> mat.materialEscolar == false;
        Predicate<ProdutoDesafio> biaxoEstoque = mat -> mat.quantidadeEstoque <= 100;

        Function<ProdutoDesafio, String> saidaEscolar = s -> "O produto " + s.nomeProduto + " é um material escolar";
        Function<ProdutoDesafio, String> saidaComida = s -> "O produto " + s.nomeProduto + " é um alimento";
        Function<ProdutoDesafio, String> saidaBaixoEstoque = s -> "O produto " + s.nomeProduto + " está com um estoque baixo";

        System.out.println("\n MATERIAL ESCOLAR");
        produtos.stream()
                .filter(materialEscolar)
                .map(saidaEscolar)
                .forEach(System.out::println);

        System.out.println("\n ALIMENTOS");
        produtos.stream()
               .filter(comida)
                .map(saidaComida)
                .forEach(System.out::println);

        System.out.println("\n BAIXO ESTOQUE");
        produtos.stream()
              .filter(biaxoEstoque)
                .map(saidaBaixoEstoque)
                .forEach(System.out::println);









    }
}
