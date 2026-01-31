package org.steiner.com.warehouse;

import org.steiner.com.warehouse.device.WarehouseDevice;
import org.steiner.com.warehouse.device.app.control.ControlApp;
import org.steiner.com.warehouse.device.state.types.IdleState;
import org.steiner.com.warehouse.device.state.types.MovingState;
import org.steiner.com.warehouse.device.strategy.types.EnergySavingStrategy;
import org.steiner.com.warehouse.device.strategy.types.HighPerformanceStrategy;
import org.steiner.com.warehouse.manager.WarehouseManager;

import java.util.List;

public class WarehouseFacade {
    private WarehouseManager warehouseManager;

    public WarehouseFacade(WarehouseManager warehouseManager) {
        this.warehouseManager = warehouseManager;
    }

    public void startAllDevices() {
        List<WarehouseDevice> devices = warehouseManager.getDevices();

        for (WarehouseDevice d : devices) {
            d.addObserver(new ControlApp());
            d.notifyObserver("Device is online! " + d.getName());
            d.setState(new MovingState());
            d.moving();
            d.setStrategy(new HighPerformanceStrategy());
            d.operate();
            d.notifyObserver("Device is now changing state to moving state and changing strategy to high performance strategy. " + d.getName());
        }
    }

    public void shutdownAllDevices() {
        List<WarehouseDevice> devices = warehouseManager.getDevices();

        for (WarehouseDevice d: devices) {
            d.addObserver(new ControlApp());
            d.notifyObserver("Device is shutting down! " + d.getName());
            d.setState(new IdleState());
            d.idle();
            d.setStrategy(new EnergySavingStrategy());
            d.operate();
            d.notifyObserver("Device is now changing state to idle state and changing strategy to energy saving strategy. " + d.getName());
        }
    }

    public void setEnergySavingModeAll() {
        List<WarehouseDevice> devices = warehouseManager.getDevices();

        for (WarehouseDevice d: devices) {
            d.addObserver(new ControlApp());
            d.notifyObserver("Device is now changing strategy to energy saving strategy. " + d.getName());
            d.setState(new MovingState());
            d.moving();
            d.setStrategy(new EnergySavingStrategy());
            d.operate();
            d.notifyObserver("Device is now operating in energy saving strategy. " + d.getName());
        }
    }
}
