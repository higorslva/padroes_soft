import java.util.*;

class opcaoFactory{
  private static HashMap <String, opcao> hm = new HashMap<String, opcao>();

  public static opcao getOpcao(String type){
    opcao o = null;
    if (hm.containsKey(type)){
      o = hm.get(type);
    }else{
      switch(type){
        case "Pizza":
          o = new pizza();
          break;

        case "Hamburger":
          o = new hamburguer();
          break;
          default:
            System.out.println("Não reconhecido");
          }
          hm.put(type, o);
        }
      return o;
    }
}
