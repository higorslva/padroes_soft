class stateContextoAlerta{
  private stateAlertaMovel estadoAtual;

  public stateContextoAlerta(){
    estadoAtual = new Vibracao();
  }
  public void setState(stateAlertaMovel estado){
    estadoAtual = estado;
  }
  public void alerta(){
    estadoAtual.alerta(this);
  }
}
