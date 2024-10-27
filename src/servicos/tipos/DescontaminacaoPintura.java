package servicos.tipos;

import carro.TipoCarro;
import servicos.base.DecoratorServico;
import servicos.base.ServicoLavaJato;

public class DescontaminacaoPintura extends DecoratorServico {

    // Construtor para adicionar sobre outro serviço
    public DescontaminacaoPintura(ServicoLavaJato servicoLavaJato) {
        super(servicoLavaJato);
    }

    // Construtor para ser o primeiro serviço
    public DescontaminacaoPintura() {
        super(); // Primeiro serviço, sem base
    }

    @Override
    public String getDescricao() {
        return servicoLavaJato.getDescricao() + ", Serviço de descontaminação da pintura (para remoção de manchas e resíduos).";
    }

    @Override
    public double calcularPreco(TipoCarro tipoCarro) {
        return servicoLavaJato.calcularPreco(tipoCarro) + 70.0;
    }
}
