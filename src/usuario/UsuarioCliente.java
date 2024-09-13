package usuario;

import carro.Carro;

public class UsuarioCliente extends Usuario {
    private Carro carro;


    public UsuarioCliente(String nome, String telefone, Carro carro) {
        super(nome, telefone);
        this.carro = carro;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }
}
