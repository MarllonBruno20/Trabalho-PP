package estoque;

import produto.Produto;

public interface ControleEstoque {
    void adicionarProduto(Produto produto);
    void removerProduto(Produto produto);
    Produto buscarProduto(String nome);
    void ajustarEstoque(String nomeProduto, int quantidadeVendida);
    void listarProdutosEmEstoque();
}
