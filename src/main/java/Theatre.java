import java.util.ArrayList;
import java.util.List;

public class Theatre {

    private String artType;

    List<Observer> observers = new ArrayList();

    public String getArtType() {
        return artType;
    }

    public void setArtType(String artType) {
        this.artType = artType;
        notifyAllObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.reactOnArtType();
        }
    }
}
