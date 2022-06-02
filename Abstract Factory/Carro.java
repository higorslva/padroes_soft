abstract class Carro{
  Carro(tipoCarro modelo, Localidade localidade){
    this.modelo = modelo;
    this.localidade = localidade;
  }
  abstract void construct();
  tipoCarro modelo = null;
  Localidade localidade = null;

  tipoCarro getModel(){
    return modelo;
  }
  void setModel(tipoCarro modelo){
    this.modelo = modelo;
  }
  Localidade getLocalidade(){
    return localidade;
  }

//  @Override
  public String toString(){
    return "Modelo do carro - " + modelo + " localizado em " + localidade;
  }
}
