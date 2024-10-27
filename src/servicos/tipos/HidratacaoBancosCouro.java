package servicos.tipos;

import carro.TipoCarro;
import servicos.base.DecoratorServico;
import servicos.base.ServicoLavaJato;

public class HidratacaoBancosCouro extends DecoratorServico {

    // Construtor para adicionar sobre outro serviço
    public HidratacaoBancosCouro(ServicoLavaJato servicoLavaJato) {
        super(servicoLavaJato);
    }

    // Construtor para ser o primeiro serviço
    public HidratacaoBancosCouro() {
        super(); // Primeiro serviço, sem base
    }

    @Override
    public String getDescricao() {
        return servicoLavaJato.getDescricao() + ", Hidratação de bancos de couro, preservando a durabilidade e aparência.";
    }

    @Override
    public double calcularPreco(TipoCarro tipoCarro) {
        return servicoLavaJato.calcularPreco(tipoCarro) + 50.0;
    }
}
