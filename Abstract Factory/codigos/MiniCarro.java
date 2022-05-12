class MiniCarro extends Carro{
  MiniCarro(Localidade localidade){
    super(tipoCarro.MINI, localidade);
    construct();
  }
  @Override
  protected void construct(){
    System.out.println("Conectando ao mini carro");
  }
}
