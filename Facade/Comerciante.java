public class Comerciante{
  private LojaCelular iphone;
  private LojaCelular samsung;
  private LojaCelular motorola;

  public Comerciante(){
    iphone = new iphone();
    samsung = new samsung();
    motorola = new motorola();
  }
  public void iphoneVenda(){
    iphone.noModelo();
    iphone.preco();
  }
  public void samsungVenda(){
    samsung.noModelo();
    samsung.preco();
  }
  public void motorolaVenda(){
    motorola.noModelo();
    motorola.preco();
  }
}
