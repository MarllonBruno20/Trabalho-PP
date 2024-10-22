package servicos.decorator.adicionais;

import carro.TipoCarro;
import servicos.decorator.ServicoAdicional;
import servicos.principais.ServicoLavaJato;

public class AplicacaoSelante extends ServicoAdicional {
    public AplicacaoSelante(ServicoLavaJato servicoLavaJato) {
        super(servicoLavaJato);
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
