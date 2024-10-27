package servicos.tipos;

import carro.TipoCarro;
import servicos.base.DecoratorServico;
import servicos.base.ServicoLavaJato;

public class DesodorizacaoInterior extends DecoratorServico {

    // Construtor para adicionar sobre outro serviço
    public DesodorizacaoInterior(ServicoLavaJato servicoLavaJato) {
        super(servicoLavaJato);
    }

    // Construtor para ser o primeiro serviço
    public DesodorizacaoInterior() {
        super(); // Primeiro serviço, sem base
    }

    @Override
    public String getDescricao() {
        return servicoLavaJato.getDescricao() + ", Serviço de desodorização do interior do veículo, eliminando odores.";
    }

    @Override
    public double calcularPreco(TipoCarro tipoCarro) {
        return servicoLavaJato.calcularPreco(tipoCarro) + 70.0;
    }
}
