package servicos.tipos;

import carro.TipoCarro;
import servicos.base.DecoratorServico;
import servicos.base.ServicoLavaJato;

public class LavagemMotor extends DecoratorServico {

    // Construtor para adicionar sobre outro serviço
    public LavagemMotor(ServicoLavaJato servicoLavaJato) {
        super(servicoLavaJato);
    }

    // Construtor para ser o primeiro serviço
    public LavagemMotor() {
        super(); // Primeiro serviço, sem base
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
