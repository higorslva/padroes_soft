class CarrinhoShoppingClient{
  public static void main(String[] args){
    ItemElement[] itens = new ItemElement[]{new Livro(20, "1234"),
                          new Livro(100, "5678"), new Fruta(10, 2, "Banana"),
                          new Fruta(5, 5, "Maçã")};

    int total = calcularpreco(itens);
    System.out.println("Custo total = " + total);
  }

  private static int calcularpreco(ItemElement[] itens){
    CarrinhoShoppingVisitor visitor = new CarrinhoShoppingVisitorImpl();
    int sum = 0;
    for(ItemElement item:itens){
      sum = sum + item.aceite(visitor);
    }
    return sum;
  }
}
