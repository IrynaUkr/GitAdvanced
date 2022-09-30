package org.example;

public class Calculator {
    private final String name;

    public Calculator(String name) {
        this.name = name;
    }

    static void printSomething(){
        System.out.println("print something");
    }
    public static void main(String[] args) {
        int r = 5;
        System.out.println(new Calculator("simple calc"));
    }
}
