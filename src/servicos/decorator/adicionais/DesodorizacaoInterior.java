package servicos.decorator.adicionais;

import carro.TipoCarro;
import servicos.decorator.ServicoAdicional;
import servicos.principais.ServicoLavaJato;

public class DesodorizacaoInterior extends ServicoAdicional {
    public DesodorizacaoInterior(ServicoLavaJato servicoLavaJato) {
        super(servicoLavaJato);
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
