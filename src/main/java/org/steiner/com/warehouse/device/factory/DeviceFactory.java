package org.steiner.com.warehouse.device.factory;

import org.steiner.com.warehouse.device.WarehouseDevice;

public interface DeviceFactory {
    WarehouseDevice createRobot(String name);
    WarehouseDevice createConveyor(String name);
}
