package org.steiner.com.warehouse.device.app;

public interface Subject {
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObserver(String message);
}
