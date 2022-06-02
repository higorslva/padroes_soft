import java.io.IOException;
import java.util.*;

 public class Subject {
 List <Observer> observers;
    private String estado;
    public Subject(String estado) {
        observers = new LinkedList<>();
        try {
            setEstado(estado);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) throws IOException {
        this.estado = estado;
        System.out.println("\nEstado Atual: " + estado + "\n");
        notifyObservers();
    }
    public void registerObserver(Observer observers){
        for (Observer observer : this.observers) {
            this.observers.add(observer);
        }
    }
    public void removeObserver(Observer observer){
        observers.remove(observer);
    }
    public void notifyObservers() throws IOException {
        for(Observer o: observers)
            o.update();
    }
}