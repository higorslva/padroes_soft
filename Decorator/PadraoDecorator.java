public class PadraoDecorator{
  public static void main(String[] args){
    Formato circulo = new Circulo();

    Formato circuloVermelho = new DecoratorFormatoVermelho(new Circulo());
    Formato retanguloVermelho = new DecoratorFormatoVermelho(new Retangulo());

    System.out.println("Circulo com borda normal");
    circulo.desenhe();

    System.out.println("Circulo com bordas vermelhas");
    circuloVermelho.desenhe();

    System.out.println("Retangulo com bordas vermelhas");
    retanguloVermelho.desenhe();
  }
}
