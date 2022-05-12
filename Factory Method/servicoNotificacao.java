public class servicoNotificacao{
  public static void main(String[] args){
    factoryNotificacao FactoryNotificacao = new factoryNotificacao();
    Notificacao notificacao = FactoryNotificacao.createNotificacao("SMS");
    notificacao.notificarUsuario();
  }
}
