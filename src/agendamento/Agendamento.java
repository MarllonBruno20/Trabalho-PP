package agendamento;

import notificacao.Notificacao;
import pagamento.Pagamento;
import pagamento.PagamentoCartaoCredito;
import servicos.base.ServicoLavaJato;
import carro.Carro;
import usuario.UsuarioCliente;

import java.time.LocalDateTime;

public class Agendamento {
    private UsuarioCliente cliente;
    private Carro carro;
    private ServicoLavaJato servico;  // Pode incluir decorators de serviços adicionais
    private Pagamento pagamento;
    private Notificacao notificacao;
    private LocalDateTime dataHora;

    public Agendamento(UsuarioCliente cliente, Carro carro, ServicoLavaJato servico, Notificacao notificacao, LocalDateTime dataHora) {
        this.cliente = cliente;
        this.carro = carro;
        this.servico = servico;
        this.dataHora = dataHora;
        this.notificacao = notificacao;
    }

    public UsuarioCliente getCliente() {
        return cliente;
    }

    public void setCliente(UsuarioCliente cliente) {
        this.cliente = cliente;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public ServicoLavaJato getServico() {
        return servico;
    }

    public void setServico(ServicoLavaJato servico) {
        this.servico = servico;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public void processarPagamento(int parcelas) {
        if (pagamento != null) {
            // Calcular o preço total com base no tipo do carro e nos serviços adicionais
            double precoFinal = servico.calcularPreco(carro.getTipoCarro());

            if (pagamento instanceof PagamentoCartaoCredito && parcelas > 1) {
                PagamentoCartaoCredito pagamentoCartao = (PagamentoCartaoCredito) pagamento;
                double precoComPagamentoParcelado = pagamentoCartao.processarPagamento(precoFinal, parcelas);
                System.out.println("Serviço: " + servico.getDescricao() +
                        " | Carro: " + carro.getModelo() +
                        " | Preço Parcelado: R$ " + precoComPagamentoParcelado +
                        " | Parcelas: " + parcelas);
            } else {
                double precoComPagamento = pagamento.processarPagamento(precoFinal);
                System.out.println("Serviço: " + servico.getDescricao() +
                        " | Carro: " + carro.getModelo() +
                        " | Preço Final: R$ " + precoComPagamento);
            }

            String mensagem = "O pagamento para o serviço " + servico.getDescricao() + " foi processado com sucesso!";
            notificacao.enviarNotificacao(mensagem, cliente.getNome());
        } else {
            System.out.println("Forma de pagamento não definida.");
        }
    }

    public void exibirDetalhesAgendamento() {
        System.out.println("\nDetalhes do Agendamento: ");
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Carro: " + carro.getModelo());
        System.out.println("Serviço: " + servico.getDescricao()); // Exibirá o serviço com todos os decorators aplicados
        System.out.println("Data e Hora: " + dataHora);
        if (pagamento != null) {
            System.out.println("Forma de pagamento: " + pagamento.getDescricaoMetodo());
            System.out.println("Valor final: R$ " + pagamento.processarPagamento(servico.calcularPreco(carro.getTipoCarro())));
        } else {
            System.out.println("Forma de pagamento ainda não definida.");
        }
    }
}
