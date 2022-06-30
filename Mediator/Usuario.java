public class Usuario{
   private String nome;

   public String getNome() {
      return nome;
   }

   public void setNome(String nome){
      this.nome = nome;
   }

   public Usuario(String nome){
      this.nome  = nome;
   }

   public void enviarMensagem(String mensagem){
      SalaBatePapo.mostrarMensagem(this,mensagem);
   }
}
