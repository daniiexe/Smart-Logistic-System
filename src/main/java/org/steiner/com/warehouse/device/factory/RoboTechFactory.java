package org.steiner.com.warehouse.device.factory;

import org.steiner.com.warehouse.device.WarehouseDevice;
import org.steiner.com.warehouse.device.factory.robotech.RoboTechConveyor;
import org.steiner.com.warehouse.device.factory.robotech.RoboTechRobot;

public class RoboTechFactory implements DeviceFactory {
    @Override
    public WarehouseDevice createRobot(String name) {
        return new RoboTechRobot(name);
    }

    @Override
    public WarehouseDevice createConveyor(String name) {
        return new RoboTechConveyor(name);
    }
}
