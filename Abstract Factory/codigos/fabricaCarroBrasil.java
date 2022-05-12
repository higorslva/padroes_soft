class fabricaCarroBrasil{
  static Carro buildCar(tipoCarro modelo){
    Carro carro = null;
    switch(modelo){
      case MICRO:
        carro = new MicroCarro(Localidade.BRASIL);
        break;

      case MINI:
        carro = new MiniCarro(Localidade.BRASIL);
        break;

      case LUXO:
        carro = new carroLuxo(Localidade.BRASIL);
        break;
    }
    return carro;
  }
}
