package servicos.tipos;

import carro.TipoCarro;
import servicos.base.DecoratorServico;
import servicos.base.ServicoLavaJato;

public class Polimento extends DecoratorServico {

    // Construtor para adicionar sobre outro serviço
    public Polimento(ServicoLavaJato servicoLavaJato) {
        super(servicoLavaJato);
    }

    // Construtor para ser o primeiro serviço
    public Polimento() {
        super(); // Primeiro serviço, sem base
    }


    @Override
    public String getDescricao() {
        return "Serviço de polimento para o exterior do carro.";
    }

    @Override
    public double calcularPreco(TipoCarro tipoCarro) {
        if (tipoCarro == TipoCarro.HATCH) {
            return 60.0;
        } else if (tipoCarro == TipoCarro.SEDA) {
            return 75.0;
        } else if (tipoCarro == TipoCarro.CAMINHONETE){
            return 90.0;
        }
        return 0.0;
    }
}
