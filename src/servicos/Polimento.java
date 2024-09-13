package servicos;

import carro.TipoCarro;

public class Polimento extends ServicoLavaJato{
    public Polimento() {
        super("Polimento");
    }
    @Override
    public double calcularPrecoFinal(TipoCarro tipoCarro) {
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
