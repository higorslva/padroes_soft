public class DecoratorFormatoVermelho extends DecoratorFormato{
  public DecoratorFormatoVermelho(Formato decoratedFormato){
    super(decoratedFormato);
  }
  @Override
  public void desenhe(){
    decoratedFormato.desenhe();
    setBordaVermelha(decoratedFormato);
  }
  private void setBordaVermelha(Formato decoratedFormato){
    System.out.println("Bordas ajustadas para vermelho.");
  }
}
