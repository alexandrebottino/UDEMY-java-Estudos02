package streams;

public class ProdutoDesafio {
    final String nomeProduto;
    final double precoProduto;
    final int quantidadeEstoque;
    final boolean materialEscolar;

    public ProdutoDesafio(String nomeProduto, double precoProduto, int quantidadeEstoque, boolean materialEscolar) {
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
        this.quantidadeEstoque = quantidadeEstoque;
        this.materialEscolar = materialEscolar;
    }
}
