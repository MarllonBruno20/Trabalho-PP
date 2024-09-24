package produto;

public class ProdutoLimpeza extends Produto{
    public ProdutoLimpeza(String nome, double preco, int quantidade) {
        super(nome, preco, quantidade);
    }

    @Override
    public void ajustarEstoque(int quantidadeVendida) {
        if(getQuantidade() >= quantidadeVendida){
            adicionarQuantidade(-quantidadeVendida);
        }
        else{
            System.out.println("Estoque insuficiente para " + getNome() + ".");
        }
    }
}
