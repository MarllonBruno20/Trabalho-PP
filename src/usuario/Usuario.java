package usuario;

public class Usuario {
    private static int contadorId = 1;
    private int id;
    private String nome;
    private String telefone;

    public Usuario(String nome, String telefone) {
        this.id = contadorId++;
        this.nome = nome;
        this.telefone = telefone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
