package org.steiner.com.warehouse.device.app.control.device;

public class DeviceProxy implements DeviceControl {
    private final RealDeviceControl real;
    private boolean isAdmin;

    public DeviceProxy(RealDeviceControl real, boolean isAdmin) {this.real = real; this.isAdmin = isAdmin;}

    @Override
    public void operate() {
        if (isAdmin) {
            System.out.println("[Control] Real device control is now operating");
            real.operate();
        } else {
            System.out.println("[Control] Real device control can only be operated by an admin!");
        }
    }
}
