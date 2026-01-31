package org.steiner.com.warehouse.device.robot.builder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Robot {
    private final String cpu;
    private final int ram;
    private final int batteryCapacity;
    private final int loadCapacity;
    private final List<String> sensorArray;

    public Robot(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.batteryCapacity = builder.batteryCapacity;
        this.loadCapacity = builder.loadCapacity;
        this.sensorArray = builder.sensorArray;
    }

    public String getCpu() {return cpu;}
    public int getRam() {return ram;}
    public int getBatteryCapacity() {return batteryCapacity;}
    public int getLoadCapacity() {return loadCapacity;}
    public List<String> getSensorArray() {return sensorArray;}

    @Override
    public String toString() {
        return cpu + " | " + ram + " | " + batteryCapacity + " | " + loadCapacity + " | " + Arrays.toString(sensorArray.toArray());
    }

    public static class Builder {
        private String cpu;
        private int ram;
        private int batteryCapacity;
        private int loadCapacity;
        private List<String> sensorArray;

        public Builder setCpu(String cpu) {this.cpu = cpu; return this;}
        public Builder setRam(int ram) {this.ram = ram; return this;}
        public Builder setBatteryCapacity(int batteryCapacity) {this.batteryCapacity = batteryCapacity; return this;}
        public Builder setLoadCapacity(int loadCapacity) {this.loadCapacity = loadCapacity; return this;}
        public Builder setSensorArray(List<String> sensorArray) {this.sensorArray = sensorArray; return this;}

        public Robot build() {return new Robot(this);}
    }
}
