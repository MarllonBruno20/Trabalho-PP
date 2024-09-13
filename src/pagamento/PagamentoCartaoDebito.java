package pagamento;

public class PagamentoCartaoDebito implements Pagamento{
    @Override
    public double processarPagamento(double valor) {
        System.out.println("Processando pagamento com Cartão de Débito. Valor: R$" + valor);
        return valor;
    }

    @Override
    public double processarPagamento(double valor, int qtdParcelas) {
        return 0;
    }

    @Override
    public String getDescricaoMetodo() {
        return "Cartão de Débito";
    }
}
