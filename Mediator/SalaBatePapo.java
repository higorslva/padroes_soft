import java.util.Date;

public class SalaBatePapo{
	public static void mostrarMensagem(Usuario usuario, String mensagem){
		System.out.println(new Date().toString() + " [" + usuario.getNome() + "] : " + mensagem);
	}
}
