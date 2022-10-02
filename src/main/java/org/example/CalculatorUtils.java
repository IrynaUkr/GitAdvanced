package org.example;

public class CalculatorUtils {
    static int[] parseString(String string) {
        int length = string.length();
        char[] charArray = string.replaceAll(" ", "").toCharArray();
        int[] res = new int[length];
        for (int i = 0; i < length; i++) {
            res[i] = charArray[i] - 48;
        }
        return res;
    }

    static void doSomething() {

        System.out.println("do something");
    }

    static int calc(char[] parsed) {
        int result = 0;
        for (Character c : parsed) {
            result += c + 48;
        }
        return result;
    }
}
