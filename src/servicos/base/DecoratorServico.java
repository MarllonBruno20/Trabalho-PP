package servicos.base;

import carro.TipoCarro;

// Decorator abstrato
public abstract class DecoratorServico implements ServicoLavaJato {
    protected ServicoLavaJato servicoLavaJato;

    // Construtor opcional para o primeiro serviço
    public DecoratorServico(ServicoLavaJato servicoLavaJato) {
        this.servicoLavaJato = servicoLavaJato;
    }

    // Construtor sem o serviço base para o primeiro serviço escolhido
    public DecoratorServico() {
        this.servicoLavaJato = null; // O primeiro serviço não terá outro para decorar
    }

    @Override
    public String getDescricao() {
        if (servicoLavaJato != null) {
            return servicoLavaJato.getDescricao();
        }
        return "";
    }

    @Override
    public double calcularPreco(TipoCarro tipoCarro) {
        if (servicoLavaJato != null) {
            return servicoLavaJato.calcularPreco(tipoCarro);
        }
        return 0.0;
    }

}
