import java.io.IOException;

public class ObserverMain{
    public static void main (String args[]) throws IOException{
      Subject subject = new Subject("Olá mundo");

      new CapsObserver(subject);
      new TamanhoObserver(subject);
      new PalavrasObserver(subject);
      subject.notifyObservers();

      subject.setEstado("Testando observador");
      subject.setEstado("");
    }
}
