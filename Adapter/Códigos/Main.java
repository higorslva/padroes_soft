class Main{
  public static void main(String args[]){
    Pardal pardal = new Pardal();
    patoBrinquedo patoBrinquedo = new PatoDeBorracha();

    patoBrinquedo AdaptadorPassaro = new AdaptadorPassaro(pardal);

    System.out.println("Pardal...");
    pardal.voar();
    pardal.fazerSom();

    System.out.println("PatoBrinquedo...");
    patoBrinquedo.barulho();

    System.out.println("Adaptando o som para cantar...");
    AdaptadorPassaro.barulho();
  }
}
