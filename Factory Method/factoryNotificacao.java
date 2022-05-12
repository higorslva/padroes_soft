public class factoryNotificacao{
  public Notificacao createNotificacao(String canal){
    if (canal == null || canal.isEmpty()){
      return null;
    }switch (canal){
      case "SMS":
        return new notificacaoSMS();
      case "email":
        return new notificacaoEmail();
      case "push":
        return new notificacaoPush();
      default:
        throw new IllegalArgumentException("Canal desconhecido " + canal);
    }
  }
}
