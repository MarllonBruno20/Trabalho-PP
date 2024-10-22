package servicos.principais;

import carro.TipoCarro;
import servicos.principais.ServicoLavaJato;

public class LavagemCompleta implements ServicoLavaJato {
    @Override
    public String getDescricao() {
        return "Lavagem detalhada do carro, incluindo limpeza do motor e do chassi.";
    }

    @Override
    public double calcularPreco(TipoCarro tipoCarro) {
        if (tipoCarro == TipoCarro.HATCH) {
            return 60.0;
        } else if (tipoCarro == TipoCarro.SEDA) {
            return 70.0;
        } else if (tipoCarro == TipoCarro.CAMINHONETE){
            return 80.0;
        }
        return 0.0;
    }
}
