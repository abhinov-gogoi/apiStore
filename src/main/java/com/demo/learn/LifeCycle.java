package com.demo.learn;

public class LifeCycle {
    private static String message = null;
    static {
        System.out.println("static");
        message = "hello";
        System.out.println("message from static =" +message);
    }

    LifeCycle() {
        System.out.println("constructor");
    }
    public static void main(String[] args) {
        System.out.println("main");
        System.out.println("message =  " + message);
        LifeCycle lifeCycle = new LifeCycle();
        lifeCycle.printMessage();
    }

    void printMessage() {
        System.out.println("printMessage");
    }
}
