package org.steiner.com;

import org.steiner.com.warehouse.WarehouseFacade;
import org.steiner.com.warehouse.device.WarehouseDevice;
import org.steiner.com.warehouse.device.app.control.ControlApp;
import org.steiner.com.warehouse.device.app.control.device.DeviceControl;
import org.steiner.com.warehouse.device.app.control.device.DeviceProxy;
import org.steiner.com.warehouse.device.app.control.device.RealDeviceControl;
import org.steiner.com.warehouse.device.factory.AutoLogixFactory;
import org.steiner.com.warehouse.device.factory.DeviceFactory;
import org.steiner.com.warehouse.device.factory.RoboTechFactory;
import org.steiner.com.warehouse.device.robot.builder.Robot;
import org.steiner.com.warehouse.device.state.types.IdleState;
import org.steiner.com.warehouse.manager.WarehouseManager;

import java.util.List;


public class Main {
    static void main() {
        WarehouseManager warehouseManager = WarehouseManager.getInstance();
        WarehouseFacade warehouseFacade = new WarehouseFacade(warehouseManager);

        ControlApp controlApp = new ControlApp();

        DeviceFactory robotechFactory = new RoboTechFactory();
        DeviceFactory autologixFactory = new AutoLogixFactory();


        DeviceControl deviceControlTrue = new DeviceProxy(new RealDeviceControl(), true);
        DeviceControl deviceControlFalse = new DeviceProxy(new RealDeviceControl(), false);

        Robot robot = new Robot.Builder()
                .setCpu("Core i7-8700-CPU")
                .setRam(32000)
                .setBatteryCapacity(1500)
                .setLoadCapacity(320)
                .setSensorArray(List.of("HC-SR04", "KY-038"))
                .build();

        WarehouseDevice robotechRobot= robotechFactory.createRobot("Robot RoboTech 1");
        WarehouseDevice robotechConveyor = robotechFactory.createConveyor("Conveyor RoboTech 1");
        WarehouseDevice autologixRobot = autologixFactory.createRobot("Robot AutoLogix 1");
        WarehouseDevice autologixConveyor = autologixFactory.createConveyor("Conveyor AutoLogix 1");

        System.out.println("---" + robotechRobot.getName() + "---");
        warehouseManager.registerDevice(robotechRobot);
        robotechRobot.addObserver(controlApp);
        robotechRobot.setState(new IdleState());
        robotechRobot.notifyObserver("Device " + robotechRobot.getName() + " is online");

        System.out.println();
        System.out.println("---" + robotechConveyor.getName() + "---");
        warehouseManager.registerDevice(robotechConveyor);
        robotechConveyor.addObserver(controlApp);
        robotechConveyor.setState(new IdleState());
        robotechConveyor.notifyObserver("Device " + robotechConveyor.getName() + " is online");

        System.out.println();
        System.out.println("---" + autologixRobot.getName() + "---");
        warehouseManager.registerDevice(autologixRobot);
        autologixRobot.addObserver(controlApp);
        autologixRobot.setState(new IdleState());
        autologixRobot.notifyObserver("Device " + autologixRobot.getName() + " is online");

        System.out.println();
        System.out.println("---" + autologixConveyor.getName() + "---");
        warehouseManager.registerDevice(autologixConveyor);
        autologixConveyor.addObserver(controlApp);
        autologixConveyor.setState(new IdleState());
        autologixConveyor.notifyObserver("Device " + autologixConveyor.getName() + " is online");

        System.out.println();
        System.out.println("---WarehouseFacade---");

        System.out.println();
        System.out.println("--Starting all devices--");
        warehouseFacade.startAllDevices();

        System.out.println();
        System.out.println("--Shutting down all devices--");
        warehouseFacade.shutdownAllDevices();

        System.out.println();
        System.out.println("--Energy saving mode all devices--");
        warehouseFacade.setEnergySavingModeAll();

        System.out.println();
        System.out.println("---Robot builder---");
        System.out.println(robot.toString());

        System.out.println();
        System.out.println("---Proxy test true---");
        deviceControlTrue.operate();

        System.out.println();
        System.out.println("---Proxy test false---");
        deviceControlFalse.operate();

    }
}
