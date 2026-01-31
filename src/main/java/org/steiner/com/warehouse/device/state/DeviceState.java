package org.steiner.com.warehouse.device.state;

import org.steiner.com.warehouse.device.WarehouseDevice;

public interface DeviceState {
    void idle(WarehouseDevice d);
    void moving(WarehouseDevice d);
    void loading(WarehouseDevice d);
    void error(WarehouseDevice d);
}
