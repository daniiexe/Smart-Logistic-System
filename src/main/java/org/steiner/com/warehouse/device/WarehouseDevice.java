package org.steiner.com.warehouse.device;

import org.steiner.com.warehouse.device.app.Observer;
import org.steiner.com.warehouse.device.app.Subject;
import org.steiner.com.warehouse.device.state.DeviceState;
import org.steiner.com.warehouse.device.strategy.OperationStrategy;

import java.util.ArrayList;
import java.util.List;

public abstract class WarehouseDevice implements Subject {
    protected String name;
    protected List<Observer> observers = new ArrayList<>();
    protected DeviceState state;
    protected OperationStrategy strategy;

    public WarehouseDevice(String name) {this.name = name;}

    public void setState(DeviceState state) {this.state = state;}
    public void setStrategy(OperationStrategy strategy) {this.strategy = strategy;}

    public void idle() {state.idle(this);}
    public void moving() {state.moving(this);}
    public void loading() {state.loading(this);}
    public void error() {state.error(this);}
    public void operate() {strategy.execute(this.name);}

    public String getName() {return name;}

    @Override
    public void addObserver(Observer o) {observers.add(o);}

    @Override
    public void removeObserver(Observer o) {observers.remove(o);}

    @Override
    public void notifyObserver(String message) {
        for (Observer o : observers) {
            o.update(message);
        }
    }
}
