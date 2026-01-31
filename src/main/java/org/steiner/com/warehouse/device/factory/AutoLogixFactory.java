package org.steiner.com.warehouse.device.factory;

import org.steiner.com.warehouse.device.WarehouseDevice;
import org.steiner.com.warehouse.device.factory.autologix.AutoLogixConveyor;
import org.steiner.com.warehouse.device.factory.autologix.AutoLogixRobot;

public class AutoLogixFactory implements DeviceFactory {
    @Override
    public WarehouseDevice createRobot(String name) {
        return new AutoLogixRobot(name);
    }

    @Override
    public WarehouseDevice createConveyor(String name) {
        return new AutoLogixConveyor(name);
    }
}
