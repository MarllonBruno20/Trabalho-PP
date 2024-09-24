package estoque;

import produto.Produto;

import java.util.ArrayList;
import java.util.List;

public class ControleEstoqueImpl implements ControleEstoque {

    private List<Produto> produtos = new ArrayList<>();

    @Override
    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    @Override
    public void removerProduto(Produto produto) {
        produtos.remove(produto);
    }

    @Override
    public Produto buscarProduto(String nome) {
        for (Produto produto : produtos) {
            if (produto.getNome().equals(nome)) {
                return produto;
            }
        }
        return null;
    }

    @Override
    public void ajustarEstoque(String nomeProduto, int quantidadeVendida) {
        Produto produto = buscarProduto(nomeProduto);
        if (produto != null) {
            produto.ajustarEstoque(quantidadeVendida);
        }
    }

    @Override
    public void listarProdutosEmEstoque() {
        System.out.println("Produtos em estoque:");
        for (Produto produto : produtos) {
            System.out.println("Produto: " + produto.getNome() +
                    " | Quantidade: " + produto.getQuantidade() +
                    " | Preço: R$ " + produto.getPreco());
        }
    }
}
