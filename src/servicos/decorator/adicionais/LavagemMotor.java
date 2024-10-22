package servicos.decorator.adicionais;

import carro.TipoCarro;
import servicos.decorator.ServicoAdicional;
import servicos.principais.ServicoLavaJato;

public class LavagemMotor extends ServicoAdicional {
    public LavagemMotor(ServicoLavaJato servicoLavaJato) {
        super(servicoLavaJato);
    }

    @Override
    public String getDescricao() {
        return servicoLavaJato.getDescricao() + ", Lavagem do motor e compartimento do motor.";
    }

    @Override
    public double calcularPreco(TipoCarro tipoCarro) {
        return servicoLavaJato.calcularPreco(tipoCarro) + 50.0;
    }

}
