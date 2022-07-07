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
