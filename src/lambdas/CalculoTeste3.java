package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
    public static void main(String[] args) {

        BinaryOperator<Double> soma = (x, y) -> { return x + y; };
        System.out.println(soma.apply (2.0,3.0));

        BinaryOperator <Double> multiplicacao = (x, y) -> x * y;
        System.out.println (multiplicacao.apply(2.0,3.0));
    }
}
