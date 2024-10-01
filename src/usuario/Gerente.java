package usuario;

public class Gerente extends Funcionario {

    public Gerente(String nome, String telefone) {
        super(nome, telefone);
    }

    void gerenciarEquipe() {
        System.out.println("Gerenciando equipe!");
    }

}
