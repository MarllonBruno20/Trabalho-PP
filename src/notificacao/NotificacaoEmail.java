package notificacao;

public class NotificacaoEmail implements Notificacao {
    @Override
    public void enviarNotificacao(String mensagem, String destinatario) {
        System.out.println("Enviando e-mail para: " + destinatario);
        System.out.println("Mensagem: " + mensagem);
    }
}
