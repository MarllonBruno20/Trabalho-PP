package servicos.tipos;

import carro.TipoCarro;
import servicos.base.DecoratorServico;
import servicos.base.ServicoLavaJato;

public class LavagemSimples extends DecoratorServico {

    // Construtor para adicionar sobre outro serviço
    public LavagemSimples(ServicoLavaJato servicoLavaJato) {
        super(servicoLavaJato);
    }

    // Construtor para ser o primeiro serviço
    public LavagemSimples() {
        super(); // Primeiro serviço, sem base
    }


    @Override
    public String getDescricao() {
        return "Serviço básico de lavagem do carro.";
    }

    @Override
    public double calcularPreco(TipoCarro tipoCarro) {
        if (tipoCarro == TipoCarro.HATCH) {
            return 45.0;
        } else if (tipoCarro == TipoCarro.SEDA) {
            return 55.0;
        } else if (tipoCarro == TipoCarro.CAMINHONETE){
            return 65.0;
        }
        return 0.0;
    }
}
