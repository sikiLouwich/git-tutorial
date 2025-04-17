import java.util.ArrayList;

public class Observer {
    public static void main(String[] args) {
        NewsAgency newsAgency = new NewsAgency();
        Reader bob = new Reader("Bob");
        Reader alice = new Reader("Alice");

        newsAgency.registerObserver(bob);
        newsAgency.registerObserver(alice);
        newsAgency.notifyObservers("siki go to master this exam!!!");
    }
}


interface ObserverInterface {
    void update(String message);
}

interface SubjectInterface {
    void registerObserver(ObserverInterface observer);
    void removeObserver(ObserverInterface observer);
    void notifyObservers(String message);
}


class NewsAgency implements SubjectInterface {
    private ArrayList<ObserverInterface> observers = new ArrayList<ObserverInterface>();
    public void registerObserver(ObserverInterface observer) {
        observers.add(observer);
    }
    public void removeObserver(ObserverInterface observer) {
        observers.remove(observer);
    }
    public void notifyObservers(String message) {
        for (ObserverInterface observer : observers) {
            observer.update(message);
        }
    }
}

class Reader implements ObserverInterface {
    private String name;
    public Reader(String name) {
        this.name = name;
    }

    public void update(String message) {
        System.out.println(this.name + ": " + message);
    }
}