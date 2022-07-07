public class EstoqueCompra implements Pedido {
   private Estoque absEstoque;

   public EstoqueCompra(Estoque absEstoque){
      this.absEstoque = absEstoque;
   }

   public void execute() {
      absEstoque.compra();
   }
}
