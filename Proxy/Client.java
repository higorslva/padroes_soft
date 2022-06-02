import java.util.Scanner;

public class Client
{
    public static void main (String[] args)
    {
        String site;
        Scanner ler = new Scanner(System.in);
        Internet internet = new ProxyInternet();
        try
        {
            System.out.println("Digite um site para tentar conectar: ");
            site = ler.next();
            internet.connectTo(site);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
