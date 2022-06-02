class MicroCarro extends Carro{
  MicroCarro(Localidade localidade){
    super(tipoCarro.MICRO, localidade);
    construct();
  }
  @Override
  protected void construct(){
    System.out.println("Conectando ao micro carro");
  }
}
