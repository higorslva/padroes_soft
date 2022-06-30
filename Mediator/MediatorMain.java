public class MediatorMain{
	public static void main(String [] args){
		Usuario higor = new Usuario ("Higor");
		Usuario felipe = new Usuario ("Felipe");

		higor.enviarMensagem("Oi, Felipe!");
		felipe.enviarMensagem("Olá, Higor!");
	}
}
