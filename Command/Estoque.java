public class Estoque {

   private String nome = "ABC";
   private int quantidade = 10;

   public void compra(){
      System.out.println("Estoque [ Nome: "+nome+", Quantidade: " + quantidade +" ] comprado");
   }
   public void vender(){
      System.out.println("Estoque [ Nome: "+nome+", Quantidade: " + quantidade +" ] vendido");
   }
}
