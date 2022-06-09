class Livro implements ItemElement{
  private int preco;
  private String IsbnNum;

  public Livro(int custo, String isbn){
    this.preco=custo;
    this.IsbnNum=isbn;
  }
  public int getpreco(){
    return preco;
  }

  public String getNumIsbn(){
    return IsbnNum;
  }

  @Override
  public int aceite(CarrinhoShoppingVisitor visitor){
    return visitor.visit(this);
  }
}
