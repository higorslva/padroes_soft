class Fruta implements ItemElement{
  private int precoPorKg;
  private int peso;
  private String nome;

  public Fruta(int precoKg, int ps, String nm){
    this.precoPorKg = precoKg;
    this.peso = ps;
    this.nome = nm;
  }

  public int getprecoPorKg(){
    return precoPorKg;
  }

  public int getPeso(){
    return peso;
  }

  public String getNome(){
    return this.nome;
  }

  @Override
  public int aceite(CarrinhoShoppingVisitor visitor){
    return visitor.visit(this);
  }
}
