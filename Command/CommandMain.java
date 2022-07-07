public class CommandMain {
   public static void main(String[] args) {
      Estoque absEstoque = new Estoque();

      EstoqueCompra comprarPedidoStock = new EstoqueCompra(absEstoque);
      VendaEstoque venderPedidoStock = new VendaEstoque(absEstoque);

      Vendedor vendedor = new Vendedor();
      vendedor.pegarPedido(comprarPedidoStock);
      vendedor.pegarPedido(venderPedidoStock);

      vendedor.placePedidos();
   }
}
