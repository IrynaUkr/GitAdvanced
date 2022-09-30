package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Calculator calculator = new Calculator("smart");
        Calculator calculator2 = new Calculator("intelligent");
        System.out.println(calculator2);
        System.out.println(calculator);
    }
}
