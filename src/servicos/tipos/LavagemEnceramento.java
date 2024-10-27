package servicos.tipos;

import carro.TipoCarro;
import servicos.base.DecoratorServico;
import servicos.base.ServicoLavaJato;

public class LavagemEnceramento extends DecoratorServico {

    // Construtor para adicionar sobre outro serviço
    public LavagemEnceramento(ServicoLavaJato servicoLavaJato) {
        super(servicoLavaJato);
    }

    // Construtor para ser o primeiro serviço
    public LavagemEnceramento() {
        super(); // Primeiro serviço, sem base
    }
    @Override
    public String getDescricao() {
        return "Lavagem com enceramento incluso.";
    }

    @Override
    public double calcularPreco(TipoCarro tipoCarro) {
        if (tipoCarro == TipoCarro.HATCH) {
            return 55.0;
        } else if (tipoCarro == TipoCarro.SEDA) {
            return 65.0;
        } else if (tipoCarro == TipoCarro.CAMINHONETE){
            return 75.0;
        }
        return 0.0;
    }
}
