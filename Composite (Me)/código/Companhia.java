public class Companhia{
  public static void main (String[] args){
    Desenvolvedor dev1 = new Desenvolvedor(100, "Pedro Alberto", "Dev Senior");
    Desenvolvedor dev2 = new Desenvolvedor(101, "Mateus Filho", "Dev Jr");
    DiretoriaCompanhia engDiretoria = new DiretoriaCompanhia();
    engDiretoria.addEmpregado(dev1);
    engDiretoria.addEmpregado(dev2);

    Gerente ger1 = new Gerente(200, "Higor Silva", "CEO");
    Gerente ger2 = new Gerente(201, "Bruna Rodrigues", "Gerente");

    DiretoriaCompanhia accDiretoria = new DiretoriaCompanhia();
    accDiretoria.addEmpregado(ger1);
    accDiretoria.addEmpregado(ger2);

    DiretoriaCompanhia diretoria = new DiretoriaCompanhia();
    diretoria.addEmpregado(engDiretoria);
    diretoria.addEmpregado(accDiretoria);
    diretoria.mostrarDetalhesEmpregado();
  }
}
