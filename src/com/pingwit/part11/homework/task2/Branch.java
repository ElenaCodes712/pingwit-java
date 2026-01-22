package com.pingwit.part11.homework.task2;

public class Branch {
    private final Fruits[] fruits;
    private final Branch[] children;

    public Branch(Fruits[] fruits, Branch[] children) {
        this.fruits = fruits;
        this.children = children;
    }

    public Fruits[] getFruits() {
        return fruits;
    }

    public Branch[] getChildren() {
        return children;
    }
}
