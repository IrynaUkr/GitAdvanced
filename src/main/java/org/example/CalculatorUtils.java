package org.example;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;

public class CalculatorUtils {

    private static final Logger LOGGER = LoggerFactory.getLogger(Calculator.class);
    static int[] parseString(String string) {
        LOGGER.info(()->"method parse String starts");
        int length = string.length();
        char[] charArray = string.replaceAll(" ", "").toCharArray();
        int[] res = new int[length];
        for (int i = 0; i < length; i++) {
            res[i] = charArray[i] - 48;
        }
        LOGGER.info(()->"method parse String completed successfully");
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
