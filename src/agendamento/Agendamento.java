package agendamento;

import pagamento.Pagamento;
import servicos.ServicoLavaJato;
import carro.Carro;
import usuario.UsuarioCliente;

import java.time.LocalDateTime;

public class Agendamento {
    private UsuarioCliente cliente;
    private Carro carro;
    private ServicoLavaJato servico;
    private Pagamento pagamento;
    private LocalDateTime dataHora;

    public Agendamento(UsuarioCliente cliente, Carro carro, ServicoLavaJato servico, LocalDateTime dataHora) {
        this.cliente = cliente;
        this.carro = carro;
        this.servico = servico;
        this.dataHora = dataHora;
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

    public void processarPagamento() {
        if (pagamento != null) {
            double precoFinal = servico.calcularPrecoFinal(carro.getTipoCarro());
            double precoComPagamento = pagamento.processarPagamento(precoFinal);

            System.out.println("Serviço: " + servico.getDescricao() +
                    " | Carro: " + carro.getModelo() +
                    " | Preço Final: R$ " + precoComPagamento);
        } else {
            System.out.println("Forma de pagamento não definida.");
        }
    }

    public void exibirDetalhesAgendamento() {
        System.out.println("\nDetalhes do Agendamento: ");
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Carro: " + carro.getModelo());
        System.out.println("Serviço: " + servico.getDescricao());
        System.out.println("Data e Hora: " + dataHora);
        if (pagamento != null) {
            double precoFinal = servico.calcularPrecoFinal(carro.getTipoCarro());
            System.out.println("Forma de pagamento: " + pagamento.getDescricaoMetodo());
            System.out.println("Valor final: R$ " + pagamento.processarPagamento(precoFinal));
        } else {
            System.out.println("Forma de pagamento ainda não definida.");
        }
    }

}
