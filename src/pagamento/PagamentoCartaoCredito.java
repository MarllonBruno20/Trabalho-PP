package pagamento;

public class PagamentoCartaoCredito implements  Pagamento{
    @Override
    public double processarPagamento(double valor) {
        double valorFinal = valor * 1.05;
        System.out.println("Processando pagamento com Cartão de Crédito. Valor com aumento: R$" + valorFinal);
        return valorFinal;
    }

    public double processarPagamento(double valor, int qtdParcelas) {
        double valorFinal = valor * 1.05;
        double valorParcelado = valorFinal / qtdParcelas;
        System.out.println("Processando pagamento com Cartão de Crédito. Valor parcelado: R$" + valorParcelado);
        return valorParcelado;
    }

    @Override
    public String getDescricaoMetodo() {
        return "Cartão de Crédito";
    }
}
