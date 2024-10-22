package servicos.principais;

import carro.TipoCarro;

public class LavagemSimples implements ServicoLavaJato {

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
