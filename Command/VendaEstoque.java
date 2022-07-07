public class VendaEstoque implements Pedido {
   private Estoque absEstoque;

   public VendaEstoque(Estoque absEstoque){
      this.absEstoque = absEstoque;
   }

   public void execute() {
      absEstoque.vender();
   }
}
