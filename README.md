# 📦 Smart Logistic System — Java Practice Project

## 📘 Project Description

The **Smart Logistic System** is a Java practice project that demonstrates Object-Oriented Programming (OOP) principles together with several important design patterns.
The system simulates a modular logistics platform that manages warehouse devices and notifications.

The goal of this project is to show how design patterns can be used in a realistic software architecture to improve flexibility, maintainability, and scalability.

---

## 🎯 Project Goals

* Apply **OOP concepts** in Java
* Use multiple **design patterns** correctly
* Build a modular and extensible system
* Simulate real logistics workflows
* Practice clean architecture and separation of concerns

---

## 🧱 OOP Concepts Used

- Encapsulation
- Inheritance
- Polymorphism
- Abstraction
- Interfaces
- Composition
---

## 🏗️ Design Patterns used

### Creational
- Singleton
- Builder
- Abstract Factory

### Structural
- Adapter
- Proxy
- Facade

### Behavioral
- Observer
- Strategy
- State

---

## 📊 UML diagram
![UML Diagram](umldiagram/uml.png)

---

## 📂 Project structure
```
src/main/java/org/steiner/com/
├── warehouse/
│   ├── device/
│   │   ├── app/
│   │   │   ├── control/
│   │   │   │   ├── device/
│   │   │   │   │   ├── DeviceControl.java
│   │   │   │   │   ├── DeviceProxy.java
│   │   │   │   │   └── RealDeviceControl.java
│   │   │   │   └── ControlApp.java
│   │   │   ├── Observer.java
│   │   │   └── Subject.java
│   │   ├── factory/
│   │   │   ├── autologix/
│   │   │   │   ├── AutoLogixConveyor.java
│   │   │   │   └── AutoLogixRobot.java
│   │   │   ├── robotech/
│   │   │   │   ├── RoboTechConveyor.java
│   │   │   │   └── RoboTechRobot.java
│   │   │   ├── AutoLogixFactory.java
│   │   │   ├── DeviceFactory.java
│   │   │   └── RoboTechFactory.java
│   │   ├── robot/
│   │   │   └── builder/
│   │   │       └── Robot.java
│   │   ├── scan/
│   │   │   ├── LegacyScanner.java
│   │   │   ├── Scanner.java
│   │   │   └── ScannerAdapter.java
│   │   ├── state/
│   │   │   ├── types/
│   │   │   │   ├── ErrorState.java
│   │   │   │   ├── IdleState.java
│   │   │   │   ├── LoadingState.java
│   │   │   │   └── MovingState.java
│   │   │   └── DeviceState.java
│   │   ├── strategy/
│   │   │   ├── types/
│   │   │   │   ├── EnergySavingStrategy.java
│   │   │   │   └── HighPerformanceStrategy.java
│   │   │   └── OperationStrategy.java
│   │   └── WarehouseDevice.java
│   ├── manager/
│   │   └── WarehouseManager.java
│   └── WarehouseFacade.java
└── Main.java
```

---

## 🎮 Console Output
```TERMINAL
    ---Robot RoboTech 1---
    Device Robot RoboTech 1 is online
    
    ---Conveyor RoboTech 1---
    Device Conveyor RoboTech 1 is online
    
    ---Robot AutoLogix 1---
    Device Robot AutoLogix 1 is online
    
    ---Conveyor AutoLogix 1---
    Device Conveyor AutoLogix 1 is online
    
    ---WarehouseFacade---
    
    --Starting all devices--
    Device is online! Robot RoboTech 1
    Device is online! Robot RoboTech 1
    Device is already in moving state. Robot RoboTech 1
    Device is now operating in high performance strategy. Robot RoboTech 1
    Device is now changing state to moving state and changing strategy to high performance strategy. Robot RoboTech 1
    Device is now changing state to moving state and changing strategy to high performance strategy. Robot RoboTech 1
    Device is online! Conveyor RoboTech 1
    Device is online! Conveyor RoboTech 1
    Device is already in moving state. Conveyor RoboTech 1
    Device is now operating in high performance strategy. Conveyor RoboTech 1
    Device is now changing state to moving state and changing strategy to high performance strategy. Conveyor RoboTech 1
    Device is now changing state to moving state and changing strategy to high performance strategy. Conveyor RoboTech 1
    Device is online! Robot AutoLogix 1
    Device is online! Robot AutoLogix 1
    Device is already in moving state. Robot AutoLogix 1
    Device is now operating in high performance strategy. Robot AutoLogix 1
    Device is now changing state to moving state and changing strategy to high performance strategy. Robot AutoLogix 1
    Device is now changing state to moving state and changing strategy to high performance strategy. Robot AutoLogix 1
    Device is online! Conveyor AutoLogix 1
    Device is online! Conveyor AutoLogix 1
    Device is already in moving state. Conveyor AutoLogix 1
    Device is now operating in high performance strategy. Conveyor AutoLogix 1
    Device is now changing state to moving state and changing strategy to high performance strategy. Conveyor AutoLogix 1
    Device is now changing state to moving state and changing strategy to high performance strategy. Conveyor AutoLogix 1
    
    --Shutting down all devices--
    Device is shutting down! Robot RoboTech 1
    Device is shutting down! Robot RoboTech 1
    Device is shutting down! Robot RoboTech 1
    Device is already in idle state. Robot RoboTech 1
    Device is now operating in energy saving strategy. Robot RoboTech 1
    Device is now changing state to idle state and changing strategy to energy saving strategy. Robot RoboTech 1
    Device is now changing state to idle state and changing strategy to energy saving strategy. Robot RoboTech 1
    Device is now changing state to idle state and changing strategy to energy saving strategy. Robot RoboTech 1
    Device is shutting down! Conveyor RoboTech 1
    Device is shutting down! Conveyor RoboTech 1
    Device is shutting down! Conveyor RoboTech 1
    Device is already in idle state. Conveyor RoboTech 1
    Device is now operating in energy saving strategy. Conveyor RoboTech 1
    Device is now changing state to idle state and changing strategy to energy saving strategy. Conveyor RoboTech 1
    Device is now changing state to idle state and changing strategy to energy saving strategy. Conveyor RoboTech 1
    Device is now changing state to idle state and changing strategy to energy saving strategy. Conveyor RoboTech 1
    Device is shutting down! Robot AutoLogix 1
    Device is shutting down! Robot AutoLogix 1
    Device is shutting down! Robot AutoLogix 1
    Device is already in idle state. Robot AutoLogix 1
    Device is now operating in energy saving strategy. Robot AutoLogix 1
    Device is now changing state to idle state and changing strategy to energy saving strategy. Robot AutoLogix 1
    Device is now changing state to idle state and changing strategy to energy saving strategy. Robot AutoLogix 1
    Device is now changing state to idle state and changing strategy to energy saving strategy. Robot AutoLogix 1
    Device is shutting down! Conveyor AutoLogix 1
    Device is shutting down! Conveyor AutoLogix 1
    Device is shutting down! Conveyor AutoLogix 1
    Device is already in idle state. Conveyor AutoLogix 1
    Device is now operating in energy saving strategy. Conveyor AutoLogix 1
    Device is now changing state to idle state and changing strategy to energy saving strategy. Conveyor AutoLogix 1
    Device is now changing state to idle state and changing strategy to energy saving strategy. Conveyor AutoLogix 1
    Device is now changing state to idle state and changing strategy to energy saving strategy. Conveyor AutoLogix 1
    
    --Energy saving mode all devices--
    Device is now changing strategy to energy saving strategy. Robot RoboTech 1
    Device is now changing strategy to energy saving strategy. Robot RoboTech 1
    Device is now changing strategy to energy saving strategy. Robot RoboTech 1
    Device is now changing strategy to energy saving strategy. Robot RoboTech 1
    Device is already in moving state. Robot RoboTech 1
    Device is now operating in energy saving strategy. Robot RoboTech 1
    Device is now operating in energy saving strategy. Robot RoboTech 1
    Device is now operating in energy saving strategy. Robot RoboTech 1
    Device is now operating in energy saving strategy. Robot RoboTech 1
    Device is now operating in energy saving strategy. Robot RoboTech 1
    Device is now changing strategy to energy saving strategy. Conveyor RoboTech 1
    Device is now changing strategy to energy saving strategy. Conveyor RoboTech 1
    Device is now changing strategy to energy saving strategy. Conveyor RoboTech 1
    Device is now changing strategy to energy saving strategy. Conveyor RoboTech 1
    Device is already in moving state. Conveyor RoboTech 1
    Device is now operating in energy saving strategy. Conveyor RoboTech 1
    Device is now operating in energy saving strategy. Conveyor RoboTech 1
    Device is now operating in energy saving strategy. Conveyor RoboTech 1
    Device is now operating in energy saving strategy. Conveyor RoboTech 1
    Device is now operating in energy saving strategy. Conveyor RoboTech 1
    Device is now changing strategy to energy saving strategy. Robot AutoLogix 1
    Device is now changing strategy to energy saving strategy. Robot AutoLogix 1
    Device is now changing strategy to energy saving strategy. Robot AutoLogix 1
    Device is now changing strategy to energy saving strategy. Robot AutoLogix 1
    Device is already in moving state. Robot AutoLogix 1
    Device is now operating in energy saving strategy. Robot AutoLogix 1
    Device is now operating in energy saving strategy. Robot AutoLogix 1
    Device is now operating in energy saving strategy. Robot AutoLogix 1
    Device is now operating in energy saving strategy. Robot AutoLogix 1
    Device is now operating in energy saving strategy. Robot AutoLogix 1
    Device is now changing strategy to energy saving strategy. Conveyor AutoLogix 1
    Device is now changing strategy to energy saving strategy. Conveyor AutoLogix 1
    Device is now changing strategy to energy saving strategy. Conveyor AutoLogix 1
    Device is now changing strategy to energy saving strategy. Conveyor AutoLogix 1
    Device is already in moving state. Conveyor AutoLogix 1
    Device is now operating in energy saving strategy. Conveyor AutoLogix 1
    Device is now operating in energy saving strategy. Conveyor AutoLogix 1
    Device is now operating in energy saving strategy. Conveyor AutoLogix 1
    Device is now operating in energy saving strategy. Conveyor AutoLogix 1
    Device is now operating in energy saving strategy. Conveyor AutoLogix 1
    
    ---Robot builder---
    Core i7-8700-CPU | 32000 | 1500 | 320 | [HC-SR04, KY-038]
    
    ---Proxy test true---
    [Control] Real device control is now operating
    Device control is now operating.
    
    ---Proxy test false---
    [Control] Real device control can only be operated by an admin!
    
    Process finished with exit code 0
```
---

## ▶️ How to Run

1. Clone the repository
2. Open in IntelliJ / Eclipse
3. Run `Main.java`

---

## 🛠️ Technologies

- Java (JDK 24)
- Maven
- Object-Oriented Programming (OOP)
- Design Patterns (GoF)
- UML Modeling

---

> ⚠️ Note: This project is for practice purposes only and is not a production-ready system.

---