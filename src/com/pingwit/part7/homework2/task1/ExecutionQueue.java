package com.pingwit.part7.homework2.task1;

public class ExecutionQueue {
    private static String msg;
    static {
        msg="static block";
        System.out.println("Static");
    }

    {
        msg="regular init block";
        System.out.println("Not static");
    }

    public ExecutionQueue() {
        msg="constructor value";
    }

    public static void main(String[] args) {
        ExecutionQueue executionQueue = new ExecutionQueue();
        new ExecutionQueue();

        System.out.println(executionQueue.msg);
    }
}
