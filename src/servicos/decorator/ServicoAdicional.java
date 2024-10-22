package servicos.decorator;

import carro.TipoCarro;
import servicos.principais.ServicoLavaJato;

// Decorator abstrato
public abstract class ServicoAdicional implements ServicoLavaJato {
    protected ServicoLavaJato servicoLavaJato;

    public ServicoAdicional(ServicoLavaJato servicoLavaJato){
        this.servicoLavaJato = servicoLavaJato;
    }

    @Override
    public String getDescricao() {
        return servicoLavaJato.getDescricao();
    }

    @Override
    public double calcularPreco(TipoCarro tipoCarro) {
        return servicoLavaJato.calcularPreco(tipoCarro);
    }



}
