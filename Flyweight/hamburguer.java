class hamburguer implements opcao{
  private String ingrediente;
  public void atribuirIngrediente(String ingrediente){
    this.ingrediente = ingrediente;
  }
  public void sabor(){
    System.out.println("Hambúrguer sabor: " + ingrediente);
  }
}
