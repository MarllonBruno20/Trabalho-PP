package pagamento;

public class PagamentoDinheiro implements Pagamento {
    @Override
    public double processarPagamento(double valor) {
        double valorFinal = valor * 0.95;
        return valorFinal;
    }

    @Override
    public double processarPagamento(double valor, int qtdParcelas) {
        return 0;
    }

    @Override
    public String getDescricaoMetodo() {
        return "Dinheiro";
    }
}
