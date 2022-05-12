import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ClientFacade{
  private static int escolha;
  public static void main(String args[]) throws NumberFormatException, IOException{
    do{
      System.out.println("========Loja de Celular========\n");
      System.out.print("            1. IPHONE.              \n");
      System.out.print("            2. SAMSUNG.              \n");
      System.out.print("            3. MOTOROLA.            \n");
      System.out.print("            4. Exit.                     \n");
      System.out.print("Enter your choice: ");

      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      escolha = Integer.parseInt(br.readLine());
      Comerciante cmt = new Comerciante();
      switch (escolha){
        case 1:
        {
          cmt.iphoneVenda();
          break;
        }

        case 2:
        {
          cmt.samsungVenda();
          break;
        }
        case 3:
        {
          cmt.motorolaVenda();
          break;
        }
        default:
        {
          System.out.println("Saindo...");
        }
        return;
      }
    } while (escolha!=4);
  }
}
