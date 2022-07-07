///////// Pedido.java
public interface Pedido {
   void execute();
}

///////// Estoque.java
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

///////// EstoqueCompra.java
public class EstoqueCompra implements Pedido {
   private Estoque absEstoque;

   public EstoqueCompra(Estoque absEstoque){
      this.absEstoque = absEstoque;
   }

   public void execute() {
      absEstoque.compra();
   }
}

///////// VendaEstoque.java
public class VendaEstoque implements Pedido {
   private Estoque absEstoque;

   public VendaEstoque(Estoque absEstoque){
      this.absEstoque = absEstoque;
   }

   public void execute() {
      absEstoque.vender();
   }
}

///////// Vendedor.java
import java.util.ArrayList;
import java.util.List;

   public class Vendedor{
   private List<Pedido> orderList = new ArrayList<Pedido>();

   public void pegarPedido(Pedido order){
      orderList.add(order);
   }

   public void placePedidos(){

      for (Pedido order : orderList) {
         order.execute();
      }
      orderList.clear();
   }
}

///////// CommandMain.java
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
