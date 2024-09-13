package servicos;

import carro.TipoCarro;

public class LavagemSimples extends ServicoLavaJato{

    public LavagemSimples() {
        super("Lavagem Simples");
    }

    @Override
    public double calcularPrecoFinal(TipoCarro tipoCarro) {
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
