package org.steiner.com.warehouse.device.state.types;

import org.steiner.com.warehouse.device.WarehouseDevice;
import org.steiner.com.warehouse.device.state.DeviceState;

public class MovingState implements DeviceState {
    @Override
    public void idle(WarehouseDevice d) {
        System.out.println("Device switched to idle state. " + d.getName());
        d.setState(new IdleState());
    }

    @Override
    public void moving(WarehouseDevice d) {
        System.out.println("Device is already in moving state. " + d.getName());
    }

    @Override
    public void loading(WarehouseDevice d) {
        System.out.println("Device switched to loading state. " + d.getName());
        d.setState(new LoadingState());
    }

    @Override
    public void error(WarehouseDevice d) {
        System.out.println("Device switch to error state. " + d.getName());
        d.setState(new ErrorState());
    }
}
