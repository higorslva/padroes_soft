class CarrinhoShoppingVisitorImpl implements CarrinhoShoppingVisitor{
  @Override
  public int visit(Livro livro){
    int custo = 0;
    //Desconto de 5$ se o livro custar mais que 50$
    if(livro.getpreco() > 50){
      custo = livro.getpreco()-5;
    }
    else{
      custo = livro.getpreco();
    }

    System.out.println("Livro ISBN: " + livro.getNumIsbn() + " custo = " + custo);
    return custo;
  }
  @Override
  public int visit(Fruta fruta){
    int custo = fruta.getprecoPorKg()*fruta.getPeso();
    System.out.println(fruta.getNome() + " custo = "+custo);
    return custo;
  }
}
