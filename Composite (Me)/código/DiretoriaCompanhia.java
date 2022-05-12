import java.util.ArrayList;
import java.util.List;

public class DiretoriaCompanhia implements Empregado{
  private List<Empregado> listaEmpregado = new ArrayList<Empregado>();

  @Override
  public void mostrarDetalhesEmpregado(){
    for(Empregado emp:listaEmpregado){
      emp.mostrarDetalhesEmpregado();
    }
  }

  public void addEmpregado(Empregado emp){
    listaEmpregado.add(emp);
  }
  public void removerEmpregado(Empregado emp){
    listaEmpregado.remove(emp);
  }
}
