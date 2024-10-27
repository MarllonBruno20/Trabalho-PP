package servicos.tipos;

import carro.TipoCarro;
import servicos.base.DecoratorServico;
import servicos.base.ServicoLavaJato;

public class AplicacaoSelante extends DecoratorServico {

    // Construtor para adicionar sobre outro serviço
    public AplicacaoSelante(ServicoLavaJato servicoLavaJato) {
        super(servicoLavaJato);
    }

    // Construtor para ser o primeiro serviço
    public AplicacaoSelante() {
        super(); // Primeiro serviço, sem base
    }

    @Override
    public String getDescricao() {
        return servicoLavaJato.getDescricao() + ", Aplicação de selante para proteger a pintura por mais tempo.";
    }

    @Override
    public double calcularPreco(TipoCarro tipoCarro) {
        return servicoLavaJato.calcularPreco(tipoCarro) + 40.0;
    }
}
