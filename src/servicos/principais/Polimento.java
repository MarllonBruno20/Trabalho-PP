package servicos.principais;

import carro.TipoCarro;

public class Polimento implements ServicoLavaJato {

    @Override
    public String getDescricao() {
        return "Serviço de polimento para o exterior do carro.";
    }

    @Override
    public double calcularPreco(TipoCarro tipoCarro) {
        if (tipoCarro == TipoCarro.HATCH) {
            return 60.0;
        } else if (tipoCarro == TipoCarro.SEDA) {
            return 75.0;
        } else if (tipoCarro == TipoCarro.CAMINHONETE){
            return 90.0;
        }
        return 0.0;
    }
}
