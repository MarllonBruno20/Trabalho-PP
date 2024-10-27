package servicos.tipos;

import carro.TipoCarro;
import servicos.base.DecoratorServico;
import servicos.base.ServicoLavaJato;

public class LavagemCompleta extends DecoratorServico {

    // Construtor para adicionar sobre outro serviço
    public LavagemCompleta(ServicoLavaJato servicoLavaJato) {
        super(servicoLavaJato);
    }

    // Construtor para ser o primeiro serviço
    public LavagemCompleta() {
        super(); // Primeiro serviço, sem base
    }
    @Override
    public String getDescricao() {
        return "Lavagem detalhada do carro, incluindo limpeza do motor e do chassi.";
    }

    @Override
    public double calcularPreco(TipoCarro tipoCarro) {
        if (tipoCarro == TipoCarro.HATCH) {
            return 60.0;
        } else if (tipoCarro == TipoCarro.SEDA) {
            return 70.0;
        } else if (tipoCarro == TipoCarro.CAMINHONETE){
            return 80.0;
        }
        return 0.0;
    }
}
