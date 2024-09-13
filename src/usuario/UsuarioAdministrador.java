package usuario;

import java.util.ArrayList;
import java.util.List;

public class UsuarioAdministrador extends Usuario{

    private static List<Usuario> listaUsuarios = new ArrayList<>();
    public UsuarioAdministrador(String nome, String telefone) {
        super(nome, telefone);
    }

    public static void adicionarUsuario(Usuario usuario) {
        listaUsuarios.add(usuario);
    }

    public static List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }
}
