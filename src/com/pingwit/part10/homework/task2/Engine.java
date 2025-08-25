package com.pingwit.part10.homework.task2;

public class Engine {
    private boolean engineIsRunning = false;

    public void start() {
        if (engineIsRunning) {
            System.out.println("Engine is already running");
        } else {
            engineIsRunning = true;
            System.out.println("The engine is running");
        }
    }

    public void stop() {
        if (!engineIsRunning) {
            System.out.println("Engine is already stopped");
        } else {
            engineIsRunning = false;
            System.out.println("Engine is stopped");
        }
    }

    public boolean isRunning() {
        return engineIsRunning;
    }
}
