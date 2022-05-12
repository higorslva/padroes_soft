class fabricaCarro{
  private fabricaCarro(){

  }
  public static Carro buildCar(tipoCarro tipo){
    Carro carro = null;
    Localidade localidade = Localidade.BRASIL;
    switch (localidade)
    {
      case EUA:
        carro = fabricaCarroEUA.buildCar(tipo);
        break;

      case BRASIL:
        carro = fabricaCarroBrasil.buildCar(tipo);
        break;

        default:
          carro = fabricaCarroDefault.buildCar(tipo);
    }
    return carro;
  }
}
