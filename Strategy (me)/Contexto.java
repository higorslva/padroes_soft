public class Contexto {
   private Strategy strategy;

   public Contexto(Strategy strategy){
      this.strategy = strategy;
   }

   public int executarStrategy(int num1, int num2){
      return strategy.fazerOperacao(num1, num2);
   }
}
