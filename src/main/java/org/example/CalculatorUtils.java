package org.example;

public class CalculatorUtils {
    static char[] parseString(String string){
        return string.replaceAll(" ","").toCharArray();
    }
    static void doSomething(){
        System.out.println("do something");
    }
}
