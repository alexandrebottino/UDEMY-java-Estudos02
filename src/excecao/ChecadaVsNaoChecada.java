package excecao;

public class ChecadaVsNaoChecada {

    public static void main(String[] args) {

        geraErro1();

        try {
            geraErro2();
        } catch (Throwable e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Fim");
    }

    //Não checada ounão verificada
    static void geraErro1() {
        throw new RuntimeException("Ocorreu um erro bem legal %01");
    }

    //Exceção checada ou verificada
    static void geraErro2() throws Exception {
        new Exception("Ocorreu um erro bem legal %02");

    }
}
