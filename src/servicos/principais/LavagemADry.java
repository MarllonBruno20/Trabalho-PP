package servicos.principais;

import carro.TipoCarro;

public class LavagemADry implements  ServicoLavaJato{
    @Override
    public String getDescricao() {
        return "Lavagem a seco, usando produtos especiais.";
    }

    @Override
    public double calcularPreco(TipoCarro tipoCarro) {
        if (tipoCarro == TipoCarro.HATCH) {
            return 100.0;
        } else if (tipoCarro == TipoCarro.SEDA) {
            return 115.0;
        } else if (tipoCarro == TipoCarro.CAMINHONETE){
            return 130.0;
        }
        return 0.0;
    }
}
