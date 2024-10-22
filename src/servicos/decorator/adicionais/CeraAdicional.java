package servicos.decorator.adicionais;

import carro.TipoCarro;
import servicos.decorator.ServicoAdicional;
import servicos.principais.ServicoLavaJato;

public class CeraAdicional extends ServicoAdicional {
    public CeraAdicional(ServicoLavaJato servicoLavaJato) {
        super(servicoLavaJato);
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
