import agendamento.Agendamento;
import carro.TipoCarro;
import estoque.ControleEstoque;
import estoque.ControleEstoqueImpl;
import pagamento.Pagamento;
import pagamento.PagamentoCartaoCredito;
import pagamento.PagamentoCartaoDebito;
import pagamento.PagamentoDinheiro;
import produto.Produto;
import produto.ProdutoLimpeza;
import servicos.LavagemSimples;
import servicos.Polimento;
import servicos.ServicoLavaJato;
import carro.Carro;
import usuario.Usuario;
import usuario.UsuarioAdministrador;
import usuario.UsuarioCliente;

import java.time.LocalDateTime;
import java.util.List;

public class Principal {
    public static void main(String[] args) {

        // SERVIÇOS OFERECIDOS
        ServicoLavaJato servicoLavagemSimples = new LavagemSimples();
        ServicoLavaJato servicoPolimento = new Polimento();

        // FORMAS DE PAGAMENTO
        Pagamento pagamentoDinheiro = new PagamentoDinheiro();
        Pagamento pagamentoCartaoCredito = new PagamentoCartaoCredito();
        Pagamento pagamentoCartaoDebito = new PagamentoCartaoDebito();

        // CLIENTES
        Carro carroAlvaro = new Carro("Fiat", "Argo", TipoCarro.HATCH);
        UsuarioCliente alvaro = new UsuarioCliente("Álvaro", "(34) 99999-9999", carroAlvaro);

        Carro carroJefferson = new Carro("Chevrolet", "S-10", TipoCarro.CAMINHONETE);
        UsuarioCliente jefferson = new UsuarioCliente("Jefferson", "(34) 75462-4545", carroJefferson);

        // AGENDAMENTOS
        Agendamento agendamento = new Agendamento(alvaro, carroAlvaro, servicoLavagemSimples, LocalDateTime.now());
        agendamento.setPagamento(pagamentoDinheiro);
        agendamento.processarPagamento(1);
        agendamento.exibirDetalhesAgendamento();

        System.out.println("\n");
        Agendamento agendamentoJefferson = new Agendamento(jefferson, carroJefferson, servicoPolimento, LocalDateTime.now());
        agendamentoJefferson.setPagamento(pagamentoCartaoCredito);
        agendamentoJefferson.processarPagamento(3);
        agendamentoJefferson.exibirDetalhesAgendamento();


        // Implementação do Estoque
        System.out.println("\nImplementação do Estoque\n");
        ControleEstoque controleEstoque = new ControleEstoqueImpl();
        Produto sabao = new ProdutoLimpeza("Sabão para Carro", 15.00, 100);
        Produto cera = new ProdutoLimpeza("Cera", 30.00, 10);

        controleEstoque.adicionarProduto(sabao);
        controleEstoque.adicionarProduto(cera);
        controleEstoque.ajustarEstoque("Sabão para Carro", 10);

        controleEstoque.listarProdutosEmEstoque();

        // PARTE DO ADMINISTRADOR
        UsuarioAdministrador.adicionarUsuario(alvaro);
        UsuarioAdministrador.adicionarUsuario(jefferson);

        UsuarioAdministrador administrador = new UsuarioAdministrador("Geraldo", "(34) 8888888");

        List<Usuario> usuarios = UsuarioAdministrador.getListaUsuarios();

        System.out.println("\nUsuários em memória:");
        for (Usuario usuario : usuarios) {
            System.out.println("Id: " + usuario.getId() + ", Nome: " + usuario.getNome() + ", Telefone: " + usuario.getTelefone());
        }
    }
}

