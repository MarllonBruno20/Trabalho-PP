package servicos.principais;

import carro.TipoCarro;

public interface ServicoLavaJato {

    String getDescricao();
    double calcularPreco(TipoCarro tipoCarro);

}
