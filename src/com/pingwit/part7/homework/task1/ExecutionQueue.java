package com.pingwit.part7.homework.task1;

public class ExecutionQueue {
    private static String msg;

    static {
        msg = "static block";
    }

    {
        msg = "regular init block";
    }

    public static void main(String[] args) {
        ExecutionQueue executionQueue = new ExecutionQueue();

        System.out.println(executionQueue.msg);
    }
}
