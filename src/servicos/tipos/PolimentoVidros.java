package servicos.tipos;

import carro.TipoCarro;
import servicos.base.DecoratorServico;
import servicos.base.ServicoLavaJato;

public class PolimentoVidros extends DecoratorServico {
    // Construtor para adicionar sobre outro serviço
    public PolimentoVidros(ServicoLavaJato servicoLavaJato) {
        super(servicoLavaJato);
    }

    // Construtor para ser o primeiro serviço
    public PolimentoVidros() {
        super(); // Primeiro serviço, sem base
    }



    @Override
    public String getDescricao() {
        return servicoLavaJato.getDescricao() + ", Polimento e tratamento dos vidros para melhorar a visibilidade.";
    }

    @Override
    public double calcularPreco(TipoCarro tipoCarro) {
        return servicoLavaJato.calcularPreco(tipoCarro) + 45.0;
    }
}
