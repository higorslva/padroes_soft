public class TamanhoObserver extends Observer {
    public TamanhoObserver(Subject subject){
        this.subject = subject;
        this.subject.registerObserver(this);
    }
    public void update() {
       System.out.println("Tamanho: " + subject.getEstado().length());
    }
}