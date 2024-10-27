package servicos.tipos;

import carro.TipoCarro;
import servicos.base.DecoratorServico;
import servicos.base.ServicoLavaJato;

public class LavagemADry extends DecoratorServico {

    // Construtor para adicionar sobre outro serviço
    public LavagemADry(ServicoLavaJato servicoLavaJato) {
        super(servicoLavaJato);
    }

    // Construtor para ser o primeiro serviço
    public LavagemADry() {
        super(); // Primeiro serviço, sem base
    }
    @Override
    public String getDescricao() {
        return "Lavagem a seco, usando produtos especiais.";
    }

    @Override
    public double calcularPreco(TipoCarro tipoCarro) {
        if (tipoCarro == TipoCarro.HATCH) {
            return 100.0;
        } else if (tipoCarro == TipoCarro.SEDA) {
            return 115.0;
        } else if (tipoCarro == TipoCarro.CAMINHONETE){
            return 130.0;
        }
        return 0.0;
    }
}
