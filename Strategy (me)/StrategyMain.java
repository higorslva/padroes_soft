public class StrategyMain {
   public static void main(String[] args) {
      Contexto contexto = new Contexto(new OperacaoSoma());
      System.out.println("10 + 5 = " + contexto.executarStrategy(10, 5));

      contexto = new Contexto(new OperacaoSubtracao());
      System.out.println("10 - 5 = " + contexto.executarStrategy(10, 5));

      contexto = new Contexto(new OperacaoMultiplicacao());
      System.out.println("10 * 5 = " + contexto.executarStrategy(10, 5));
   }
}
