package org.steiner.com.warehouse.device.app.control.device;

public class RealDeviceControl implements DeviceControl {
    @Override
    public void operate() {
        System.out.println("Device control is now operating.");
    }
}
