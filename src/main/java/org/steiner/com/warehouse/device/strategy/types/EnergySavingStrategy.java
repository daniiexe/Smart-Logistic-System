package org.steiner.com.warehouse.device.strategy.types;

import org.steiner.com.warehouse.device.strategy.OperationStrategy;

public class EnergySavingStrategy implements OperationStrategy {
    @Override
    public void execute(String deviceName) {
        System.out.println("Device is now operating in energy saving strategy. " + deviceName);
    }
}
