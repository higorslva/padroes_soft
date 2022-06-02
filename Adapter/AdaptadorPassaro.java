class AdaptadorPassaro implements patoBrinquedo{
  Passaro passaro;
  public AdaptadorPassaro(Passaro passaro){
    this.passaro = passaro;
  }
  public void barulho(){
    passaro.fazerSom();
  }
}
