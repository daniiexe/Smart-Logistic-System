package org.steiner.com.warehouse.device.app.control;

import org.steiner.com.warehouse.device.app.Observer;

public class ControlApp implements Observer {
    @Override
    public void update(String message) {
        System.out.println(message);
    }
}
