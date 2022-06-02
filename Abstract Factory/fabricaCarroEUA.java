class fabricaCarroEUA{
  static Carro buildCar(tipoCarro modelo){
    Carro carro = null;
    switch(modelo){
      case MICRO:
        carro = new MicroCarro(Localidade.EUA);
        break;

      case MINI:
        carro = new MiniCarro(Localidade.EUA);
        break;

      case LUXO:
        carro = new carroLuxo(Localidade.EUA);
        break;
    }
    return carro;
  }
}
