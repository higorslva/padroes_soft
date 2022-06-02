public class Gerente implements Empregado{
  private String nome;
  private long empId;
  private String cargo;

  public Gerente(long empId, String nome, String cargo){
    this.empId = empId;
    this.nome = nome;
    this.cargo = cargo;
  }

  @Override
  public void mostrarDetalhesEmpregado(){
    System.out.println(empId+ ", " + nome + ", " + cargo);
  }
}
