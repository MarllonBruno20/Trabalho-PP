package servicos.tipos;

import carro.TipoCarro;
import servicos.base.DecoratorServico;
import servicos.base.ServicoLavaJato;

public class LimpezaInternaPremium extends DecoratorServico {

    // Construtor para adicionar sobre outro serviço
    public LimpezaInternaPremium(ServicoLavaJato servicoLavaJato) {
        super(servicoLavaJato);
    }

    // Construtor para ser o primeiro serviço
    public LimpezaInternaPremium() {
        super(); // Primeiro serviço, sem base
    }

    @Override
    public String getDescricao() {
        return servicoLavaJato.getDescricao() + ", Limpeza interna premium, incluindo bancos, tapetes e painel.";
    }

    @Override
    public double calcularPreco(TipoCarro tipoCarro) {
        return servicoLavaJato.calcularPreco(tipoCarro) + 30.0; // Custo extra pela limpeza interna
    }
}
