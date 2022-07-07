public class OperacaoMultiplicacao implements Strategy{
   @Override
   public int fazerOperacao(int num1, int num2) {
      return num1 * num2;
   }
}
