package servicos.principais;

import carro.TipoCarro;

public class LavagemEnceramento implements ServicoLavaJato{
    @Override
    public String getDescricao() {
        return "Lavagem com enceramento incluso.";
    }

    @Override
    public double calcularPreco(TipoCarro tipoCarro) {
        if (tipoCarro == TipoCarro.HATCH) {
            return 55.0;
        } else if (tipoCarro == TipoCarro.SEDA) {
            return 65.0;
        } else if (tipoCarro == TipoCarro.CAMINHONETE){
            return 75.0;
        }
        return 0.0;
    }
}
