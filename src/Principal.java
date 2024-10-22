import agendamento.Agendamento;
import carro.TipoCarro;
import estoque.ControleEstoque;
import estoque.ControleEstoqueImpl;
import notificacao.Notificacao;
import notificacao.NotificacaoEmail;
import notificacao.NotificacaoSms;
import pagamento.Pagamento;
import pagamento.PagamentoCartaoCredito;
import pagamento.PagamentoCartaoDebito;
import pagamento.PagamentoDinheiro;
import produto.Produto;
import produto.ProdutoLimpeza;
import servicos.decorator.adicionais.CeraAdicional;
import servicos.decorator.adicionais.LavagemMotor;
import servicos.decorator.adicionais.LimpezaInternaPremium;
import servicos.principais.*;
import carro.Carro;
import usuario.*;

import java.time.LocalDateTime;
import java.util.List;

public class Principal {
    public static void main(String[] args) {

        System.out.println("\n");

        // SERVIÇOS OFERECIDOS
        ServicoLavaJato servicoLavagemSimples = new LavagemSimples();
        ServicoLavaJato servicoPolimento = new Polimento();
        ServicoLavaJato lavagemEnceramento  = new LavagemEnceramento();
        ServicoLavaJato lavagemCompleta = new LavagemCompleta();
        ServicoLavaJato lavagemDry = new LavagemADry();

        // FORMAS DE PAGAMENTO
        Pagamento pagamentoDinheiro = new PagamentoDinheiro();
        Pagamento pagamentoCartaoCredito = new PagamentoCartaoCredito();
        Pagamento pagamentoCartaoDebito = new PagamentoCartaoDebito();

        // NOTIFICAÇÃO
        Notificacao notificacaoEmail = new NotificacaoEmail();
        Notificacao notificacaoSms = new NotificacaoSms();

        // CLIENTES
        Carro carroAlvaro = new Carro("Fiat", "Argo", TipoCarro.HATCH);
        UsuarioCliente alvaro = new UsuarioCliente("Álvaro", "(34) 99999-9999", carroAlvaro);

        Carro carroJefferson = new Carro("Chevrolet", "S-10", TipoCarro.CAMINHONETE);
        UsuarioCliente jefferson = new UsuarioCliente("Jefferson", "(34) 75462-4545", carroJefferson);

        // AGENDAMENTOS
        Agendamento agendamento = new Agendamento(alvaro, carroAlvaro, servicoLavagemSimples, notificacaoEmail, LocalDateTime.now());
        agendamento.setPagamento(pagamentoDinheiro);
        agendamento.processarPagamento(1);
        agendamento.exibirDetalhesAgendamento();

        System.out.println("\n");
        Agendamento agendamentoJefferson = new Agendamento(jefferson, carroJefferson, servicoPolimento, notificacaoSms, LocalDateTime.now());
        agendamentoJefferson.setPagamento(pagamentoCartaoCredito);
        agendamentoJefferson.processarPagamento(3);
        agendamentoJefferson.exibirDetalhesAgendamento();


        // IMPLEMENTAÇÃO DE ESTOQUE
        System.out.println("\nImplementação do Estoque");
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


        //PRINCÍPIO DE SUBSTITUIÇÃO DE LISKOV
        System.out.println("\nPrincípio de Substituição de Liskov");
        Funcionario func1 = new Funcionario("Alvaro", "3499823409823");
        func1.setSalario(3000d);
        System.out.println("Salario: " + func1.getSalario());
        func1.calcularBonificacao(0.3);
        System.out.println("Bonus: " + func1.getBonus());

        Gerente func2 = new Gerente("Marllon", "3492410928412");
        func2.setSalario(34000d);
        System.out.println("Salario: " + func2.getSalario());
        func2.calcularBonificacao(0.3);
        System.out.println("Bonus: " + func2.getBonus());

        Atendente func3 = new Atendente("Marllon", "3492410928412");
        func3.setSalario(3200d);
        System.out.println("Salario: " + func3.getSalario());
        func3.calcularBonificacao(0.3);
        System.out.println("Bonus: " + func3.getBonus());
        System.out.println("\n");

        //APLICAÇÃO DO DECORATOR
        // CLIENTE
        Carro carroLuiz = new Carro("Chevrolet", "Vectra", TipoCarro.SEDA);
        UsuarioCliente luiz = new UsuarioCliente("Luiz Carlos", "(34) 99666-9999", carroLuiz);

        //ESCOLHA SERVIÇO
        ServicoLavaJato servico = new Polimento();
        servico = new LimpezaInternaPremium(servico);
        servico = new LavagemMotor(servico);

        // AGENDAMENTO
        Agendamento agendamentoLuiz = new Agendamento(luiz, carroLuiz, servico, notificacaoEmail, LocalDateTime.now());
        agendamentoLuiz.setPagamento(pagamentoDinheiro);
        agendamentoLuiz.processarPagamento(1);
        agendamentoLuiz.exibirDetalhesAgendamento();
    }
}

