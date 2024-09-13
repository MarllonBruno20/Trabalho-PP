package servicos;

import carro.TipoCarro;

public abstract class ServicoLavaJato {
    private String descricao;

    public ServicoLavaJato(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public abstract double calcularPrecoFinal(TipoCarro tipoCarro);

}
