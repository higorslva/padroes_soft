class carroLuxo extends Carro{
  carroLuxo(Localidade localidade){
    super(tipoCarro.LUXO, localidade);
    construct();
  }
  @Override
  protected void construct(){
    System.out.println("Conectando ao carro de luxo");
  }
}
