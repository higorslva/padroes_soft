class PadraoState{
  public static void main(String[] args){
    stateContextoAlerta stateContexto = new stateContextoAlerta();
    stateContexto.alerta();
		stateContexto.alerta();
		stateContexto.setState(new Silencioso());
		stateContexto.alerta();
		stateContexto.alerta();
		stateContexto.alerta();
  }
}
