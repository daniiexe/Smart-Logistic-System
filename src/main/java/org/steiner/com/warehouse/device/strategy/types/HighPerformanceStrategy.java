package org.steiner.com.warehouse.device.strategy.types;

import org.steiner.com.warehouse.device.strategy.OperationStrategy;

public class HighPerformanceStrategy implements OperationStrategy {
    @Override
    public void execute(String deviceName) {
        System.out.println("Device is now operating in high performance strategy. " + deviceName);
    }
}
