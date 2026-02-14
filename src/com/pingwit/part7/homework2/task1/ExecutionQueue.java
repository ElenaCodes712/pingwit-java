package com.pingwit.part7.homework2.task1;

public class ExecutionQueue {
    private static String msg;
    static {
        msg="static block";
        System.out.println("Static");
    } //добавь абзаца между блоками
    {
        msg="regular init block";
        System.out.println("Not static");
    } // сюда тоже абзац
    public ExecutionQueue() {
        msg="constructor value";
    }

    public static void main(String[] args) {
        ExecutionQueue executionQueue = new ExecutionQueue();
        new ExecutionQueue();

        System.out.println(executionQueue.msg);
    }
}
