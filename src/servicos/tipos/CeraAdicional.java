package servicos.tipos;

import carro.TipoCarro;
import servicos.base.DecoratorServico;
import servicos.base.ServicoLavaJato;

public class CeraAdicional extends DecoratorServico {

    // Construtor para adicionar sobre outro serviço
    public CeraAdicional(ServicoLavaJato servicoLavaJato) {
        super(servicoLavaJato);
    }

    // Construtor para ser o primeiro serviço
    public CeraAdicional() {
        super(); // Primeiro serviço, sem base
    }

    @Override
    public String getDescricao() {
        return servicoLavaJato.getDescricao() + ", Aplica cera no carro.";
    }

    @Override
    public double calcularPreco(TipoCarro tipoCarro) {
        return servicoLavaJato.calcularPreco(tipoCarro) + 20.0; // Custo extra pela cera
    }
}
