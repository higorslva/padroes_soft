import java.util.*;

public class restaurante{
  private static String[] tipoOpcao = {"Pizza", "Hamburger"};
  private static String [] sabores = {"Carne", "Calabresa", "Atum", "Segredo do chefe","Frango", "Mortadela"};
  public static String getOpcaoAleatoria(){
    Random r = new Random();
    int randInt = r.nextInt(tipoOpcao.length);
    return tipoOpcao[randInt];
  }
  public static String getSaboresAleatorios(){
    Random r = new Random();
    int randInt = r.nextInt(sabores.length);
    return sabores[randInt];
  }

// Main
  public static void main(String args[]){
    //for (int i = 0; i < 10; i++){
      opcao o = opcaoFactory.getOpcao(getOpcaoAleatoria());
      o.atribuirIngrediente(getSaboresAleatorios());
      o.sabor();
    //}
  }
}
