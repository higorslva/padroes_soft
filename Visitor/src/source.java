interface ItemElement{
    public int aceite(CarrinhoShoppingVisitor visitor);
}
////////////////////////////////////////////////////////
class Livro implements ItemElement{
    private int preco;
    private String IsbnNum;

    public Livro(int custo, String isbn)    {
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
////////////////////////////////////////////////////////
class Fruta implements ItemElement
{
    private int precoPorKg;
    private int peso;
    private String nome;

    public Fruta(int precoKg, int ps, String nm)
    {
        this.precoPorKg=precoKg;
        this.peso=ps;
        this.nome = nm;
    }

    public int getprecoPorKg()
    {
        return precoPorKg;
    }

    public int getpeso()
    {
        return peso;
    }

    public String getnome()
    {
        return this.nome;
    }

    @Override
    public int aceite(CarrinhoShoppingVisitor visitor)
    {
        return visitor.visit(this);
    }

}
////////////////////////////////////////////////////////
interface CarrinhoShoppingVisitor
{

    int visit(Livro livro);
    int visit(Fruta fruta);
}
////////////////////////////////////////////////////////
class CarrinhoShoppingVisitorImpl implements CarrinhoShoppingVisitor
{

    @Override
    public int visit(Livro livro)
    {
        int custo=0;
        //aplica desconto de $5 se o preço do livro é maior que $50
        if(livro.getpreco() > 50)
        {
            custo = livro.getpreco()-5;
        }
        else
            custo = livro.getpreco();

        System.out.println("Livro ISBN::"+livro.getNumIsbn() + " custo ="+custo);
        return custo;
    }

    @Override
    public int visit(Fruta fruta)
    {
        int custo = fruta.getprecoPorKg()*fruta.getpeso();
        System.out.println(fruta.getnome() + " custo = "+custo);
        return custo;
    }

}
////////////////////////////////////////////////////////
class ShoppingCartClient
{

    public static void main(String[] args)
    {
        ItemElement[] itens = new ItemElement[]{new Livro(20, "1234"),
                              new Livro(100, "5678"), new Fruta(10, 2, "Banana"),
                              new Fruta(5, 5, "Maçã")};

        int total = calcularpreco(itens);
        System.out.println("Total custo = "+total);
    }

    private static int calcularpreco(ItemElement[] itens)
    {
        CarrinhoShoppingVisitor visitor = new CarrinhoShoppingVisitorImpl();
        int sum=0;
        for(ItemElement item : itens)
        {
            sum = sum + item.aceite(visitor);
        }
        return sum;
    }

}
