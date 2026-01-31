package org.steiner.com.warehouse.manager;

import org.steiner.com.warehouse.device.WarehouseDevice;

import java.util.ArrayList;
import java.util.List;

public class WarehouseManager {
    private static WarehouseManager instance;
    private final List<WarehouseDevice> devices = new ArrayList<>();

    private WarehouseManager() {

    }

    public static WarehouseManager getInstance() {
        if (instance == null) {
            instance = new WarehouseManager();
        }
        return instance;
    }

    public void registerDevice(WarehouseDevice d) {devices.add(d);}

    public List<WarehouseDevice> getDevices() {return devices;}
}
