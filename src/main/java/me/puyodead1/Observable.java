package me.puyodead1;

public interface Observable {
    public void addObserver(Observer o);
    public void notifyObservers();
}
