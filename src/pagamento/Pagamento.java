package pagamento;

public interface Pagamento {
    double processarPagamento(double valor);

    double processarPagamento(double valor, int qtdParcelas);

    String getDescricaoMetodo();
}
