class fabricaCarroDefault{
  static Carro buildCar(tipoCarro modelo){
    Carro carro = null;
    switch(modelo){
      case MICRO:
        carro = new MicroCarro(Localidade.DEFAULT);
        break;

      case MINI:
        carro = new MiniCarro(Localidade.DEFAULT);
        break;

      case LUXO:
        carro = new carroLuxo(Localidade.DEFAULT);
        break;
    }
    return carro;
  }
}
