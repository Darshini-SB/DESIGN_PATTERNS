package OBSERVER;

// Subject interface in Observer pattern
interface Subject {
    public void addObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObserver();
}
