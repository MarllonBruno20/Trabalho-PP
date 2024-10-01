package usuario;

public class Atendente extends Funcionario {

    public Atendente(String nome, String telefone) {
        super(nome, telefone);
    }

    void atender() {
        System.out.println("Atendendo os clientes...");
    }
}
