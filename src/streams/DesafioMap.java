package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {

    public static void main(String[] args) {
        Consumer<Integer> print = System.out::println;

        List<Integer> numeros =
                Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        Function<Integer, String> convert =
                nume -> nume.toBinaryString(nume);

        UnaryOperator<String> reverter =
                nume -> new StringBuilder(nume).reverse().toString();

        Function<String, Integer> converter =
                nume -> Integer.parseInt(nume, 2);

        numeros.stream()
                .map(convert)
                .map(reverter)
                .map(converter)
                .forEach(print);

// Tem um metodo chamad ,.map(Integer::toBinaryString) sem precusar criar a funcção

    }
}
