package servicos.decorator.adicionais;

import carro.TipoCarro;
import servicos.decorator.ServicoAdicional;
import servicos.principais.ServicoLavaJato;

public class HidratacaoBancosCouro extends ServicoAdicional {
    public HidratacaoBancosCouro(ServicoLavaJato servicoLavaJato) {
        super(servicoLavaJato);
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
