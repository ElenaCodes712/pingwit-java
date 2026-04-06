package com.pingwit.part10.homework2.task2;

public class Engine {
    private boolean engineIsRunning;

    public void startTheEngine() {
        if (engineIsRunning) {
            System.out.println("The engine is already running");
        } else {
            engineIsRunning = true;
            System.out.println("The engine is running");
        }
    }

    public void stopTheEngine() {
        if (engineIsRunning) {
            System.out.println("The engine is stopped");
        } else {
            engineIsRunning = false;
            System.out.println("The engine is already stopped");
        }
    }

    public boolean isRunning() {
        return engineIsRunning;
    }
}
