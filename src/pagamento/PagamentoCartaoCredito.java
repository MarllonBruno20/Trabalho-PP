package pagamento;

public class PagamentoCartaoCredito implements  Pagamento{
    @Override
    public double processarPagamento(double valor) {
        double valorFinal = valor * 1.05;
        System.out.println("Processando pagamento com Cartão de Crédito. Valor com aumento: R$" + valorFinal);
        return valorFinal;
    }

    public double processarPagamento(double valor, int parcelas) {
        double taxaJuros = 0.02;
        double valorFinal = valor * (1 + (taxaJuros * parcelas));
        return valorFinal;
    }

    @Override
    public String getDescricaoMetodo() {
        return "Cartão de Crédito";
    }
}
