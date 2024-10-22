package notificacao;

public class NotificacaoSms implements Notificacao{
    @Override
    public void enviarNotificacao(String mensagem, String destinatario) {
        System.out.println("Enviando SMS para: " + destinatario);
        System.out.println("Mensagem: " + mensagem);
    }
}
